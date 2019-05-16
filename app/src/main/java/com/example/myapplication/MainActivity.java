package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company>  companies = new ArrayList<>();
        String[] company_name ={"YY","GATEWAY","JAGUAR","KAKISE","MASH POA","SIMBA","TRINITY",
                "BABY COACH","KALITA","POSTA EXECUTIVE","GAAGAA"};
        String[] departure = {"7:00am","5:00am","6:00am","10:00am","10:00am","6:00am","5:00am","11:00am","6:00am","11:00am","6:00pm","12:00pm"};
    String[] route = {"Moroto","Nairobi","Kigali","Mbale","Busia","Bujumbura","Dar-salaam","Arua","Goma","Gulu","Juba","Mbarara"};
        String[] fee = {"$70","$100","$80","$40","$45","$87","$200","$70","$100","$40","$100","$30"};
        String[] days = {"Monday-Saturday","Tuesday,Friday","Monday,Wednesday,Saturday","Everyday","Everyday",
                "Monday,Wednesday,Saturday","Tuesday,Friday","Everday","Friday","Everday","Tuesday,Thursaday","Everyday"};


        for(int i = 0;i<route.length;i++){
            ArrayList<Product>  company= new ArrayList<>();
            company.add(new Product(departure[i],fee[i],days[i]));
            Company newCompany = new Company("Kampala - "+route[i],company);
            companies.add(newCompany);
        }
        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);

    }

    public void startNew(View view){
        startActivity(new Intent(getApplicationContext(),MakePayment.class));
    }
}
