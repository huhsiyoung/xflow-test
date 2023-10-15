package com.test.node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.test.message.RequestMessage;
import com.test.wire.Wire;

/*
 * Standard In Node - stdin으로 들어오는 데이터를 flow 메시지로 만들어 flow에 넣는다.
 */

public class ClientNode extends ProcessNode implements Runnable {
    String host;
    int port;
    Socket socket;


    public ClientNode(String name, String host, int port) {
        super(name);
        this.host = host;
        this.port = port;

    }

    @Override
    void preprocess() {
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void process() {
        // 인풋 노드에서 메세지를 입력하고 와어어에 저장된 큐를 출력한다.
        // 클라이언트에서 서버로 표준 출력
        // Wire wire = new Wire();
        // OutputStream socketOut = socket.getOutputStream();
        // System.out.println(wire.get().toString());
        // socketOut.write(.getBytes());
        // socketOut.flush();

        // 받아온 응답을 아웃풋 노드


    }

    @Override
    void postprocess() {
        if (socket == null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
