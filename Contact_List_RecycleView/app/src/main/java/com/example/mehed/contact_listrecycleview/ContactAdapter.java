package com.example.mehed.contact_listrecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    public ContactAdapter(Context context, ArrayList<Contact> contactList) {
        this.context = context; //ArrayList & Context k call korar jonno constructor create korci
        this.contactList = contactList;
    }

    Context context;
   ArrayList<Contact>contactList;
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.sample_view,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Contact contact=contactList.get(i);
        myViewHolder.name.setText(contact.getName());//Contract ArrayList thake data set kore
        myViewHolder.phone.setText(contact.getPhone());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,phone;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.nameTV);
            phone=itemView.findViewById(R.id.phoneTV);
        }
    }
}
