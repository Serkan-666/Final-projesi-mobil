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

public class X7Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup7 = (ViewGroup) inflater.inflate(R.layout.fragment_x7,container,false);
        TextView number1 = viewGroup7.findViewById(R.id.number1);
        TextView result = viewGroup7.findViewById(R.id.hacim);
        Button button = viewGroup7.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (number1.getText().toString().matches(""))
                {

                }
                else
                {
                    int no1 = Integer.parseInt(number1.getText().toString());
                    int a=0;
                    for (int i = 1; i <= no1; i++)
                    {
                        if(no1%i == 0)
                        {
                            a++;
                        }
                    }
                    if(a==2)
                        result.setText(String.valueOf("Seçtiğiniz asaldır."));
                    else
                        result.setText(String.valueOf("Seçtiğiniz asal değildir."));
                }


            }





        });




        return viewGroup7;
    }
}