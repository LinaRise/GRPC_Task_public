package com.linadom.nikak.unary;

import com.linadom.nikak.CalculatorServiceGrpc;
import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

public class UnaryCalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

  @Override
  public void findSqrt(Input request, StreamObserver<Output> responseObserver) {
    double inputNumber = request.getNumber();
    double resultNumber = this.sqrt(inputNumber);
    Output output = Output.newBuilder()
            .setResult(resultNumber)
            .build();
    responseObserver.onNext(output);
    responseObserver.onCompleted();
  }

  private double sqrt(double number) {
    if (number < 0)
      return -1;
    return Math.sqrt(number);
  }

}
