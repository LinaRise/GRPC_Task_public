package com.linadom.nikak.client;

import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

public class OutputStreamObserver implements StreamObserver<Output> {

  @Override
  public void onNext(Output output) {
    System.out.println("Получил : " + output.getResult());
  }

  @Override
  public void onError(Throwable throwable) {

  }

  @Override
  public void onCompleted() {

  }

}