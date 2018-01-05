package br.com.studio.studiopilates.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.redmadrobot.inputmask.MaskedTextChangedListener;

import br.com.studio.studiopilates.MainActivity;
import br.com.studio.studiopilates.R;


public class DadosPessoaisFragment extends Fragment {

    private View fragmentView;

    private EditText telefone;

    public DadosPessoaisFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.dados_pessoais_fragment, container, false);

        getComponents();
        setMaskTelefone();

        return fragmentView;
    }

    private void getComponents(){
        telefone = (EditText) fragmentView.findViewById(R.id.dados_pessoais_telefone);
    }

    private void setMaskTelefone(){
        final MaskedTextChangedListener listener = new MaskedTextChangedListener(
                "+7 ([000]) [000] [00] [00]",
                true,
                telefone,
                null,
                new MaskedTextChangedListener.ValueListener() {
                    @Override
                    public void onTextChanged(boolean maskFilled, @NonNull final String extractedValue) {
//                        Log.d(MainActivity.class.getSimpleName(), extractedValue);
//                        Log.d(MainActivity.class.getSimpleName(), String.valueOf(maskFilled));
                    }
                }
        );

        telefone.addTextChangedListener(listener);
        telefone.setOnFocusChangeListener(listener);
        telefone.setHint(listener.placeholder());
    }
}
