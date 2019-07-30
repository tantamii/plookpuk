package com.example.plookpuks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class AddVeget extends AppCompatActivity {

    private Button acept;
    private String add;
    private EditText nameMake;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private FirebaseDatabase database ;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_vegetable);

        acept = (Button) findViewById(R.id.aceptbutton);
        nameMake = (EditText)  findViewById(R.id.editMake);


        acept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickAcept();
            }
        });
    }

    void ClickAcept ()
    {

        Intent acept = new Intent(AddVeget.this,Main_Edit.class);
        startActivity(acept);
    }

    /*
    // Create a new user with a first and last name
Map<String, Object> user = new HashMap<>();
user.put("first", "Ada");
user.put("last", "Lovelace");
user.put("born", 1815);

// Add a new document with a generated ID
db.collection("users")
        .add(user)
        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
            }
        })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "Error adding document", e);
            }
        });*/

    void ClickAcepts ()
    {
        Intent make = new Intent(AddVeget.this,Home.class);
        add = nameMake.getText().toString();
        Map<String, Object> farms = new HashMap<>();
        farms.put("name", add);


        db.collection("farms").add(farms);
        Toast.makeText(this,"เพิ่มผักของคูรเรียบร้อยแบล้ว",Toast.LENGTH_LONG).show();

        //databaseReference.child(user.getUid()).child("name"+).setValue(makeName);

        startActivity(make);
    }
}
