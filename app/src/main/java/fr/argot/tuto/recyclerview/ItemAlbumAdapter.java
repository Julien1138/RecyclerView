package fr.argot.tuto.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import fr.argot.tuto.recyclerview.Objects.Album;

/**
 * Created by Julien on 11/11/2016.
 */

public class ItemAlbumAdapter extends RecyclerView.Adapter<ItemAlbumViewHolder> {
    // Le dataset est la liste des albums
    private ArrayList<Album> mDataSet;

    public ItemAlbumAdapter(ArrayList<Album> mDataSet) {
        this.mDataSet = mDataSet;
    }

    // Cette fonction crée les nouvelles vues des items
    @Override
    public ItemAlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Creation de la vue d'un album (item_album.xml)
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false);

        // Et création du ViewHolder associé (que l'on retourne)
        ItemAlbumViewHolder vh = new ItemAlbumViewHolder(v);
        return vh;
    }

    // Cette fonction rempli la vue avec les données de l'album
    @Override
    public void onBindViewHolder(ItemAlbumViewHolder holder, int position) {
        // On récupère l'élément du dataset à la position donnée
        // On remplace le contenu de la vue avec cet élement

        final Album album = mDataSet.get(position);
        holder.setTitle(album.getTitle());
        holder.setDepartureDate(album.getDepartureDate());
        holder.setDuration(album.getDuration());

        // Lorsqu'on clique sur un album, on le supprime de la liste
        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                remove(album);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    // On veut pouvoir ajouter un album
    public void add(int position, Album item) {
        mDataSet.add(position, item);

        // On prévient l'adapter qu'un nouvel element à été ajouté à la liste
        notifyItemInserted(position);
    }

    // On veut pouvoir supprimer un album
    public void remove(Album item) {
        int position = mDataSet.indexOf(item); //Il faut retrouve l'item dans la liste
        if (position != -1) {// Comme on raffraichit la vue après avoir supprimé l'élément, il peut arriver qu'on clique sur un élément qui n'est plus dans la liste. Dans ce cas on ne peut pas l'enlever à nouveau (il n'est pas trouvé et retourne -1)
            mDataSet.remove(position);

            // On prévient l'adapter qu'un element à été supprimé de la liste
            notifyItemRemoved(position);
            notifyDataSetChanged();
        }
    }
}
