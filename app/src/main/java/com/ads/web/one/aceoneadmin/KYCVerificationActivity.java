package com.ads.web.one.aceoneadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class KYCVerificationActivity extends AppCompatActivity {

    SwitchMaterial kycSwitch;
    EditText interest_rate, max_loan_amount, max_tenure, processing_fee_rate, approved_limit;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kycverification);
        kycSwitch = findViewById(R.id.switch_kyc);
        interest_rate = findViewById(R.id.et_interest_rate);
        max_loan_amount = findViewById(R.id.et_max_loan_amount);
        max_tenure = findViewById(R.id.et_tenure);
        processing_fee_rate = findViewById(R.id.et_processing_fee_rate);
        approved_limit = findViewById(R.id.et_approved_limit_amount);
        btnSubmit = findViewById(R.id.btn_submit);
        kycSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    //write function when switch button is checked
                } else {

                }
            }
        });
    }
}