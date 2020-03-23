package io.librehealth.androidappforbirthregistrations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hospitalid extends AppCompatActivity {

    public String val1n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitalid);

        Button button1=findViewById(R.id.hospitalid);
        EditText val1=findViewById(R.id.val1);
        val1n = val1.getText().toString();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),   viewdata.class);
                startActivity(myIntent);
            }
        });
    }
}
