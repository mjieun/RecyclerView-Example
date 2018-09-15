package com.example.jieun_slljmh6.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoListAdapter extends BaseAdapter {


    ArrayList<String> list = new ArrayList<>();

    public void addToList(String str) {
        list.add(str);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_todo, parent, false);
        TextView titleText = view.findViewById(R.id.itemTitleText);

        String currentStr = list.get(position);
        titleText.setText(currentStr);

        return view;
    }



    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
