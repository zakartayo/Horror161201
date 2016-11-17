package com.horrornumber1.millitarystory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MillitaryActivity extends AppCompatActivity {

    ArrayAdapter<String> mAdapter;
    ListView simpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_millitary);

        simpleListView = (ListView) findViewById(R.id.millitary_List);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        simpleListView.setAdapter(mAdapter);

        initData();
    }
    private void initData(){
        String[] items = getResources().getStringArray(R.array.items);
        mAdapter.addAll(items);
    }
}
