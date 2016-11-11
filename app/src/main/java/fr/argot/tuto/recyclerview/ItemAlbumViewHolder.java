package fr.argot.tuto.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Julien on 11/11/2016.
 */

public class ItemAlbumViewHolder extends RecyclerView.ViewHolder {
    // Les 3 éléments de la vue
    private TextView mTitle;
    private TextView mDepartureDate;
    private TextView mDuration;

    // Un pointeur sur la vue correspondante à une cellule
    private View view;

    public ItemAlbumViewHolder(View itemView) {
        super(itemView);

        // Ici on associe les vues à leurs pointeurs
        this.mTitle = (TextView) itemView.findViewById(R.id.album_item_title);
        this.mDepartureDate = (TextView) itemView.findViewById(R.id.album_item_departure_date);
        this.mDuration = (TextView) itemView.findViewById(R.id.album_item_duration);

        this.view = itemView;
    }

    // Les 3 setters pour chacun des 3 éléments de la vue
    public void setTitle(String myTitle) {
        this.mTitle.setText(myTitle);
    }

    public void setDepartureDate(String myDepartureDate) {
        this.mDepartureDate.setText(myDepartureDate);
    }

    public void setDuration(String myDuration) {
        this.mDuration.setText(myDuration);
    }

    // On permet d'ajouter un onClickListener
    public void setOnClickListener(View.OnClickListener myListener) {
        view.setOnClickListener(myListener);
    }
}
