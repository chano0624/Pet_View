package com.example.pet_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        TextView text1, text2;
        CheckBox check1;
        RadioGroup Rgroup;
        RadioButton RdoDog, RdoCat, RdoRabbit;
        Button button;
        ImageView ImgPet;

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        check1 = (CheckBox) findViewById(R.id.check1);
        Rgroup = (RadioGroup) findViewById(R.id.Rgroup);
        RdoDog = (RadioButton) findViewById(R.id.RdoDog);
        RdoCat = (RadioButton) findViewById(R.id.RdoCat);
        RdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);
        button = (Button) findViewById(R.id.button);
        ImgPet = (ImageView) findViewById(R.id.imageView);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check1.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    Rgroup.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    Rgroup.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    ImgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(Rgroup.getCheckedRadioButtonId()) {
                    case R.id.RdoDog:
                        ImgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        ImgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        ImgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}