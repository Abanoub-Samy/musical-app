package com.example.bebo.musicalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SetAdapter extends ArrayAdapter<List> {
    ArrayList<List> list;

    public SetAdapter(Context context, ArrayList<List> list) {
        super(context, 0, list);
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View viewlist = convertView;
        if (viewlist == null) {
            viewlist = LayoutInflater.from(getContext()).inflate(R.layout.playmusic, parent, false);
        }
        List item = getItem(position);
        TextView SongName = viewlist.findViewById(R.id.textView1);
        SongName.setText(item.getMode());
        return SongName;
    }
}
