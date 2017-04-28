package com.testadapter.rehab.testadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by RERE on 4/28/2017.
 */

public class MyAdapter extends BaseAdapter{
    String []items;
    Context context;

   public MyAdapter(Context context,String[] Items){
        this.items=Items;
        this.context=context;
    }

    @Override
    public int getCount() {

        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
      //  View gridview;
      //  gridview=new View(context);

       // gridview= LayoutInflater.from(context).inflate(R.layout.row_data,null);

        //TextView textView=(TextView)gridview.findViewById(R.id.textviewnames);
      //  TextView textView1=(TextView)gridview.findViewById(R.id.textviewemail);

       // textView.setText(items[i]);
       // textView1.setText(items[i]);

        //return gridview;



        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (view == null) {

            gridView = new View(context);


            gridView = inflater.inflate(R.layout.row_data, null);


            TextView textView = (TextView) gridView.findViewById(R.id.textviewnames);
            textView.setText(items[i]);
            TextView textView1=(TextView)gridView.findViewById(R.id.textviewemail);
            textView1.setText(items[i]);
        } else {
            gridView = (View) view;
        }

        return gridView;
    }
}
