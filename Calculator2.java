package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator2 extends AppCompatActivity {

    //INITIALIZING ALL VARIABLES
    int num1, num2, num, total;
    String numeral1;
    TextView outputdecimal, outputroman;
    boolean add,sub;

    public int converttodecimal(String numeral1) { //Second method converting roman numeral to decimal
        this.numeral1 = numeral1; //making initializer equal to the new variable
        int decimal = 0; // setting the number the user starts with to 0

        while (numeral1.length() != 0) { //Loops until the length of the numeral1 equals 0

            if (numeral1.indexOf("CM") >= 0)  { //finds the position where these letters are in the string
                decimal += 900; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("CM", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("CD") >= 0) { //finds the position where these letters are in the string
                decimal += 400; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("CD", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("XC") >= 0) { //finds the position where these letters are in the string
                decimal += 90; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("XC", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("XL") >= 0) { //finds the position where these letters are in the string
                decimal += 40; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("XL", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("IX") >= 0) { //finds the position where these letters are in the string
                decimal += 9; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("IX", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("IV") >= 0) { //finds the position where these letters are in the string
                decimal += 4; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("IV", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("M") >= 0) { //finds the position where these letters are in the string
                decimal += 1000; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("M", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("D") >= 0) { //finds the position where these letters are in the string
                decimal += 500; //adds the associated value with the letter(s)
                numeral1 = numeral1 .replaceFirst("D", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("C") >= 0) { //finds the position where these letters are in the string
                decimal += 100; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("C", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("L") >= 0) { //finds the position where these letters are in the string
                decimal += 50;   //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("L", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("X") >= 0) { //finds the position where these letters are in the string
                decimal += 10; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("X", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("V") >= 0) { //finds the position where these letters are in the string
                decimal += 5; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("V", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

            if (numeral1.indexOf("I") >= 0) { //finds the position where these letters are in the string
                decimal += 1; //adds the associated value with the letter(s)
                numeral1 = numeral1.replaceFirst("I", ""); // replaces those letter(s) with a blank space so you don't recount them again
            }

        }
        return decimal; // stores the value of the variable
    }

    public String converttostring(int num) { //First method converting decimal to Roman Numeral
        this.num =  num; // keeps the same variable without actually having to create a new variable
        String roman = ""; // Storing the roman numeral inside this empty string

        while (num >= 1000) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "M"; // If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 1000; // subtracts 1000 from the user's input for the number so no more of the same letter show again
        }

        while ( num >= 900) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "CM"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 900; // subtracts 900 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 500) {//Checks to see if num the user entered is greater than or equal to this statement
            roman += "D";  //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 500; // subtracts 500 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 400) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "CD"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 400; // subtracts 400 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 100) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "C"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 100; // subtracts 100 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 90) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "XC"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 90; // subtracts 90 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 50) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "L"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 50; // subtracts 50 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 40) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "XL"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 40; // subtracts 40 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 10) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "X"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 10; // subtracts 10 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 9) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "IX"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 9; // subtracts 9 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 5) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "V"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 5; // subtracts 5 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 4) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "IV"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 4; // subtracts 4 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 1) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "I"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 1; // subtracts 1 from the user's input for the number so no more of the same letter show again
        }
        return roman;// stores the value of the variable

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        //MAPPING BUTTONS TO CORRECT OBJECT ID
        Button ButtonDR = (Button) findViewById(R.id.ButtonDR);
        Button ButtonAC = (Button) findViewById(R.id.buttonAC);
        Button ButtonI = (Button) findViewById(R.id.buttonI);
        Button ButtonV = (Button) findViewById(R.id.buttonV);
        Button ButtonX = (Button) findViewById(R.id.buttonX);
        Button ButtonL = (Button) findViewById(R.id.buttonL);
        Button ButtonC = (Button) findViewById(R.id.buttonC);
        Button ButtonD = (Button) findViewById(R.id.buttonD);
        Button ButtonM = (Button) findViewById(R.id.buttonM);
        Button Buttonadd = (Button) findViewById(R.id.buttonadd);
        Button Buttonsub = (Button) findViewById(R.id.buttonsub);
        Button Buttontotal = (Button) findViewById(R.id.buttontotal);

        outputdecimal = (TextView) findViewById(R.id.outputdecimal);
        outputroman = (TextView) findViewById(R.id.outputroman);

        // THIS BUTTON IS STARTING A NEW WINDOW WITHIN THAT SAME SCREEN
        ButtonDR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

        //ONCE THE CLEAR BUTTON IS CLICKED IT WILL RESET ALL VALUES
        ButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                total = 0;
                outputdecimal.setText("");
                outputroman.setText("");
            }
        });

        //ONCE THE USER CLICKS ON THE I BUTTON
        ButtonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "I"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "I" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER CLICKS ON THE V BUTTON
        ButtonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "V"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "V" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL



            }
        });

        //ONCE THE USER CLICKS ON THE X BUTTON
        ButtonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "X"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "X" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER CLICKS ON THE L BUTTON
        ButtonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "L"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "L" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER CLICKS ON THE C BUTTON
        ButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "C"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON


                outputroman.setText(outputroman.getText().toString() + "C" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER CLICKS ON THE D BUTTON
        ButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "D"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "D" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER CLICKS ON THE M BUTTON
        ButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeral1 = numeral1 + "M"; //SETS THE NUMERAL TO THE BUTTON THEY CLICKED ON AND ALLOWS TO REPEATDLY CLICK THAT BUTTON

                outputroman.setText(outputroman.getText().toString() + "M" ); //OUTPUT THE ROMAN NUMERAL TO A STRING OF THAT BUTTON

                outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUT THE DECIMAL USING THE CONVERT TO DECIMAL METHOD BY INPUTING A ROMAN NUMERAL

            }
        });

        //ONCE THE USER SELECTS THE ADDING BUTTON
        Buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(outputroman == null){ //IF THE OUTPUT OF THE DECIMAL IS NOTHING
                    outputroman.setText("");  // IT WILL SET THE OUTPUT OF THE DECIMAL TO A STRING WHICH IS BLANK
                }

                else{ //OTHERWISE
                    num1 = converttodecimal(outputroman.getText().toString()); //CONVERT'S THE ROMAN NUMERAL TO A DECIMAL
                    add = true; // THIS BUTTON TURNS TRUE
                    outputroman.setText(null); //CLEARS THE ROMAN NUMERAL THAT YOU INPUTTED ONCE YOU CLICK THE ADD BUTTON
                }

            }
        });

        Buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(outputroman == null){  //IF THE OUTPUT OF THE DECIMAL IS NOTHING
                    outputroman.setText(""); // IT WILL SET THE OUTPUT OF THE DECIMAL TO A STRING WHICH IS BLANK
                }

                else{ //OTHERWISE
                    num1 = converttodecimal(outputroman.getText().toString()); //CONVERT'S THE ROMAN NUMERAL TO A DECIMAL
                    sub = true; // THIS BUTTON TURNS TRUE
                    outputroman.setText(null); //CLEARS THE ROMAN NUMERAL THAT YOU INPUTTED ONCE YOU CLICK THE ADD BUTTON
                }

            }
        });

        Buttontotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2 = converttodecimal(outputroman.getText().toString()); //THE SECOND NUMBER ALSO GETS CONVERTED TO AN INTEGER


                if(add == true){ //IF THE ADDING BUTTON WAS SET TO TRUE

                    if (num1 + num2 < 5000) // IF THE TOTAL OF BOTH NUMBERS ADDED TOGETHER IS LESS THAN 5000
                        outputroman.setText(converttostring(num1 + num2 )); //CONVERTING THE SUM OF THOSE TWO NUMBERS INTO A ROMAN NUMERAL
                        outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUTING THAT SUM INTO A DECIMAL



                    if (num1 + num2 > 5000) { // IF THE TOTAL OF BOTH NUMBERS ADDED TOGETHER IS GREATER THAN 5000
                        outputdecimal.setText("Error"); //PRINT ERROR IN DECIMAL
                        outputroman.setText("Error"); //PRINT ERROR IN ROMAN NUMERAL

                    }

                    add = false; //SET ADD TO FALSE

                }

                else if (sub == true){ //IF THE ADDING BUTTON WAS SET TO TRUE

                    if (num1 - num2 < 5000)  // IF THE TOTAL OF BOTH NUMBERS SUBTRACTED TOGETHER IS LESS THAN 5000

                        outputroman.setText(converttostring(num1 - num2 )); //CONVERTING THE DIFFERENCE OF THOSE TWO NUMBERS INTO A ROMAN NUMERAL
                        outputdecimal.setText(converttodecimal(outputroman.getText().toString()) + ""); //OUTPUTING THAT SUM INTO A DECIMAL



                    if (num1 - num2 > 5000 || num1 - num2 < 0) { //IF THE DIFFERENCE IS LESS THAN 0 OR GREATER THAN 5000 PRINT ERROR
                        outputdecimal.setText("Error");
                        outputroman.setText("Error");

                    }




                    sub = false; //SET SUB TO FALSE
                }


            }

        });





    }

}