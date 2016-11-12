package fr.argot.tuto.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;

/**
 * Created by Julien on 11/11/2016.
 */

public class ItemAlbumViewHolder extends RecyclerView.ViewHolder {
    // Les 4 éléments de la vue
    private ImageView mIcon;
    private TextView mTitle;
    private TextView mDepartureDate;
    private TextView mDuration;

    // Un pointeur sur la vue correspondante à une cellule
    private View view;

    public ItemAlbumViewHolder(View itemView) {
        super(itemView);

        // Ici on associe les vues à leurs pointeurs
        this.mIcon = (ImageView) itemView.findViewById(R.id.album_item_icon);
        this.mTitle = (TextView) itemView.findViewById(R.id.album_item_title);
        this.mDepartureDate = (TextView) itemView.findViewById(R.id.album_item_departure_date);
        this.mDuration = (TextView) itemView.findViewById(R.id.album_item_duration);

        this.view = itemView;
    }

    // Les 3 setters pour chacun des 3 champs texte de la vue
    public void setTitle(String myTitle) {
        this.mTitle.setText(myTitle);

        // On mets ici la génération de l'icon
        ColorGenerator generator = ColorGenerator.DEFAULT;
        TextDrawable drawable = TextDrawable.builder()
                .buildRound(myTitle.substring(0, 1), ColorGenerator.DEFAULT.getColor(myTitle));
        mIcon.setImageDrawable(drawable);
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
