package com.example.fahad.restaurantapp.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.fahad.restaurantapp.R;
import com.example.fahad.restaurantapp.adapters.PagerAdapter;
import com.example.fahad.restaurantapp.fragments.OrderFragment;
import com.example.fahad.restaurantapp.fragments.TableFragment;

public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar ;
    TabLayout tabLayout ;
    ViewPager viewPager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.toolbar) ;
        setSupportActionBar(toolbar);
        tabLayout = findViewById(R.id.tabLayout) ;
        viewPager = findViewById(R.id.pager) ;

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager()) ;
        pagerAdapter.addFragment(new TableFragment(), "Tables");
        pagerAdapter.addFragment(new OrderFragment(), "Order");

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}
