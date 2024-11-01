package com.ukom.resto2.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ukom.resto2.R;
import com.ukom.resto2.adapters.FeaturedAdapter;
import com.ukom.resto2.adapters.FeaturedVerAdapter;
import com.ukom.resto2.models.FeaturedModel;
import com.ukom.resto2.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class ThirdFragment extends Fragment {

    /////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    ////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        /////////Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.new1,"New 1","Description 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.new2,"New 2","Description 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.new3,"New 3","Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);


        ////////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.new11,"New 1","Pink Lava","4.8","10:00-13:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.new22,"New 2","Corn Dog","4.8","12:00-20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.new33,"New 3","Candy","4.8","09:00-20:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}