package com.serkanbakirci.matkolik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class X1Fragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup1 = (ViewGroup) inflater.inflate(R.layout.fragment_x1,container,false);

        TextView number1 = viewGroup1.findViewById(R.id.number1);
        TextView number2 = viewGroup1.findViewById(R.id.number2);
        TextView cevre = viewGroup1.findViewById(R.id.cevre);
        TextView alan = viewGroup1.findViewById(R.id.alan);
        Button button = viewGroup1.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {

                }
                else
                {
                    double no1 = Integer.parseInt(number1.getText().toString());
                    double no2 = Integer.parseInt(number2.getText().toString());

                    double chesap = 2 * (no1 + no2);
                    double ahesap = no1 * no2;
                    cevre.setText(String.valueOf("Çevre :" + chesap));
                    alan.setText(String.valueOf("Alan :" + ahesap));
                }

            }
        });




        return viewGroup1;
    }
}