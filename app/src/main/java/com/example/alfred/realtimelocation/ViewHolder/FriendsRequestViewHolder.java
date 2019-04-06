package com.example.alfred.realtimelocation.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alfred.realtimelocation.Interface.IRecyclerItemClickListencer;
import com.example.alfred.realtimelocation.R;

public class FriendsRequestViewHolder extends RecyclerView.ViewHolder{

    public TextView txt_user_email;
    public ImageView btn_accept, btn_decline;




    public FriendsRequestViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_user_email = itemView.findViewById(R.id.txt_user_email);
        btn_accept = itemView.findViewById(R.id.btn_accept);
        btn_decline = itemView.findViewById(R.id.btn_decline);
    }

}
