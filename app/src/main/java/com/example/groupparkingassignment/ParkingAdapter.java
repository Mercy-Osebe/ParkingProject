package com.example.groupparkingassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ParkingAdapter extends RecyclerView.Adapter<ParkingAdapter.ViewHolder> {
    private final ParkingList[] listdata;

    public ParkingAdapter(ParkingList[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ParkingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ParkingAdapter.ViewHolder holder, int position) {
        final ParkingList myListData = listdata[position];
        holder.parkingArea.setText(listdata[position].getParkingArea());
        holder.parkingLocation.setText(listdata[position].getParkingLocation());
        holder.parkingNumber.setText(listdata[position].getParkingNumber());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ParkingSlotDetail.class);
                intent.putExtra("parkname", myListData.getParkingLocation());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView parkingNumber, parkingArea, parkingLocation;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.parkingNumber = (TextView) itemView.findViewById(R.id.parkingnumber);
            this.parkingLocation = (TextView) itemView.findViewById(R.id.parkinglocation);
            this.parkingArea = (TextView) itemView.findViewById(R.id.parkingarea);
            this.linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
