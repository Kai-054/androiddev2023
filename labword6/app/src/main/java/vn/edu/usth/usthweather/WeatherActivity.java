package vn.edu.usth.usthweather;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

////        Practical 7:
//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
//        viewPager.setOffscreenPageLimit(3);
//
//        // Create a list of fragments
//        List<Fragment> fragmentList = new ArrayList<>();
//        fragmentList.add(new WeatherAndForecastFragment());
//        fragmentList.add(new WeatherAndForecastFragment());
//        fragmentList.add(new WeatherAndForecastFragment());
//
//        // Set up the ViewPager with the adapter
//        FragmentPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragmentList);
//        viewPager.setAdapter(pagerAdapter);


//         Practical 2:
//        // Create a new Fragment to be placed in the activity
//        ForecastFragment firstFragment = new ForecastFragment();
//        // Add the fragment to the 'container' FrameLayout
//        getSupportFragmentManager().beginTransaction().add(
//                R.id.container, firstFragment
//        ).commit();
//
//        Practical 6:
       ForecastFragment firstFragment = new ForecastFragment();
       getSupportFragmentManager().beginTransaction().add(
               R.id.container, firstFragment
       ).commit();

       WeatherFragment secondFragment = new WeatherFragment();
       getSupportFragmentManager().beginTransaction().add(
               R.id.container, secondFragment
       ).commit();

        Log.i(TAG, "onCreate: This is a log message.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: This is a log message.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: This is a log message.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: This is a log message.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: This is a log message.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: This is a log message.");
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> fragmentList;

        public MyPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
            super(fm);
            this.fragmentList = fragmentList;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}
