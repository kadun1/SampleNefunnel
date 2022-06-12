package com.tutorials.samplenefunnel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleItemView extends LinearLayout {

    TextView tvTitle;
    TextView tvDate;
    ImageView iv;


    public SampleItemView(Context context) {
        super(context);
        init(context);
    }

    public SampleItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.listitem, this, true);
        tvTitle = (TextView) findViewById(R.id.title);
        tvDate= (TextView) findViewById(R.id.createDate);
        iv = (ImageView) findViewById(R.id.image);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("M월 dd일");
        String sdfStr = sdf.format(date);
        tvDate.setText(sdfStr);
    }

    public void setImage(int resId) {
        iv.setImageResource(resId);
    }
}
