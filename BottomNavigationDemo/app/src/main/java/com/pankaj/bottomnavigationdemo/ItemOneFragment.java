package com.pankaj.bottomnavigationdemo;

import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemOneFragment extends Fragment {

    View rootView;
    Button btn;

    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate(R.layout.fragment_item_one, container, false);

        btn=rootView.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.frame_layout, new ItemTwoFragment());
                fr.commit();

            }
        });



        return  rootView;
    }
}
