package com.example.jieun_slljmh6.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoListAdapter extends BaseAdapter {


    ArrayList<TodoVo> list = new ArrayList<>();

    public void addTodo(TodoVo todo) {
        list.add(todo);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("ASDF", "getView가 호출되었습니다. position : " + position);

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_todo, parent, false);
        TextView titleText = view.findViewById(R.id.itemTitleText);
        TextView contentText = view.findViewById(R.id.itemContentText);

        TodoVo currentTodo = list.get(position);
        titleText.setText(currentTodo.getTitle());
        contentText.setText(currentTodo.getContent());
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
