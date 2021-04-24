package com.example.shequtest.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.cuberto.liquid_swipe.LiquidPager;
import com.example.shequtest.R;
import com.example.shequtest.fragment.OnBoardingFragment1;
import com.example.shequtest.fragment.OnBoardingFragment2;
import com.example.shequtest.fragment.OnBoardingFragment3;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IntroductoryActivity1 extends AppCompatActivity {


    //由多个片段组成的变量
    private static final int NUM_PAGES = 3;
    //视图翻页工具
    @BindView(R.id.pager)
    LiquidPager pager;

    //页面适配器
    private YeTaiAdapter yeTaiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lntroductory_activiity);
        ButterKnife.bind(this);


        yeTaiAdapter = new YeTaiAdapter(getSupportFragmentManager());
        pager.setAdapter(yeTaiAdapter);

    }

//    @Override
//    public void onClick(View view) {
//            switch (view.getId()){
//                case R.id.tiaodenglu:
//                    Intent intent = new Intent(IntroductoryActivity1.this, Login.class);
//                    startActivity(intent);
//                    break;
//                case R.id.tiaodenglu1:
//                    Intent intent1 = new Intent(IntroductoryActivity1.this, Login.class);
//                    startActivity(intent1);
//                    break;
//                case R.id.tiaodenglu2:
//                    Intent intent2 = new Intent(IntroductoryActivity1.this, Login.class);
//                    startActivity(intent2);
//                    break;
//        }
//    }


    private class YeTaiAdapter extends FragmentStatePagerAdapter {

        public YeTaiAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    OnBoardingFragment1 tab1 = new OnBoardingFragment1();
                    return tab1;
                case 1:
                    OnBoardingFragment2 tab2 = new OnBoardingFragment2();
                    return tab2;
                case 2:
                    OnBoardingFragment3 tab3 = new OnBoardingFragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}