package com.example.admin.w2d2zoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AnimalList extends AppCompatActivity {

    ListView lvListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        lvListView = (ListView) findViewById(R.id.lvAnimals);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Shiva","Tiger",13,350,R.drawable.tiger1,R.drawable.tiger2));
        animalList.add(new Animal("Leo","Lion",9,420,R.drawable.lion1,R.drawable.lion2));
        animalList.add(new Animal("Free Willy","Whale",12,9000,R.drawable.orca1,R.drawable.orca2));
        animalList.add(new Animal("Oscar","Ostrich",3,250,R.drawable.ostrich1,R.drawable.ostrich2));
        animalList.add(new Animal("Grape","Penguin",5,40,R.drawable.penguin1,R.drawable.penguin2));

        CustomListAdapter customListAdapter = new CustomListAdapter(this,
                R.layout.activity_animal_list, animalList);

        lvListView.setAdapter(customListAdapter);
    }
}
