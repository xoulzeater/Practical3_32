package com.example.user.practical3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

import com.example.user.practical3_3.R;

import static com.example.user.practical3_3.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View v) {
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);
        int selectedId = radioSexGroup.getCheckedRadioButtonId(); // find the radiobutton by returned id
        radioSexButton = (RadioButton) findViewById(selectedId); Toast.makeText(this,

        radioSexButton.getText(), Toast.LENGTH_SHORT).show();
    }
}


