package com.davissylvester.dfitnesstracker.Adapters;


import android.support.v7.widget.RecyclerView;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }
}
