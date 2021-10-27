package com.example.addevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityAddClicked extends AppCompatActivity {


    //private EditText editTextName;
    //private EditText editTextCommit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_add_clicked);

        EditText editTextName = (EditText)findViewById(R.id.editTextName);
        EditText editTextCommit = (EditText)findViewById(R.id.editTextComments);

        Button submitButtom = (Button) findViewById(R.id.submitButton);
        submitButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hint = editTextName.getText().toString() + " is submitted";
                Toast.makeText(MainActivityAddClicked.this,hint,Toast.LENGTH_SHORT).show();
            }
        });

    }
}