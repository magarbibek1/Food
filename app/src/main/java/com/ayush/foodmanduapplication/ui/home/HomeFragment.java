package com.ayush.foodmanduapplication.ui.home;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.ayush.foodmanduapplication.R;
import com.ayush.foodmanduapplication.ui.home.Adapter.BakeriesAdapter;
import com.ayush.foodmanduapplication.ui.home.Adapter.CategoryAdapter;
import com.ayush.foodmanduapplication.ui.home.Adapter.FlavoursAdapter;
import com.ayush.foodmanduapplication.ui.home.Adapter.SuperAdapter;
import com.ayush.foodmanduapplication.ui.home.Adapter.ViewPagerAdapter;
import com.ayush.foodmanduapplication.ui.home.Model.BakeriesViewModel;
import com.ayush.foodmanduapplication.ui.home.Model.FlavoursViewModel;
import com.ayush.foodmanduapplication.ui.home.Model.HomeViewModel;
import com.ayush.foodmanduapplication.ui.home.Model.SuperViewModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    // private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;
    private RecyclerView SuperRecyclerView;
    private RecyclerView BakeriesRecyclerView;
    private RecyclerView FlavourRecyclerView;
    ViewPager viewPager;
    public static List<HomeViewModel> categoryList=new ArrayList<>();
    public static List<SuperViewModel> superList=new ArrayList<>();
    public static List<BakeriesViewModel> bakeriesList=new ArrayList<>();
    public static List<FlavoursViewModel> flavoursList=new ArrayList<>();
    private int position;
    private static final int PAGE_NUM=4;

    private Handler handler=new Handler();
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            viewPager.setCurrentItem(position,true);
            if(position>=PAGE_NUM) position=0;
            else position++;
            handler.postDelayed(runnable,3000);
        }
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        runnable.run();


        recyclerView=view.findViewById(R.id.recycler);
        HomeViewModel homeViewModel=new HomeViewModel(R.drawable.food);
        categoryList=homeViewModel.getListcategory();
        categoryList.add(new HomeViewModel(R.drawable.restaurent));
        categoryList.add(new HomeViewModel(R.drawable.liquare));
        categoryList.add(new HomeViewModel(R.drawable.refreshment));
        categoryList.add(new HomeViewModel(R.drawable.organic));
        categoryList.add(new HomeViewModel(R.drawable.ice));

        CategoryAdapter categoryAdapter=new CategoryAdapter(getActivity(),categoryList);
        recyclerView.setAdapter(categoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));


        SuperRecyclerView=view.findViewById(R.id.recyclerSuper);
        SuperViewModel superViewModel=new SuperViewModel(R.drawable.facebook,"cafe12","pizza","Gausala",R.drawable.ic_battery_full_black_24dp);
        superList=superViewModel.getSuperlist();
        superList.add(new SuperViewModel(R.drawable.coffee,"Kitchen-Cafe","Coffee","Maitidevi",R.drawable.ic_free_breakfast_black_24dp));
        superList.add(new SuperViewModel(R.drawable.burger,"Friends-Cafe","Burger","Mid-baneswor",R.drawable.ic_toys_black_24dp));
        superList.add(new SuperViewModel(R.drawable.momo,"Good-Food-Cafe","MO:MO","Chabel",R.drawable.ic_spa_black_24dp));
        superList.add(new SuperViewModel(R.drawable.chicken_chilli,"Red-House-Cafe","Chiken Chilli","New-baneswor",R.drawable.ic_restaurant_menu_black_24dp));
        superList.add(new SuperViewModel(R.drawable.susage,"AmiGO-Cafe","Susege","New-baneswor",R.drawable.ic_room_service_black_24dp));
        SuperAdapter superAdapter=new SuperAdapter(getActivity(),superList);
        SuperRecyclerView.setAdapter(superAdapter);
        SuperRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));


        BakeriesRecyclerView=view.findViewById(R.id.bakeriesRecycler);
        BakeriesViewModel bakeriesViewModel=new BakeriesViewModel(R.drawable.susage,"Chocolote");
        bakeriesList=bakeriesViewModel.getBakeriesList();
        bakeriesList.add(new BakeriesViewModel(R.drawable.chocolates,"Chocolate"));
        bakeriesList.add(new BakeriesViewModel(R.drawable.cake,"Cakes"));
        bakeriesList.add(new BakeriesViewModel(R.drawable.cookies,"Cream cookies"));
        bakeriesList.add(new BakeriesViewModel(R.drawable.choco,"Choco Cream"));
        bakeriesList.add(new BakeriesViewModel(R.drawable.fine_cakes,"Fine Cakes"));
        bakeriesList.add(new BakeriesViewModel(R.drawable.chocolates,"Chocolates"));
        BakeriesAdapter bakeriesAdapter=new BakeriesAdapter(getActivity(),bakeriesList);
        BakeriesRecyclerView.setAdapter(bakeriesAdapter);
        BakeriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));


        FlavourRecyclerView=view.findViewById(R.id.recyclerflavour);
        FlavoursViewModel flavoursViewModel=new FlavoursViewModel(R.drawable.chocolates,"choco","restro");
        flavoursList=flavoursViewModel.getFlavoursList();
        flavoursList.add(new FlavoursViewModel(R.drawable.bota,"Bota","Local Jhol Mo:Mo"));
        flavoursList.add(new FlavoursViewModel(R.drawable.katiya,"Special Chicken...","Katiya House"));
        flavoursList.add(new FlavoursViewModel(R.drawable.duck_choila,"Duck Choila","8 Degrees"));
        flavoursList.add(new FlavoursViewModel(R.drawable.buff_choila,"Buff Choila","The Village cafe"));
        flavoursList.add(new FlavoursViewModel(R.drawable.chaku_yomari,"Chaku Yomari","Yomari Corner"));
        FlavoursAdapter flavoursAdapter=new FlavoursAdapter(getActivity(),flavoursList);
        FlavourRecyclerView.setAdapter(flavoursAdapter);
        FlavourRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        return view;

    }


}