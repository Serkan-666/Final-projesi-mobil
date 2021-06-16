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

public class X8Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup8 = (ViewGroup) inflater.inflate(R.layout.fragment_x8,container,false);
        TextView number1 = viewGroup8.findViewById(R.id.number1);
        TextView result = viewGroup8.findViewById(R.id.hacim);
        Button button = viewGroup8.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (number1.getText().toString().matches(""))
                {

                }
                else
                {
                    int deger = Integer.parseInt(number1.getText().toString());
                    int faktoriyel = 1;
                    for(int i = 1; i<= deger; i++){
                        faktoriyel = faktoriyel * i;
                    }
                    result.setText(String.valueOf(faktoriyel));
                }


            }





        });




        return viewGroup8;
    }
}