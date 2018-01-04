package br.com.studio.studiopilates;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.studio.studiopilates.adapter.TabCadastroPacienteAdapter;

public class CadastroPacienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabCadastroPacienteAdapter mAdapter = new TabCadastroPacienteAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.cadastro_paciente_pager);
        viewPager.setAdapter(mAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

}
