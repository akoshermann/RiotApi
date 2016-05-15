package hu.hermann.akos.riotapi.utils;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;
import java.util.Set;

import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.domain.ChampionDetails;
import hu.hermann.akos.riotapi.domain.RecentGame;
import hu.hermann.akos.riotapi.domain.RecentMatchHistory;
import hu.hermann.akos.riotapi.domain.matchhistory.RankedMatchHistory;

/**
 * Created by hofee on 2016. 05. 15..
 */
public class RecentGamesAdapter extends RecyclerView.Adapter<RecentGamesAdapter.ViewHolder> {

    private RecentMatchHistory recentMatchHistory;
    private Set<ChampionDetails> championDetailsSet;

    public RecentGamesAdapter(RecentMatchHistory recentMatchHistory, Set<ChampionDetails> championDetailsSet) {
        this.recentMatchHistory = recentMatchHistory;
        this.championDetailsSet = championDetailsSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if(recentMatchHistory.getGames().get(position).getStats().isWin()){
            holder.tvChampionName.setText("Victory");
            holder.cardView.setCardBackgroundColor(0xFFADD0DB);
        } else {
            holder.tvChampionName.setText("Defeat");
            holder.cardView.setCardBackgroundColor(0xFFD97979);
        }
        for(ChampionDetails championDetails : championDetailsSet){
            if(Objects.equals(championDetails.getId(), recentMatchHistory.getGames().get(position).getChampionId())){
                holder.ivChampionIcon.setImageBitmap(championDetails.getBitmap());
            }
        }

    }

    @Override
    public int getItemCount() {
        return recentMatchHistory.getGames().size();
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
