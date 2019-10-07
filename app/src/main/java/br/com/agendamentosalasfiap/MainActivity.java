package br.com.agendamentosalasfiap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtMatricula;
    EditText edtSenha;
    Button btnCadastrar;
    Button btnAutenticar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        edtMatricula = findViewById(R.id.edtMatricula);
        edtSenha = findViewById(R.id.edtSenha);
        btnAutenticar = findViewById(R.id.btnAutenticar);


    }


    public void autenticar(View view) {
        Intent intent = new Intent(this, AgendamentoSolicitacoes.class);
        startActivity(intent);

        if (edtMatricula.getText().length()==0 || edtSenha.getText().length()==0){
            Toast.makeText(this, "Matricula e senha nao podem estar em branco", Toast.LENGTH_SHORT).show();
        }
        return;
    }


    public void registrar(View view) {
        Intent intent = new Intent(this, RegistrarProfessor.class);
        startActivity(intent);
    }

}
