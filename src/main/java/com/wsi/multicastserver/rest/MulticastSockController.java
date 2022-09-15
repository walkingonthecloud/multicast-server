package com.wsi.multicastserver.rest;

import com.wsi.multicastserver.impl.MulticastSockServerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class MulticastSockController {

    private final MulticastSockServerImpl multicastSockServer;

    public MulticastSockController(MulticastSockServerImpl multicastSockServer){
        this.multicastSockServer = multicastSockServer;
    }

    @GetMapping(value = "/send/{msg}")
    public void sendUDPMessage(@PathVariable String msg) throws IOException {
        log.info("Sending message over UDP...");
        multicastSockServer.sendUDPMessage(msg);
        log.info("Sent!");
    }
}
