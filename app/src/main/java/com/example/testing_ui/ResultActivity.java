package com.example.testing_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult=findViewById(R.id.tvResult);

        Bundle bundle= getIntent().getExtras();
        if (bundle!=null){
            tvResult.setText(bundle.getString("result"));
        }
    }
}
