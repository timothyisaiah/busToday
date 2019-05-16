package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class CompanyViewHolder extends GroupViewHolder {
    private TextView textView;

    public CompanyViewHolder(View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textViewCompany);
    }

    public void bind(Company company){
        textView.setText(company.getTitle());
    }
}
