package com.example.graduation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.graduation.R;
import com.example.graduation.adapter.Adapter_Items_Of_Menu;
import com.example.graduation.adapter.Adapter_home;
import com.example.graduation.adapter.UpdateItems;
import com.example.graduation.models.Items_Of_Menu;
import com.example.graduation.models.Home_Models;
import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UpdateItems {

RecyclerView homeHor,homeVer;
ArrayList<Home_Models> homeModel;
Adapter_home homeAdapter;

////vertical
ArrayList<Items_Of_Menu>  homeModelVer;
Adapter_Items_Of_Menu homeAdapterVer;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        homeHor = root.findViewById(R.id.recy_home);
        homeVer = root.findViewById(R.id.recy_home2);


        ///horizantal menu
        homeModel = new ArrayList<>();
        homeModel.add(new Home_Models(R.drawable.appetizers,"apptizer"));
        homeModel.add(new Home_Models(R.drawable.salad,"salads"));
        homeModel.add(new Home_Models(R.drawable.main_dish,"MAIN DISH "));
        homeModel.add(new Home_Models(R.drawable.burger,"burgers"));
        homeModel.add(new Home_Models(R.drawable.cold_dring,"cold drinks"));
        homeModel.add(new Home_Models(R.drawable.hot_drinck,"hot drinks"));
        homeModel.add(new Home_Models(R.drawable.dessert,"Desserts"));
        homeModel.add(new Home_Models(R.drawable.hooka,"hoka"));

        homeAdapter =  new Adapter_home(this,getActivity(),homeModel);
        homeHor.setAdapter(homeAdapter);
        homeHor.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHor.setHasFixedSize(true);
        homeHor.setNestedScrollingEnabled(false);


        /////vertical menu item
        homeModelVer = new ArrayList<>();

        homeAdapterVer =  new Adapter_Items_Of_Menu(getActivity(),homeModelVer);
        homeVer.setAdapter(homeAdapterVer);
        GridLayoutManager grid = new GridLayoutManager(getActivity(),3,GridLayoutManager.VERTICAL,false);
        homeVer.setLayoutManager(grid);

       homeVer.setHasFixedSize(true);
////      homeVer.setNestedScrollingEnabled(false);
        return root;
    }


    @Override
    public void callBack(int position, ArrayList<Items_Of_Menu> list) {
        homeAdapterVer = new Adapter_Items_Of_Menu(getContext(),list);
        homeAdapterVer.notifyDataSetChanged();
        homeVer.setAdapter(homeAdapterVer);



    }
}