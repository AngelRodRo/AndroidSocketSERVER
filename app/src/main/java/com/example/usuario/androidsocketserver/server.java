package com.example.usuario.androidsocketserver;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.ServerSocket;
import android.os.Handler;

import java.net.Socket;
import java.util.logging.LogRecord;

/**
 * Created by Usuario on 21/12/2014.
 */
public class server extends Activity {

    private ServerSocket serverSocket;

    Handler updateConversationHandler;
    Thread serverThread = null;
    private TextView text;
    public static final int SERVERPORT = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textview);

        updateConversationHandler = new Handler();

        this.serverThread = new Thread(new ServerThread());
        this.serverThread.start();


    }


    private class ServerThread implements Runnable {


        @Override
        public void run() {
            Socket socket = null;

        }
    }
}
