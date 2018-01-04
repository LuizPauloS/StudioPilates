package br.com.studio.studiopilates.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.studio.studiopilates.R;


public class EnderecoFragment extends Fragment {

    public EnderecoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.endereco_fragment, container, false);



        return rootView;
    }
}
