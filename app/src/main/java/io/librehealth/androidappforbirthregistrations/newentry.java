package io.librehealth.androidappforbirthregistrations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class newentry extends storage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newentry);

      final storage s = new storage();

        Button button1=findViewById(R.id.signup);
        final EditText edn1=findViewById(R.id.edn1);
        final EditText edn2=findViewById(R.id.edn2);
        final EditText edn3=findViewById(R.id.edn3);
        final EditText edn4=findViewById(R.id.edn4);
        final EditText edn5=findViewById(R.id.edn5);
        final EditText edn6=findViewById(R.id.edn6);
        final EditText edn7=findViewById(R.id.edn7);
        final EditText edn8=findViewById(R.id.edn8);
        final EditText edn9=findViewById(R.id.edn9);
        final EditText edn10=findViewById(R.id.edn10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s.hospitalidn=edn1.getText().toString();
                s.placeofbirthn=edn2.getText().toString();
                s.dateofbirthn=edn3.getText().toString();
                s.timeofbirthn=edn4.getText().toString();
                s.sexofchildn=edn5.getText().toString();
                s.nameofmothern=edn6.getText().toString();
                s.nameoffathern=edn7.getText().toString();
                s.weightofchildn=edn8.getText().toString();
                s.heightofchildn=edn9.getText().toString();
                s.headcircumferencen=edn10.getText().toString();
                Intent myIntent = new Intent(getBaseContext(),   data_success.class);
                startActivity(myIntent);
            }
        });
    }
}
