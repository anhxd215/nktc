package com.ptaconstructions.control;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class RCVEmployeeAdapter extends RecyclerView.Adapter<RCVEmployeeAdapter.itemViewHolder> {
    private List<itemEmployeeAdapter> emList;

    public void setData(List<itemEmployeeAdapter> list) {
        this.emList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_recycleview_item_layout, parent, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        itemEmployeeAdapter item = emList.get(position);
        if (item == null) {
            return;
        }
        holder.tvTitle.setText(item.getTitle());
        holder.etBirthDay.setText(item.getEtBirthDay());
        holder.etIDCard.setText(item.getEtIDCard());

        holder.etDateCard.setText(item.getEtDateCard());
        holder.etLocationCard.setText(item.getEtLocationCard());
        holder.etAddress.setText(item.getEtAddress());
        holder.etNote.setText(item.getEtNote());

        holder.foldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.foldingCell.toggle(false);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (emList != null) {
            return emList.size();
        }
        return 0;
    }


    public class itemViewHolder extends RecyclerView.ViewHolder {
        private FoldingCell foldingCell;
        private TextView tvTitle;
        private EditText etBirthDay, etIDCard, etDateCard, etLocationCard, etAddress, etNote;


        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            foldingCell = itemView.findViewById(R.id.folding_cell);
            tvTitle = itemView.findViewById(R.id.tvTitleEmployee);
            etBirthDay = itemView.findViewById(R.id.etBirthDay);
            etIDCard = itemView.findViewById(R.id.etIDCard);
            etDateCard = itemView.findViewById(R.id.etDateCard);
            etLocationCard = itemView.findViewById(R.id.etLocationCard);
            etAddress = itemView.findViewById(R.id.etAddress);
            etNote = itemView.findViewById(R.id.etNote);


        }
    }

}
