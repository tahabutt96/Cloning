package com.internship.cloning.taha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.internship.cloning.R;

import java.util.ArrayList;

public class cardOne extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//    private ImageView myimageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_one);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
//run kro ab ??
        Model m = new Model();
        m.setImg(R.drawable.ic_hypothesis);
        m.setTitle("Hypotheses");
        m.setDescription("Making predictions on behalf of theories, observation.\n" +
                "\n" +
                "Basically hypothesis is just means Assumption.\n" +
                "Example: Morning walk is good for health.\n" +
                "Hypothesis basically need analysis to prove. Above example has no supporting data so initially we call it hypothesis. Most hypothesis is like if then statement.\n" +
                "If we do morning walk then health will be good.\n" +
                "\n" +
                "Types of Hypothesis : Simple hypothesis, complex hypothesis, Null hypothesis, Alternate hypothesis, Statistical hypothesis\n" +
                "\n" +
                "Generally in Data Science we refer to main following 2 hypothesis\n" +
                "\n" +
                "Null hypothesis: is basically means \"No difference\" ( nothing significantly different happening )means what is state of nature is true. It is denoted by H0.\n" +
                "Example: Pouplation mean is 50 Or H0.• p = 50\n" +
                "\n" +
                "Alternate hypothesis: is basically reverse of null hypothesis means something will change/happening. This is for researchers to prove. It is denoted by H1\n" +
                "Example: For H0: p = 50, alternate hypothesis can be: \n" +
                "H1: p != 50 (not equal) \n" +
                "H1: p > 50 (greater than) \n");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_quantitative);
        m.setTitle("Quantitative methods");
        m.setDescription("When numbers are involved in somem research data");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_qualitative);
        m.setTitle("Qualitative methods");
        m.setDescription("Instead of numbers when use language analysis like news,article,conversation etc. in research");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_independent);
        m.setTitle("Independent and Dependent variables");
        m.setDescription("A variable that is a \"Cause\" called Independent variable, because its value is not dependent on any other, A variable that is \"Effect\" called dependent variable, it is always dependent on the independent variable (cause).\n" +
                "\n" +
                "Basically in the world there is no sence of talk of independent and dependent terms because in some cases all variables are dependent in some sense In experimental method, cause (independent variable) can be manupulated by experimenter. In cross-sesctional method any variable cant be manupulated.\n" +
                "\n" +
                "So instead of independence and dependence fo;owing term is better\n" +
                "\n" +
                "Predictor and Outcome variable");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_predictor);
        m.setTitle("Predictor and Outcome variables");
        m.setDescription("The Cause (Independent variable) is called Pridictor and thre Effect(dependent variable) is called Outcome.\n" +
                "\n" +
                "Example: Carrots contains viatamin A, so here cause, Mango aloso contain viatamin A\n" +
                "\n" +
                "So it would be better to use term Predictor and Outcome here Predictor is carrot or Mango and outcome is vaitamin A.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_categorical);
        m.setTitle("Categorical variables");
        m.setDescription("Variables that belong to specific categories.\n" +
                "Example: Vehicle, Bird etc");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_binary);
        m.setTitle("Binary variables");
        m.setDescription("Belonging one of two distinct types\n" +
                "Example: Yes or No, Male or Female");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_nominal);
        m.setTitle("Nominal variables");
        m.setDescription("Variable that have 2 or more categories.\n" +
                "Example: Cricket team has 4 Bastman, 4 Bowlers, 1 Wicketkeper");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_ordinal);
        m.setTitle("Ordinal variables");
        m.setDescription("When norminal variable categories are in order or rank.\n" +
                "Example: Best Bastman, Good Batsman, Average Batsman.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_continuous);
        m.setTitle("Continuous variable");
        m.setDescription("Any values or measurements scale(between minumum and maximum value) Weight of cricket player between 55 kg to 85 kg");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_interval);
        m.setTitle("Interval variable");
        m.setDescription("Defrence between the 2 variables is meaningful\n" +
                "Example: difference between 10 Runs and 20 runs is similar to the difference between 50 Runs and 60 Runs");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_ratio);
        m.setTitle("Ratio variable");
        m.setDescription("Having same properties of interval variable including any 2 values of interval variable have some meaningful ratio.\n" +
                "Example: 20 runs twice useful than 10 same as 40 runs is twice more useful than 20");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_discrete);
        m.setTitle("Discrete variable");
        m.setDescription("Whole number (without precision values) are discrete variables.\n" +
                "Example Number of players in team can be 11 or 15  not 11.5 or 12.4");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_confounding);
        m.setTitle("Confounding variables");
        m.setDescription("Counfounding variables is third (other than independent and dependent variable) that change the effect of independent and dependent variable.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_measurement);
        m.setTitle("Measurement error");
        m.setDescription("Discrepancy between measured value and runs ( should be value ) is called measurement error.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_reliability);
        m.setTitle("Validity and Reliability");
        m.setDescription("Properties to ensure minimum measurement error are\n" +
                "\n" +
                "Validity and Reliability\n" +
                "\n" +
                "Validity is whatever an instrument is actually measure what setout(made) to measure and reliability is an instrument measure consistent value in defferent situations and times.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_collection);
        m.setTitle("Two methods of data collection");
        m.setDescription("First is to manupulate/change the independent variable on different participants.\n" +
                "\n" +
                "Second is to manupulate/change the independent variable on the same participants.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_variation);
        m.setTitle("Types of variation");
        m.setDescription("Unsystematic variation\n" +
                "\n" +
                "Systematic variation");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_unsystematic);
        m.setTitle("Unsystematic variation");
        m.setDescription("If variation in performance is due to unknown factor\n" +
                "\n" +
                "For Example\n" +
                "\n" +
                "Some opener batsman score high sometimes and sometimes low on the same palyground, cricket pitch and opposite team without any change now the performance change may be due to any unknown factor like his mood, fitness on that day etc.\n" +
                "\n" +
                "Now here comes the role of statistics to discover how much variation there is in performance and find out how much of thi is systematic and how much is unsystematic.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_systematic);
        m.setTitle("Systematic variation");
        m.setDescription("Diffrence in performance due to specific manipulation in experiment\n" +
                "\n" +
                "For Example\n" +
                "\n" +
                "Now if much organizer introduced brand new Ferrari car to best scorer and same opener batsman score better we know the factor that may change performance\n" +
                "\n" +
                "Now here comes the role of statistics to discover how much variation there is in performance and find out how much of this is systematic and how much is unsystematic.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_frequency);
        m.setTitle("Frequency variation");
        m.setDescription("After data collection important thing to do is to plot a graph of how many times each score occurs. This is called a frequency distribution, or histrogram,which is a graph plotting values of observation on horizontals axis, with a bar showing how many times each value present/appeared/occurred in data set.\n" +
                "\n" +
                "To know the center of frequency distribution there are 3 measures\n" +
                "\n" +
                "The mean\n" +
                "\n" +
                "The Median" +
                "\n" +
                "The Mode");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_mean);
        m.setTitle("The Mean");
        m.setDescription("Add all scores and devide by the total number of occurance basically called average also.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_median);
        m.setTitle("The Median");
        m.setDescription("Value lying at the midpoint of frequency distribution is called the Median\n" +
                "\n" +
                "If values are ood number then formula\n" +
                "\n" +
                "(n +1)/2\n" +
                "\n" +
                "For Example values are-\n" +
                        "20,50,40,30, 60\n" +
                        "These are 5 values so-\n" +
                        "(5+1)/2=3\n" +
                        "so the vale on 3rd position is median in our Example median is 40\n" +
                        "if values are even number for Example:\n" +
                        "20,50,40,30,60,70,\n" +
                        "(6+1)/2=3.5\n" +
                        "This means median is half way between third and fourth value. to get the median we add these 2 position values and divide by 2 so in our case median is \n " +
                        "(40+30)/2=35");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_mode);
        m.setTitle("The Mode");
        m.setDescription("In Mode data set score occur more frequently\n" +
                "\n" +
                "If data set has 2 scores that occue most frequently called bimodel. More than 2 modes are also possible in data set that is called multimodal.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_dispresion);
        m.setTitle("Dispersion in distribution of Data");
        m.setDescription("Range - Subtaract smallest value from largest give us Range\n" +
                "\n" +
                "Interquartitle range - Cut off 25% of bottom and top data the rest middle data is called interquartile range.\n" +
                "\n" +
                "Quartitles- Three values that split the data into four equal parts. The median is called the second quartile Lower quartile is the median of the lower half of data and upper quartile is the median of the upper half of the data.\n" +
                "\n" +
                "Example - \n" +
                "Data: 20, 50, 40, 30, 60, 70, 80, 35, 45, 11, 101\n" +
                "Sorted Data: 11, 20, 30, 35, 40, 45, 50, 60, 70, 80, 101\n" +
                "Range: 101 - 11 = 90 \n" +
                "Median or second quartile is 45\n" +
                "Lower quartile is 30\n" +
                "Upper quartile is 70");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_range);
        m.setTitle("Range");
        m.setDescription("Subtract smallest value from largest value give us Range\n" +
                "\n"+
                "Example - \n" +
                "Data: 20, 50, 40, 30, 60, 70, 80, 35, 45, 11, 101\n" +
                "Sorted Data: 11, 20, 30, 35, 40, 45, 50, 60, 70, 80, 101\n" +
                "Range: 101 - 11 = 90 \n" );
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_inter_quartile);
        m.setTitle("Interquartile range");
        m.setDescription("Cut off 25% of bottom and top data the rest middle data is called interquartile range.\n" +
                "\n" +
                "Example - \n" +
                "Data: 20, 50, 40, 30, 60, 70, 80, 35, 45, 11, 101\n" +
                "Sorted Data: 11, 20, 30, 35, 40, 45, 50, 60, 70, 80, 101\n" +
                "Range: 101 - 11 = 90 \n" +
                "Median or second quartile is 45\n" +
                "Lower quartile is 30\n" +
                "Upper quartile is 70");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_quartile);
        m.setTitle("Quartiles");
        m.setDescription("Three values that split the data into four equal parts. The median is called the second quartile Lower quartile is the median of the lower half of data and upper quartile is the median of the upper half of the data.\n" +
                "\n" +
                "Example - \n" +
                "Data: 20, 50, 40, 30, 60, 70, 80, 35, 45, 11, 101\n" +
                "Sorted Data: 11, 20, 30, 35, 40, 45, 50, 60, 70, 80, 101\n" +
                "Range: 101 - 11 = 90 \n" +
                "Median or second quartile is 45\n" +
                "Lower quartile is 30\n" +
                "Upper quartile is 70");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_probability);
        m.setTitle("Probability");
        m.setDescription("The one thing is how often a value/ score occured and other thing is what are the chances that value/score would occur that is called probability by any distribution of values/score we can make out probability\n" +
                "\n" +
                "For Example\n" +
                "by bastsman score in different matches we can make the probability of his next match score obviously its complex task ");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_standard_devi);
        m.setTitle("Standard deviation");
        m.setDescription("How numbers are spread out.\n" +
                "Dispersion of data set relative to its mean value. As low is standard deviation is denoted its close to mean value. High standard deviations denote values are spread out wider.");
        models.add(m);
//error kia ara hai ab? wohi error rarah hai app crsh kr rahi h
        return models;
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
