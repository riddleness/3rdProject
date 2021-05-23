package com.example.a3rd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Frag4 extends Fragment {
    //식물 MBTI 페이지
    private View view;
    Button tv_test;
    TextView tv_title;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.frag4, container, false);

        tv_title = view.findViewById(R.id.tv_title);
        tv_test = view.findViewById(R.id.tv_test);


        tv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv_title.setVisibility(View.GONE);
//                tv_test.setVisibility(View.GONE);

                FragmentManager fm = getFragmentManager();
                mbtiFrag dialFrag = new mbtiFrag();
                dialFrag.show(fm,"mbtiFrag");




            }
        });


        return view;
    }
}
