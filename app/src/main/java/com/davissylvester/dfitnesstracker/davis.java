package com.davissylvester.dfitnesstracker;


import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class davis extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public davis() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        mRecyclerView = getView().findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_davis, container, false);
    }



}
