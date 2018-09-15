package com.example.jieun_slljmh6.myapplication;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoRecyclerAdapter extends RecyclerView.Adapter<TodoRecyclerAdapter.TodoViewHolder> {

    ArrayList<TodoVo> list = new ArrayList<>();

    public void addTodo(TodoVo todo) {
        list.add(todo);
    }

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("ASDF", "onCreate가 호출되었습니다.");

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_todo, parent, false);
        TodoViewHolder viewHolder = new TodoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        Log.d("ASDF", "onBind가 호출되었습니다. position : " + position);

        TodoVo currentTodo = list.get(position);
        holder.titleText.setText(currentTodo.getTitle());
        holder.contentText.setText(currentTodo.getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TodoViewHolder extends RecyclerView.ViewHolder {

        TextView titleText, contentText;

        public TodoViewHolder(View itemView) {
            super(itemView);

            Log.d("ASDF", "ViewHolder가 생성되었습니다.");

            titleText = itemView.findViewById(R.id.itemTitleText);
            contentText = itemView.findViewById(R.id.itemContentText);
        }
    }
}
