package com.example.myrecyclejson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<User> users ;

    public MyAdapter(Context mContext, ArrayList<User> users) {
        this.mContext = mContext;
        this.users = users;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {


        holder.name.setText(users.get(position).getNom());
        holder.email.setText(users.get(position).getEmail());
        holder.country.setText(users.get(position).getCountry());
        holder.imageView.setImageResource(users.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,email,country;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewNom);
            email = itemView.findViewById(R.id.textViewEmail);
            country = itemView.findViewById(R.id.textViewCountry);
            imageView = itemView.findViewById(R.id.imageViewProrfile);
        }

    }
}
