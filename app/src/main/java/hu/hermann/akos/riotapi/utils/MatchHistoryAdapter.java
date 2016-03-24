package hu.hermann.akos.riotapi.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchHistory;
import hu.hermann.akos.riotapi.interfaces.IImageLoader;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class MatchHistoryAdapter extends RecyclerView.Adapter<MatchHistoryAdapter.ViewHolder> {

    private MatchHistory matchHistory;
    private Context context;
    private ImageView imageView;

    public MatchHistoryAdapter(Context context, MatchHistory matchHistory) {
        this.matchHistory = matchHistory;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvChampionName.setText(matchHistory.getMatches().get(position).getChampionName());
        holder.ivChampionIcon.setImageBitmap(matchHistory.getMatches().get(position).getChampionIcon());
    }

    @Override
    public int getItemCount() {
        return matchHistory.getMatches().size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView tvChampionName;
        private ImageView ivChampionIcon;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            tvChampionName = (TextView) itemView.findViewById(R.id.champion_name);
            ivChampionIcon = (ImageView) itemView.findViewById(R.id.champion_icon);
        }
    }
}
