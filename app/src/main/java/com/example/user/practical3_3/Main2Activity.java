package com.example.user.practical3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ToggleButton toggleOnOff;
    ImageView imageViewIcon;
    TextView textViewMessage;
    StringBuilder message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageViewIcon = (ImageView) findViewById(R.id.imageViewIcon);






        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        Spinner spinnerDay = (Spinner)findViewById(R.id.spinnerDay);
        spinnerDay.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.day, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDay.setAdapter(adapter);
    }

    public void showPicture(View v) {
        boolean on = ((ToggleButton) v).isChecked();
        if (on) imageViewIcon.setVisibility(View.VISIBLE);
        else imageViewIcon.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        textViewMessage.setText(adapterView.getItemAtPosition(i).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
