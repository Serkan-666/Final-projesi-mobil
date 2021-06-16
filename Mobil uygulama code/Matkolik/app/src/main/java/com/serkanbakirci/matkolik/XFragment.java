package com.serkanbakirci.matkolik;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class XFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_x,container,false);

        TextView yaricap = viewGroup.findViewById(R.id.number1);
        TextView cevre = viewGroup.findViewById(R.id.cevre);
        TextView alan = viewGroup.findViewById(R.id.alan);
        Button button = viewGroup.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (yaricap.getText().toString().matches(""))
                {

                }
                else
                {
                    double no1 = Integer.parseInt(yaricap.getText().toString());
                    double pi = 3.14;
                    double chesap = 2 * pi* no1;
                    double ahesap = pi * no1 * no1;
                    cevre.setText(String.valueOf("Çevre :" + chesap));
                    alan.setText(String.valueOf("Alan :" + ahesap));

                }

            }
        });




        return viewGroup;
    }
}