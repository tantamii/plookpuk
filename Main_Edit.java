package com.example.plookpuks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_Edit extends AppCompatActivity {

    private com.google.android.material.floatingactionbutton.FloatingActionButton add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_farm);

        add = (com.google.android.material.floatingactionbutton.FloatingActionButton) findViewById(R.id.floatingActionButton3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickAdd();
            }
        });

    }

    void ClickAdd ()
    {

        Intent add = new Intent(Main_Edit.this,AddVeget.class);
        startActivity(add);
    }
}
