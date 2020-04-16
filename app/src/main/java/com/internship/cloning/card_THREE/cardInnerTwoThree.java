package com.internship.cloning.card_THREE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.internship.cloning.R;
import com.internship.cloning.card_ONE.Model;
import com.internship.cloning.card_ONE.MyAdapter;

import java.util.ArrayList;

public class cardInnerTwoThree extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_inner_two_three);

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
        m.setImg(R.drawable.ic_numpy);
        m.setTitle("Introduction");
        m.setDescription("Python has built-in data structure “List” which is very useful but have some limitation and so to overcome those limitation, NumPy package is available in Python to help us. \n NumPy is basically array-processing package. It support multidimensional arrays on which mathematical operations can be applied. \n Suppose we have following 2 lists – \n list_runs_scored = [225, 210, 250, 150] \n list_overs_played = [30, 25, 20, 15] \n Now if we want to do mathematical computation on whole list like as follows – \n run_rate = list_runs_scored/list_over_played \n We get following error –  lt;font color=red> \n TypeError Traceback (most recent call last)     <ipython-input-9-6d6e32234a46> in   <module>   2 list_overs_played = [30, 25, 20, 15]\n 3 -> 4 run_rate = list_runs_scored / list_overs_played\n TypeError: unsupported operand type(s) for /: 'list' and 'list'     \n But we can do this in NumPy. \n Steps – \n 1.) Import NumPy package as follows – \n import numpy as np \n 2.) Creating NumPy array, Here I converted lists i had in to NumPy arrays as follows – \n np_runs_scored = np.array(list_runs_scored)\n np_overs_played = np.array(list_overs_played)\n 3.) Now you can perform mathematical operations easily over the “np_runs_scored” and “np_overs_played” arrays. As follows – \n run_rate = np_runs_scored / np_overs_played run_rate\n Output:    array([ 7.5, 8.4, 12.5, 10. ])\n NumPy has following powerful properties –\n Support fast and efficient multidimensional arrays (ndarray)\n Mathematical calculations and computations over each element.\n Fourier transforms, Random number generations and Perform algebraic operations.\n Efficient way of manipulating and storing data.\n Tools for writing/reading array based datasets on disk.\n Tools for integrating C, C++ or FORTRAN code.\n NOTE: ndarray is single data type (homogenous).");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_array);
        m.setTitle("Types of Arrays");
        m.setDescription("Arrays can be One-Dimensional, Two-Dimensional, Three-Dimensional or Multi-Dimensional. \n One-Dimensional Array – printed as rows, 1 axis (x-axis) only. \n  Example: lt  \n print output as: \n array([20, 30, 40]) \n Two-Dimensional Array – printed as matrices, 2 axis (x-axis and y-axis). \n  Example: lt  \n print output as: \n array([[20, 30, 40],\n [ 1, 2, 3]])\n Matrix of 2 x 3\n Three-Dimensional Array – Printed as list of matrices, 3 axis (x-axis, y-axis and z-axis) \n  Example: lt \n print output as: \n array([[[ 0, 1, 2],\n [ 3, 4, 5],\n [ 6, 7, 8]],\n [[ 9, 10, 11],\n [12, 13, 14],\n [15, 16, 17]],\n [[18, 19, 20],\n [21, 22, 23],\n [24, 25, 26]]])");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_probability);
        m.setTitle("Attributes of ndarray");
        m.setDescription("NumPy array class is ndarray (numpy.ndarray). \n Attributes of ndarray are as follow: \n .ndim\n Refers to number of axes (dimension) of array, it can be one-dimension, two-dimension, three-dimension. Know as rank of the array too.\n  Example: lt \n np_car = np.array([‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’])\n np_car.ndim\n Output:    1 \n  Example: lt  \n np_car_and_model = np.array([[‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’], [‘S-Cross’, ‘i20’, ‘City’, ‘Z4’]])\n np_car_and_model.ndim\n Output:    2\n .shape\n It gives tuple of integers showing size of each dimension of array. Length of tuple is ndim (rank)\n  Example: lt \n np_car = np.array([‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’])\n np_car.shape\n Output:    (4,)\n Length of above tuple is 1 so ndim(rank) is 1.\n  Example: lt \n np_car_and_model = np.array([[‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’], [‘S-Cross’, ‘i20’, ‘City’, ‘Z4’]])\n np_car_and_model.shape\n Output:    (2, 4)\n Length of above tuple is 2 so ndim(rank) is 2.\n .size\n It provide the total number of elements in array. It is equal to the multiply of elements of shape tuple.\n  Example: lt \n np_car = np.array([‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’])\n np_car.shape\nOutput:    (4,)\n np_car.size\n Output:    4\n  Example: lt \n np_car_and_model = np.array([[‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’], [‘S-Cross’, ‘i20’, ‘City’, ‘Z4’]])\n np_car_and_model.shape\n Output:    (2, 4)\n np_car_and_model.size\nOutput:    8\n .dtype\n It gives and object and describe data type of element in the array.\n  Example: lt \n np_car.dtype\n Output:    dtype(‘  <U7’)");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_operators);
        m.setTitle("Basic Operations");
        m.setDescription("Various mathematical, logical and comparison operations can be performed on arrays using following operands – \n Mathematical –\n Addition (+)\n Subtraction (-)\n Multiplication (*)\n Division (/)\n Exponentiation (**)\n Logical –\n And ( amp;)\n Or (|)\n Not (~)\n Comparison –\n Greater (>)\n Greater or equal (>=)\n Less (  <)\n Less or equal (  <=)\n Equal (==)\n Not equal (!=)\n Note: Numpy work on behalf of index of element in each array to perform operations.\n  Example: lt \n first_day_km_travel = [10, 11, 15, 30]\n second_day_km_travel = [5, 6, 8, 10]\n np_first_day_km = np.array(first_day_km_travel)\n np_second_day_km = np.array(second_day_km_travel)\n total_km = np_first_day_km + np_second_day_km\n total_km\n Output:    array([15, 17, 23, 40])");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_factors);
        m.setTitle("Accessing Array Element");
        m.setDescription("We can access row of an array by its axis index.\n  Example: lt \n Here creating 2D array of total km traveled by 4 person in 2 days, day one in first row and day 2 in second row.\n Person1 traveled 10 Km first day, 5 Km second day.\n Person2 traveled 11 Km first day, 6 Km second day.\n Person3 traveled 15 Km first day, 8 Km second day.\n Person4 traveled 30 Km first day, 10 Km second day.\n total_km = np.array([[10, 11, 15, 30], [5, 6, 8, 10]])\n To access first row (axis 0) –\n first_day = total_km[0]\n first_day\n Output:    array([10, 11, 15, 30])\n To access second row (axis 1) –\n second_day = total_km[1]\n second_day\nOutput:    array([ 5, 6, 8, 10])\n You can select particular index of more than 1 axis at a time i.e. index of more than 1 rows of that array.\n  Example: lt \n person_1_first_day = total_km[0][0]\n person_1_first_day  Output:    10\n Person 1 traveled first day -> First row first column, row index 0 (axis 0), column index 0.\n person_1_all_day = total_km[:, 0]\n person_1_all_day\n Output:    array([10, 5])\n Person 1 traveled all days data -> All rows, first column, all row indices, column index 0.\n Slicing\n To access range of elements/values of an array, we can slice it.\n  Example: lt \n person_2_and_3_all_day = total_km[:, 1:3]\n person_2_and_3_all_day\n Output:   \n array([[11, 15],\n [ 6, 8]])\n All rows, and column including 1 and excluding 3.\n Iteration\n Go through each element in dataset, we use iteration method.\n  Example: lt \n total_km = np.array([[10, 11, 15, 30], [5, 6, 8, 10]])\n for km in total_km:\n print(km)\n Output:   \n [10 11 15 30]\n [ 5 6 8 10]\n Indexing with Boolean Array\n If we want to filter array based on some condition, boolean array is useful in such cases.\n In out Km travel example, If we consider above 6 Km travel is only accepted then we can use Boolean array as follows –\n  Example: lt \n good_travel = total_km > 6\n good_travel\n Output:   \n array([[ True, True, True, True],\n [False, False, True, True]])\n It mark True and False according to condition.\n Now if we pass this boolean array to our original array, it will filter based on condition True.\n  Example: lt \n total_km[good_travel]\n Output:    array([10, 11, 15, 30, 8, 10])");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_confounding);
        m.setTitle("Copy and Views");
        m.setDescription("When working with arrays, data of array copy to new array in some cases.\n Here is some ways to copy one array to another –\n Simple Assignments, View/Shallow Copy, Deep Copy\n Simple Assignment\n Just assign variable to another variable, No new copy made.\n  Example: lt \n np_car_brands = np.array([‘Maruti’, ‘Hyundai’, ‘Honda’, ‘BMW’])\n print(np_car_brands)\n np_cars = np_car_brands\n print(np_cars)\\n check = np_cars is np_car_brands\n print(check)\n np_cars[3] = ‘Kia’\n print(np_car_brands)\n print(np_cars)\n Output:   \n ['Maruti' 'Hyundai' 'Honda' 'BMW']\n ['Maruti' 'Hyundai' 'Honda' 'BMW']\n True\n ['Maruti' 'Hyundai' 'Honda' 'Kia']\n ['Maruti' 'Hyundai' 'Honda' 'Kia']\n In above example you can see, check print given True that mean both objects are same, and if I changed value of any index of one array, another also changed. View/Shallow Copy\n A view is also shallow copy of array, it create new object.\n  Example: lt First created view of one array by using view() method.\n np_car_view = np_car_brands.view()\n print(np_car_brands)\n print(np_car_view)\n np_car_view[3] = ‘Toyoto’\n print(np_car_brands)\n print(np_car_view)\n Then assigned another value to index 3 of view array and when check both arrays value got changed.\n Deep Copy\n Deep Copy is done via method copy(), change in copy doesn’t effect on original dataset.\n  Example: lt n np_car_copy = np_car_brands.copy()\n print(np_car_brands)\n print(np_car_copy)\n np_car_copy[3] = ‘BMW’\n print(np_car_brands)\n print(np_car_copy)\n If you do change in copy array, it doesn’t effect original array.");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_custom_function);
        m.setTitle("Universal Functions (ufunc)");
        m.setDescription("NumPy gives some matematical functions known as universal functions. \n These functions perform element wise operations on array and create another array as output. \n Some of universal functions are as follows – \n sqrt – provides square root of every element in the array. \n cos – provides cosine value of every element in the array. \n floor – returns largest integer value of every element in the array. \n exp – provides exponentiation of every element in the array. \n  Example: lt  \n np_sqrt = np.sqrt([25, 36, 49, 64])\n np_sqrt Output:    array([5., 6., 7., 8.]) \n np.cos(0) Output:    1.0 \n np.floor([1.5, 1.4, 1.6, -0.3, -1.4]) Output:    array([ 1., 1., 1., -1., -2.]) \n np.exp([1, 2, 2]) Output:    array([2.71828183, 7.3890561 , 7.3890561 ])");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_variation);
        m.setTitle("Shape Manipulation");
        m.setDescription("Using NumPy library functions you can modify shape of the array according to your requirement. \n Some following useful operations you can do on arrays – \n Flatten, Reshape, Resize, Split, Stack \n To Flatten –\n  Example: lt \n total_km = np.array([[10, 11, 15, 30], [5, 6, 8, 10]])\n total_km.ravel() Output:    array([10, 11, 15, 30, 5, 6, 8, 10]) \n To Reshape –\n  Example: lt \n Reshape above array in 4 rows, 2 columns.\n total_km.reshape(4, 2)\n Output:   \n array([[10, 11],\n [15, 30],\n [ 5, 6],\n [ 8, 10]])\n To Resize –\n  Example: lt \n Resize again to 2 rows, 4 columns.\n total_km.resize(2, 4)\n total_km\n Output:   \n array([[10, 11, 15, 30],\n [ 5, 6, 8, 10]])\n To Split –\n  Example: lt \n Split array in 2 arrays.\n np.hsplit(total_km, 2)\n Output:   \n [array([[10, 11],\n [ 5, 6]]), array([[15, 30],\n [ 8, 10]])]\n To Stack –\n  Example: lt \n Stack 2 arrays.\n day_1_km = np.array([10, 11, 15, 30])\n day_2_km = np.array([5, 6, 8, 10])\n np.hstack((day_1_km, day_2_km)) \nOutput:    array([10, 11, 15, 30, 5, 6, 8, 10])");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_multiply);
        m.setTitle("Broadcasting");
        m.setDescription("To perform arithmetic operations between 2 arrays of different shapes NumPy uses broadcasting. NumPy broadcast smaller array over larger array. n  Example: lt  n array_1 = np.array([4, 8, 12, 16])n array_2 = np.array([2, 3, 4, 5])n array_1 * array_2\n Output:    array([ 8, 24, 48, 80])\n fix_val = 2\n array_1 * fix_val\n Output:    array([ 8, 16, 24, 32])\n You can notice here, if shape doesn’t match with array_1, NumPy doesn’t create copies of fix_val, it just broadcast fix_val over the entire array to multiply.\n Few constraints of broadcasting are –\n Between 2 arrays broadcasting can be performed either if their dimension are same or one of them is dimension of size 1.\n  Example: lt \n array_1 = np.array([4, 8, 12, 16])\n array_3 = np.array([2, 3])\n array_1 * array_3\n Output:   \n  lt;font color=red> ValueError Traceback (most recent call last)\n   <ipython-input-27-ca6929323c1e> in   <module>\n \n-> 1 array_1 * array_3\n ValueError: operands could not be broadcast together with shapes (4,) (2,)     \n Error due to incompatible shapes");
        models.add(m);

        m = new Model();
        m.setImg(R.drawable.ic_data_frames);
        m.setTitle("Linear Algegbra");
        m.setDescription("Transpose\n transpose() function help to interchange rows and columns i.e. converts rows to columns and columns to rows.\n  Example: lt \n array_1 = np.array([[4, 8, 12, 16], [3, 6, 9, 12]])\n array_1.transpose()\n Output:   \n array([[ 4, 3],\n [ 8, 6],\n [12, 9],\n [16, 12]])\n Inverse\n Find inverse of an array.\n Note: can be applied only on square matrix.\n array_1 = np.array([[2, 4], [1, 3]])\n np.linalg.inv(array_1)\n Output: \narray([[ 1.5, -2. ],\n [-0.5, 1. ]])\n If you are not sure how ouput is as above, then you have to recall formula of inverse of matrix.\n TraceSome of diagonal element. in our array_1 diagonal elements 2 and 3.\n np.trace(array_1)\n Output:    5");
        models.add(m);//error kia ara hai ab? wohi error rarah hai app crsh kr rahi h
        return models;
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}