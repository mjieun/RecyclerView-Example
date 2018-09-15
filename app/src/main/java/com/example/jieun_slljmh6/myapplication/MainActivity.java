package com.example.jieun_slljmh6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TodoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.todoListView);
        adapter = new TodoListAdapter();

        adapter.addToList("첫번째 테스트");
        adapter.addToList("2번째 테스트");
        adapter.addToList("3번째 테스트");
        adapter.addToList("테스트 테스트");
        listView.setAdapter(adapter);
    }
}
