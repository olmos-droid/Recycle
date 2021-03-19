package com.example.myrecyclejson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclevsCardview.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<User> users;
    RecyclerView recyclerView;

    public MyAdapter(Context mContext, ArrayList<User> users, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.users = users;
        this.recyclerView = recyclerView;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager)
        {
            view = layoutInflater.inflate(R.layout.grid, parent, false);
        } else
        {
            view = layoutInflater.inflate(R.layout.row, parent, false);
        }
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {


        holder.name.setText(users.get(position).getNom());
        holder.email.setText(users.get(position).getEmail());
        holder.country.setText(users.get(position).getCountry());
        holder.imageView.setImageResource(users.get(position).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "You are selected CardView num: " + position, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, email, country;
        ImageView imageView;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewNom);
            email = itemView.findViewById(R.id.textViewEmail);
            country = itemView.findViewById(R.id.textViewCountry);
            imageView = itemView.findViewById(R.id.imageViewProrfile);

            if (recyclerView.getLayoutManager() instanceof GridLayoutManager)
            {
                cardView = itemView.findViewById(R.id.cardViewGrid);
            } else
            {
                cardView = itemView.findViewById(R.id.cardViewRow);

            }

        }

    }
}
