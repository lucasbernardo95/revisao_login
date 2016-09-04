package br.com.eaj.ufrn.lucas.revisaologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String login;
    String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //tratando o evento do botão 1. associa o botão a um onclick dentro do parâmetro do setOnClickL.
        Button bt1 = (Button) findViewById(R.id.botaoEvento1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login = ((TextView) findViewById(R.id.edilogin)).getText().toString();
                senha = ((TextView) findViewById(R.id.edtsenha)).getText().toString();
                Log.d("debug", ""+login+"   "+senha);
                if (login.equals("pastel") && senha.equals("coxinha")){
                    Toast.makeText(MainActivity.this, "Logado", Toast.LENGTH_LONG).show();
                } else {
                    TextView sms = (TextView) findViewById(R.id.smsinvalido);
                    sms.setText("Login ou senha inválidos");
                }
            }
        });

        Button bt2 = (Button) findViewById(R.id.botaoEvento2);
        bt2.setOnClickListener(meu_listner);//Dessa fora, ao ser clicado o botão irá chamar o evento de nome meu_listner que irá tratar o evento
    }

    private View.OnClickListener meu_listner = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            login = ((TextView) findViewById(R.id.edilogin)).getText().toString();
            senha = ((TextView) findViewById(R.id.edtsenha)).getText().toString();
            Log.d("debug", ""+login+"   "+senha);
            if (login.equals("pastel") && senha.equals("coxinha")){
                Toast.makeText(MainActivity.this, "Logado", Toast.LENGTH_LONG).show();
            } else {
                TextView sms = (TextView) findViewById(R.id.smsinvalido);
                sms.setText("Login ou senha inválidos");
            }
        }
    };

    public void entrar(View view){
        login = ((TextView) findViewById(R.id.edilogin)).getText().toString();
        senha = ((TextView) findViewById(R.id.edtsenha)).getText().toString();
        Log.d("debug", ""+login+"   "+senha);
        if (login.equals("pastel") && senha.equals("coxinha")){
            Toast.makeText(this, "Logado", Toast.LENGTH_LONG).show();
        } else {
            TextView sms = (TextView) findViewById(R.id.smsinvalido);
            sms.setText("Login ou senha inválidos");
        }//tratamento do login
    }
}
