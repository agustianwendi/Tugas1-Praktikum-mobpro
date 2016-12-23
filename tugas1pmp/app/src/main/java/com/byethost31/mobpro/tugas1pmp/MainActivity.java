package com.byethost31.mobpro.tugas1pmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button submit;
    EditText nama, email, nim, angkatan;
    TextView Tnama, Tnim, Temail, Tangkatan;
    String Snama, Semail , Snim, Sangkatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit= (Button) findViewById(R.id.btnSubmit);
        nama = (EditText) findViewById(R.id.addnama);
        nim = (EditText) findViewById(R.id.addnim);
        email = (EditText) findViewById(R.id.addemail);
        angkatan = (EditText) findViewById(R.id.addangkatan);

        Tnama = (TextView) findViewById(R.id.nama);
        Tnim = (TextView) findViewById(R.id.nim);
        Temail = (TextView) findViewById(R.id.email);
        Tangkatan = (TextView) findViewById(R.id.angkatan);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Snama = nama.getText().toString();
        Semail = email.getText().toString();
        Snim = nim.getText().toString();
        Sangkatan = angkatan.getText().toString();

        Tnama.setText("NAMA       : "+Snama);
        Tnim.setText("NIM         : "+Snim);
        Temail.setText("EMAIL     : "+Semail);
        Tangkatan.setText("ANGKATAN     : "+Sangkatan);

        nama.setVisibility(View.INVISIBLE);
        nim.setVisibility(View.INVISIBLE);
        email.setVisibility(View.INVISIBLE);
        angkatan.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);

    }
}