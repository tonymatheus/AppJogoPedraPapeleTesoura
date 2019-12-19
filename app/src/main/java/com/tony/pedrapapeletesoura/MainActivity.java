package com.tony.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("Tesoura");


    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }


    public void selecionarPapael(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        TextView textoResultado = findViewById(R.id.textoResultado);
        ImageView imageResultado = findViewById(R.id.imageResultado);

        String[] opcoes = {"Tesoura", "Pedra", "Papel"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "Tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
            case "Pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imageResultado.setImageResource(R.drawable.papel);
        }
        if ((escolhaApp == "Pedra" && escolhaUsuario == "Tesoura") ||
                (escolhaApp == "Papel" && escolhaUsuario == "Pedra") ||
                (escolhaApp == "Tesoura" && escolhaUsuario == "Papel")) { // condições Para o APP Vencer

            textoResultado.setText("Você Perdeu !!!");


        } else if ((escolhaUsuario == "Pedra" && escolhaApp == "Tesoura") ||
                (escolhaUsuario == "Papel" && escolhaApp == "Pedra") ||
                (escolhaUsuario == "Tesoura" && escolhaApp == "Papel")) { // condições Para O Usuário Vencer

            textoResultado.setText("Parabéns você Venceu!!");

        } else {
            //empate
            textoResultado.setText("Empatamos :)");
        }


    }
}
