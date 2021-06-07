package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {
    ListView lv1;
int image []={R.drawable.fruits,R.drawable.banana,R.drawable.grapes,R.drawable.kivi,R.drawable.oranges};
String[]name= {"This is fruits","This is banana","This is grapes","This is kivi","This is oranges"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(image, name, CustomListViewActivity.this);
        lv1.setAdapter(myAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(CustomListViewActivity.this,ListViewDetailActivity.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}
