package com.example.admin.coffee;

import android.annotation.TargetApi;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView quantitytv;
    private int quantity =0;
    private int price ;
    private int quantityprice=10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plusbtn (View v){


        quantity++;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void minusbtn(View view){
        quantity--;
        String b= "" + quantity;
        display(quantity);
    }



    private void display(int number) {
        quantitytv=(TextView)findViewById(R.id.quantity_text_view);
        quantitytv.setText("" + number);

    }


    @TargetApi(Build.VERSION_CODES.N)
    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.price_text_view);
        priceTextView.setTextAppearance(Integer.parseInt(NumberFormat.getCurrencyInstance().format(number)));

    }

    public void orderbtn(View view){

        price= quantity*quantityprice;
        String g = "" + price;
        display(quantity*10);

    }


}