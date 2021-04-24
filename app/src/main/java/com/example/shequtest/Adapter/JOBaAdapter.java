package com.example.shequtest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shequtest.R;
import com.example.shequtest.shiti.JOBa;
import com.example.shequtest.shiti.OnItemClickListener;

import java.util.List;

public class JOBaAdapter extends RecyclerView.Adapter<JOBaAdapter.ViewHolder> {

    private List<JOBa> mJOBaList;
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    public JOBaAdapter(Context context,List<JOBa>jobaList){
        mJOBaList = jobaList;
        mContext = context;
    }

    public void setmOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobaImage;
        TextView jobaName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobaImage = (ImageView) itemView.findViewById(R.id.recommended_image);
            jobaName = (TextView) itemView.findViewById(R.id.recommended_name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_recommended_recycler_items,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final JOBaAdapter.ViewHolder holder, int position) {
        JOBa joba = mJOBaList.get(position);
        holder.jobaImage.setImageResource(joba.getRecommendedimageId());
        holder.jobaName.setText(joba.getRecommendedname());

        View itemView = ((ConstraintLayout)holder.itemView).getChildAt(0);
        if (mOnItemClickListener != null){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getLayoutPosition();
                    mOnItemClickListener.onItemClick(holder.itemView,position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mJOBaList.size();
    }


}

