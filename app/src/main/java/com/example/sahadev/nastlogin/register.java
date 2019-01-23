package com.example.sahadev.nastlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;

public class register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText firstname, lastname, email, password, confirmpassword;
    Spinner spinner;
    Button signup;
    CheckBox check_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = findViewById(R.id.spinner);
        check_box = findViewById(R.id.re_check_box);
        signup = findViewById(R.id.re_signup);
        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email = findViewById(R.id.re_email);
        password = findViewById(R.id.et_password);
        confirmpassword = findViewById(R.id.et_confirm_password);
        signup.setEnabled(false);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        check_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    signup.setEnabled(true);
                } else {
                    signup.setEnabled(false);
                }
            }


            signup.setOnClickListener(new View.OnClickListener());

            public void onclick(View view) {

            }

        }
    }

    ;
}

    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String text = adapterView.getItemAtPosition(position).toString();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

}
