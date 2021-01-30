package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void decrement(View view) {

    }

    public void increment(View view) {
    }

    public void submitOrder(View view) {
    }

    /**
     * This app displays an order form to order coffee.
     */
    public class DrinksActivity extends Order {

        int numCoffee = 0;
        int coffeePrice = 5;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_drink);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
            EditText gratuity_view = (EditText) findViewById(R.id.gratuity_view);

            if (gratuity_view.getText().length() > 0) {
                double gratuity = Double.parseDouble(gratuity_view.getText().toString());
                displayPrice(numCoffee * coffeePrice + gratuity);
            } else {
                displayPrice(numCoffee * coffeePrice);
            }
        }

        public void increment(View view) {
            numCoffee++;
            display(numCoffee);
        }

        public void decrement(View view) {
            if (numCoffee > 0) {
                numCoffee--;
            }
            display(numCoffee);
        }

        /**
         * This method displays the given quantity value on the screen.
         */
        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
            quantityTextView.setText("" + number);
        }

        private void displayPrice(double number) {
            TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
            priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        }

    }
}
