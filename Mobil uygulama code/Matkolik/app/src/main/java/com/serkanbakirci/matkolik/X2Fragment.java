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

public class X2Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup2 = (ViewGroup) inflater.inflate(R.layout.fragment_x2, container, false);

        TextView yukseklık = viewGroup2.findViewById(R.id.number1);
        TextView taban = viewGroup2.findViewById(R.id.number2);
        TextView alan = viewGroup2.findViewById(R.id.alan);
        Button button = viewGroup2.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (yukseklık.getText().toString().matches("") || taban.getText().toString().matches(""))
                {

                }
                else
                {
                    double no1 = Integer.parseInt(yukseklık.getText().toString());
                    double no2 = Integer.parseInt(taban.getText().toString());

                    double ahesap = no1 * no2 / 2;
                    alan.setText(String.valueOf("Alan :" + ahesap));
                }

            }
        });




        return viewGroup2;
    }
}