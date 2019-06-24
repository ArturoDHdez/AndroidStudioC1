package erick.com.example.gato;

import android.content.Intent;
import android.media.Image;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_Inicia;
    private TextInputEditText textImputPlayer1;
    private TextInputEditText textImputPlayer2;

    String p1 = "";
    String p2 = "";

    int eleccion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_Inicia = findViewById(R.id.text_Inicia);
        textImputPlayer1 = findViewById(R.id.player1);
        textImputPlayer2 = findViewById(R.id.player2);
    }

    private boolean validarJugador1() {
        p1 = textImputPlayer1.getText().toString().trim();

        if (p1.isEmpty()) {
            p1 = "Jugador 1";
            return true;
        } else if (p1.length() > 10){
            textImputPlayer1.setError("Name too long");
            return false;
        } else {
            textImputPlayer1.setError(null);
            return true;
        }
    }

    private boolean validarJugador2() {
        p2 = textImputPlayer2.getText().toString().trim();

        if (p2.isEmpty()) {
            p2 = "Jugador 2";
            return true;
        } else if (p2.length() > 10){
            textImputPlayer2.setError("Name too long");
            return false;
        } else {
            textImputPlayer2.setError(null);
            return true;
        }
    }

    public void Inicia_O(View v) {
        eleccion = 2;

        String selection = "Inicia O";
        Toast.makeText(this, selection, Toast.LENGTH_SHORT).show();
    }

    public void Inicia_X(View v) {
        eleccion = 1;

        String selection = "Inicia X";
        Toast.makeText(this, selection, Toast.LENGTH_SHORT).show();
    }

    public void EmpezarJuego(View v) {
        if (eleccion == 0){
            Toast.makeText(this, "Selecciona [O] ó [X]", Toast.LENGTH_SHORT).show();
        } else {
            if (!validarJugador1() | !validarJugador2()) {
                return;
            }

            String input = "Jugador1: " + p1;
            input += "\n";
            input += "Jugador2: " + p2;
            input += "\n";
            input += "Select: " + eleccion;

            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

            Intent empezarJuego = new Intent(MainActivity.this, ContentGato.class);

            empezarJuego.putExtra("jugador1", p1);
            empezarJuego.putExtra("jugador2", p2);
            empezarJuego.putExtra("inicia" , eleccion+"");

            startActivity(empezarJuego);
        }
    }

}
