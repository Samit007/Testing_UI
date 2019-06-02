package com.example.testing_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private Button btnSum;
    private EditText etOne, etTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etOne=findViewById(R.id.etOne);
        etTwo=findViewById(R.id.etTwo);
        btnSum=findViewById(R.id.btnSum);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(etOne.getText().toString());
                int second = Integer.parseInt(etTwo.getText().toString());
                Arithmetic arithmetic=new Arithmetic();

                int result = arithmetic.add(first,second);
                String res = Integer.toString(result);

                Intent intent=new Intent(Main2Activity.this,ResultActivity.class);
                intent.putExtra("result",res);
                startActivity(intent);
            }
        });
    }
}
