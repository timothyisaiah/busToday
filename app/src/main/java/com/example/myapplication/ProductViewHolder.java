package com.example.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import static android.support.constraint.Constraints.TAG;

public class ProductViewHolder extends ChildViewHolder {

    private TextView myTextView;
    private TextView myTextView2;
    private TextView myTextView3;


    public ProductViewHolder(View itemView) {
        super(itemView);
        myTextView = itemView.findViewById(R.id.textViewProduct);
        myTextView2 = itemView.findViewById(R.id.textViewProduct2);
        myTextView3 = itemView.findViewById(R.id.textViewProduct3);
    }

    public void bind(Product product){
        myTextView.setText(product.name);
        myTextView2.setText(product.name2);
        myTextView3.setText(product.name3);
    }



}
