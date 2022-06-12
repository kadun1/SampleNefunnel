package com.tutorials.samplenefunnel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class ListActivity extends AppCompatActivity {

    ListAdapter listAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.list_item);

        listAdapter = new ListAdapter();
        //임의의 리소스를 설정
        listAdapter.addItem(new SampleItem("TestTitle1", new Date(), R.drawable.jrd1));
        listAdapter.addItem(new SampleItem("TestTitle2", new Date(), R.drawable.jrd2));
        listAdapter.addItem(new SampleItem("TestTitle3", new Date(), R.drawable.jrd3));

        listView.setAdapter(listAdapter);

        Intent intent = getIntent();
//        String id = intent.getExtras().getString("id");
//        String pw = intent.getExtras().getString("pw");
    }

    class ListAdapter extends BaseAdapter {

        ArrayList<SampleItem> items = new ArrayList<SampleItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(SampleItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            SampleItemView sampleItemView = null;
            if (sampleItemView == null) {
                sampleItemView = new SampleItemView(getApplicationContext());
            } else {
                sampleItemView = (SampleItemView) view;
            }

            SampleItem item = items.get(i);

            sampleItemView.setTitle(item.getTitle());
            sampleItemView.setDate(item.getPostdate());
            sampleItemView.setImage(item.getResId());

            return sampleItemView;
        }
    }

}