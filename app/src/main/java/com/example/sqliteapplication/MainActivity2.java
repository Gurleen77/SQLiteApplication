package com.example.sqliteapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    DBHelper DB;
    List<ViewList> viewList1;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_data_layout);
        viewList1 = new ArrayList<>();
        listView = findViewById(R.id.listView);
        DB = new DBHelper(this);
        Cursor res1 = DB.getdata();
        while(res1.moveToNext()){
             ViewList info  = new ViewList((String)res1.getString(0),(String)res1.getString(1),(String)res1.getString(2));
            viewList1.add(info);
        }
        ViewDataAdapter iv = new ViewDataAdapter(MainActivity2.this,R.layout.view_list,viewList1);
        listView.setAdapter(iv);

    }
}
