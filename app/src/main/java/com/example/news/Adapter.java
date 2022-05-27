package com.example.news;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {

    private Context context;
    private List<GetData> dataList;

    public Adapter(Context context, List<GetData> datalist){
        this.context = context;
        this.dataList = datalist;
    }
    @NonNull
    @Override
    public Adapter.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.AdapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {
        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
