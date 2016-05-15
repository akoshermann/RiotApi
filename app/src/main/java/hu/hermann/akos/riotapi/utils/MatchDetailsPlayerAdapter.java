package hu.hermann.akos.riotapi.utils;

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
import hu.hermann.akos.riotapi.domain.matchhistory.MatchDetails;
import hu.hermann.akos.riotapi.domain.matchhistory.Participant;

/**
 * Created by hofee on 2016. 05. 12..
 */
public class MatchDetailsPlayerAdapter extends RecyclerView.Adapter<MatchDetailsPlayerAdapter.ViewHolder> {

    private MatchDetails matchDetails;
    private Set<ChampionDetails> championDetailsSet;

    public MatchDetailsPlayerAdapter(MatchDetails matchDetails, Set<ChampionDetails> championDetailsSet) {
        this.matchDetails = matchDetails;
        this.championDetailsSet = championDetailsSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_detail_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Participant participant = matchDetails.getParticipants().get(position);
        for(ChampionDetails championDetails : championDetailsSet){
            if(Objects.equals(championDetails.getId(), participant.getChampionId())){
                holder.championIcon.setImageBitmap(championDetails.getBitmap());
            }
        }
        holder.summonerNameText.setText(matchDetails.getParticipantIdentities().get(position).getPlayer().getSummonerName());
        holder.goldText.setText(String.valueOf(matchDetails.getParticipants().get(position).getStats().getGoldEarned()));
        holder.kdaText.setText(matchDetails.getParticipants().get(position).getStats().getKills() +"/" + matchDetails.getParticipants().get(position).getStats().getDeaths() +"/"+
                                matchDetails.getParticipants().get(position).getStats().getAssists());
        if(matchDetails.getParticipants().get(position).getTeamId() == 100){
            holder.cardView.setCardBackgroundColor(0xFFADD0DB);
        } else {
            holder.cardView.setCardBackgroundColor(0xFFD97979);
        }
    }

    @Override
    public int getItemCount() {
        return matchDetails.getParticipants().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView championIcon;
        private TextView summonerNameText;
        private TextView goldText;
        private TextView kdaText;
        private TextView levelText;
        private CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            championIcon = (ImageView) itemView.findViewById(R.id.list_item_champion_icon);
            summonerNameText = (TextView) itemView.findViewById(R.id.list_item_summoner_name);
            goldText = (TextView) itemView.findViewById(R.id.list_item_gold_text);
            kdaText = (TextView) itemView.findViewById(R.id.list_item_kda_text);
            levelText = (TextView) itemView.findViewById(R.id.list_item_level_text);
            cardView = (CardView) itemView.findViewById(R.id.history_list_item_card);
        }
    }
}
