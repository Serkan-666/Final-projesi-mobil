package com.serkanbakirci.matkolik;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class X3Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        ViewGroup viewGroup3 = (ViewGroup) inflater.inflate(R.layout.fragment_x3,container,false);

        TextView number1 = viewGroup3.findViewById(R.id.number1);
        TextView hacim = viewGroup3.findViewById(R.id.alan);
        Button button = viewGroup3.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (number1.getText().toString().matches(""))
                {

                }
                else
                {
                    int no1 = Integer.parseInt(number1.getText().toString());
                    int h3 = no1 *no1 * no1;
                    hacim.setText(String.valueOf("Hacim :" + h3));
                }

            }
        });




        return viewGroup3;
    }
}