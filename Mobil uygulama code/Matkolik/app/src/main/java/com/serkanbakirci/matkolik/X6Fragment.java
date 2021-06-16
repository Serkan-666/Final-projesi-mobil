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

public class X6Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup6 = (ViewGroup) inflater.inflate(R.layout.fragment_x6,container,false);

        TextView number1 = viewGroup6.findViewById(R.id.number1);
        TextView number2 = viewGroup6.findViewById(R.id.number2);
        TextView result = viewGroup6.findViewById(R.id.hacim);
        Button button = viewGroup6.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {

                }
                else
                {
                    int no1 = Integer.parseInt(number1.getText().toString());
                    int no2 = Integer.parseInt(number2.getText().toString());
                    double h2 = no1*no1 + no2*no2;
                    double h = Math.sqrt(h2);
                    result.setText(String.valueOf(h));
                }




            }
        });




        return viewGroup6;
    }
}