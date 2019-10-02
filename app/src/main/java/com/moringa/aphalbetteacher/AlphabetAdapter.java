package com.moringa.aphalbetteacher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView==null){
            //getting the xml file
            gridView =inflater.inflate(R.layout.alphabet_grid_item,null);
            //pulling the views
            TextView letterView =(TextView)gridView.findViewById(R.id.grid_item_letter);
            //setting values into views
            letterView.setText("A");//usiing dummy data.
        }else{
            gridView=(View)convertView;
        }
        return gridView;
    }

    private Context mContext;
    private String[] mLetters;
    public AlphabetAdapter(Context context,String[] letters){
        this.mContext=context;
        this.mLetters =letters;
    }
}
