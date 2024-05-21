package com.random.kentsimgeleri;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.random.kentsimgeleri.databinding.RecayclerRowBinding;

import java.util.ArrayList;

public class LanMarkAdapter extends RecyclerView.Adapter<LanMarkAdapter.LandMarkHolder> {

    ArrayList<LanMark> landMarkArryListe;

    public LanMarkAdapter(ArrayList<LanMark> landMarkArryListe) {
        this.landMarkArryListe = landMarkArryListe;
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // XML bağlama işlemini burada yapacağız
        RecayclerRowBinding recayclerRowBinding=RecayclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandMarkHolder(recayclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {
        //Layotumuzda hangi veriler gösterilecekse onu burada belirteceğiz.

        holder.binding.recyclerViewTextView.setText(landMarkArryListe.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(),DetaylarActivity.class);
                intent.putExtra("landmark",landMarkArryListe.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        //Bu method listemizde kaç kere xml oluşturulacağını soruyor.
        //Biz normalda arry listemizde kaçtane varsa okadar oluştur diyeceğiz.

        return landMarkArryListe.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private  RecayclerRowBinding binding;
              public LandMarkHolder(RecayclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
