package taller1NathanM;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.nathanm.taller1NathanM.R;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_j1,btn_j2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_j1 = findViewById(R.id.btn_j1);
        btn_j2 = findViewById(R.id.btn_j2);

        btn_j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(), Jugador1.class);

                startActivity(intento);
            }
        });

        btn_j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(), Jugador2.class);

                startActivity(intento);
            }
        });

    }


}