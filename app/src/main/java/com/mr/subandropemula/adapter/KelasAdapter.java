package com.mr.subandropemula.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mr.subandropemula.DataKelas;
import com.mr.subandropemula.R;
import com.mr.subandropemula.model.KursusModel;

import org.w3c.dom.Text;

import java.util.List;

public class KelasAdapter extends RecyclerView.Adapter<KelasAdapter.ViewHolder> {

    private List<KursusModel> data;
    private Context context;
    private AdapterListener listener;

    public KelasAdapter(List<KursusModel> data, Context context, AdapterListener listener) {
        this.data = data;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kursus, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull KelasAdapter.ViewHolder holder, int position) {
        KursusModel kursusModel = data.get(position);
        Glide.with(holder.itemView.getContext()).load(kursusModel.getIvImgKursus())
                .into(holder.ivImgKursus);
        holder.tvNamaKursus.setText(kursusModel.getTvNamaKursus());
        holder.tvDurasi.setText(kursusModel.getTvDurasi());
        holder.tvHarga.setText(kursusModel.getTvHarga());
        holder.cvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNamaKursus, tvDurasi, tvHarga;
        private ImageView ivImgKursus;
        private CardView cvData;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaKursus = itemView.findViewById(R.id.tv_kursus);
            tvDurasi = itemView.findViewById(R.id.tv_durasi);
            tvHarga = itemView.findViewById(R.id.tv_harga);
            ivImgKursus = itemView.findViewById(R.id.iv_img);
            cvData = itemView.findViewById(R.id.cv_data);
        }
    }

    public interface AdapterListener {
        void onClick();
    }

}
