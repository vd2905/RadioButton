package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.radiobutton.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.category.setText("Male");
            }
        });
        binding.female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.category.setText("Female");
            }
        });
        binding.java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.java.isChecked())
                {
                    list.add("Java/");
                    binding.category.setText(""+list.get(0));
                }
                else if(!binding.java.isChecked())
                {
                    list.remove("Java/");
                    binding.category.setText(""+list.get(0));
                }
            }
        });
        binding.kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.kotlin.isChecked())
                {
                    list.add("Kotlin/");
                    binding.category.setText(""+list.get(1));
                }
                else if(!binding.kotlin.isChecked())
                {
                    list.remove("Kotlin/");
                    binding.category.setText(""+list.get(1));
                }
            }
        });
        binding.python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.python.isChecked())
                {
                    list.add("Python/");
                    binding.category.setText(""+list.get(2));
                }
                else if(!binding.python.isChecked())
                {
                    list.remove("Python/");
                    binding.category.setText(""+list.get(2));
                }
            }
        });
    }
}