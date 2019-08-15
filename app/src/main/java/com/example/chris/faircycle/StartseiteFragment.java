package com.example.chris.faircycle;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class StartseiteFragment extends Fragment {

    static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
    private FragmentListener listener;
    private FloatingActionButton fab;

    public interface FragmentListener {
        void onClick(View view);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_startseite, container, false);

        fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // Startet in den BarCode Scanner
            startActivity(new Intent(getActivity(), BarcodeActivity.class));
                // Zeigt Snackbar an, auch cool:
                // Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                // .setAction("Action", null).show();
            }

        });
        return v;


        }
    }

   /* Erst einmal nicht relevant!
   @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentListener){
            listener = (FragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()+"must implement FragmentListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }*/



