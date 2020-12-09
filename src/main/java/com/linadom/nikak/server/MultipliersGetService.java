package com.linadom.nikak.server;

import com.google.common.util.concurrent.Uninterruptibles;
import com.linadom.nikak.CalculatorServiceGrpc;
import com.linadom.nikak.Input;
import com.linadom.nikak.Output;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MultipliersGetService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

  ArrayList<Integer> multipliers = new ArrayList<>();
  double number;
//  Map<Category, Consumer<StreamObserver<OrderResponse>>> categoryHandler = Map.of(
//          Category.ELECTRONICS, this::handleElectronics,
//          Category.EBOOKS, this::handleEBooks
//  );

  @Override
  public void getNumbersAllMultipliers(Input input, StreamObserver<Output> responseObserver) {
    number = input.getNumber();
    findAllPrimeFactors((int) number,responseObserver);
//    for (int i = 0; i < multiplier.length; i++) {
//      multipliers.add(Double.valueOf(multiplier[i]));
//
//    }

    responseObserver.onCompleted();
  }


  public void findAllPrimeFactors(int n,StreamObserver<Output> responseObserver)
  {
    Output output ;
    // Print the number of 2s that divide n
    while (n % 2 == 0) {
      System.out.print(2 + " ");
      output = Output.newBuilder().setResult(2).build();
      responseObserver.onNext(output);
      multipliers.add(2);
      n /= 2;
    }

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      // While i divides n, print i and divide n
      while (n % i == 0) {
        System.out.print(i + " ");
        output = Output.newBuilder().setResult(i).build();
        responseObserver.onNext(output);
        multipliers.add(i);
        n /= i;
      }
    }


    if (n > 2) {
      System.out.print(n);
      output = Output.newBuilder().setResult(n).build();
      responseObserver.onNext(output);
      multipliers.add(n);
    }
  }


  /*public static String findAllMultipliers(int n,StreamObserver<Output> responseObserver) {
    StringBuilder res = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      if (0 == (n % i)) {
        System.out.println(i);
        res.append(i).append(",");
        Output output = Output.newBuilder().setResult(Double.valueOf(i)).build();
        responseObserver.onNext(output);
      }
    }
    return res.toString();
  }*/
}

