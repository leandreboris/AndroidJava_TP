package com.example.tp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText myuser, mypass;
    Button mybtn;

    static int cmp = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myuser = (EditText) findViewById(R.id.login);
        mypass = (EditText) findViewById(R.id.password);
        mybtn = (Button) findViewById(R.id.btnconnect);


        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myuser.getText().toString().isEmpty() || mypass.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs ", Toast.LENGTH_SHORT).show();
                }

                if(myuser.getText().toString().equals("admin") && mypass.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Connection en cours ...", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Identifiants saisis incorrects", Toast.LENGTH_SHORT).show();
                    cmp --;
                    if(cmp == 0){
                        mybtn.setEnabled(false);
                    }
                }

            }
        });

    }
}