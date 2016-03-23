package hu.hermann.akos.riotapi.utils;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.domain.matchhistory.MatchHistory;

/**
 * Created by a.hermann on 2016.03.23..
 */
public class MatchHistoryAdapter extends RecyclerView.Adapter<MatchHistoryAdapter.ViewHolder> {

    private MatchHistory matchHistory;

    public MatchHistoryAdapter(MatchHistory matchHistory) {
        this.matchHistory = matchHistory;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvGameMode.setText(matchHistory.getMatches().get(position).getLane());
    }

    @Override
    public int getItemCount() {
        return matchHistory.getMatches().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView tvGameMode;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            tvGameMode = (TextView) itemView.findViewById(R.id.game_mode);
        }
    }
}
