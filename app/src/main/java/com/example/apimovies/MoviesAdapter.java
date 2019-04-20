package com.example.apimovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apimovies.model.ResultsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.Holder> {
    private List<ResultsItem> resultsItemList;
    private Context context;

    public MoviesAdapter(Context context, List<ResultsItem> resultsItemList) {
        this.context = context;
        this.resultsItemList = resultsItemList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(MoviesAdapter.Holder holder, final int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return resultsItemList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        private RelativeLayout openEdukasi;
        private ImageView imgArtikel;
        private TextView tvJudul;
        private TextView tvTanggal;

        public Holder(View itemView) {
            super(itemView);
            imgArtikel = itemView.findViewById(R.id.poster);
            tvJudul = itemView.findViewById(R.id.judul);
            tvTanggal = itemView.findViewById(R.id.tanggal);
            openEdukasi = itemView.findViewById(R.id.openEdukasi);
        }

        public void bind(final int position) {
            Picasso.get()
                    .load(resultsItemList.get(position).getPosterPath())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imgArtikel);
            tvJudul.setText(resultsItemList.get(position).getTitle());
            tvTanggal.setText(resultsItemList.get(position).getReleaseDate());
            openEdukasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, "clicked : " + tvJudul.getText().toString() + "\n Position : " + String.valueOf(position),
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}