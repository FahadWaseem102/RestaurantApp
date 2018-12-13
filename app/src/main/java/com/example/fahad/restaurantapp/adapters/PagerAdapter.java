package com.example.fahad.restaurantapp.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fahad.restaurantapp.fragments.OrderFragment;
import com.example.fahad.restaurantapp.fragments.TableFragment;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentLists = new ArrayList<>() ;
    private final ArrayList<String> fragmentTitle = new ArrayList<>() ;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentLists.get(i);
    }

    @Override
    public int getCount() {
        return fragmentTitle.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position) ;
    }
    public void addFragment(Fragment fragment, String title){
        fragmentTitle.add(title) ;
        fragmentLists.add(fragment) ;
    }
}
