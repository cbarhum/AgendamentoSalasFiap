package br.com.agendamentosalasfiap;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.Calendar;


public class AgendamentoSalas extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerProfessor;
    Spinner spinnerSalas;
    Spinner spinnerParcCli;
    Button btnData;
    TextView txtQtdeAlunos;
    Spinner spinnerPeriodos;
    MenuItem solMateriais;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agendamentosalas);

        Intent intent = getIntent();

        spinnerProfessor = findViewById(R.id.professor_spinner);
        spinnerParcCli = findViewById(R.id.parceiroCliente_spinner);
        spinnerSalas = findViewById(R.id.salas_spinner);
        spinnerPeriodos = findViewById(R.id.periodos_spinner);
        solMateriais = findViewById(R.id.solMateriais);

        ArrayAdapter<CharSequence> adapterProfessor = ArrayAdapter.createFromResource(this, R.array.professor_array, android.R.layout.simple_spinner_item);
        adapterProfessor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProfessor.setAdapter(adapterProfessor);

        ArrayAdapter<CharSequence> adapterParcCli = ArrayAdapter.createFromResource(this, R.array.parcCli_array, android.R.layout.simple_spinner_item);
        adapterParcCli.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerParcCli.setAdapter(adapterParcCli);

        ArrayAdapter<CharSequence> adapterSalas = ArrayAdapter.createFromResource(this, R.array.salas_array, android.R.layout.simple_spinner_item);
        adapterSalas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSalas.setAdapter(adapterSalas);

        ArrayAdapter<CharSequence> adapterPeriodos = ArrayAdapter.createFromResource(this, R.array.periodos_array, android.R.layout.simple_spinner_item);
        adapterPeriodos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPeriodos.setAdapter(adapterPeriodos);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String spinnerProfessor = adapterView.getItemAtPosition(position).toString();
        String spinnerParcCli = adapterView.getItemAtPosition(position).toString();
        String spinnerSalas = adapterView.getItemAtPosition(position).toString();
        String spinnerPeriodos = adapterView.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_agendamentos,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void mostraDatas(View view) {
        //instanciar datepickerdialog pag86 da apostila
        DatePickerDialog picker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

            }
        }, 2019, 10,02);
        picker.show();
    }

    public void home(MenuItem item) {
        Intent intent = new Intent(this,AgendamentoSolicitacoes.class);
        startActivity(intent);
    }

    public void solMateriais(MenuItem item) {
        Intent intent = new Intent(this, SolicitacaoMateriais.class);
        startActivity(intent);
    }


    //public void Submeter(View view) {
    //}
}
