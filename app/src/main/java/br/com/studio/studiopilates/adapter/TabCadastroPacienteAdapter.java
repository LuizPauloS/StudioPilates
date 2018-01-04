package br.com.studio.studiopilates.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.studio.studiopilates.R;
import br.com.studio.studiopilates.fragment.DadosPessoaisFragment;
import br.com.studio.studiopilates.fragment.EnderecoFragment;


public class TabCadastroPacienteAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabCadastroPacienteAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DadosPessoaisFragment();
        } else{
            return new EnderecoFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_dados_pessoais);
            case 1:
                return mContext.getString(R.string.tab_endereco);
            default:
                return null;
        }
    }

}
