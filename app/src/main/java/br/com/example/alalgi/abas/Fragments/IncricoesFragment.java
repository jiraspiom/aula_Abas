package br.com.example.alalgi.abas.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.example.alalgi.abas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IncricoesFragment extends Fragment {


    public IncricoesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_incricoes, container, false);
    }

}
