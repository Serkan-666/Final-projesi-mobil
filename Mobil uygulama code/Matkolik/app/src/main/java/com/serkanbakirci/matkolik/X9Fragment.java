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

public class X9Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {



        ViewGroup viewGroup9 = (ViewGroup) inflater.inflate(R.layout.fragment_x9,container,false);
        TextView number1 = viewGroup9.findViewById(R.id.number1);
        TextView number2 = viewGroup9.findViewById(R.id.number2);
        TextView hacim = viewGroup9.findViewById(R.id.hacim);
        TextView alan = viewGroup9.findViewById(R.id.alan);

        Button button = viewGroup9.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {

                }
                else
                {
                    double no1 = Integer.parseInt(number1.getText().toString());
                    double no2 = Integer.parseInt(number2.getText().toString());
                    double a = (no2*no2)*no1/3;
                    double h = 2*(no2*no2)+4*(no1*no2);

                    hacim.setText(String.valueOf(h));
                    alan.setText(String.valueOf(a));

                }


            }





        });




        return viewGroup9;
    }
}