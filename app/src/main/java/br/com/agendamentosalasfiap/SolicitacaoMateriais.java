package br.com.agendamentosalasfiap;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;

public class SolicitacaoMateriais extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinnerProfessor;
    Spinner spinnerMateriais;
    Spinner spinnerSalas;
    Spinner spinnerPeriodos;
    MenuItem solSalas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacaomateriais);

        Intent intent = getIntent();

        spinnerProfessor = findViewById(R.id.professor_spinner);
        spinnerMateriais = findViewById(R.id.materiais_spinner);
        spinnerSalas = findViewById(R.id.salas_spinner);
        spinnerPeriodos = findViewById(R.id.periodos_spinner);
        solSalas = findViewById(R.id.solSalas);

        ArrayAdapter<CharSequence> adapterProfessor = ArrayAdapter.createFromResource(this, R.array.professor_array, android.R.layout.simple_spinner_item);
        adapterProfessor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProfessor.setAdapter(adapterProfessor);

        ArrayAdapter<CharSequence> adapterMateriais = ArrayAdapter.createFromResource(this, R.array.materiais_array, android.R.layout.simple_spinner_item);
        adapterMateriais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMateriais.setAdapter(adapterMateriais);

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
        String spinnerMateriais = adapterView.getItemAtPosition(position).toString();
        String spinnerSalas = adapterView.getItemAtPosition(position).toString();
        String spinnerPeriodos = adapterView.getItemAtPosition(position).toString();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void mostraDatas(View view) {
        DatePickerDialog picker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

            }
        }, 2019, 10,02);
        picker.show();
    }

    public void home(MenuItem item) {
        Intent intent = new Intent(this, AgendamentoSolicitacoes.class);
        startActivity(intent);
    }


    public void agSala(MenuItem item) {
        Intent intent = new Intent(this,AgendamentoSalas.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_agendamentos,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}



