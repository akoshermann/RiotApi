package hu.hermann.akos.riotapi.utils;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import hu.hermann.akos.riotapi.R;
import hu.hermann.akos.riotapi.domain.Game;

/**
 * Created by hofee on 2016. 03. 03..
 */
public class FeaturedGameAdapter extends RecyclerView.Adapter<FeaturedGameAdapter.ViewHolder> {

    private List<Game> gameList;

    public FeaturedGameAdapter(List<Game> gameList) {
        this.gameList = gameList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvGameMode.setText(gameList.get(position).getGameMode().toString());
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView tvGameMode;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
