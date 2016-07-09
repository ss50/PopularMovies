package com.example.shreya.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by shreya on 7/8/16.
 */
public class MovieAdapter extends ArrayAdapter<Integer> {


    public MovieAdapter(Context context, List<Integer> drawables) {
        super(context, 0, drawables);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.movie_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.movie_image);
        int drawable = getItem(position);
        imageView.setImageResource(drawable);

        return convertView;
    }
}
