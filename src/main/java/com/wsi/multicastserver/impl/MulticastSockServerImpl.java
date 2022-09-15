package com.wsi.multicastserver.impl;

import com.wsi.multicastserver.api.MulticastSockServer;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.*;

@Component
public class MulticastSockServerImpl  implements MulticastSockServer {

    public MulticastSockServerImpl(){}

    @Override
    public void sendUDPMessage(String msg) throws IOException {

        DatagramSocket socket = new DatagramSocket();
        InetAddress group = InetAddress.getByName("230.0.0.0");
        byte[] message = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(message, message.length,
                group, 6500);
        socket.send(packet);
        socket.close();

    }
}

