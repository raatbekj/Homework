package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button enter;
    private TextView Reg;
    private TextView ent;
    private TextView Waste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.pasword);
        enter = findViewById(R.id.Enter);
        Reg=findViewById(R.id.reg);
        ent=findViewById(R.id.Ent);
        Waste=findViewById(R.id.Waste);



        enter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (Email.getText().toString().equals("Raatbek@gmail.com")&&Password.getText().
                       toString().equals("12345")) {
                   Email.setAlpha(0f);
                   Password.setAlpha(0f);
                   enter.setAlpha(0f);
                   Reg.setAlpha(0f);
                   Waste.setAlpha(0f);
                   Toast toast = Toast.makeText(getApplicationContext(),
                           "Вы успешно вошли!!", Toast.LENGTH_SHORT);
                   toast.show();
               }else {
                   Toast toast = Toast.makeText(getApplicationContext(),
                           "Неверная почта или пороль!", Toast.LENGTH_SHORT);
                   toast.show();
                   return;
               }
           }
       });

        Password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.orange),PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (Password.length() <= 0 ) {
                    enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.gray), PorterDuff.Mode.SRC_ATOP);
                }

            }
        });
         Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.orange),PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if ( Email.length() <= 0) {
                    enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.gray), PorterDuff.Mode.SRC_ATOP);
                }
            }
        });

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Password.length() > 0 || Email.length() > 0) {
                    enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.orange), PorterDuff.Mode.SRC_ATOP);

                }
            }


        });
        Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Password.length() > 0 || Email.length() > 0) {
                    enter.getBackground().mutate().setColorFilter(getResources().getColor(R.color.orange), PorterDuff.Mode.SRC_ATOP);
                }
            }
        });


            }

        }