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
import com.example.shequtest.shiti.Allmeun;
import com.example.shequtest.shiti.OnItemClickListener;

import java.util.List;

public class AllmeunAdapter extends RecyclerView.Adapter<AllmeunAdapter .ViewHolder> {

    private List<Allmeun> mAllmeunList;
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    public AllmeunAdapter(Context context,List<Allmeun>allmeunList){
        mContext = context;
        mAllmeunList = allmeunList;
    }



    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView AllmeunImage;
        TextView AllmeunName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            AllmeunImage = (ImageView) itemView.findViewById(R.id.all_menu_image);
            AllmeunName = (TextView) itemView.findViewById(R.id.all_menu_name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.allmenu_recycler_items,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull final AllmeunAdapter.ViewHolder holder, final int position) {
        final Allmeun allmeun = mAllmeunList.get(position);
        holder.AllmeunImage.setImageResource(allmeun.getAllmeunimageId());
        holder.AllmeunName.setText(allmeun.getAllmeunname());

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
        return mAllmeunList.size();
    }


    //点击事件






}

