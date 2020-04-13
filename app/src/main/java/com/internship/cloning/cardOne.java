package com.internship.cloning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class cardOne extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_one);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_hypothesis, "Hypotheses"));
        exampleList.add(new ExampleItem(R.drawable.ic_quantitative, "Quantitative methods"));
        exampleList.add(new ExampleItem(R.drawable.ic_qualitative, "Qualitative methods"));
        exampleList.add(new ExampleItem(R.drawable.ic_independent, "Independent and Dependent variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_predictor, "Predictor and Outcome variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_categorical, "Categorical variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_binary, "Binary variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_nominal, "Nominal variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_ordinal, "Ordinal variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_continuous, "Continuous variable "));
        exampleList.add(new ExampleItem(R.drawable.ic_interval, "Interval variable"));
        exampleList.add(new ExampleItem(R.drawable.ic_ratio, "Ratio variable"));
        exampleList.add(new ExampleItem(R.drawable.ic_discrete, "Discrete variable"));
        exampleList.add(new ExampleItem(R.drawable.ic_confounding, "Confounding variables"));
        exampleList.add(new ExampleItem(R.drawable.ic_measurement, "Measurement error"));
        exampleList.add(new ExampleItem(R.drawable.ic_variation, "Validity and Reliability"));
        exampleList.add(new ExampleItem(R.drawable.ic_data_collection, "Two methods of data collection"));
        exampleList.add(new ExampleItem(R.drawable.ic_variation, "Types of variation"));
        exampleList.add(new ExampleItem(R.drawable.ic_unsystematic, "Unsystematic variation"));
        exampleList.add(new ExampleItem(R.drawable.ic_systematic, "Systematic variation"));
        exampleList.add(new ExampleItem(R.drawable.ic_frequency, "Frequency distribution"));
        exampleList.add(new ExampleItem(R.drawable.ic_mean, "The Mean"));
        exampleList.add(new ExampleItem(R.drawable.ic_median, "The Median"));
        exampleList.add(new ExampleItem(R.drawable.ic_mode, "The Mode"));
        exampleList.add(new ExampleItem(R.drawable.ic_dispresion, "Dispersion in distribution of Data"));
        exampleList.add(new ExampleItem(R.drawable.ic_range, "Range"));
        exampleList.add(new ExampleItem(R.drawable.ic_inter_quartile, "Interquartile range"));
        exampleList.add(new ExampleItem(R.drawable.ic_quartile, "Quartiles"));
        exampleList.add(new ExampleItem(R.drawable.ic_probability, "Probability"));
        exampleList.add(new ExampleItem(R.drawable.ic_standard_devi, "Standard derivation"));
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
