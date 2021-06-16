package com.serkanbakirci.matkolik.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.serkanbakirci.matkolik.R;
import com.serkanbakirci.matkolik.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_home,container,false);


        return  viewGroup;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}