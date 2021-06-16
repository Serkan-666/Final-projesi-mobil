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

public class X5Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup5 = (ViewGroup) inflater.inflate(R.layout.fragment_x5,container,false);
        TextView number1 = viewGroup5.findViewById(R.id.number1);
        TextView number2 = viewGroup5.findViewById(R.id.number2);
        TextView result = viewGroup5.findViewById(R.id.hacim);
        Button button = viewGroup5.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(number1.getText().toString());
                int r = Integer.parseInt(number2.getText().toString());
                int x = n - r;
                int nf = 1;
                for(int i = 1; i<= n; i++){
                    nf = nf * i;
                }
                int rf = 1;
                for(int i = 1; i<= r; i++){
                    rf = rf * i;
                }
                int xf = 1;
                for(int i = 1; i<= x; i++){
                    xf = xf * i;
                }
                double sonuc = nf/(rf*xf);
                result.setText(String.valueOf(sonuc));

            }
        });




        return viewGroup5;
    }
}