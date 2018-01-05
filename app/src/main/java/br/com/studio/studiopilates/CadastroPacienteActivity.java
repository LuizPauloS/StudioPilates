package br.com.studio.studiopilates;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.studio.studiopilates.adapter.TabCadastroPacienteAdapter;

public class CadastroPacienteActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageButton cadastrar;
    private ImageButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);

        toolbar = (Toolbar) findViewById(R.id.toolbar_cadastrar);
        setSupportActionBar(toolbar);

        TabCadastroPacienteAdapter mAdapter = new TabCadastroPacienteAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.cadastro_paciente_pager);
        viewPager.setAdapter(mAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        getComponentsView();
        setToolbarAction();
    }

    private void getComponentsView(){
        cadastrar = (ImageButton) toolbar.findViewById(R.id.toolbar_cadastrar_salvar);
        voltar = (ImageButton) toolbar.findViewById(R.id.toolbar_cadastrar_voltar);
    }

    private void setToolbarAction(){
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CadastroPacienteActivity.this, "TOMA SEU TOAST", Toast.LENGTH_SHORT).show();
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
