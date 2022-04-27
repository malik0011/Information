package com.example.information;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myviewholder> {

    //creating list to store data which we getting
    Teacher[] data;

    public myAdapter(Teacher[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_view,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        Glide.with(holder.img).load(data[position].getProfileImag()).into(holder.img);
        holder.name.setText(data[position].getName().toString());
        holder.subjects.setText(data[position].getSubjects()[0].toString());
        holder.qualification.setText(data[position].getQualification()[0].toString());
        holder.viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if we want to perform any operation after clicking view more button then we have write the code here

                Toast.makeText(view.getContext(), "this feature will coming soon..", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length; //returning the size of the list
    }

    class myviewholder extends RecyclerView.ViewHolder{

        RoundedImageView img;
        TextView name,subjects,qualification;
        Button viewMore;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView1);
            name = itemView.findViewById(R.id.nameTV);
            subjects = itemView.findViewById(R.id.subjectTv);
            qualification = itemView.findViewById(R.id.qualification);
            viewMore = itemView.findViewById(R.id.btn_viewMore);
        }
    }
}
