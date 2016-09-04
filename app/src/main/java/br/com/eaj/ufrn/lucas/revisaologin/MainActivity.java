package br.com.eaj.ufrn.lucas.revisaologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view){
        String login = ((TextView) findViewById(R.id.edilogin)).getText().toString();
        String senha = ((TextView) findViewById(R.id.edtsenha)).getText().toString();

        if (login.equals("pastel") && senha.equals("coxinha")){
            Toast.makeText(this, "Logado", Toast.LENGTH_LONG).show();
        } else {
            TextView sms = (TextView) findViewById(R.id.smsinvalido);
            sms.setText("Login ou senha inválidos");
        }
    }
}
