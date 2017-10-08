package com.ite17.pikulkaew.teamdr.ocrproject.dashboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ite17.pikulkaew.teamdr.ocrproject.R;
import com.ite17.pikulkaew.teamdr.ocrproject.dashboard.fragment.CameraFragment;
import com.ite17.pikulkaew.teamdr.ocrproject.dashboard.fragment.GalleryFragment;
import com.ite17.pikulkaew.teamdr.ocrproject.dashboard.fragment.HomeFragment;
import com.ite17.pikulkaew.teamdr.ocrproject.model.ItemClickCallback;


public class DashBoardActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener, ItemClickCallback {


    BottomNavigationView bottomNavigationView;

    //This is our viewPager
    private ViewPager viewPager;


    //Fragments
    CameraFragment cameraFragment;
    GalleryFragment galleryFragment;
    HomeFragment homeFragment;

    MenuItem prevMenuItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        initInstance();

    }

    private void initInstance() {



        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Initializing the bottomNavigationView
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_camera:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.action_home:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.action_gallery:
                                viewPager.setCurrentItem(2);
                                break;
                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(this);
        setupViewPager(viewPager);

        bottomNavigationView.setSelectedItemId(R.id.action_home);

    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        cameraFragment = new CameraFragment();
        homeFragment = new HomeFragment();
        galleryFragment = new GalleryFragment();
        adapter.addFragment(cameraFragment);
        adapter.addFragment(homeFragment);
        adapter.addFragment(galleryFragment);
        viewPager.setAdapter(adapter);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (prevMenuItem != null) {
            prevMenuItem.setChecked(false);
        } else {
            bottomNavigationView.getMenu().getItem(0).setChecked(false);
        }

        bottomNavigationView.getMenu().getItem(position).setChecked(true);
        prevMenuItem = bottomNavigationView.getMenu().getItem(position);


    }

    @Override
    public void onPageScrollStateChanged(int state) {

//       viewPager.setOnTouchListener(new View.OnTouchListener()
//        {
//            @Override
//            public boolean onTouch(View v, MotionEvent event)
//            {
//                return true;
//            }
//        });
//

    }

    @Override
    public void onClick(View view, int position) {
        //TODO:: handle click
        Toast.makeText(this, "Position " + position, Toast.LENGTH_SHORT).show();
    }
}
