package erick.com.example.verificacionpalabras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_Palabra;
    private Button btn_Verificar;

    private TextView txt_Polindromo;
    private TextView txt_longitud;
    private TextView txt_Inversa;
    private  TextView txt_repetidas;


    String Contrario = "";
    int repetidas = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Palabra = (EditText) findViewById(R.id.txt_Palabra);
        btn_Verificar = (Button) findViewById(R.id.btn_Verificar);

        txt_Polindromo = (TextView) findViewById(R.id.txt_Polindromo);
        txt_longitud = (TextView) findViewById(R.id.txt_longitud);
        txt_Inversa = (TextView) findViewById(R.id.txt_Inversa);
        txt_repetidas = (TextView) findViewById(R.id.txt_repetidas);

        btn_Verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabra = txt_Palabra.getText().toString();

                String repetida = "";
                int contador = 0;
                int repetidas = 0;

                for(int i = palabra.length() - 1; i >= 0; i--)
                {
                    Contrario += palabra.charAt(i);
                     for (int j = palabra.length() - 1; j >= 0; j--){
                        if (palabra.charAt(i) == palabra.charAt(j)) {
                            repetidas++;
                        }
                     }

                     if (repetidas > contador){
                         repetida = "" + palabra.charAt(i);
                         contador = repetidas;
                     }

                     repetidas = 0;
                }

                String comparar = Contrario;


                if (palabra.equals(comparar)){
                    txt_Polindromo.setText("Polindromo: Si");
                } else {
                    txt_Polindromo.setText("Polindromo: No");
                }


                txt_longitud.setText("Longitud: " + palabra.length());
                txt_Inversa.setText("Inversa: " + Contrario);
                txt_repetidas.setText("Coincidencias: " + repetida);

                Contrario = "";
            }
        });

    }
}
