package fr.argot.tuto.recyclerview;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import fr.argot.tuto.recyclerview.Objects.Album;

public class MainActivity extends AppCompatActivity {

    // Pointeur sur les éléments de la vue (elle ne contient ici qu'un recycler)
    private RecyclerView mRecyclerView;

    // La liste d'albums
    private ArrayList<Album> myAlbums = new ArrayList<Album>();

    // L'adapteur
    private ItemAlbumAdapter mAlbumAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // On associe un LinearLayout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        // On crée et on associe notre Adapter
        mAlbumAdapter = new ItemAlbumAdapter(myAlbums);
        mRecyclerView.setAdapter(mAlbumAdapter);

        // On ajoute et supprime des albums (pour l'exercice)
        Test();
    }

    private void Test() {
        // On ajoute assez d'éléments pour remplir l'écran
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Trek Laugavegur", "22 Août 2011", "5 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Les balcons de l'Annapurna", "13 Octobre 2012", "15 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("From Russia, with Love", "23 Avril 2013", "24 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Claire et Julien au pays des Caribous", "17 Septembre 2014", "14 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("L'aventure en mode Zen", "1er Septembre 2015", "29 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Voyage en Italie", "13 Septembre 2016", "10 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Trek Laugavegur", "22 Août 2011", "5 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Les balcons de l'Annapurna", "13 Octobre 2012", "15 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("From Russia, with Love", "23 Avril 2013", "24 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Claire et Julien au pays des Caribous", "17 Septembre 2014", "14 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("L'aventure en mode Zen", "1er Septembre 2015", "29 jours"));
        mAlbumAdapter.add(mAlbumAdapter.getItemCount(), new Album("Voyage en Italie", "13 Septembre 2016", "10 jours"));
    }
}
