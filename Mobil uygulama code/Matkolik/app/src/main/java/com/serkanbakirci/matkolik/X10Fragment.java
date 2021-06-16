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

public class X10Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup10 = (ViewGroup) inflater.inflate(R.layout.fragment_x10,container,false);
        TextView number1 = viewGroup10.findViewById(R.id.number1);
        TextView number2 = viewGroup10.findViewById(R.id.number2);
        TextView number3 = viewGroup10.findViewById(R.id.number3);
        TextView hacim = viewGroup10.findViewById(R.id.hacim);
        TextView alan = viewGroup10.findViewById(R.id.alan);

        Button button = viewGroup10.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (number1.getText().toString().matches("") || number2.getText().toString().matches("") || number3.getText().toString().matches(""))
                {

                }
                else
                {
                    int no1 = Integer.parseInt(number1.getText().toString());
                    int no2 = Integer.parseInt(number2.getText().toString());
                    int no3 = Integer.parseInt(number3.getText().toString());
                    int a = no1*no2*no3;
                    int h = 2*(no1*no2)+2*(no1*no3)+2*(no2*no3);

                    hacim.setText(String.valueOf(h));
                    alan.setText(String.valueOf(a));
                }


            }





        });




        return viewGroup10;
    }
}