package taller1NathanM;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import com.example.nathanm.taller1NathanM.R;

public class Jugador1  extends AppCompatActivity implements View.OnTouchListener {

    private ImageButton btn_arriba,btn_abajo,btn_izquierda,btn_derecha,btn_fuego;
    private Cliente c;
    Dato dato;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugador1);

        c = new Cliente(this);
        c.start();
        dato = new Dato();


        btn_arriba = findViewById(R.id.btn_arriba);
        btn_abajo = findViewById(R.id.btn_abajo);
        btn_izquierda = findViewById(R.id.btn_izquierda);
        btn_derecha = findViewById(R.id.btn_derecha);
        btn_fuego = findViewById(R.id.btn_fuego);

        btn_arriba.setOnTouchListener(this);
        btn_abajo.setOnTouchListener(this);
        btn_izquierda.setOnTouchListener(this);
        btn_derecha.setOnTouchListener(this);
        btn_fuego.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){

            btnPressed(view);

        }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
            btnReleased(view);
        }

        return false;
    }

    public void btnPressed(View view){
        switch (view.getId()){

            case R.id.btn_arriba:
                dato.arriba=true;
                c.enviar(dato);
                break;

            case R.id.btn_abajo:
                dato.abajo=true;
                c.enviar(dato);
                break;

            case R.id.btn_izquierda:
                dato.izqu=true;
                c.enviar(dato);
                break;

            case R.id.btn_derecha:
                dato.dere=true;
                c.enviar(dato);
                break;

            case R.id.btn_fuego:
                dato.fuego=true;
                c.enviar(dato);
                break;

        }
    }

    public void btnReleased(View view){
        switch (view.getId()){

            case R.id.btn_arriba:
                dato.arriba=false;
                c.enviar(dato);
                break;

            case R.id.btn_abajo:
                dato.abajo=false;
                c.enviar(dato);
                break;

            case R.id.btn_izquierda:
                dato.izqu=false;
                c.enviar(dato);
                break;

            case R.id.btn_derecha:
                dato.dere=false;
                c.enviar(dato);
                break;

            case R.id.btn_fuego:
                dato.fuego=false;
                c.enviar(dato);
                break;

        }
    }

}
