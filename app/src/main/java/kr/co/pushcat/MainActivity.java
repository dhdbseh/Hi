package kr.co.pushcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id = findViewById(R.id.et_id);
        btn_test = findViewById(R.id,btn_test);

        btn_test.setOnClickListener((new.View.onClickListener));


    }
}
