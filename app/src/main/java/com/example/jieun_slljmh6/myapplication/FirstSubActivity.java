package com.example.jieun_slljmh6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class FirstSubActivity extends AppCompatActivity {

    ListView listView;
    TodoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sub);

        listView = findViewById(R.id.todoListView);
        adapter = new TodoListAdapter();

        listView.setAdapter(adapter);

        for (int i = 0; i < 100; i++) {
            adapter.addTodo(new TodoVo("첫 타이틀", "콘텐츠입니다"));
            adapter.addTodo(new TodoVo("첫 타이틀2", "콘텐츠입니다ㅋㅋ"));
            adapter.addTodo(new TodoVo("첫 타이틀3", "콘텐츠입니다ㄴㄴ"));
            adapter.addTodo(new TodoVo("첫 타이틀4", "콘텐츠입니ㄴㅇㄹ다"));
            adapter.addTodo(new TodoVo("첫 타이틀ㅋㅋ", "콘텐츠입ㅇㅇㅇㅇㅇㅇㄹㄹㄹ니다"));
        }
    }
}
