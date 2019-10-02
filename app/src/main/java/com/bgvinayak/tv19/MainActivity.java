package com.bgvinayak.tv19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private HomeFragment homeFragment;
    private EventsFragment eventsFragment;
    private AboutFragment aboutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

       homeFragment = new HomeFragment();
       eventsFragment = new EventsFragment();
       aboutFragment = new AboutFragment();

       //setFragment(homeFragment);
        mMainNav.setItemBackgroundResource(R.color.colorAccent);
        setFragment(homeFragment);
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.nav_home:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(homeFragment);
                        return true;


                    case R.id.nav_events:
                        mMainNav.setItemBackgroundResource(R.color.event_press);
                        setFragment(eventsFragment);
                        return true;


                    case R.id.nav_about:
                        mMainNav.setItemBackgroundResource(R.color.about_press);
                        setFragment(aboutFragment);
                        return true;

                        default:
                            return false;
                }


            }

            private void setFragment(Fragment fragment) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.main_frame, fragment);
                ft.commit();
            }
        });
    }

    private void setFragment(HomeFragment homeFragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_frame, homeFragment);
        ft.commit();
    }
}
