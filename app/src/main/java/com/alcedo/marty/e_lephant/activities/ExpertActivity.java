package com.alcedo.marty.e_lephant.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.alcedo.marty.e_lephant.R;

public class ExpertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert);
    }

    public void selectedLive(View v)
    {
        Toast.makeText(this, "Appel de Romane", Toast.LENGTH_LONG).show();
        Intent cal = new Intent(ExpertActivity.this, CallActivity.class);
        startActivity(cal);
    }
}
