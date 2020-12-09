package com.linadom.nikak.client;

import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;

public class InputStreamObserver implements StreamObserver<Input> {

  private double STD = 0;
  private int length = 0;
  private double sum = 0;
  private ArrayList<Double> listOfNumbers = new ArrayList<>();
  private final StreamObserver<Output> outputStreamObserver;

  public InputStreamObserver(StreamObserver<Output> outputStreamObserver) {
    this.outputStreamObserver = outputStreamObserver;
  }

  @Override //здесь считаем
  public void onNext(Input input) {
    STD = 0;
    listOfNumbers.add(input.getNumber());
    sum = sum + listOfNumbers.get(length);
    System.out.println(Arrays.asList(listOfNumbers.toArray()));
    length++;
    double mean = sum / length;
    for (double number : listOfNumbers) {
      STD += Math.pow(number - mean, 2);
    }
    System.out.println(STD);
  }

  @Override
  public void onError(Throwable throwable) {

  }

  @Override
  public void onCompleted() {//здесь ответ
    Output output = Output.newBuilder().setResult(Math.sqrt(STD / length)).build();
    outputStreamObserver.onNext(output);
    outputStreamObserver.onCompleted();
  }

}