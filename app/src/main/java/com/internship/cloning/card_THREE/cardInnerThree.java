package com.internship.cloning.card_THREE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.internship.cloning.R;
import com.internship.cloning.card_ONE.Model;
import com.internship.cloning.card_ONE.MyAdapter;

import java.util.ArrayList;

public class cardInnerThree extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_inner_three);

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
        m.setImg(R.drawable.ic_python_black);
        m.setTitle("Introduction and Environment Setup ");
        m.setDescription("Introduction and Environment Setup.\n" +
                "\n" +
                "Python and its libraries are very important in every aspect of Data Science\n" +
                "\n" +
                "From data aquire to visualize every step Python have great liabilities like -\n" +
                "\n" +
                "Pandas - to wrangle data, Matplotlib - to explore data, Scrikit, Numpy - to model data, Bokeh, SciPy - to visualize data.\n" +
                "\n" +
                "To use Python most recommended platform is Anaconda. Some reasons are -\n" +
                "\n" +
                "Open source Python distribution More than 400 pupular Python packages.\n" +
                "Enterprise ready data analytics platform.\n" +
                "Modren Data Science analytics architecture\n" +
                "\n" +
                "Big data environments support\n" +
                "Interactive visualization and security. All major OS support – Windows, Mac, Linux.\n" +
                "\n" +
                "Current version of Python is 3.7\n" +
                "\n" +
                "To install Anaconda, just go to their website – https://www.anaconda.com/ and it will detect your OS itself \n" +
                "\n" +
                "and you can download their installer. Run the installer and follow the very steps and you are done with installation.\n" +
                "\n" +
                "You will get Jupyter Notebook with Anaconda. We will use Jupyter Notebook for programming in Python.\n" +
                "\n" +
                "Click on “Launch” under Jupyter Notebook, As Jupyter Notebook is web-based Python interface for Data Science, It will open in your browser.\n" +
                "\n" +
                "For starting Python programming practice, you will click on New > Python and It will open Untitled file, you can start your Python programming code practice here.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_variable);
        m.setTitle("Variable assignment in Python");
        m.setDescription("A variable can be assigned any value, variable is left side of equal sign and assigned value is right side of equal sign. \n Example: \n x =4 \n y = 4.4 \n z = ‘Prakash’ You can check data type (we will read further what data types Python support) of variable by following – \n" +
                "\n" +
                "type(x)\n" +
                "\n" +
                "Output: int\n" +
                "\n" +
                "type(y) \n" +
                "\n" +
                "Output: float \n" +
                "\n" +
                "type(z)\n" +
                "\n" +
                "Output: str \n" +
                "\n" +
                "You can access variable if it is defined only, otherwise it will give following error – \n" +
                "\n" +
                "NameError Traceback (most recent call last) python-input-9-03cfd743661f> in  ----> 1 abc  NameError: name 'abc' is not defined.\n" +
                "\n" +
                "Once i assign some value like abc = 5 i can access it. \n" +
                "\n" +
                "We can define multiple variables together like –  ab, bc = 4, 8 \n" +
                "\n" +
                "NOTE: In Python, when we assign value to variable, it refers to memory location/address. Its not equal to value itself.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_type);
        m.setTitle("Data Types in Python");
        m.setDescription("Numeric – There are 2 main numeric data types in Python \n\nInteger – Without decimal point. Ex. 4 \n\nFloat – With decimal point. Ex. 4.4 \n\nString – String can be build in Python by using Single Quote, Double Quote or Three Double Quotes.\n\nEx. \n\nstring_a = ‘Prakash’\n\nstring_b = “Raynav”\n\nstring_c = “””Garv”””\n\nNone Data Type – Ex. num_a = None \n\nBoolean Data Type – True or False \n\nType Casting \n\nIn Python we can change number data type using type casting.\n\n Ex. \n float_x = 4.4 \n\n float_x \n\n Output: 4.4 \n\nint(float_x) \n\nOutput: 4 \n\n str(float_x) \n\nOutput: 4.4");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_structure);
        m.setTitle("Data Structure: Tuple");
        m.setDescription("Items ordered in sequence which can be mixed data types. Tuple is immutable and one-dimension.\n" +
                "\n" +
                "Example\n" +
                "\n" +
                "Create TUple\n" +
                "\n" +
                "test_tuple = (4, ‘Prakash’, 4.4, (4, 2), ‘Garv’)\n" +
                "\n" +
                "test_tuple\n" +
                "\n" +
                "Output:(4, ‘Prakash’, 4.4, (4, 2), ‘Garv’)\n" +
                "\n" +
                "Access indexx 1 item\n" +
                "\n" +
                "test_tuple[1]" +
                "Output: 'Prakash'\n" +
                "\n" +
                "Try to reassign value to index 1\n" +
                "\n" +
                "test_tuple[1] = 'John'\n" +
                "\n" +
                "TypeError Traceback (most recent call last) <ipython-input-7-a540209b813f> in <module> ----> 1 test_tuple[1] = 'John' TypeError: 'tuple' object does not support item assignment\n" +
                "\n" +
                "Because of immutable it can’t be modified. In Python index can be positive and negative both, In case of positive index it start from left and 0, In case of negative it start from right and -1. Here is Example on above tuple – \n\ntest_tuple[2] \n\nOutput: 4.4 \n\n test_tuple[-2] \n\nOutput: (4, 2)\n\nSubset/Slice Tuple  You can slice a Tuple by start and end index, starting index is included and ending index is excluded. Indices can be separate by colon. \nHere is Example on same tuple we built above: \n\ntest_tuple[1:4]\n\nOutput: (‘Prakash’, 4.4, (4, 2)) \n\nYou can use negative index too, -1 is right most element.\n\n test_tuple[1: -1] \n\nOutput: (‘Prakash’, 4.4, (4, 2))");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_list);
        m.setTitle("Data Structure: List ");
        m.setDescription("List is similar to Tuple with just different of mutable.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"List is ordered sequence of items which can be mixed of data-types, List is one-dimensional and as mentioned above Mutable. Create list Example:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"test_list = [‘Raynav’, 4, 4.4, ‘Prakash’, None, 9]\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"test_list \\n\\nOutput: [‘Raynav’, 4, 4.4, ‘Prakash’, None, 9]\\n\\nNOTE: when creating Tuple we used round bracket- parentheses “()” and when creating List we used square brackets “[]”. \\n\\nModify a List \\n\\nAdd new Item – test_list.append(‘Garv’) \\n\\nOutput: [‘Raynav’, 4, 4.4, ‘Prakash’, None, 9, ‘Garv’]  \\n\\nRemove Item – test_list.remove(‘Prakash’) \\n\\ntest_list \\n\\nOutput: [‘Raynav’, 4, 4.4, None, 9, ‘Garv’] \\n\\nAccess and remove list data using element index \\n\\ntest_list.pop(2) \\n\\nOutput: 4.4  and this output has been removed also from list. Insert a new item on particular index – test_list.insert(1, ‘Prakash’)  \\n\\ntest_list \\n\\nOutput: [‘Raynav’, ‘Prakash’, 4, None, 9, ‘Garv’] \\n\\nAccessing List \\n\\nSame as Tuple, element can be accessed using positive or negative index, positive index start from left and 0, negative index start from right and -1. \\n\\nExample:\\n\\ntest_list \\n\\nOutput: [‘Raynav’, ‘Prakash’, 4, None, 9, ‘Garv’] \\n\\ntest_list[1] \\n\\nOutput: ‘Prakash’ \\n\\ntest_list[-1] \\n\\nOutput: ‘Garv’\\n\\nSlicing List – Similar to Tuple, you can slide List also using indices. \\n\\ntest_list \\n\\nOutput: [‘Raynav’, ‘Prakash’, 4, None, 9, ‘Garv’] \\n\\nExample: \\n\\ntest_list[1:4] \\n\\nOutput: [‘Prakash’, 4, None] \\n\\nIn above example, Start from index 1 (including first index), Stop before last index (excluding last index). \\n\\nExample test_list[1: -1] \\n\\nOutput: [‘Prakash’, 4, None, 9] \\n\\n In above example, used negative index for second index and here, started from 1 and stopped before -1.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_dispresion);
        m.setTitle("Data Structure: Dictionary(Dict) ");
        m.setDescription("Dictionary is set of key-value pairs, where keys are any immutable type and values are any data types. &lt;br />&lt;br /> Create Dictionary &lt;br />&lt;br /> &lt;b>Example:&lt;/b> &lt;br />&lt;br /> test_dict = {‘Prakash’: ‘prakashm@gmail.com’, ‘Raynav’: ‘raynav@gmail.com’, ‘id’: [4, 5]} &lt;br />&lt;br /> test_dict &lt;br />&lt;br /> &lt;font color=green>Output:&lt;/font> {‘Prakash’: ‘prakashm@gmail.com’, ‘Raynav’: ‘raynav@gmail.com’, ‘id’: [4, 5]} &lt;br />&lt;br /> In above output, it shown keys and values all together, &lt;br />&lt;br /> we can see keys and values separately too, as below: &lt;br />&lt;br /> test_dict.keys() &lt;br />&lt;br /> &lt;font color=green>Output:&lt;/font> dict_keys([‘Prakash’, ‘Raynav’, ‘id’]) &lt;br />&lt;br /> test_dict.values() &lt;br />&lt;br /> &lt;font color=green>Output:&lt;/font> dict_values([‘prakashm@gmail.com’, ‘raynav@gmail.com’, [4, 5]]) &lt;br />&lt;br /> Access element by keys in dictionary – &lt;br />&lt;br /> test_dict[‘Prakash’] &lt;br />&lt;br /> &lt;font color=green>Output:&lt;/font> ‘prakashm@gmail.com’ &lt;br />&lt;br /> test_dict[‘id’] &lt;br />&lt;br /> &lt;font color=green>Output: [4, 5] \n\nModify Dictionary: Update – test_dict.update({‘id’: [44, 45]})  \n\ntest_dict Output: {‘Prakash’: ‘prakashm@gmail.com’, ‘Raynav’: ‘raynav@gmail.com’, ‘id’: [44, 45]} \n\nModify Dictionary: Delete –  del test_dict[‘id’]\n\ntest_dict Output: {‘Prakash’: ‘prakashm@gmail.com’, ‘Raynav’: ‘raynav@gmail.com’}");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_array);
        m.setTitle("Data Structure: Set ");
        m.setDescription("A set is collection of unique elements and its unordered. \n\n Create set- \n\n \nExample: lt  \n\n names_set = set([‘Prakash’, ‘Garv’, ‘Prakash’, ‘Raynav’, ‘Garv’, ‘Jiya’]) \n\n names_set \n Output:    {‘Garv’, ‘Jiya’, ‘Prakash’, ‘Raynav’} \n\n Some basic Set operations- \n\n OR – Union Set operation to combine 2 Sets values \n\n \nExample: lt  \n\n names_set_1 = set([‘Prakash’, ‘Garv’, ‘Prakash’, ‘Raynav’, ‘Garv’, ‘Jiya’]) \n\n names_set_2 = set([‘Prakash’, ‘Garv’, ‘Ram’, ‘Mohan’, ‘Ram’, ‘Garv’]) \n\n name_set_combine = names_set_1 | names_set_2 \n\n name_set_combine \nOutput:    {‘Garv’, ‘Jiya’, ‘Mohan’, ‘Prakash’, ‘Ram’, ‘Raynav’} \n\n AND – Intersection set operation to get common values. \n\nExample: lt  \n\n name_set_common = names_set_1  amp; names_set_2 \n\n name_set_common \n\n {‘Garv’, ‘Prakash’}");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_atomic_vector);
        m.setTitle("Basic Operator: in");
        m.setDescription("Operator in is used to check if value is present or not in container, it return boolean value – True/False. \n " +
                " \n \nExample: lt  \n " +
                "\n car_list = [‘Ford’, ‘Hyundai’, ‘Honda’, ‘BMW’] \n " +
                " \n ‘BMW’ in car_list   Output:    True \n " +
                " \n ‘Toyoto’ in car_list   Output:    False \n " +
                " \n name = ‘Prakash’ \n + \n ‘k’ in name   Output:    True \n " +
                " \n ‘K’ in name   Output:    False \n " +
                " \n As Python is Case-Sensitive.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_plus);
        m.setTitle("Basic Operator: +(plus)");
        m.setDescription("Plus operator is used for concatenation in Python, It create new Tuple, List or String. \n " +
                " \n \nExample: lt  \n " +
                " \n tuple_1 = (25, 35, 45) \n " +
                " \n tuple_2 = (55, 65, 75) \n " +
                " \n tuple_3 = tuple_1 + tuple_2 \n " +
                " \n tuple_3   Output:    (25, 35, 45, 55, 65, 75) \n " +
                " \n list_1 = [‘Prakash’, ‘Garv’] \n " +
                " \n list_2 = [‘Raynav’, ‘Jiya’] \n " +
                " \n list_3 = list_1 + list_2 \n " +
                " \n list_3   Output:    [‘Prakash’, ‘Garv’, ‘Raynav’, ‘Jiya’] \n " +
                " \n f_name = ‘Prakash’ \n " +
                " \n l_name = ‘Meghani’ \n " +
                " \n full_name = f_name + ‘ ‘ + l_name \n " +
                " \n full_name   Output:    ‘Prakash Meghani’");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_multiply);
        m.setTitle("Basic Operator: *(multiply)");
        m.setDescription("Multiplication operator create new Tuple, List, String that repeat original one with repeat specified times, it doesn’t multiply its values. \n " +
                " \n tuple_1 = (25, 35, 45) * 3 \n " +
                " \n tuple_1   Output:    (25, 35, 45, 25, 35, 45, 25, 35, 45) \n " +
                " \n list_1 = [‘Prakash’, ‘Garv’] * 3 \n " +
                " \n list_1   Output:    [‘Prakash’, ‘Garv’, ‘Prakash’, ‘Garv’, ‘Prakash’, ‘Garv’] \n " +
                " \n f_name = ‘Prakash’ *3 \n " +
                " \n f_name   Output:    ‘PrakashPrakashPrakash’ ");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_r_functions);
        m.setTitle("Functions");
        m.setDescription("Functions are used in Python for code optimization, proper organisation and reuse. \n " +
                " \n There is so many built-in functions in Python and here in this section we are talking about custom made functions. \n " +
                " \n ‘def’ is keyword in Python to create own custom function. \n " +
                " \n Syntax: \n " +
                " \n def  lt;name_of_function>(arg1, arg2, …, argN): \n " +
                "\n  <statements> \n " +
                " \n  return   <value> \n " +
                " \n Result of function is communicated by return value. \n " +
                " \n A function should always have return value, if not defined then it will return None. \n " +
                " \n Function overloading is not allowed in Python. \n " +
                " \n  Example: lt  \n " +
                " \n def helloToName(name): \n " +
                " \n  return ‘Hello ‘ + name \n " +
                " \n helloToName(‘Prakash’) Output:    ‘Hello Prakash’ \n " +
                " \n Argument can be single, multiple or even blank (no any argument). \n " +
                " \n Return value can be single or multiple. \n " +
                " \n  Example: lt  \n " +
                " \n def add_two_numbers(number1, number2): \n " +
                " \n  return number1 + number2 \n " +
                "\n add_result = add_two_numbers(4, 5) \n  " +
                "\n add_result Output:    9 \n " +
                " \n  Example: lt  \n " +
                " \n def car_detail(): = ‘Maruti’ \n " +
                " \n  color = ‘White’ \n  " +
                "\n miliage = 17 \n " +
                " \n  " +
                "return brand_name, color, miliage \n " +
                "\n brand_name, color, miliage = car_detail() \n " +
                " \n print(brand_name, color, miliage) \n" +
                "Output:    Maruti White 17");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_apply_function);
        m.setTitle("Build-in Sequence Function in Python");
        m.setDescription("enumerate \n " +
                " \n Indexes data to keep track indices and data mapping. \n  " +
                "\n  Example: lt  \n  " +
                "\n car_list = [‘Maruti’, ‘Hyundai’, ‘Ford’, ‘BMW’, ‘Toyoto’] \n  " +
                "\n for position, name in enumerate(car_list): \n  " +
                "\n  print (position, name) Output:  0 Maruti \n  " +
                "\n 1 Hyundai \n " +
                " \n 2 Ford \n  " +
                "\n 3 BMW \n  " +
                "\n 4 Toyoto \n " +
                "\n sorted \n " +
                " \n return new sorted list \n " +
                "\n  Example: lt  \n  " +
                "\n sorted([85, 95, 45, 55, 65, 35]) Output:    [35, 45, 55, 65, 85, 95] \n  " +
                "\n sorted(‘I am Prakash’) Output:    [‘ ‘, ‘ ‘, ‘I’, ‘P’, ‘a’, ‘a’, ‘a’, ‘h’, ‘k’, ‘m’, ‘r’, ‘s’] \n " +
                "\n reversed \n " +
                " \n Iterate data in reverse order. \n " +
                " \n list(reversed(range_list)) Output:    [6, 5, 4, 3, 2, 1, 0] \n " +
                " \n Note: range create list of given range \n " +
                " \n  Example: lt  \n  " +
                "\n range_list = range(7) \n  " +
                "\n range_list Output:    range(0, 7) \n  " +
                "\n Further make it list – \n " +
                " \n list(range_list) Output:    [0, 1, 2, 3, 4, 5, 6]   \n" +
                "zip  Create list of Tuples by pairing elements of List, Tuples or any other sequence. \n " +
                "\n car_model = [‘Maruti’, ‘Hyundai’, ‘Ford’] \n " +
                "\n car_mileage = [’17’, ’12’, ’15’] \n  " +
                "\n car_model_vs_mileage = zip(car_model, car_mileage) \n  " +
                "\n print(list(car_model_vs_mileage)) Output:    [(‘Maruti’, ’17’), (‘Hyundai’, ’12’), (‘Ford’, ’15’)]");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_conditional);
        m.setTitle("Control Flow Statements: if, elif, else");
        m.setDescription("On behalf of condition, code block get execute, on condition True, if block will execute, otherwise else. \n " +
                "\n  Example: lt  \n " +
                "\n mileage = 17 \n " +
                "\n if(mileage > 15): \n " +
                "\n         print(“Good Mileage”) \n " +
                "else: \n " +
                "\n         print(“Bad Mileage”) Output:    Good Mileage \n " +
                "\n  Example: lt  \n " +
                "\n mileage = 13 \n " +
                "\n if(mileage > 17): \n " +
                "\n         print(“Very Good Mileage”) \n " +
                "\n elif 15  <=mileage  <=17 : \n " +
                "\n         print(“Good Mileage”) \n " +
                "\n elif 12  <=mileage  <15: \n" +
                " \n         print(“Bad Mileage”) \n " +
                "\n else: \n" +
                " \n         print(“Very Bad Mileage”) Output:    Bad Mileage");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_loop);
        m.setTitle("Control Flow Statements: for, Loops");
        m.setDescription("It is used to iterate on any collection like List, Tuple etc. \n  Example: lt  \n car_list = [‘Maruti’, ‘Hyundai’, ‘Ford’, None, ‘BMW’, ‘Toyoto’] \n for car_model in car_list: \n if(car_model is None): \n         continue \n         print(car_model) Output:    \n Maruti \n Hyundai \n Ford \n BMW\n Toyoto\n for car_model in car_list:\n if(car_model is None):\n         break\n         print(car_model) Output:\n Maruti\n Hyundai\n Ford\n</string>\n" +
                "    <string name=\"frequency_distribution\">Frequency distribution\n");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_loop_control);
        m.setTitle("Control Flow Statements: while loops");
        m.setDescription("while loop code of block executes until condition evaluate to false or the loop explicitly ended using break. \n run_count = 45 \n while run_count   <= 50:\n         print(run_count) \n         run_count = run_count + 1 Output:    \n 45 \n 46 \n 47 \n 48 \n 49 \n 50 ");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_frames);
        m.setTitle("Exception Handling");
        m.setDescription("nException Handling lt To make robust program and algorithms, handling errors and exception in Python is essential part. \n  Example: lt  \n def testing_float(number): \n         return float(number) \n testing_float(4.442) Output:    \n 4.442 \n testing_float(‘Prakash’) ValueError Traceback (most recent call last)     <ipython-input-207-3b29332b3454> in   <module>   \n-> 1 testing_float('Prakash') \n   <ipython-input-206-7f876497df27> in testing_float(number)           1 def testing_float(number):   \n-> 2 return float(number)           3         4 testing_float(4.442)   ValueError: could not convert string to float: 'Prakash'     \n def testing_float(number): \n try: \n return float(number) \n except ValueError: \n return ‘Input value is ‘ + number + “, which is not number.” \n testing_float(‘Prakash’) Output:    \n ‘Input value is Prakash, which is not number.");
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