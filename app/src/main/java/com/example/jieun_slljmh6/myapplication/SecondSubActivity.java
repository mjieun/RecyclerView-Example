package com.example.jieun_slljmh6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class SecondSubActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TodoRecyclerAdapter adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sub);

        recyclerView = findViewById(R.id.todoRecyclerView);
        adapter = new TodoRecyclerAdapter();
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        button = findViewById(R.id.addTodoBtn);


        adapter.addTodo(new TodoVo("첫 타이틀", "콘텐츠입니다"));
        adapter.addTodo(new TodoVo("첫 타이틀2", "콘텐츠입니다ㅋㅋ"));
        adapter.addTodo(new TodoVo("첫 타이틀3", "콘텐츠입니다ㄴㄴ"));
        adapter.addTodo(new TodoVo("첫 타이틀4", "콘텐츠입니ㄴㅇㄹ다"));
        adapter.addTodo(new TodoVo("첫 타이틀ㅋㅋ", "콘텐츠입ㅇㅇㅇㅇㅇㅇㄹㄹㄹ니다"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addTodo(new TodoVo("추가된 타이틀", "ㅁㄴㅇㄹ"));
            }
        });
    }
}
