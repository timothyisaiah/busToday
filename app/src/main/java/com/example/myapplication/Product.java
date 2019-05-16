package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    public final String name;
    public final String name2;
    public final String name3;

    public Product(String name,String name2,String name3){
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
    }

    protected  Product(Parcel in){
        name = in.readString();
        name2 = in.readString();
        name3 = in.readString();
    }

    public static  final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel parcel) {
            return new Product(parcel);
        }

        @Override
        public Product[] newArray(int i) {
            return new Product[i];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(name);
    }
}
