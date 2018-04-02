package com.example.mac.inclassassignment08_yup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recycleView = findViewById(R.id.recycler_view);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(new QuestionsAdapter(questions,this) );

    }
    private void initialData(){
        questions = new ArrayList<>();
        questions.add(new Question(R.string.australia, R.string.question_australia,R.drawable.australia,true));
        questions.add(new Question(R.string.africa,R.string.question_africa, R.drawable.africa, false));
        questions.add(new Question(R.string.asia, R.string.question_asia,R.drawable.asia, true));
        questions.add(new Question(R.string.mideast,R.string.question_mideast, R.drawable.mideast,false));
        questions.add(new Question(R.string.oceans,R.string.question_oceans,R.drawable.oceans,true));
        questions.add(new Question(R.string.americas, R.string.question_americas, R.drawable.amercias,true));

    }
}
