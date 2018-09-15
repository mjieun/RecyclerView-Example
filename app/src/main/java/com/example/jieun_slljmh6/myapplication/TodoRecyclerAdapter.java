package com.example.jieun_slljmh6.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TodoRecyclerAdapter extends RecyclerView.Adapter<TodoRecyclerAdapter.TodoViewHolder> {

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_todo, parent, false);
        TodoViewHolder viewHolder = new TodoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class TodoViewHolder extends RecyclerView.ViewHolder {

        TextView titleText, contentText;

        public TodoViewHolder(View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.itemTitleText);
            contentText = itemView.findViewById(R.id.itemContentText);
        }
    }
}
