//package com.example.amir.sqlite;
//
//import android.annotation.SuppressLint;
//import android.database.Cursor;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.BaseAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//
//public class AddNewContacts extends AppCompatActivity {
//
//    EditText name,email;
//    Button save;
//    private DatabaseHelper databaseHelper;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_new_contacts);
//
//        name = (EditText) findViewById(R.id.etname1);
//
//        email =(EditText) findViewById(R.id.etemail1);
//
//        save = (Button) findViewById(R.id.save);
//
//
//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                databaseHelper = new DatabaseHelper(AddNewContacts.this);
//                boolean result = databaseHelper.insertData(name.getText().toString(), email.getText().toString());
//                if (result)
//                {Toast.makeText(AddNewContacts.this, "Data Insterted", Toast.LENGTH_SHORT).show();
//              } else
//                    Toast.makeText(AddNewContacts.this,"Data Not Insterted",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
