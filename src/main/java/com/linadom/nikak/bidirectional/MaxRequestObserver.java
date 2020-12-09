package com.linadom.nikak.bidirectional;

import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxRequestObserver implements StreamObserver<Input> {

  private List<Double> numbers = new ArrayList<>();
  private final StreamObserver<Output> outputStreamObserver;
  private double maxNumber = 0;

  public MaxRequestObserver(StreamObserver<Output> outputStreamObserver) {
    this.outputStreamObserver = outputStreamObserver;
  }

  @Override
  public void onNext(Input input) {
    numbers.add(input.getNumber());
    maxNumber = Collections.max(numbers);
    System.out.println(maxNumber);
    System.out.println(Arrays.toString(numbers.toArray()));
    Output outputResponse = Output.newBuilder()
            .setResult(maxNumber)
            .build();
    this.outputStreamObserver.onNext(outputResponse);
  }


  @Override
  public void onError(Throwable throwable) {

  }

  @Override
  public void onCompleted() {
    this.outputStreamObserver.onCompleted();
  }

}