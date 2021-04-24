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
import com.example.shequtest.shiti.JOB;
import com.example.shequtest.shiti.OnItemClickListener;

import java.util.List;

public class JOBAdapter extends RecyclerView.Adapter<JOBAdapter.ViewHolder> {

    private List<JOB> mJOBList;
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobImage;
        TextView jobName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImage = (ImageView) itemView.findViewById(R.id.all_menu_image);
            jobName = (TextView) itemView.findViewById(R.id.all_menu_name);
        }
    }

    public JOBAdapter(Context context,List<JOB>jobList){
        mContext = context;
        mJOBList = jobList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_recycler_items,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final JOBAdapter.ViewHolder holder, int position) {
        JOB job = mJOBList.get(position);
        holder.jobImage.setImageResource(job.getImageId());
        holder.jobName.setText(job.getName());

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
        return mJOBList.size();
    }
}
