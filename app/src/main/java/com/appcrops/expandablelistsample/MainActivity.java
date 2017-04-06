package com.appcrops.expandablelistsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {

    ArrayList<String> mBirds;
    ArrayList<String> mAnimals;
    HashMap<String, ArrayList<String>> mLivingBeings;
    ArrayList<String> mLivingBeingGroups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        LivingBeingsAdapter livingBeingsAdapter = new LivingBeingsAdapter(this, mLivingBeings, mLivingBeingGroups);

        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.living_being_list_view);
        expandableListView.setAdapter(livingBeingsAdapter);
    }

    private void init() {
        mBirds = new ArrayList<String>();
        mBirds.add("Crow");
        mBirds.add("Sparow");
        mBirds.add("Peacock");
        mBirds.add("Dove");

        mAnimals = new ArrayList<String>();
        mAnimals.add("Lion");
        mAnimals.add("Tigher");
        mAnimals.add("Deer");
        mAnimals.add("Monkey");
        mAnimals.add("Elephant");

        mLivingBeings = new HashMap<String, ArrayList<String>>();
        mLivingBeings.put("Birds", mBirds);
        mLivingBeings.put("Animals", mAnimals);

        mLivingBeingGroups = new ArrayList<String>();
        mLivingBeingGroups.add("Birds");
        mLivingBeingGroups.add("Animals");
    }

}
