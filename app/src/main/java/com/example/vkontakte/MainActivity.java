package com.example.vkontakte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        public static final String TEXT = "GOLGOL";
        public static final String PHONE = "+79090901111";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClick(View view){
            EditText editText = (EditText)findViewById(R.id.editText);
            String s = editText.getText().toString();
            EditText editText2 = (EditText)findViewById(R.id.editText2);
            String s1 = editText2.getText().toString();
            TextView textView4 = (TextView)findViewById(R.id.textView4);
            textView4.setText("");
            TextView textView3 = (TextView)findViewById(R.id.textView3);
            textView3.setText("");
            //  Log.d("TUTUSHKI", "normalno");
            proverka(s,s1);
        }
        public void proverka(String s, String s1){
            if(s.equals(TEXT) && s1.equals(PHONE) ) {
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                textView4.setText("Логин и пароль введены корректно");
            }
            else {
                EditText editText = (EditText)findViewById(R.id.editText);
                   editText.setText("");
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                   editText2.setText("");
                TextView textView3 = (TextView)findViewById(R.id.textView3);
                textView3.setText("Вы ошиблись в логине или пароле");
            }
        }
    }