package com.linadom.nikak.server;

import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;

  public class MultipliersResponseStreamObserver implements StreamObserver<Output> {

    @Override
    public void onNext(Output output) {
      System.out.println(
              "Множитель" + " : " + output.getResult()
      );
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }

  }