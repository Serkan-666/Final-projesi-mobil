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

public class X13Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup13 = (ViewGroup) inflater.inflate(R.layout.fragment_x13,container,false);
        TextView number1 = viewGroup13.findViewById(R.id.number1);
        TextView number2 = viewGroup13.findViewById(R.id.number2);
        TextView hacim = viewGroup13.findViewById(R.id.hacim);
        TextView alan = viewGroup13.findViewById(R.id.alan);

        Button button = viewGroup13.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {

                }
                else
                {
                    int no1 = Integer.parseInt(number1.getText().toString());
                    int no2 = Integer.parseInt(number2.getText().toString());
                    double a = 2 * (no2 * no2 * Math.sqrt(3)/4) + 3 * no1 * no2;
                    double h = (no2 * no2 * Math.sqrt(3)/4) * no1;

                    hacim.setText(String.valueOf(h));
                    alan.setText(String.valueOf(a));
                }


            }





        });




        return viewGroup13;
    }
}