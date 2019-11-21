package com.dilli.practicetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdomessi,rdorock,rdoeverst;
    private EditText etfirstname,etlastname,etaddress;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstname = findViewById(R.id.etfirstname);
        etlastname = findViewById(R.id.etlastname);
        etaddress = findViewById(R.id.etaddress);

        rdomessi=findViewById(R.id.rdomessi);
        rdorock=findViewById(R.id.rdorock);
        rdoeverst=findViewById(R.id.rdoeverest);

        imgview=findViewById(R.id.imgview);

        rdomessi.setOnClickListener(this);
        rdorock.setOnClickListener(this);
        rdoeverst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rdomessi:
                imgview.setImageResource(R.drawable.messi);
                break;
            case R.id.rdorock:
                imgview.setImageResource(R.drawable.rock);
                break;
            case R.id.rdoeverest:
                imgview.setImageResource(R.drawable.everst);
                break;
        }
    }
}
