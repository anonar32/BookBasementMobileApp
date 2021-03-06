package com.example.bookbasement_02.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.bookbasement_02.Constants.URL;
import com.example.bookbasement_02.Models.Favorite;
import com.example.bookbasement_02.R;
import com.squareup.picasso.Picasso;

public class RemoveFavoritesDialog  extends AppCompatDialogFragment {
    private ImageView imageView;
    private Favorite favorite;
    private  RemoveFavoriteListener listener;
    @NonNull
    @Override
    public Dialog onCreateDialog (@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view =  inflater.inflate(R.layout.remove_favorites_dialog,null);
        initialize(view);
        setItems();

        builder.setView(view);
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog, int which) {

            }
        });
        builder.setPositiveButton("Remove", new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog, int which) {
                listener.setDataPassed(favorite);
            }
        });
        return builder.create();
    }
    public RemoveFavoritesDialog() {}

    public void setRemoveFavoritesDialog(RemoveFavoriteListener listener) {
        this.listener = listener;
    }


    public interface RemoveFavoriteListener{
        void setDataPassed (Favorite favorite);
    }

    public void setFavorite(Favorite favorite){
        this.favorite = favorite;
    }

    private void initialize (View view) {
        imageView = view.findViewById(R.id.image_view_id);
    }
    public void setItems(){
        Picasso.get()
                .load(URL.IMAGE_URL_ADDRESS.concat(favorite.getImage_url()))
                .resize(130, 200)
                .centerCrop()
                .into(imageView);

    }
}
