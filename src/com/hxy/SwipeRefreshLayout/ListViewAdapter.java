package com.hxy.SwipeRefreshLayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vnut on 2015/9/19.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SoftwareClassificationInfo> list;

    public ListViewAdapter(Context context, ArrayList<SoftwareClassificationInfo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.user_center_list_item,null);
            viewHolder.textView=(TextView)convertView.findViewById(R.id.user_center_item_txt);
            viewHolder.imageView=(ImageView)convertView.findViewById(R.id.user_center_item_img);
            convertView.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder)convertView.getTag();
        }
        viewHolder.textView.setText(list.get(position).getCatname());
        viewHolder.imageView.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.tool_box_fragment_settings_icon));
        return convertView;
    }
    class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}
