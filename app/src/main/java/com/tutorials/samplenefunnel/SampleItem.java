package com.tutorials.samplenefunnel;

import java.util.Date;

public class SampleItem {

    String title;
    Date postdate;
    int resId;

    public SampleItem(String title, Date postdate, int resId) {
        this.title = title;
        this.postdate = postdate;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "SampleItem{" +
                "title='" + title + '\'' +
                ", postdate=" + postdate +
                ", resId=" + resId +
                '}';
    }
}
