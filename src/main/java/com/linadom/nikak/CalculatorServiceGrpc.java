package com.linadom.nikak;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sqrt.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getFindSqrtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findSqrt",
      requestType = com.linadom.nikak.Input.class,
      responseType = com.linadom.nikak.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getFindSqrtMethod() {
    io.grpc.MethodDescriptor<com.linadom.nikak.Input, com.linadom.nikak.Output> getFindSqrtMethod;
    if ((getFindSqrtMethod = CalculatorServiceGrpc.getFindSqrtMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindSqrtMethod = CalculatorServiceGrpc.getFindSqrtMethod) == null) {
          CalculatorServiceGrpc.getFindSqrtMethod = getFindSqrtMethod = 
              io.grpc.MethodDescriptor.<com.linadom.nikak.Input, com.linadom.nikak.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "findSqrt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Output.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("findSqrt"))
                  .build();
          }
        }
     }
     return getFindSqrtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getFindMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findMax",
      requestType = com.linadom.nikak.Input.class,
      responseType = com.linadom.nikak.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getFindMaxMethod() {
    io.grpc.MethodDescriptor<com.linadom.nikak.Input, com.linadom.nikak.Output> getFindMaxMethod;
    if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaxMethod = CalculatorServiceGrpc.getFindMaxMethod) == null) {
          CalculatorServiceGrpc.getFindMaxMethod = getFindMaxMethod = 
              io.grpc.MethodDescriptor.<com.linadom.nikak.Input, com.linadom.nikak.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "findMax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Output.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("findMax"))
                  .build();
          }
        }
     }
     return getFindMaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getGetNumbersAllMultipliersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumbersAllMultipliers",
      requestType = com.linadom.nikak.Input.class,
      responseType = com.linadom.nikak.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getGetNumbersAllMultipliersMethod() {
    io.grpc.MethodDescriptor<com.linadom.nikak.Input, com.linadom.nikak.Output> getGetNumbersAllMultipliersMethod;
    if ((getGetNumbersAllMultipliersMethod = CalculatorServiceGrpc.getGetNumbersAllMultipliersMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetNumbersAllMultipliersMethod = CalculatorServiceGrpc.getGetNumbersAllMultipliersMethod) == null) {
          CalculatorServiceGrpc.getGetNumbersAllMultipliersMethod = getGetNumbersAllMultipliersMethod = 
              io.grpc.MethodDescriptor.<com.linadom.nikak.Input, com.linadom.nikak.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "getNumbersAllMultipliers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Output.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getNumbersAllMultipliers"))
                  .build();
          }
        }
     }
     return getGetNumbersAllMultipliersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getGetSTDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSTD",
      requestType = com.linadom.nikak.Input.class,
      responseType = com.linadom.nikak.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.linadom.nikak.Input,
      com.linadom.nikak.Output> getGetSTDMethod() {
    io.grpc.MethodDescriptor<com.linadom.nikak.Input, com.linadom.nikak.Output> getGetSTDMethod;
    if ((getGetSTDMethod = CalculatorServiceGrpc.getGetSTDMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetSTDMethod = CalculatorServiceGrpc.getGetSTDMethod) == null) {
          CalculatorServiceGrpc.getGetSTDMethod = getGetSTDMethod = 
              io.grpc.MethodDescriptor.<com.linadom.nikak.Input, com.linadom.nikak.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalculatorService", "getSTD"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.linadom.nikak.Output.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getSTD"))
                  .build();
          }
        }
     }
     return getGetSTDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary - вернуть корень числа
     * </pre>
     */
    public void findSqrt(com.linadom.nikak.Input request,
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSqrtMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional - макс число из списка
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.linadom.nikak.Input> findMax(
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaxMethod(), responseObserver);
    }

    /**
     * <pre>
     * server - найти все множители из которого состоят числа
     * </pre>
     */
    public void getNumbersAllMultipliers(com.linadom.nikak.Input request,
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumbersAllMultipliersMethod(), responseObserver);
    }

    /**
     * <pre>
     * client - получить стандартное распределение числа
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.linadom.nikak.Input> getSTD(
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetSTDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindSqrtMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.linadom.nikak.Input,
                com.linadom.nikak.Output>(
                  this, METHODID_FIND_SQRT)))
          .addMethod(
            getFindMaxMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.linadom.nikak.Input,
                com.linadom.nikak.Output>(
                  this, METHODID_FIND_MAX)))
          .addMethod(
            getGetNumbersAllMultipliersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.linadom.nikak.Input,
                com.linadom.nikak.Output>(
                  this, METHODID_GET_NUMBERS_ALL_MULTIPLIERS)))
          .addMethod(
            getGetSTDMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.linadom.nikak.Input,
                com.linadom.nikak.Output>(
                  this, METHODID_GET_STD)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - вернуть корень числа
     * </pre>
     */
    public void findSqrt(com.linadom.nikak.Input request,
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSqrtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bi-directional - макс число из списка
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.linadom.nikak.Input> findMax(
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaxMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * server - найти все множители из которого состоят числа
     * </pre>
     */
    public void getNumbersAllMultipliers(com.linadom.nikak.Input request,
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetNumbersAllMultipliersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client - получить стандартное распределение числа
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.linadom.nikak.Input> getSTD(
        io.grpc.stub.StreamObserver<com.linadom.nikak.Output> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetSTDMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - вернуть корень числа
     * </pre>
     */
    public com.linadom.nikak.Output findSqrt(com.linadom.nikak.Input request) {
      return blockingUnaryCall(
          getChannel(), getFindSqrtMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server - найти все множители из которого состоят числа
     * </pre>
     */
    public java.util.Iterator<com.linadom.nikak.Output> getNumbersAllMultipliers(
        com.linadom.nikak.Input request) {
      return blockingServerStreamingCall(
          getChannel(), getGetNumbersAllMultipliersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary - вернуть корень числа
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.linadom.nikak.Output> findSqrt(
        com.linadom.nikak.Input request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSqrtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_SQRT = 0;
  private static final int METHODID_GET_NUMBERS_ALL_MULTIPLIERS = 1;
  private static final int METHODID_FIND_MAX = 2;
  private static final int METHODID_GET_STD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_SQRT:
          serviceImpl.findSqrt((com.linadom.nikak.Input) request,
              (io.grpc.stub.StreamObserver<com.linadom.nikak.Output>) responseObserver);
          break;
        case METHODID_GET_NUMBERS_ALL_MULTIPLIERS:
          serviceImpl.getNumbersAllMultipliers((com.linadom.nikak.Input) request,
              (io.grpc.stub.StreamObserver<com.linadom.nikak.Output>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMax(
              (io.grpc.stub.StreamObserver<com.linadom.nikak.Output>) responseObserver);
        case METHODID_GET_STD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSTD(
              (io.grpc.stub.StreamObserver<com.linadom.nikak.Output>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.linadom.nikak.Sqrt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getFindSqrtMethod())
              .addMethod(getFindMaxMethod())
              .addMethod(getGetNumbersAllMultipliersMethod())
              .addMethod(getGetSTDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
