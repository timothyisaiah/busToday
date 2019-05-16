package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BusCompanyAdapter extends RecyclerView.Adapter<BusCompanyAdapter.myViewHolder>{
    public static Context context;
    LayoutInflater inflater;

    private ArrayList<busCompanyModel> arrayList;


    public  BusCompanyAdapter(Context context,ArrayList<busCompanyModel> arrayList){
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.arrayList =arrayList;
    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buscomodel,parent,false);

        return new myViewHolder(view /*, mListener*/, arrayList);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {
        busCompanyModel model = arrayList.get(i);

        myViewHolder.textView.setText(model.getCompany_name());
//        myViewHolder.imageView.setImageResource(model.getImg_id());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class myViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView;
        ArrayList<busCompanyModel> arrayList;

        public myViewHolder(View itemView/*, final onItemClickListener listener */,ArrayList<busCompanyModel> arrayList){
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.busPic);
            textView = (TextView)itemView.findViewById(R.id.companyName);
            this.arrayList = arrayList;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int pointClicked = getAdapterPosition();
            busCompanyModel bus = arrayList.get(pointClicked);

            Intent i = new Intent(context,MainActivity.class);
            i.putExtra("company_name", bus.getCompany_name());
            context.startActivity(i);
            try {
                Toast.makeText(context, bus.getCompany_name(), Toast.LENGTH_LONG).show();
            }catch (Exception e){
                Toast.makeText(context, "can Click but cant reach Context", Toast.LENGTH_LONG).show();
            }

        }
    }
}

