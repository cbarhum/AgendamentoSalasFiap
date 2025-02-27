package br.com.agendamentosalasfiap;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AgendamentoSolicitacoes extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamentosesolicitacoes);

        Intent intent = getIntent();
    }

    public void agendarSala(View view) {
        Intent intent = new Intent(this, AgendamentoSalas.class);
        startActivity(intent);
    }


    public void solicitarMateriais(View view) {
        Intent intent = new Intent(this, SolicitacaoMateriais.class);
        startActivity(intent);
    }
}
