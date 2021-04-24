package com.example.shequtest.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.shequtest.R;
import com.example.shequtest.activity.IntroductoryActivity1;
import com.example.shequtest.activity.Login;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OnBoardingFragment1 extends Fragment {

    //    OnBoardingFragment1 onBoardingFragment1;
//    @BindView(R.id.tiaodenglu)
//    TextView tiaodenglu;
//    private IntroductoryActivity1 introductoryActivity1;
//    private ViewGroup root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        if (root != null) {
//            ViewGroup parent = (ViewGroup) root.getParent();
//            if (parent != null) {
//                parent.removeView(root);
//            }
//            return root;
//        }
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_on_boarding1, container, false);
        return root;
//        root = (ViewGroup) inflater.inflate(R.layout.fragment_on_boarding1, container, false);
//
//        ButterKnife.bind(this, root);
//        introductoryActivity1 = (IntroductoryActivity1) getActivity();
//        tiaodenglu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(introductoryActivity1, Login.class);
//                startActivity(i);
//                ViewGroup parent = (ViewGroup) root.getParent();
//                parent.removeView(root);
//            }
//        });
//        return root;
//    }
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//    }
    }
}

