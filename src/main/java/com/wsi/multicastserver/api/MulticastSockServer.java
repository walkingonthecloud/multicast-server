package com.wsi.multicastserver.api;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

public interface MulticastSockServer {

    void sendUDPMessage(String msg) throws IOException;

}
