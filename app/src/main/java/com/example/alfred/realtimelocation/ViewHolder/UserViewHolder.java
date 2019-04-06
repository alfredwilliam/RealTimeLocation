package com.example.alfred.realtimelocation.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.alfred.realtimelocation.Interface.IRecyclerItemClickListencer;
import com.example.alfred.realtimelocation.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txt_user_email;
    IRecyclerItemClickListencer iRecyclerItemClickListencer;

    public void setiRecyclerItemClickListencer(IRecyclerItemClickListencer iRecyclerItemClickListencer) {
        this.iRecyclerItemClickListencer = iRecyclerItemClickListencer;
    }



    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_user_email = itemView.findViewById(R.id.txt_user_email);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        iRecyclerItemClickListencer.onItemClickListener(view,getAdapterPosition());
    }
}
