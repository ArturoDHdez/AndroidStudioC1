package erick.com.example.gato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentGato extends AppCompatActivity implements View.OnClickListener {

    private TextView text_P1;
    private TextView text_P2;
    private ImageView Img_Turno;
    private TextView turne;
    int turn, contador, turno, inicia, contP1 = 0, contP2 = 0;
    String namePlayer1 = "", namePlayer2 = "";
    private ImageButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_Terminar, btn_Limpiar;

    int valor_btn[] = new int[9];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_gato);

        text_P1 = (TextView) findViewById(R.id.text_P1);
        text_P2 = (TextView) findViewById(R.id.text_P2);
        Img_Turno = (ImageView) findViewById(R.id.Img_Turno);

        namePlayer1 = getIntent().getStringExtra("jugador1");
        text_P1.setText(namePlayer1);
        namePlayer2 = getIntent().getStringExtra("jugador2");
        text_P2.setText(namePlayer2);
        String iniciador = getIntent().getStringExtra("inicia");
        turn = Integer.parseInt(iniciador);
        inicia = turn;

        btn_1 = (ImageButton) findViewById(R.id.btn_1);
        btn_2 = (ImageButton) findViewById(R.id.btn_2);
        btn_3 = (ImageButton) findViewById(R.id.btn_3);
        btn_4 = (ImageButton) findViewById(R.id.btn_4);
        btn_5 = (ImageButton) findViewById(R.id.btn_5);
        btn_6 = (ImageButton) findViewById(R.id.btn_6);
        btn_7 = (ImageButton) findViewById(R.id.btn_7);
        btn_8 = (ImageButton) findViewById(R.id.btn_8);
        btn_9 = (ImageButton) findViewById(R.id.btn_9);

        btn_Limpiar = (Button) findViewById(R.id.btn_Limpiar);
        btn_Terminar = (Button) findViewById(R.id.btn_Terminar);

        for (int i  = 0; i < 9; i++) {
            valor_btn[i] = 0;
        }
        if (turn == 1){
            Img_Turno.setImageResource(R.drawable.x);
        } else {
            Img_Turno.setImageResource(R.drawable.o);
        }

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
    }

    public void onClick(View v) {
        contador++;
        turno = contador%2;

        if (turno == 1) {
            if (turn == 1){
                imprimirButton(turn, v);
                Img_Turno.setImageResource(R.drawable.o);
                System.out.println("I1: " + turn + " " + turno);
                turn++;
            } else {
                if (turn == 2) {
                    imprimirButton(turn, v);
                    Img_Turno.setImageResource(R.drawable.x);
                    System.out.println("I2: " + turn + " " + turno);
                    turn--;
                }
            }
        } else {
            if (turn == 1){
                imprimirButton(turn, v);
                Img_Turno.setImageResource(R.drawable.o);
                System.out.println("I3: " + turn + " " + turno);
                turn++;
            } else {
                if (turn == 2) {
                    imprimirButton(turn, v);
                    Img_Turno.setImageResource(R.drawable.x);
                    System.out.println("I4: " + turn + " " + turno);
                    turn--;
                }
            }
        }

    }

    public void imprimirButton(int turn, View v) {
        if (v.getId() == R.id.btn_1) {
            if (turn == 1){
                btn_1.setImageResource(R.drawable.x);
                btn_1.setTag(1);
            } else {
                btn_1.setImageResource(R.drawable.o);
                btn_1.setTag(0);
            }
            btn_1.setEnabled(false);
            valor_btn[0] = turn;
        }
        if (v.getId() == R.id.btn_2) {
            if (turn == 1){
                btn_2.setImageResource(R.drawable.x);
                btn_2.setTag(1);
            } else {
                btn_2.setImageResource(R.drawable.o);
                btn_2.setTag(0);
            }
            btn_2.setEnabled(false);
            valor_btn[1] = turn;
        }
        if (v.getId() == R.id.btn_3) {
            if (turn == 1){
                btn_3.setTag(1);
                btn_3.setImageResource(R.drawable.x);
            } else {
                btn_3.setImageResource(R.drawable.o);
                btn_3.setTag(0);
            }
            btn_3.setEnabled(false);
            valor_btn[2] = turn;
        }
        if (v.getId() == R.id.btn_4) {
            if (turn == 1){
                btn_4.setImageResource(R.drawable.x);
                btn_4.setTag(1);
            } else {
                btn_4.setImageResource(R.drawable.o);
                btn_4.setTag(0);
            }
            btn_4.setEnabled(false);
            valor_btn[3] = turn;
        }
        if (v.getId() == R.id.btn_5) {
            if (turn == 1){
                btn_5.setImageResource(R.drawable.x);
                btn_5.setTag(1);
            } else {
                btn_5.setImageResource(R.drawable.o);
                btn_5.setTag(0);
            }
            btn_5.setEnabled(false);
            valor_btn[4] = turn;
        }
        if (v.getId() == R.id.btn_6) {
            if (turn == 1){
                btn_6.setImageResource(R.drawable.x);
                btn_6.setTag(1);
            } else {
                btn_6.setImageResource(R.drawable.o);
                btn_6.setTag(0);
            }
            btn_6.setEnabled(false);
            valor_btn[5] = turn;
        }
        if (v.getId() == R.id.btn_7) {
            if (turn == 1){
                btn_7.setImageResource(R.drawable.x);
                btn_7.setTag(1);
            } else {
                btn_7.setImageResource(R.drawable.o);
                btn_7.setTag(0);
            }
            btn_7.setEnabled(false);
            valor_btn[6] = turn;
        }
        if (v.getId() == R.id.btn_8) {
            if (turn == 1){
                btn_8.setImageResource(R.drawable.x);
                btn_8.setTag(1);
            } else {
                btn_8.setImageResource(R.drawable.o);
                btn_8.setTag(0);
            }
            btn_8.setEnabled(false);
            valor_btn[7] = turn;
        }
        if (v.getId() == R.id.btn_9) {
            if (turn == 1){
                btn_9.setImageResource(R.drawable.x);
                btn_9.setTag(1);
            } else {
                btn_9.setImageResource(R.drawable.o);
                btn_9.setTag(0);
            }
            btn_9.setEnabled(false);
            valor_btn[8] = turn;
        }
        Ganador(valor_btn, turno);
    }

    public void Ganador(int[] valor_btn, int turno) {

            if (valor_btn[0] != 0 && valor_btn[0] == valor_btn[1] && valor_btn[0] == valor_btn[2]) {
                btn_4.setEnabled(false);
                btn_5.setEnabled(false);
                btn_6.setEnabled(false);
                btn_7.setEnabled(false);
                btn_8.setEnabled(false);
                btn_9.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[3] != 0 && valor_btn[3] == valor_btn[4] && valor_btn[3] == valor_btn[5]) {
                btn_1.setEnabled(false);
                btn_2.setEnabled(false);
                btn_3.setEnabled(false);
                btn_7.setEnabled(false);
                btn_8.setEnabled(false);
                btn_9.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[6] != 0 && valor_btn[6] == valor_btn[7] && valor_btn[6] == valor_btn[8]) {
                btn_1.setEnabled(false);
                btn_2.setEnabled(false);
                btn_3.setEnabled(false);
                btn_4.setEnabled(false);
                btn_5.setEnabled(false);
                btn_6.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[0] != 0 && valor_btn[0] == valor_btn[3] && valor_btn[0] == valor_btn[6]) {
                btn_2.setEnabled(false);
                btn_3.setEnabled(false);
                btn_5.setEnabled(false);
                btn_6.setEnabled(false);
                btn_8.setEnabled(false);
                btn_9.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[1] != 0 && valor_btn[1] == valor_btn[4] && valor_btn[1] == valor_btn[7]) {
                btn_1.setEnabled(false);
                btn_3.setEnabled(false);
                btn_4.setEnabled(false);
                btn_6.setEnabled(false);
                btn_7.setEnabled(false);
                btn_9.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[2] != 0 && valor_btn[2] == valor_btn[5] && valor_btn[2] == valor_btn[8]) {
                btn_1.setEnabled(false);
                btn_2.setEnabled(false);
                btn_4.setEnabled(false);
                btn_5.setEnabled(false);
                btn_7.setEnabled(false);
                btn_8.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[0] != 0 && valor_btn[0] == valor_btn[4] && valor_btn[0] == valor_btn[8]) {
                btn_2.setEnabled(false);
                btn_3.setEnabled(false);
                btn_4.setEnabled(false);
                btn_6.setEnabled(false);
                btn_7.setEnabled(false);
                btn_8.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            } else if (valor_btn[2] != 0 && valor_btn[2] == valor_btn[4] && valor_btn[2] == valor_btn[6]) {
                btn_1.setEnabled(false);
                btn_2.setEnabled(false);
                btn_4.setEnabled(false);
                btn_6.setEnabled(false);
                btn_8.setEnabled(false);
                btn_9.setEnabled(false);
                if (turno == 1){
                    contP1++;
                    text_P1.setText( namePlayer1 + ": " + contP1);
                } else {
                    contP2++;
                    text_P2.setText(namePlayer2+  ": " + contP2);
                }
            }



    }

    public void limpiarTablero(View v) {
        contador = 0;
        turn = inicia;

        for (int i = 0; i < 9; i++){
            valor_btn[i] = 0;
        }

        if (turn == 1){
            Img_Turno.setImageResource(R.drawable.x);
        } else {
            Img_Turno.setImageResource(R.drawable.o);
        }

        btn_1.setEnabled(true);
        btn_1.setImageResource(0);

        btn_2.setEnabled(true);
        btn_2.setImageResource(0);

        btn_3.setEnabled(true);
        btn_3.setImageResource(0);

        btn_4.setEnabled(true);
        btn_4.setImageResource(0);

        btn_5.setEnabled(true);
        btn_5.setImageResource(0);

        btn_6.setEnabled(true);
        btn_6.setImageResource(0);

        btn_7.setEnabled(true);
        btn_7.setImageResource(0);

        btn_8.setEnabled(true);
        btn_8.setImageResource(0);

        btn_9.setEnabled(true);
        btn_9.setImageResource(0);
    }

    public void regresarMenu (View v) {
        Intent regresarMenu = new Intent(ContentGato.this, MainActivity.class);
        startActivity(regresarMenu);
    }
}
