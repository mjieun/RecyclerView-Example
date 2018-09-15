package com.example.jieun_slljmh6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondSubActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TodoRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sub);

        recyclerView = findViewById(R.id.todoRecyclerView);
        adapter = new TodoRecyclerAdapter();
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        for (int i = 0; i < 100; i++) {
            adapter.addTodo(new TodoVo("첫 타이틀", "콘텐츠입니다"));
            adapter.addTodo(new TodoVo("첫 타이틀2", "콘텐츠입니다ㅋㅋ"));
            adapter.addTodo(new TodoVo("첫 타이틀3", "콘텐츠입니다ㄴㄴ"));
            adapter.addTodo(new TodoVo("첫 타이틀4", "콘텐츠입니ㄴㅇㄹ다"));
            adapter.addTodo(new TodoVo("첫 타이틀ㅋㅋ", "콘텐츠입ㅇㅇㅇㅇㅇㅇㄹㄹㄹ니다"));
        }

    }
}
