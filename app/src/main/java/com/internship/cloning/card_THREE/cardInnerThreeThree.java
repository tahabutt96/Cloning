package com.internship.cloning.card_THREE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.internship.cloning.R;
import com.internship.cloning.card_ONE.Model;
import com.internship.cloning.card_ONE.MyAdapter;

import java.util.ArrayList;

public class cardInnerThreeThree extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_inner_three_three);
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
        m.setImg(R.drawable.ic_pandas);
        m.setTitle("Why Pandas ?");
        m.setDescription("Why we need pandas when we have NumPy ? \n Basically Pandas use NumPy and add several more new features over it. \n Pandas includes features like – \n     Intrinsic data alignment \n     Data operation functions such as merge, group by, join method etc. to make it efficient for data wrangling and manipulation. \n     Pandas provide functions for handling missing data. \n     Pandas is great tool for data standardization. \n     Pandas provide data structures to cover vast majority of use cases like finance, statistics, social science and other engineering field. \n  Features of Pandas lt     Powerful data structure such as series, data frame. \n   Pandas is built upon NumPy so it’s fast and efficient for data wrangling. \n   Data aggregation and transformation is easy in Pandas. \n   It has tool for data reading and writing. \n   Pandas align data wisely with labels. \n   High performance for merging of data sets to extract meaning information.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_structure);
        m.setTitle("Data Structures");
        m.setDescription("Pandas has 4 main data structures – \n  Series lt  – One dimensional labeled array, Heterogeneous (support multiple data-types). \n  Data Frame lt  – Two dimensional labeled array, Heterogeneous (support multiple data-types). Input can be Series or another data frame. \n  Panel lt  – Three dimensional labeled array, Heterogeneous (support multiple data-types). \n  Panel 4D lt  – Four dimensional labeled array, Heterogeneous (support multiple data-types). Panel 4D rarely used.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_plus);
        m.setTitle("Series - Creation ");
        m.setDescription("In Series different data can be input like ndarray, dict, scalar, list. Data alignment is intrinsic and won’t be broken until explicitly tried. \n To create Series, import pandas first and if you want to use ndarray import numpy. \n Example: \n import pandas as pd\n import numpy as np\n test_data = np.array([4, 8, 12, 16])   s = pd.Series(test_data)\n print(s)\n Output:   \n 0 4\n 1 8\n 2 12\n 3 16\n dtype: int32\n Left side is labels (index) allotted to each element of data. \n  Example: lt  \n my_name = pd.Series(list(‘Prakash’))\n print(my_name)\n Output:   \n 0 P\n 1 r\n 2 a\n 3 k\n 4 a\n 5 s\n 6 h\n dtype: object\n In above example, you can see we passed list and it converted in Series, data alignment done automatically. \n  Example: lt  \n np_cars = np.array([‘Maruti’, ‘Hyundai’, ‘Ford’, ‘BMW’])\n s_cars = pd.Series(np_cars)\n print(s_cars)\n Output:   \n 0 Maruti\n 1 Hyundai\n 2 Ford\n 3 BMW\n dtype: object\n In above example, passed ndarray as argument to make series. \n  Example: lt  \n dict_cars_mileage = pd.Series([17.4, 15.5, 14.2, 12.1], index=[‘Maruti’, ‘Hyundai’, ‘Ford’, ‘BMW’])\n print(dict_cars_mileage)\n Output:   \n Maruti 17.4\n Hyundai 15.5\n Ford 14.2\n BMW 12.1\n dtype: float64\n In above example, Series created by dict data input. Mileage has passed as actual data value and car brands passed as index.\n  Example: lt \n series_scalar = pd.Series(4, index=[‘P’, ‘R’, ‘A’, ‘K’, ‘A’, ‘S’, ‘H’])\n print(series_scalar)\n Output:   \n P 4\n R 4\n A 4\n K 4\n A 4\n S 4\n H 4\n dtype: int64\n In above example, one scalar data assigned to each index value.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_reliability);
        m.setTitle("Series - Vectorizing operations ");
        m.setDescription("All vector operations in Series performed by index position of element. \n  Example: lt  \n v_series_1 = pd.Series([2, 4, 6, 8] , index = [‘a’, ‘b’, ‘c’, ‘d’])\n v_series_2 = pd.Series([3, 6, 9, 12], index = [‘a’, ‘b’, ‘c’, ‘d’])\n v_series_1 + v_series_2\n Output:   \n a 5\n b 10\n c 15\n d 20\n dtype: int64\n v_series_2 = pd.Series([3, 6, 9, 12], index = [‘a’, ‘d’, ‘b’, ‘c’])\n v_series_1 + v_series_2\n Output:   \n a 5\n b 13\n c 1\n d 14\n dtype: int64\n Note: to explain you better, in second example we changed index position, you can see it added value by index position of each element.\n Now we replace index with new ones in second series and then add with series 1.\n v_series_2 = pd.Series([3, 6, 9, 12], index = [‘a’, ‘b’, ‘x’, ‘y’])\n v_series_1 + v_series_2\n Output:   \n a 5.0\n b 10.0\n c NaN\n d NaN\n x NaN\n y NaN\n dtype: float64\n Indices which matched it added and other result is NaN (Not a Number).");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_atomic_vector);
        m.setTitle("DataFrame - Creation ");
        m.setDescription("The Cause (Independent variable) is called Pridictor and thre Effect(dependent variable) is called Outcome.\n" +
                "\n" +
                "Example: Carrots contains viatamin A, so here cause, Mango aloso contain viatamin A\n" +
                "\n" +
                "So it would be better to use term Predictor and Outcome here Predictor is carrot or Mango and outcome is vaitamin A.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_frames);
        m.setTitle("Viewing DataFrame ");
        m.setDescription("By column name or describe function we can view DataFrame. \n  Example: lt  \n cars_list = {‘car_brand’: [‘Maruti’, ‘Hyundai’, ‘Ford’, ‘BMW’],\n ‘car_model’: [‘S-Cross’, ‘i20’, ‘Figo’, ‘X4’],\n ‘mileage’: [17.4, 15.5, 14.2, 12.1]}\n cars_df = pd.DataFrame(cars_list)\n cars_df\n cars_df.car_brand\n or you can use as follows too –\n cars_df[‘car_brand’]\n Output:   \n 0 Maruti\n 1 Hyundai\n 2 Ford\n 3 BMW\n Name: car_brand, dtype: object\n Including these, there is loc and iloc methods also, in loc method we can use index label as argument and in iloc we can use index position. \n  Example: lt  \n cars_df.iloc[2] Output:    \n car_brand Ford\n car_model Figo\n mileage 14.2\n Name: 2, dtype: object\n In iloc method we can pass range also.\n  Example: lt \n cars_df.iloc[0:2]\n Output:   \n car_brand car_model mileage\n 0 Maruti S-Cross 17.4\n 1 Hyundai i20 15.5\n iat is another method to fetch data element by index value.\n  Example: lt \n cars_df.iat[2, 2]\n Output:    14.2\n We can select data elements by condition.\n  Example: lt \n Want to fetch records which mileage is greater than 15.\n cars_df[cars_df[‘mileage’] > 15]\n Output:   \n car_brand car_model mileage\n 0 Maruti S-Cross 17.4\n 1 Hyundai i20 15.5\n Describe method is used to view the elements in data frame.\n  Example: lt \n cars_df.describe\n Output:   \n   <bound method NDFrame.describe of car_brand car_model mileage\n 0 Maruti S-Cross 17.4\n 1 Hyundai i20 15.5\n 2 Ford Figo 14.2\n 3 BMW X4 12.1>\n When you are working in large Data Set, you would like to see top few or bottom few records, here is solution. \n  Example: lt  \n cars_df.head(2) Output:    \n car_brand car_model mileage\n 0 Maruti S-Cross 17.4\n 1 Hyundai i20 15.5\n head(2) shows top 2 records only.\n  Example: lt \n cars_df.tail(2)\n Output:   \n car_brand car_model mileage\n 2 Ford Figo 14.2\n 3 BMW X4 12.1\n tail(2) shows bottom 2 records.\n To view the index of DataFrame –\n  Example: lt \n cars_df.index\n Output:    RangeIndex(start=0, stop=4, step=1)\n To view all the columns of DataFrame –\n  Example: lt \n cars_df.columns\n Output:    Index([‘car_brand’, ‘car_model’, ‘mileage’], dtype=’object’)");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_collection);
        m.setTitle("Handling Missing Values");
        m.setDescription("If you have some values missing in your dataset, it can give you misleading results, in simple words garbage in garbage out. So before doing operations on any dataset, please handle missing values. \n Before talking about basic ways to handle missing values, we will demonstrate here, impact of missing values. \n  Example: lt  \n v_series_1 = pd.Series([2, 4, 6, 8] , index = [‘a’, ‘b’, ‘c’, ‘d’])\n v_series_2 = pd.Series([3, 6, 9, 12], index = [‘a’, ‘b’, ‘x’, ‘y’])\n series_sum = v_series_1 + v_series_2\n series_sum\n Output:   \n a 5.0\n b 10.0\n c NaN\n d NaN\n x NaN\n y NaN\n dtype: float64\n In above example you can see for missing index elements it given NaN (Not a Number).\n dropna function\n dropna function delete all NaN values.\n  Example: lt \n series_dropna = series_sum.dropna()\n series_dropna\n Output:   \n a 5.0\n b 10.0\n dtype: float64\n fillna function\n fillna fills all the NaN indices with a number instead of deleting those.\n  Example: lt \n series_fillna = series_sum.fillna(4)\n series_fillna\n Output:   \n a 5.0\n b 10.0\n c 4.0\n d 4.0\n x 4.0\n y 4.0\n dtype: float64\n In above example, all NaN filled with value 4.\n  Example: lt \n series_sum_fillna = v_series_1.add(v_series_2, fill_value=4)\n series_sum_fillna\n Output:   \n a 5.0\n b 10.0\n c 10.0\n d 12.0\n x 13.0\n y 16.0\n dtype: float64\n In above example, all NaN will be replaced by value 4 first and then perform addition.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_import_export);
        m.setTitle("Data Operations with Functions");
        m.setDescription("Using built-in methods data operations can be performed on Data Frames in Pandas for faster processing. Custom functions can be applied using applymap method. \n  Example: lt  \n First we create a DataFrame – \n df_cricket_score = pd.DataFrame({‘match1’: [40, 50, 105, 10],\n ‘match2’: [55, 45, 25, 110]},\n index = [‘Rohit Sharma’, ‘K.L. Rahul’, ‘Virat Kohli’, ‘M.S. Dhoni’])\n df_cricket_score\n Output:   \n match1 match2\n Rohit Sharma 40 55\n K.L. Rahul 50 45\n Virat Kohli 105 25\n M.S. Dhoni 10 110\n Then we create a custom function:\n def score_grade(score):\n         if (score >= 100):\n                 return ‘Century’\n         elif (100 > score >= 50 ):\n                 return ‘Half Century’\n         else:\n                 return ‘Not even half century’\n Now apply this custom function on above Data Frame –\n df_cricket_score.applymap(score_grade)\n Output:   \n match1 match2\n Rohit Sharma Not even half century Half Century\n K.L. Rahul Half Century Not even half century\\n Virat Kohli Century Not even half century\n M.S. Dhoni Not even half century Century.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_custom_function);
        m.setTitle("Statistical Functions for Data Operations");
        m.setDescription(" Example: lt  \n To get max score of both matches – \n df_cricket_score.max() Output:    \n match1 105\n match2 110\n dtype: int64\n To get mean of both matches –\n df_cricket_score.mean()\n match1 51.25\n match2 58.75\n dtype: float64\n To get standard deviation of both matches –\n df_cricket_score.std()\n match1 39.660013\n match2 36.371921\n dtype: float64");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_mean);
        m.setTitle("Data Operation with GroupBy");
        m.setDescription("Example: lt  \n df_cricket_score = pd.DataFrame({‘runs’: [40, 50, 40, 50],\n ‘player’: [‘Rohit Sharma’, ‘K.L. Rahul’, ‘Virat Kohli’, ‘M.S. Dhoni’]})\n grouped = df_cricket_score.groupby(‘runs’)\n data_from_grp = grouped.get_group(40)\n data_from_grp\n Output:   \n runs player\n 0 40 Rohit Sharma\n 2 40 Virat Kohli\n In above example, grouped data with runs and get group of 40 runs.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_list);
        m.setTitle("Data Operation: Sorting");
        m.setDescription("Can sort data column wise. \n  Example: lt  \n df_cricket_score.sort_values(‘player’) Output:    \n runs player\n 1 50 K.L. Rahul\n 3 50 M.S. Dhoni\n 0 40 Rohit Sharma\n 2 40 Virat Kohli\n  Example: lt \n df_cricket_score.sort_values(‘runs’)\n Output:   \n runs player\n 0 40 Rohit Sharma\n 2 40 Virat Kohli\n 1 50 K.L. Rahul\n 3 50 M.S. Dhoni");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_multiply);
        m.setTitle("Data Operation: Merge, Duplicate, Concatenation");
        m.setDescription(" If n Lets build 2 sample DataFrame first – \n employee_development = pd.DataFrame({‘Employee’: [‘John’, ‘Peter’, ‘Garv’, ‘Prakash’, ‘Raynav’, ‘Jiya’], ‘EmpId’: [11, 15, 21, 51, 35, 25]}) \n employee_mgmt = pd.DataFrame({‘Employee’: [‘John’, ‘Raynav’, ‘Jiya’], ‘EmpId’: [11, 19, 25]}) \n Merge: \n Now do Merge operation – \n  Example: lt  \n pd.merge(employee_development, employee_mgmt) Output:    \n Employee EmpId\n 0 John 11\n 1 Jiya 25\n Here you can notice merge is done based on their Ids. \n If you want merge based on Employee, \n  Example: lt  \n pd.merge(employee_development, employee_mgmt, on=’Employee’) Output:    \n Employee EmpId_x EmpId_y\n 0 John 11 11\n 1 Raynav 35 19\n 2 Jiya 25 25\n In following example, Merge left join with key Id and fill NaN with ABC value. \n  Example: lt  \n pd.merge(employee_development, employee_mgmt, on=’EmpId’, how=’left’).fillna(‘ABC’) Output:    \n Employee_x EmpId Employee_y\n 0 John 11 John\n 1 Peter 15 ABC\n 2 Garv 21 ABC\n 3 Prakash 51 ABC\n 4 Raynav 35 ABC\n 5 Jiya 25 Jiya\n Concatenation: \n To concatenate both data frames by ignoring their index values: \n  Example: lt  \n pd.concat([employee_development, employee_mgmt], ignore_index=True) Output:    \n Employee EmpId\n 0 John 11\n 1 Peter 15\n 2 Garv 21\n 3 Prakash 51\n 4 Raynav 35\n 5 Jiya 25\n 6 John 11\n 7 Raynav 19\n 8 Jiya 25\n Duplicate: \n To check duplicate element in DataFrame. \n  Example: lt  \n Here i make new data frame and check duplicate elements by duplicated method, it return false if element is duplicate, otherwise true. \n employee_development_web = pd.DataFrame({‘Employee’: [‘John’, ‘Peter’, ‘Garv’, ‘Prakash’, ‘Raynav’, ‘Jiya’, ‘John’, ‘Peter’], ‘EmpId’: [11, 15, 21, 51, 35, 25, 11, 15]}) \n employee_development_web.duplicated() Output:    \n 0 False\n 1 False\n 2 False\n 3 False\n 4 False\n 5 False\n 6 True\n 7 True\n dtype: bool\n Drop duplicates by Employee,  Example: lt  \n employee_developemnt_web.drop_duplicates(‘Employee’) Output:    \n Employee EmpId\\n 0 John 11\n 1 Peter 15\n 2 Garv 21\n 3 Prakash 51\n 4 Raynav 35\n 5 Jiya 25");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_operators);
        m.setTitle("SQL Operation in Pandas");
        m.setDescription("Example: lt  \n After import pandas, import sqlite3 as follows – \n import sqlite3 \n Create SQL table – \n create_table = “””CREATE TABLE student(ID INTEGER, name VARCHAR(20))””” \n Execute SQL statement – \n executeSql = sqlite3.connect(‘:memory:’)\n executeSql.execute(create_table)\n executeSql.commit()\n Make SQL query –\n select_qry = executeSql.execute(‘select * from student’)\n Fetch result from DB –\n resultset = select_qry.fetchall()\n View resultset (empty data)\n resultset\n Output:    []\n Insert data in SQL table –\n insert_qry = [(1, ‘Prakash’), (2, ‘Garv’)]\n insert_statt = “insert into student values(?, ?)”\n executeSql.executemany(insert_statt, insert_qry)\n executeSql.commit()\n select_qry = executeSql.execute(‘select * from student’)\n resultset = select_qry.fetchall()\n View the resultset with data –\n resultset\n Output:    [(1, ‘Prakash’), (2, ‘Garv’)]\n We can convert this resultset in DataFrame as follows –\n df_student = pd.DataFrame(resultset)");
        models.add(m);

        return models;
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}