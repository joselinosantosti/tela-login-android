package br.com.joselinosantos.telalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etLogin = (EditText) findViewById(R.id.etUsuario);
                EditText etSenha = (EditText) findViewById(R.id.etSenha);

                String login = etLogin.getText().toString();
                String senha = etSenha.getText().toString();
                if(login.equals("pedro") && senha.equals("123")) {
                    alert("Login realizado com sucesso");
                }
                else
                {
                    alert("Senha incorreta");
                }
            }
        });
    }
    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
