package taller1NathanM;

import android.app.Activity;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente extends Thread{

    Socket s;

    Activity activity;

    private int jugador =0;

    public Cliente(Activity activity){
        this.activity = activity;

    }

    @Override
    public void run() {
        try {
            s = new Socket("172.30.168.159",5000);

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void enviar(final Dato dato){

        new Thread(new Runnable() {
            @Override
            public void run() {
                //Este Codigo se va a ejecutar en paralelo. LAMBDA
                try {
                    OutputStream salida= s.getOutputStream();

                    ObjectOutputStream osalida= new ObjectOutputStream(salida);

                    osalida.writeObject(dato);
                }catch (IOException ex){

                }
            }
        }).start();
    }

    public long getJugador(){
        return jugador;
    }
}