package com.example.android.android_me.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class MasterListFragment extends Fragment {
    List<Integer> mImageIDs;

    public MasterListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView gridView = (GridView) rootView.findViewById(R.id.imageView);

        mImageIDs = AndroidImageAssets.getAll();
        MasterListAdapter masterListAdapter = null;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            masterListAdapter = new MasterListAdapter(getContext(), mImageIDs);
        }

        gridView.setAdapter(masterListAdapter);
        return rootView;
    }

}
