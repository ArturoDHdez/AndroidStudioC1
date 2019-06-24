package erick.com.example.numeros_amigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_n1;
    private TextView txt_n2;

    private Button btn_Verificar;

    private TextView txt_na;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_n1 = (TextView) findViewById(R.id.txt_n1);
        txt_n2 = (TextView) findViewById(R.id.txt_n2);

        btn_Verificar = (Button) findViewById(R.id.btn_Verificar);

        txt_na = (TextView) findViewById(R.id.txt_na);

        btn_Verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sumaN1 = 0;
                int sumaN2 = 0;

                int numero1 = Integer.parseInt(txt_n1.getText().toString());
                int numero2 = Integer.parseInt(txt_n2.getText().toString());

                for (int i = 1; i < numero1; i++){
                    if (numero1 % i == 0){
                        sumaN1 += i;
                    }
                }

                for (int i = 1; i < numero2; i++){
                    if (numero2 % i == 0){
                        sumaN2 += i;
                    }
                }

                if (sumaN1 == numero2 && sumaN2 == numero1){
                    txt_na.setText("Numeros Amigos: Si");
                } else {
                    txt_na.setText("Numeros Amigos: No");
                }

            }
        });
    }
}
