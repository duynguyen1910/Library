package com.duynguyen.sample_project.DAOs;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.duynguyen.sample_project.Database.DatabaseHandler;
import com.duynguyen.sample_project.Models.ReceiptDetail;



public class ReceiptDetailDAO {
    private final DatabaseHandler databaseHandler;

    public ReceiptDetailDAO(Context context) {
        databaseHandler = new DatabaseHandler(context);
    }

    // Method sử dụng khi ấn Submit để tạo phiếu mượn
    public long addReceiptDetail(int receiptID, int bookID, int quantity) {
        SQLiteDatabase sqLiteDatabase = databaseHandler.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("receiptID", receiptID);
        contentValues.put("bookID", bookID);
        contentValues.put("quantity", quantity);


        return sqLiteDatabase.insert("RECEIPTDETAIL", null, contentValues);
    }

    @SuppressLint("Range")
    public int getTotalBooksBorrowed(int bookID) {
        SQLiteDatabase sqLiteDatabase = databaseHandler.getReadableDatabase();
        int totalBooksBorrowed = 0;

        String query = "SELECT SUM(quantity) AS total FROM RECEIPTDETAIL WHERE bookID = ?";
        Cursor cursor = sqLiteDatabase.rawQuery(query, new String[]{String.valueOf(bookID)});

        if (cursor.moveToFirst()) {
            totalBooksBorrowed = cursor.getInt(cursor.getColumnIndex("total"));
        }

        cursor.close();
        return totalBooksBorrowed;
    }
}
