package com.example.admin.w2d2zoo;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 9/12/2017.
 */

public class CustomListAdapter extends ArrayAdapter<Animal> {



    public CustomListAdapter(@NonNull Context context,
                             @LayoutRes int resource,
                             @NonNull List<Animal> personList) {
        super(context, resource, personList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        //set data for each view using the personList
        Animal animal = getItem(position);

        //inflate the view
        if(view == null){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(animal.getLayout(),null);
        }

        //bind the views in the custom item layout
        TextView tvAnimalName = view.findViewById(R.id.tvAnimalName);
        TextView tvAnimalAge = view.findViewById(R.id.tvAnimalAge);
        TextView tvAnimalType = view.findViewById(R.id.tvAnimalType);
        TextView tvAnimalWeight = view.findViewById(R.id.tvAnimalWeight);
        TextView tvAnimalInfo = view.findViewById(R.id.tvInfo);
        ImageView ivImg1 = view.findViewById(R.id.ivImg);
        ImageView ivImg2 = view.findViewById(R.id.ivImg2);


        if(animal != null){
            if(tvAnimalName != null) {
                tvAnimalName.setText(animal.getName());
            }
            if(tvAnimalAge != null) {
                tvAnimalAge.setText(String.valueOf(animal.getAge()));
            }
            if(tvAnimalType != null) {
                tvAnimalType.setText(animal.getType());
            }
            if(tvAnimalWeight != null) {
                tvAnimalWeight.setText(String.valueOf(animal.getWeight()));
            }
            if(tvAnimalInfo != null) {
                tvAnimalInfo.setText("Name: " + animal.getName() + "\n" + "Type: " + animal.getType() +
                        "\n" + "Age: " + String.valueOf(animal.getAge()) +
                        "\n" + "Weight: " + String.valueOf(animal.getWeight()));
            }
            if(ivImg1 != null){
                //ivImg1.setBackgroundResource(animal.getImg1());
                ivImg1.setImageResource(animal.getImg1());
            }
            if(ivImg2 != null){
                //ivImg2.setBackgroundResource(animal.getImg2());
                ivImg2.setImageResource(animal.getImg2());
            }
        }

        return view;
    }
}
