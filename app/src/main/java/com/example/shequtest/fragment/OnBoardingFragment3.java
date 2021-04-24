package com.example.shequtest.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.shequtest.R;
import com.example.shequtest.activity.Login;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OnBoardingFragment3 extends Fragment {

    @BindView(R.id.tiaodenglu2)
    TextView tiaodenglu2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_on_boarding3, container, false);
        ButterKnife.bind(this, root);

        tiaodenglu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
//                getActivity().onBackPressed();
            }
        });
        return root;
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//    }
}
