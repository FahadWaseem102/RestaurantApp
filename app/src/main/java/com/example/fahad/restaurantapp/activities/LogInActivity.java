package com.example.fahad.restaurantapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fahad.restaurantapp.R;

public class LogInActivity extends AppCompatActivity {

    EditText edEmail ;
    EditText edPassword ;
    Button btnLogIn ;
    Button btnCancel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edEmail = findViewById(R.id.ed_email) ;
        edPassword = findViewById(R.id.ed_password) ;
        btnLogIn = findViewById(R.id.button_login) ;
        btnCancel = findViewById(R.id.button_cancel) ;

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LogInActivity.this, HomeActivity.class) ;
                startActivity(intent);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
