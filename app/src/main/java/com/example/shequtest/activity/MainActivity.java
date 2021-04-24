package com.example.shequtest.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.shequtest.R;
import com.example.shequtest.back.backtui;
import com.example.shequtest.fragment.CommunityFragment;
import com.example.shequtest.fragment.MyInfoFragment;
import com.example.shequtest.fragment.NewsFragment;
import com.example.shequtest.fragment.ZhuYeFragment;
import com.example.shequtest.module.MyUser;

import cn.bmob.v3.Bmob;

public class MainActivity extends backtui implements View.OnClickListener {

//    四个fragment
    private CommunityFragment cmtyFg;
    private MyInfoFragment infoFg;
    private NewsFragment learnFg;
    private ZhuYeFragment zhuyefg;


    private RelativeLayout rlayoutCommunity;
    private RelativeLayout rlayoutStudy;
    private RelativeLayout rlayoutMyInfo;
    private RelativeLayout rlayoutZheye;

    private ImageView ivCommunity;
    private ImageView ivStudy;
    private ImageView ivMyInfo;
    private ImageView ivzhuye;

    private MyUser user;
    private String nowTime;


    //    定义FragmentManager对象管理器
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        initView();
//        默认选中社区模块
        setChoiceItem(0);
        onBackPressed();
    }



    private void setChoiceItem(int index) {
//        FragmentTransaction
//        定义了对 Fragment 添加、替换、隐藏等操作，还有四种提交方法
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // 清空, 重置选项, 隐藏所有Fragment
        clearChioce();
        hideFragments(fragmentTransaction);
        switch (index) {
            case 0:
                ivStudy.setImageResource(R.drawable.tv1);
                if (learnFg == null) {
                    learnFg = new NewsFragment();
                    fragmentTransaction.add(R.id.content, learnFg);
                } else {
                    fragmentTransaction.show(learnFg);
                }
                break;
            case 1:
                ivzhuye.setImageResource(R.drawable.zhuye);
                if (zhuyefg == null) {
                    zhuyefg = new ZhuYeFragment();
                    fragmentTransaction.add(R.id.content, zhuyefg);
                } else {
                    fragmentTransaction.show(zhuyefg);
                }
                break;
            case 2:
                ivCommunity.setImageResource(R.drawable.fx);
                if (cmtyFg == null) {
                    cmtyFg = new CommunityFragment();
                    fragmentTransaction.add(R.id.content, cmtyFg);
                } else {
                    fragmentTransaction.show(cmtyFg);
                }
                break;
            case 3:
                ivMyInfo.setImageResource(R.drawable.wd);
                if (infoFg == null) {
                    infoFg = new MyInfoFragment();
                    fragmentTransaction.add(R.id.content, infoFg);
                } else {
                    fragmentTransaction.show(infoFg);
                }
                break;
        }
        fragmentTransaction.commit(); // 提交
    }

    private void clearChioce() {
        ivStudy.setImageResource(R.drawable.tv);
        ivCommunity.setImageResource(R.drawable.fx1);
        ivMyInfo.setImageResource(R.drawable.wd1);
        ivzhuye.setImageResource(R.drawable.zhuye1);
    }

    private void hideFragments(FragmentTransaction fragmentTransaction) {
        if (learnFg != null) {
            fragmentTransaction.hide(learnFg);
        }
        if (zhuyefg != null) {
            fragmentTransaction.hide(zhuyefg);
        }
        if (cmtyFg != null) {
            fragmentTransaction.hide(cmtyFg);
        }
        if (infoFg != null) {
            fragmentTransaction.hide(infoFg);
        }
    }

    private void initView() {
        Bmob.initialize(this, "a2f0cb5fa25b26e579c32b844221a9a3");
//        初始化底部导航栏的控件
        ivStudy = findViewById(R.id.iv_study);
        ivCommunity = findViewById(R.id.iv_community);
        ivMyInfo = findViewById(R.id.iv_myInfo);
        ivzhuye = findViewById(R.id.iv_zhuye);

        rlayoutZheye = findViewById(R.id.zheye);
        rlayoutStudy = findViewById(R.id.rlayout_study);
        rlayoutCommunity = findViewById(R.id.rlayout_community);
        rlayoutMyInfo = findViewById(R.id.rlayout_myInfo);
//      监听fragment切换
        rlayoutZheye.setOnClickListener(MainActivity.this);
        rlayoutStudy.setOnClickListener(MainActivity.this);
        rlayoutCommunity.setOnClickListener(MainActivity.this);
        rlayoutMyInfo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rlayout_study:
                setChoiceItem(0);
                break;
            case R.id.zheye:
                setChoiceItem(1);
                break;
            case R.id.rlayout_community:
                setChoiceItem(2);
                break;
            case R.id.rlayout_myInfo:
                setChoiceItem(3);
                break;
            default:
                break;
        }
    }
}
