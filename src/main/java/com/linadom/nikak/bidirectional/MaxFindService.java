package com.linadom.nikak.bidirectional;

import com.linadom.nikak.CalculatorServiceGrpc;
import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

public class MaxFindService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

  @Override
  public StreamObserver<Input> findMax(StreamObserver<Output> responseObserver) {
    return new MaxRequestObserver(responseObserver);
  }

}