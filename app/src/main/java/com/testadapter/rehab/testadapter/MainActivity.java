package com.testadapter.rehab.testadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
  String [] valuesname={"toto","popoo","jpjo","uiuy"};
    String [] value={"rere@email.com","toto@yahoo.com","hghg@yahoo.com","lkpklk@yahoo.com"};
   GridView gridView;
    //ListView listView,listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // listView=(ListView)findViewById(R.id.listviewnames) ;
       // listView1=(ListView)findViewById(R.id.listviewemails);
        gridView=(GridView)findViewById(R.id.gridview);

       // MyAdapter myAdapter=new MyAdapter(getApplicationContext(),values);
        gridView.setAdapter(new MyAdapter(getApplicationContext(), valuesname));

      //  listView.setAdapter(myAdapter);
        //myAdapter.notifyDataSetChanged();

       // MyAdapter myAdapter1=new MyAdapter(getApplicationContext(),value);
      gridView.setAdapter(new MyAdapter(getApplicationContext(),value));
        //listView1.setAdapter(myAdapter1);

    }
}
