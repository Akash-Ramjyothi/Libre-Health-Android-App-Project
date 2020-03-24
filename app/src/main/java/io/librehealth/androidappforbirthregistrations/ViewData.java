package io.librehealth.androidappforbirthregistrations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ViewData extends Storage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);

        final Storage q = new Storage();
        Button button1=findViewById(R.id.home);
        Button button2=findViewById(R.id.updateview);

        final EditText ed1=findViewById(R.id.ed1);
        final EditText ed2=findViewById(R.id.ed2);
        final EditText ed3=findViewById(R.id.ed3);
        final EditText ed4=findViewById(R.id.ed4);
        final EditText ed5=findViewById(R.id.ed5);
        final EditText ed6=findViewById(R.id.ed6);
        final EditText ed7=findViewById(R.id.ed7);
        final EditText ed8=findViewById(R.id.ed8);
        final EditText ed9=findViewById(R.id.ed9);
        final EditText ed10=findViewById(R.id.ed10);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),   User.class);
                startActivity(myIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),   DataSuccess.class);
                startActivity(myIntent);
            }
        });
    }
}
