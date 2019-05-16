package com.example.myapplication;

//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.GridLayoutManager;
//import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    BusCompanyAdapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.BusCoRecyclerView);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        adapter = new BusCompanyAdapter(this,components());
   /*     adapter.setOnItemClickListener(new BusCompanyAdapter.onItemClickListener() {
            @Override
            public void onItemClicked(int position) {
                Toast.makeText(Main2Activity.this, "this item at position "+position, Toast.LENGTH_SHORT).show();
            }
        });*/
        recyclerView.setAdapter(adapter);

    }
    public ArrayList<busCompanyModel> components(){
        ArrayList<busCompanyModel> arrayList = new ArrayList<>();


         int[] img_id = {R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo,R.drawable.volo};
        String[] company_name ={"YY","GATEWAY","JAGUAR","KAKISE","MASH POA","SIMBA","TRINITY",
                "BABY COACH","KALITA","POSTA EXECUTIVE","GAAGAA"};
        int i = 0;
        for(int id : img_id){
            arrayList.add(new busCompanyModel(id,company_name[i]/*,id*/));
            i++;
        }
//        for(int x=0;x<img_id.length;x++){
//            arrayList.add(new busCompanyModel(img_id[i],company_name[i]));
//        }
//
        return arrayList;
    }
}
