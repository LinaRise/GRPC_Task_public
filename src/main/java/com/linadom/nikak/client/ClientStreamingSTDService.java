package com.linadom.nikak.client;

import com.linadom.nikak.CalculatorServiceGrpc;
import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

public class ClientStreamingSTDService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

  @Override
  public StreamObserver<Input> getSTD(StreamObserver<Output> responseObserver) {
    return new InputStreamObserver(responseObserver);
  }
}
