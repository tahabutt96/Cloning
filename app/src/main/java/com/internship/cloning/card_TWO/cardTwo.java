package com.internship.cloning.card_TWO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.internship.cloning.R;
import com.internship.cloning.card_ONE.Model;
import com.internship.cloning.card_ONE.MyAdapter;

import java.util.ArrayList;

public class cardTwo extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_two);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<com.internship.cloning.card_ONE.Model> getMyList(){
        ArrayList<com.internship.cloning.card_ONE.Model> models = new ArrayList<>();
//run kro ab ??
        com.internship.cloning.card_ONE.Model m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_introduction);
        m.setTitle("Introduction");
        m.setDescription("Data science is basically converting structured or unstructured data in to insight, understanding and knowledge using scientific methods, processes and algorithms.\n" +
                        "\n" +
                        "Introduction to R Programming Language\n" +
                        "\n" +
                        "R is free open source language used as statistical and visualization software. It can deal with structured (organized) and semi-structured (semi-organized) data\n" +
                        "It is available for all platforms – Linux, Windows, Mac.\n"+
                        "\n"+
                        "R has an effective data handling and storage facility and lot of integrated tools for data analytics.\n"+
                "\n"+
                        "Complex stats models like linear regression, logistic regression, hypothesis testing, ANOVA (Analysis Of Variance), GLM (Generalized Linear Model), etc., can be run in R software.\n"+
                "\n"+
                        "For data visualization, creating graphs, bar-charts, custom designed graphics, plots etc. R provides great tools.\n"+
                "\n"+
                        "IDE (Integrated Development Environment) for R –\n"+
                "\n"+
                "RStudio is an IDE, for R programming. Download and install it from\n" +
                        "\n"+
                        "https://rstudio.com/products/rstudio/download/");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_data_type);
        m.setTitle("Data-Types in R");
        m.setDescription("Logical – Boolean values (Ex. TRUE, FALSE)\n" +
                "\n" +
                "Numeric – All types of numbers (ex. 4, 8.25, 458)\n" +
                "\n" +
                "Integer – Non decimal (ex. 6L, 7L)\n" +
                "\n" +
                "Complex – Real + Complex values (ex. 5+6i)\n" +
                "\n" +
                "Character – Strings and characters (ex. “prakash”, ‘g’)\n" +
                "\n" +
                "Raw – Any data in raw bytes\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_variable);
        m.setTitle("Variables in R");
        m.setDescription("Instead of numbers when use language analysis like news,article,conversation etc. in research");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_operators);
        m.setTitle("Operators in R");
        m.setDescription("Variable contains some piece of data and its values can be changed anytime.\n" +
                "\n" +
                "Name of variable called Identifier.\n" +
                "\n" +
                "There are some rules to define variable names in every programming language and R is also follows some:\n" +
                "\n" +
                "a.) Reserve words or R programming language cannot be used in variable name.\n" +
                "\n" +
                "b.) Variable name can have letters, numbers, underscore, and period.\n" +
                "\n" +
                "c.) If variable name start with period then it cannot followed by digit.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_conditional);
        m.setTitle("Conditional Statements");
        m.setDescription("Conditional statements are used to check if some particular condition is true or false.\n" +
                "R supports 2 types of conditional statements –\n" +
                "1.) If … else\n" +
                "2.) Nested If … else\n" +
                "\n" +
                " If … else\n" +
                "When some particular condition is true, If block executed otherwise else.\n" +
                "Example:\n" +
                "runs <- 51\n" +
                "If (runs > 50) {\n" +
                "print (“Half century completed.”)\n" +
                "} else {\n" +
                "print (“Half century not completed yet.”)\n" +
                "}\n" +
                "Output:\n" +
                "[1] “Half century completed.”\n" +
                "\n" +
                "If … else has 2 forms –\n" +
                "1.) Ifelse() function\n" +
                "2.) Switch statement\n" +
                "\n" +
                "Ifelse() function\n" +
                "Is basically vector equivalent form of If … else and can write in one line,\n" +
                "In some other programming language is called ternary operator also.\n" +
                "Example:\n" +
                "runs <- 51\n" +
                "Ifelse (runs > 50 , “Half century completed.” ,  “Half century not completed yet.”)\n" +
                "\n" +
                "Output: [1] “Half century completed.”\n" +
                "\n" +
                "Switch statement:\n" +
                "Switch statement allows a variable to test equality for every case.\n" +
                "Syntax:  switch(expression, case1, case2,case3….)\n" +
                "Example:\n" +
                "player_type <- “Batsman”\n" +
                "Switch (player_type, Batsman = { print (“contribute runs”) }, Bowler = { print ( “contribute by taking wicket” ) } )\n" +
                "\n" +
                "Output:\n" +
                "[1] “contribute runs”\n" +
                "Nested If … else\n" +
                "Depending on test expression in If, Only one block of code will execute.\n" +
                "Example:\n" +
                "score <- 50\n" +
                "If(score > 50) {\n" +
                "print (“More than half century”) }\n" +
                "else if (score < 50) {\n" +
                "print (“Less than half century”) }\n" +
                "else {\n" +
                "print (“Exact half century”)\n" +
                "}\n" +
                "Output:\n" +
                "[1] “Exact half century”\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_loop);
        m.setTitle("Loop statements");
        m.setDescription("Loop is control flow statement to execute one line or block of code repeatedly (based on some condition can stop it).\n" +
                "Types of Loops in R\n" +
                "1.) For loop\n" +
                "2.) While loop\n" +
                "3.) Repeat loop\n" +
                "For loop\n" +
                "To execute a code (number of lines) an (specific) number of times, we can use For loop.\n" +
                "Example:\n" +
                "vec <- c(2, 4, 6, 8)\n" +
                "for (val in vec) {\n" +
                "print(val)\n" +
                "}\n" +
                "Output:\n" +
                "[1] 2\n" +
                "[1] 4\n" +
                "[1] 6\n" +
                "[1] 8\n" +
                "While loop\n" +
                "Until the test expression is true, execute number of lines (block of code), we can use While loop.\n" +
                "Example:\n" +
                "i <- 1\n" +
                "while (i < 5) {\n" +
                "print (i)\n" +
                "i = i + 1\n" +
                "}\n" +
                "Output:\n" +
                "[1] 1\n" +
                "[1] 2\n" +
                "[1] 3\n" +
                "[1] 4\n" +
                "Repeat loop\n" +
                "It iterates number of lines (block of codes) multiple times, it has no conditional check to stop/exit the loop, and we have to specify it manually inside the loop.\n" +
                "Example:\n" +
                "i <- 1\n" +
                "repeat  {\n" +
                "print (i)\n" +
                "i = i + 1\n" +
                "if ( i == 5) {\n" +
                "break\n" +
                "}\n" +
                "}\n" +
                "Output:\n" +
                "[1] 1\n" +
                "[1] 2\n" +
                "[1] 3\n" +
                "[1] 4\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_loop_control);
        m.setTitle("Loop Control Statements");
        m.setDescription("To break loop in middle means exit the loop without completing all statements of condition, Loop control statements are used. \n" +
                "In R language we use following Loop control statements — \n" +
                "1.) Break statement\n" +
                " 2.) Next statement Break statement \n" +
                "Break statement \n" +
                "To stop the loop (exit from loop) at some specific point, we use break statement. \n" +
                "Example: \n" +
                "x <- 1:4 \n" +
                "Note: above statement is same like x <- c (1, 2, 3, 4) \n" +
                "In R by colon (:) we can define range and create vector of that range. \n" +
                "Come back to Break statement again. \n" +
                "for (val in x) { \n" +
                "if (val == 4) {\n" +
                " break\n" +
                " } \n" +
                "print (val) \n" +
                "} \n" +
                "Output: \n" +
                "[1] 1 \n" +
                "[1] 2 \n" +
                "[1] 3 \n" +
                "Note: in example above, when val == 4 it came out of loop so printed only 1, 2, 3 \n" +
                "Next statement \n" +
                "To just skip the current iteration but continue looping through we use next control statement. \n" +
                "Example: \n" +
                "x <- 1:4 \n" +
                "for (val in x)  {\n" +
                "if (val == 2) {\n" +
                " next\n" +
                " } \n" +
                "print (val) \n" +
                "} \n" +
                "Output: \n" +
                " [1] 1 \n" +
                "[1] 3 \n" +
                "[1] 4 \n" +
                "Note: in example above, when val == 2 it skipped the loop but continued for next val so printed\n" +
                " only 1 3 4\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_r_script);
        m.setTitle("R Script");
        m.setDescription("R script is just plain text file that contains set of commands (block of codes) and can execute all together.\n" +
                "File extension is “.R”\n" +
                "It can modify and re-execute anytime.\n" +
                "Saves lots of time, as in R console you have to write code each time and execute each line.\n" +
                "There are different methods to run R script in R console or command line.\n" +
                "Like –\n" +
                "source ( ) function\n" +
                "Rscript ( ) function\n" +
                "R CMD BATCH\n" +
                "But if we are using R studio as IDE (Integrated Development Environment) then we can create new R script file easily and run by clicking “run “ button or press ctrl+enter (windows) and cmd +enter (mac).\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_r_functions);
        m.setTitle("R Functions");
        m.setDescription("A function is a block of code (set of statements) organized together to perform specific task. The main advantage of functions is to reuse the code. R has many in-built functions as well as we can build our own custom functions. \n" +
                "In R, functions are stored as R objects. \n" +
                "Example of some In-built functions in R — \n" +
                "rep (x, n) — Repeat x number n times. \n" +
                "append ( ) — Add new element to a vector. \n" +
                "seq(a, b, n) — Generate regular sequence from a to b, spaced by n \n" +
                "unique(vec) — Remove duplicate\n" +
                "tolower( )— Convert string to lower case \n" +
                "toupper( )—  Convert string to upper case \n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_custom_function);
        m.setTitle("Custom Function");
        m.setDescription("Syntax to develop own custom function — \n" +
                "function_name <- function (arg_1, arg_2 ...) { \n" +
                "Function body\n" +
                " } \n" +
                "Explanation of different parts of function — \n" +
                "Function name — actual name of function, by which it get called. In R functions stored as object with this name. \n" +
                "\n" +
                "Arguments — When function is called (invoked) we can pass values to arguments. These are optional in function and can assign default values also.\n" +
                "\n" +
                "Function body —  it contains set of statements (block of codes) that will be executed when function will be called/invoked.\n" +
                " \n" +
                "Return value — you have to decide what your function should return eventually to the place it was called/ invoked from. It can return nothing also.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_data_structure);
        m.setTitle("Data Structures");
        m.setDescription("There are 3 important steps when working with Data –\n" +
                "Recognize data structure\n" +
                "Assign values to data structure\n" +
                "Manipulation data\n" +
                "Different types of Data Strcuture –\n" +
                "Atomic vectors – (Type: Homogenous, Dimensionality: 1)\n" +
                "Matrix – (Type: Homogenous, Dimensionality: 2)\n" +
                "Factors – (Type: Homogenous, Dimensionality: 1)\n" +
                "Arrays – (Type: Homogenous, Dimensionality: n)\n" +
                "List – (Type: Heterogeneous, Dimensionality: 1)\n" +
                "Data Frames– (Type: Heterogeneous, Dimensionality: 2)\n" +
                "Note: Type Homogenous means same data type and Heterogeneous means multiple data types.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_atomic_vector);
        m.setTitle("Atomic vectors");
        m.setDescription("Simplest data structure which is one dimensional object. \n" +
                "All values/elements will be same data types. \n" +
                "Data types in Atomic vectors — \n" +
                "Numeric data type \n" +
                "Integer data type \n" +
                "Character data type \n" +
                "Logical data type \n" +
                "\n" +
                "Examples —\n" +
                "\n" +
                " x <- c (4, 8, 12, 16) \n" +
                "y <- c (\"prakash\", \"garv\", \"raynav\")\n" +
                " z <- c (TRUE, FALSE, TRUE, TRUE)\n" +
                "\n" +
                "Vector in continuous range can be created using colon \":\" operator.\n" +
                "\n" +
                " Example: \n" +
                "x <- 1:4; \n" +
                "print(x); \n" +
                "\n" +
                "Output:\n" +
                "[1]  1, 2, 3, 4 \n" +
                "\n" +
                "Any vector element can be accessed by its index value (position) indicated in square brackets \n" +
                "\n" +
                "Example: \n" +
                "names <- c (\"prakash\", \"garv\", \"jiya\", \"raynav\", \"daksh\") \n" +
                "names [1] \n" +
                "It will give value \"prakash\" # first element of vector \n" +
                "\n" +
                "names [ c (2, 5) ]\n" +
                " It will give value \"garv\" and \"daksh\" # second and fifth element of vector \n" +
                "\n" +
                "Note: # is used in R for commenting line.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_matrix);
        m.setTitle("Matrix");
        m.setDescription("Matrix is same as vectors means work on same data types , the only difference is Matrix is 2 dimensional. \n" +
                "Values for columns and rows are defined by argument nrow and ncol. \n" +
                "Example — \n" +
                "1.) x <- matrix(1:4, nrow = 2, ncol = 2, byrow = TRUE) \n" +
                "Output: \n" +
                "[,1] [,2]\n" +
                " [1,] 1 2 \n" +
                "[2,] 3 4 \n" +
                "\n" +
                "Note: by row define split vector by rows, by default it split by column.\n" +
                "\n" +
                "2.) y matrix(4:12, nrow=3, ncol=3) \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                " [,1] [,2] [,3] \n" +
                "[1,]4710\n" +
                " [2,] 5811 \n" +
                "[3,] 6912 \n" +
                "\n" +
                "Elements can be accessed using square bracket'[]' indexing. \n" +
                "\n" +
                "Example, In above matrix —\n" +
                " y[c(2, 3), c(1,2)]\n" +
                " It will fetch row 2 and 3, and column 1 and 2 \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "[,1] [,2]\n" +
                "[1,] 5 8\n" +
                "[2,] 6 9 1\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_array);
        m.setTitle("Arrays");
        m.setDescription("Arrays are very similar to matrix with one major difference only of dimensions,\n" +
                " As matrix are 2 dimension, Arrays can have multi dimension.\n" +
                " Example: \n" +
                "vector 1 <- c(5, 8, 3) \n" +
                "vector2 <- c(4, 6, 9, 7, 2, 1) \n" +
                "arr_result <- array(c (vector1, vector2), dim = c(3, 3, 1)) \n" +
                "\n" +
                "Output: \n" +
                ", , 1\n" +
                "[,1] [,2] [,3]\n" +
                "[1,] 5 4 7\n" +
                "[2,] 8 6 2 \n" +
                "[3,] 3 9 1 \n" +
                "\n" +
                "Note: dim 3, 3, 1 means 3 rows, 3 columns and 1 dimension.\n" +
                "If you increase rows, columns or dimension that doesn't fit elements then it will repeat.\n" +
                "For example if you make dim = (4, 3, 2) in above example then output will be – \n" +
                ", , 1\n" +
                "[,1] [,2] [,3]\n" +
                "[1,] 5 6 1 \n" +
                "[2,] 8 9 5\n" +
                " [3,] 3 7 8 \n" +
                "[4,]4 2 3\n" +
                ", , 2\n" +
                "[,1] [,2] [,3]\n" +
                "[1,]4 2 3\n" +
                "[2,] 6 1 4 \n" +
                "[3,] 9 5 6 \n" +
                "\n" +
                "To access or change/modify element of array you can use index position. \n" +
                "\n" +
                "Example: \n" +
                "arr_result[2, , 1] #second row, all columns of first dimension.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_factors);
        m.setTitle("Factors");
        m.setDescription("Factors are used to categorize data in finite number and store as levels. \n" +
                "Levels mean distinct values. \n" +
                "Example: marital status can be single, married, divorced. \n" +
                "status <- factor(c(\"single\", \"married\", \"divorced\", \"married\", \"divorced\")) \n" +
                "Output:  [1] single married divorced married divorced \n" +
                "Levels: divorced married single\n" +
                "Another example: direction can be east, west, south, north. \n" +
                "direction <- factor(c(\"east\", \"west\", \"south\", \"east\", \"south\", \"north\"))\n" +
                "Output: [1] east west south east south north \n" +
                "Levels: east north south west \n" +
                "Note: factor element can be fetched using index position, similar to vector. \n" +
                "Example:  direction[3] \n" +
                "Output:  [1] south \n" +
                "Levels: east north south west\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_data_frames);
        m.setTitle("Data Frames");
        m.setDescription("Data frames are just like matrix with the main difference of heterogenous (different data-types) support, data frames columns can consist different modes of data types like numeric, character, factors.\n" +
                " Example: \n" +
                "names <- c(\"Prakash\", \"Jiya\", \"Garv\", \"Raynav\") \n" +
                "age <-c(40, 39, 13, 4) \n" +
                "gender <- c(\"Male\", \"Female\", \"Male\")\n" +
                " df <- data.frame(names, age, gender)\n" +
                " \n" +
                "Output: \n" +
                "names age gender\n" +
                "1 Prakash 40 Male \n" +
                "2 Jiya 39 Female \n" +
                "3 Garv 13 Male \n" +
                "4 Raynav 4 Male \n" +
                "\n" +
                "If you check the structure of this df \n" +
                "By \n" +
                "str(df) \n" +
                "\n" +
                "Output:\n" +
                " 'data.frame': 4 obs. of 3 variables: \n" +
                "$ names : Factor w/ 4 levels \"Garv\",\"Jiya\",… 3 2 1 4 \n" +
                "$ age : num 40 39 13 4\n" +
                "$ gender: Factor w/ 2 levels \"Female\",\"Male\": 2  1 2 2 \n" +
                "Here if you notice, name and gender is Factor. \n" +
                "So if you don't want to convert character vector as factor, then pass the argument StringsAsFactor = FALSE \n" +
                "Example: \n" +
                "names <- c(\"Prakash\", \"Jiya\", \"Garv\", \"Raynav\") \n" +
                "age<- c(40, 39, 13, 4) \n" +
                "gender <- c(\"Male\", \"Female\", \"Male\",\n" +
                "df <- data.frame(names, age, gender, stringsAsFactors = FALSE) \n" +
                "\n" +
                "Now if you check str(df) \n" +
                "\n" +
                "Output: \n" +
                "'data.frame': 4 obs. of 3 variables:\n" +
                " $ names : chr \"Prakash\" \"Jiya\" \"Garv\" \"Raynav\" \n" +
                "$ age : num 40 39 134 \n" +
                "$ gender: chr \"Male\" \"Female\" \"Male\" \n" +
                "Here you can notice names and gender data structure is chr (character) now.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_list);
        m.setTitle("List");
        m.setDescription("A list is basically vector which elements are different type of data structures; it can contain vector, matrix, factor, data frames and even other list itself. \n" +
                "Example: \n" +
                "vec <- c(5, 6, 7, 8) \n" +
                "mat <- matrix(vec, 2, 2) \n" +
                "list1 <- list(vec, mat) \n" +
                "\n" +
                "Output: \n" +
                "[[ 1 ]]\n" +
                "[1] 5 6 7 8\n" +
                "[[ 2 ]]\n" +
                " [1,] [2,]\n" +
                "[1,] 5 7\n" +
                "[2,] 6 8\n" +
                "\n" +
                " List element can be accessed by index position. \n" +
                "\n" +
                "Example: \n" +
                "list1 [c(l ,2,3)] \n" +
                "\n" +
                "Output:\n" +
                " [1] 5 6 7 8 \n" +
                "[[ 2 ]]\n" +
                " [1,] [2,]\n" +
                "[1,] 5 7\n" +
                "[2,] 6 8\n" +
                "[[ 3 ]]\n" +
                "NULL\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_import_export);
        m.setTitle("Import/Export Data - Assign values to data structure");
        m.setDescription("Importing Data \n" +
                "In R, you can use 4 major types of files to import data – \n" +
                "Excel\n" +
                "csv \n" +
                "Table \n" +
                "Minitab \n" +
                "\n" +
                "To import any type of file format there is many packages available in R, before using any package we need to install that package, here is command how to install package –\n" +
                " install.packages(\"\") \n" +
                "Note: here will be replaced with what package you want\n" +
                "After installing package, to use that you have to load it, here is how to load package – \n" +
                "library (<package_name>)\n" +
                " After these above 2 steps you can easily use functions available in that package. \n" +
                "To importing data in R, we will discuss few packages only, every package has own functions and manual available, but installing and loading is same way as we mentioned above.\n" +
                " Excel \n" +
                "To import data from excel file to R we are going to use XLConnect library.\n" +
                "install.packages(\"XLConnect\") # To install XLConnect package. \n" +
                "library(XLConnect) # To load XLConnect library. worksheet <- loadWorkbook(\"design.xlsx\") #Load complete excel file. \n" +
                "dataf <- readWorksheet(worksheet, sheet = \"api-account\") #Read particular sheet from excel file. \n" +
                "View(dataf) # To view the sheet data in R \n" +
                "Note: you should set your R working directory to the directory your excel file is saved. \n" +
                "you can check your current working directory by\n" +
                "getwd()\n" +
                " and to change it, use \n" +
                "setwd(\"\") \n" +
                "\n" +
                "CSV \n" +
                "CSV is basically comma separated values. Separation can be other special character also but usually it is by comma. \n" +
                "help(\"read.csv\") #See the manual of read.csv \n" +
                "df <- read.csv(\"demo.csv\", sep =”,” ) #sep is for separator and optional argument \n" +
                "View(df)\n" +
                "\n" +
                "Table\n" +
                "A plain text file which has data table in it can be read in R\n" +
                "df <- read.table (“data_table.txt”)\n" +
                "View(df)\n" +
                "\n" +
                "Minitab\n" +
                "To import Mintab portable worksheet format in R, we can use read.mtp function and it will return list.\n" +
                "library(foreign)\n" +
                "help(read.mtp)\n" +
                "df <- read. mtp(“mtpdata.mtp”)\n" +
                "View(df)\n" +
                "\n" +
                "Exporting Data\n" +
                "Exporting data in different format,excel, csv, txt (for table) is very easy, here I give you one example of each.\n" +
                "Excel\n" +
                "library(xlsx)\n" +
                "help(write.xlsx)\n" +
                "write.xlsx(df, “c:/df.xlsx”)\n" +
                "\n" +
                "CSV\n" +
                "help(write.csv)\n" +
                "write.csv(df , file = ” c:/df.csv”)\n" +
                "\n" +
                "Table\n" +
                "help(write.table)\n" +
                "write.table(df , “c:/df.txt”, sep = “”)\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_data_manipulation);
        m.setTitle("Data Manipulation/Transformation");
        m.setDescription("It is rare chance that you get data in desired form, so data manipulation/transformation will help you to modify data to reach accuracy level you are looking for.\n" +
                "There are so many packages available in R for data manipulation. Here we will discuss 2 ways –\n" +
                "Apply function of Base R\n" +
                "dplyr Package\n" +
                "Both are explained in detail, Go back and click on corresponding item in list.\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_apply_function);
        m.setTitle("Apply function of Base R");
        m.setDescription("To do specific changes on row or column of R object, we can use apply function.\n" +
                "Types of apply functions in R:\n" +
                "o apply()\n" +
                "o lapply()\n" +
                "o sapply()\n" +
                "o tapply()\n" +
                "o mapply()\n" +
                "o vapply()\n" +
                "o rapply()\n" +
                "\n" +
                "Only apply(), lapply() and sapply()\n" +
                "functions are commonly used. So lets discuss those only —\n" +
                "apply()\n" +
                "To apply some function on matrix row or column and in return gets vector, array or list.\n" +
                "Syntax —\n" +
                "Apply (matrix_x, margin, function)\n" +
                "Note: margin 1 is for row and 2 is for column.\n" +
                "Example:\n" +
                "matrix_x <- matrix(c(2,4,6,8),2,2)\n" +
                "apply(matrix_x, 1, sum)\n" +
                "apply(matrix_x, 2, sum)\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "matrix_x\n" +
                "[1] [2]\n" +
                "[1,] 2 6\n" +
                "[2] 48\n" +
                "apply(matrix_x, 1, sum)\n" +
                "[1]8 12\n" +
                "apply(matrix_x, 2, sum)\n" +
                "\n" +
                "lapply()\n" +
                "\n" +
                "It accept list as argument and loop through its each item to apply function and in return gives list back.\n" +
                "Syntax —\n" +
                "lapply(my_list, function)\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "my_list <- list(a=c(2,2, b=c(4,4,c=c(6,6))))\n" +
                "lapply (my_list, sum)\n" +
                "lapply (my_list, mean)\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "my_list <- list(a=c(2,2, b=c(4,4,c=c(6,6))))\n" +
                "lapply (my_list, sum)\n" +
                "$a\n" +
                "[1] 24\n" +
                "lapply (my_list, mean)\n" +
                "$a\n" +
                "[1] 4\n" +
                "\n" +
                "sapply()\n" +
                "\n" +
                "sapply is same as lapply except it return result in simplified format, \n" +
                "\n" +
                "If list each element has size 1 then ouput is in vector format and if any element size is greater than 1 (>1) then marix format.\n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "my_list <- list(a=c(2,2, b=c(4,4,c=c(6,6))))\n" +
                "sapply (my_list, sum)\n" +
                "sapply (my_list, mean)\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "my_list <- list(a=c(2,2, b=c(4,4,c=6(6,6))))\n" +
                "my_list <- list(a=c(2,2, b=c(4,4,\n" +
                "c=c(6,6))))\n" +
                "sapply (my_list, sum)\n" +
                "a\n" +
                "24\n" +
                "sapply (my_list, mean)\n" +
                "a\n" +
                "4\n" +
                "\n" +
                "Example 2:\n" +
                "\n" +
                "my_list2 <- list(a = c(1,1), b=c(2,2),c=c(3,3))\n" +
                "sapply (my_list2, sum)\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "my_list2 <- list(a = c(1,1), b=c(2,2),c=c(3,3))\n" +
                "sapply (my_list2, sum)\n" +
                "a b c\n" +
                "2 4 6\n");
        models.add(m);

        m = new com.internship.cloning.card_ONE.Model();
        m.setImg(R.drawable.ic_dplyr);
        m.setTitle("dplyr Package");
        m.setDescription("There are many packages available for data manipulation/transformation in R, the most commonly used one is dplyr package which we will discuss here.\n" +
                "We will learn 5 key functions of dplyr packages, we can Call these functions as verbs also because their names itself suggest what action they will perform.\n" +
                "o Select()\n" +
                "o Filter()\n" +
                "o Arrange()\n" +
                "o Mutate()\n" +
                "o Summarize()\n" +
                "\n" +
                "Note: Before using dplyr package you have to do –\n" +
                "\n" +
                "install.packages(“dplyr”)\n" +
                "library(dplyr)\n" +
                "\n" +
                "Select()\n" +
                "\n" +
                "To select specific columns from large dataset, select function is used in dplyr package.\n" +
                "Note: for experiment you can use mtcars dataset (built-in dataset in R for testing and training purpose).\n" +
                "Examples:\n" +
                "select(mtcars, gear, carb)\n" +
                "select(mtcars, hp:carb)\n" +
                "select(mtcars, starts_with(“qs”))\n" +
                "select(mtcars, ends_with(“ar”))\n" +
                "select(mtcars, matches(“.r.”))\n" +
                "select(mtcars, contains(“ra”))\n" +
                "\n" +
                "Filter()\n" +
                "Filter the dataset based on condition, If you are familiar with SQL then it is similar to where clause in sql query.\n" +
                "Examples:\n" +
                "filter(mtcars, gear == 4)\n" +
                "filter(mtcars, gear < 4)\n" +
                "filter(mtcars, gear == 4 & vs == 0)\n" +
                "filter(mtcars, gear > 4 | vs == 0)\n" +
                "\n" +
                "Note: AND condition can be written as comma separated arguments too.\n" +
                "Example — filter(mtcars, gear == 4, vs == 0)\n" +
                "Arrange()\n" +
                "Arrange (sort) data in specific order.\n" +
                "Examples:\n" +
                "arrange(mtcars, gear) #Ascending order for gear (by default order is ascending)\n" +
                "arrange(mtcars, desc(gear)) #Descending order for gear\n" +
                "arrange(mtcars, cyl, gear) # Can usemultiple columns for arrange\n" +
                "Mutate()\n" +
                "To add new column/variable to dataset.\n" +
                "Example:\n" +
                "mutate(mtcars, custom_hp = hp /4) #It will add custom_hp column in existing dataset (mtcars)\n" +
                "Summarize()\n" +
                "It is used on grouped data by group_by() function. One row will be created for each group.\n" +
                "Examples:\n" +
                "summarise(group_by(mtcars, gear))\n" +
                "summarise(group_by(mtcars, gear),mean(disp))\n" +
                "summarise(group_by(mtcars, gear),mean(disp), sd(disp))\n" +
                "\n" +
                "Useful functions that can be used inthis function:\n" +
                "\n" +
                "Center: median(), mean()\n" +
                "Range: min(), max(), quantile()\n" +
                "Spread: IQR(), sd(), mad()\n" +
                "Count: n(), n_distinct()\n" +
                "Position: first(), last(), nth(),\n" +
                "Logical: any(), all()\n");
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