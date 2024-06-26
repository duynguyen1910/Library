package com.duynguyen.sample_project.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ListFragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.duynguyen.sample_project.Fragments.CustomerFragment;
import com.duynguyen.sample_project.Fragments.LibrarianFragment;

import java.util.ArrayList;

public class ViewPager2Adapter extends FragmentStateAdapter {
    private ArrayList<Fragment> list;
    public ViewPager2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        initFragmentsList();
    }

    private void initFragmentsList(){
        list = new ArrayList<>();
        list.add(new LibrarianFragment());
        list.add(new CustomerFragment());
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
