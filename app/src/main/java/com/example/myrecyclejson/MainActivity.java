package com.example.myrecyclejson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclevsCardview.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    RecyclerView recyclerView;

    ArrayList<User> users = new ArrayList<>(Arrays.asList(
            new User("Pep","pepe@dot.com", "spain", R.drawable.icon201)
            ,new User("Will","will@dot.com", "spain",R.drawable.icon202)
            ,new User("Camila","camila@dot.com", "spain",R.drawable.icon203)
            ,new User("Roser","roser@dot.com", "spain",R.drawable.icon204)
            ,new User("Juanita","junita@dot.com", "spain",R.drawable.icon205)
            ,new User("Rosita","rosita@dot.com", "spain",R.drawable.icon206)
            ,new User("Josep M","josepm@dot.com", "spain",R.drawable.icon207)
            ,new User("Vik","vik@dot.com", "spain",R.drawable.icon208)
            ,new User("Sidney","sidney@dot.com", "spain",R.drawable.icon209)
            ,new User("Parrado","parrado@dot.com", "spain",R.drawable.icon210)
            ,new User("Noelia","noelia@dot.com", "spain",R.drawable.icon211)
            ,new User("Anselmo","anselmo@dot.com", "spain",R.drawable.icon212)
            ,new User("Pedro","pedro@dot.com", "spain",R.drawable.icon213)
            ,new User("Maria","maria@dot.com", "spain",R.drawable.icon214)
            ,new User("Jesus","jesus@dot.com", "spain",R.drawable.icon215)
            ,new User("God","god@dot.com", "spain",R.drawable.icon216)

    ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Collections.shuffle(users);

        //Hooks
        recyclerView = findViewById(R.id.recycleLayout);

        //Layout
        recyclerView.setLayoutManager(new
                LinearLayoutManager(getApplicationContext()));


        //Adapters
        MyAdapter myAdapter = new MyAdapter(this,users);

        //adaptamos el recylceView
        recyclerView.setAdapter(myAdapter);



    }
}