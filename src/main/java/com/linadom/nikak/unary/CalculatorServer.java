package com.linadom.nikak.unary;

import com.linadom.nikak.bidirectional.MaxFindService;
import com.linadom.nikak.client.ClientStreamingSTDService;
import com.linadom.nikak.server.MultipliersGetService;
import com.linadom.nikak.server.MultipliersResponseStreamObserver;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

  public static void main(String[] args) throws IOException, InterruptedException {

    // build gRPC server
    Server server = ServerBuilder.forPort(8080)
//            .addService(new UnaryCalculatorService())
//            .addService(new ClientStreamingSTDService())
            .addService(new MaxFindService())
//            .addService(new MultipliersGetService())
            .build();
    System.out.println("gRPC server is starting!");
    // старт сервера
    server.start();

    // сообщение об окончании работы
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("gRPC server is shutting down!");
      server.shutdown();
    }));

    server.awaitTermination();

  }

}