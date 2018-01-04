package br.com.studio.studiopilates.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.studio.studiopilates.R;


public class DadosPessoaisFragment extends Fragment {

    public DadosPessoaisFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dados_pessoais_fragment, container, false);

        return rootView;
    }
}
