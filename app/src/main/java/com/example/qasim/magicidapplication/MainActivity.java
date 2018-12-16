package com.example.qasim.magicidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        etID=findViewById(R.id.etID);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber= etID.getText().toString().trim();
                String dob= idNumber.substring(0,6);
                int gender=Integer.parseInt(Character.toString(idNumber.charAt(6)));
                String sGender;
                if(gender<5)
                    sGender="Female";
                else
                    sGender="Male";
                int nationality=Integer.parseInt(Character.toString(idNumber.charAt(10)));
                String sNationality;
                if(nationality==0)
                    sNationality="SA Citizen";
                else
                    sNationality="Permament Resident";

                tvResult.setText("Date Of Birth: "+ dob+"\nGender:"+ sGender+"\nNationality:"+sNationality);
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}
