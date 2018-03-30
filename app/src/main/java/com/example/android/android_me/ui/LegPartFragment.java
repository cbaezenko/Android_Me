package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

public class LegPartFragment extends Fragment {

    private static final String TAG = "LegPartFragment";

    private List<Integer> mImageIds;
    private int mListIndex;

    public LegPartFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflamos el fragment layout
        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);
        ImageView imageView =(ImageView) rootView.findViewById(R.id.body_part_image_view);

        if(mImageIds !=null){
            imageView.setImageResource(mImageIds.get(mListIndex));
        }else {
            Log.v(TAG, "image not found");
        }

        return rootView;
    }

    public void setImageIds(List<Integer> mImageId) {
        this.mImageIds = mImageId;
    }

    public void setListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }

}
