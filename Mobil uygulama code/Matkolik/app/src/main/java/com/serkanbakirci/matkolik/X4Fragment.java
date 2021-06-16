package com.serkanbakirci.matkolik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class X4Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup4 = (ViewGroup) inflater.inflate(R.layout.fragment_x4,container,false);
        TextView number1 = viewGroup4.findViewById(R.id.number1);
        TextView hacim = viewGroup4.findViewById(R.id.alan);
        Button button = viewGroup4.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (number1.getText().toString().matches(""))
                {

                }
                else
                {
                    double no1 = Integer.parseInt(number1.getText().toString());
                    double pi = 3.14;
                    double h =(4 * pi * no1 * no1 * no1)/3;
                    hacim.setText(String.valueOf("Hacim :" + h));
                }

            }
        });




        return viewGroup4;
    }
}