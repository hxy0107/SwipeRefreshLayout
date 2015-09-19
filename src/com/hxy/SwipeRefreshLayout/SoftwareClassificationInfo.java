package com.hxy.SwipeRefreshLayout;

/**
 * Created by vnut on 2015/9/19.
 */
public class SoftwareClassificationInfo {
    private int cid;
    private String catname;

    public SoftwareClassificationInfo() {
    }

    public SoftwareClassificationInfo( int cid,String catname) {
        this.catname = catname;
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
}
