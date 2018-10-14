package com.alcedo.marty.e_lephant.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alcedo.marty.e_lephant.R;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }

    public void selectedAccept(View v)
    {
        Toast.makeText(this, "Live", Toast.LENGTH_LONG).show();
        Intent cal = new Intent(CallActivity.this, LiveActivity.class);
        startActivity(cal);
    }
}
