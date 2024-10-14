package com.ukom.resto2.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ukom.resto2.R;
import com.ukom.resto2.adapters.HomeHorAdapter;
import com.ukom.resto2.adapters.HomeVerAdapter;
import com.ukom.resto2.adapters.UpdateVerticalRec;
import com.ukom.resto2.databinding.FragmentHomeBinding;
import com.ukom.resto2.models.HomeHorModel;
import com.ukom.resto2.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelsList;
    HomeHorAdapter homeHorAdapter;

    //////////////////////Vertical
    ArrayList<HomeVerModel> homeVerModelsList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        //////////////////////Horizontal RecyclerView
        homeHorModelsList = new ArrayList<>();

        homeHorModelsList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.hamburger,"Hamburger"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fries"));
        homeHorModelsList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelsList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        //////////////////////Vertical RecyclerView
        homeVerModelsList = new ArrayList<>();


        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelsList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}