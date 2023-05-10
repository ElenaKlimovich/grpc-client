package com.example.grpc;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: MessageService.proto")
public final class GreetMessageServiceGrpc {

  private GreetMessageServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GreetMessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest,
      com.example.grpc.MessageService.GreetMessageResponse> getFormGreetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "formGreetMessage",
      requestType = com.example.grpc.MessageService.GreetMessageRequest.class,
      responseType = com.example.grpc.MessageService.GreetMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest,
      com.example.grpc.MessageService.GreetMessageResponse> getFormGreetMessageMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest, com.example.grpc.MessageService.GreetMessageResponse> getFormGreetMessageMethod;
    if ((getFormGreetMessageMethod = GreetMessageServiceGrpc.getFormGreetMessageMethod) == null) {
      synchronized (GreetMessageServiceGrpc.class) {
        if ((getFormGreetMessageMethod = GreetMessageServiceGrpc.getFormGreetMessageMethod) == null) {
          GreetMessageServiceGrpc.getFormGreetMessageMethod = getFormGreetMessageMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.MessageService.GreetMessageRequest, com.example.grpc.MessageService.GreetMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "formGreetMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MessageService.GreetMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MessageService.GreetMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetMessageServiceMethodDescriptorSupplier("formGreetMessage"))
              .build();
        }
      }
    }
    return getFormGreetMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest,
      com.example.grpc.MessageService.GreetMessageResponse> getFormMassGreetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "formMassGreetMessage",
      requestType = com.example.grpc.MessageService.GreetMessageRequest.class,
      responseType = com.example.grpc.MessageService.GreetMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest,
      com.example.grpc.MessageService.GreetMessageResponse> getFormMassGreetMessageMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.MessageService.GreetMessageRequest, com.example.grpc.MessageService.GreetMessageResponse> getFormMassGreetMessageMethod;
    if ((getFormMassGreetMessageMethod = GreetMessageServiceGrpc.getFormMassGreetMessageMethod) == null) {
      synchronized (GreetMessageServiceGrpc.class) {
        if ((getFormMassGreetMessageMethod = GreetMessageServiceGrpc.getFormMassGreetMessageMethod) == null) {
          GreetMessageServiceGrpc.getFormMassGreetMessageMethod = getFormMassGreetMessageMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.MessageService.GreetMessageRequest, com.example.grpc.MessageService.GreetMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "formMassGreetMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MessageService.GreetMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.MessageService.GreetMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetMessageServiceMethodDescriptorSupplier("formMassGreetMessage"))
              .build();
        }
      }
    }
    return getFormMassGreetMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetMessageServiceStub newStub(io.grpc.Channel channel) {
    return new GreetMessageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetMessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetMessageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetMessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetMessageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetMessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void formGreetMessage(com.example.grpc.MessageService.GreetMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFormGreetMessageMethod(), responseObserver);
    }

    /**
     */
    public void formMassGreetMessage(com.example.grpc.MessageService.GreetMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFormMassGreetMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFormGreetMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.MessageService.GreetMessageRequest,
                com.example.grpc.MessageService.GreetMessageResponse>(
                  this, METHODID_FORM_GREET_MESSAGE)))
          .addMethod(
            getFormMassGreetMessageMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.MessageService.GreetMessageRequest,
                com.example.grpc.MessageService.GreetMessageResponse>(
                  this, METHODID_FORM_MASS_GREET_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetMessageServiceStub extends io.grpc.stub.AbstractStub<GreetMessageServiceStub> {
    private GreetMessageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetMessageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetMessageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetMessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void formGreetMessage(com.example.grpc.MessageService.GreetMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFormGreetMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void formMassGreetMessage(com.example.grpc.MessageService.GreetMessageRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFormMassGreetMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetMessageServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetMessageServiceBlockingStub> {
    private GreetMessageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetMessageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetMessageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetMessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.MessageService.GreetMessageResponse formGreetMessage(com.example.grpc.MessageService.GreetMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getFormGreetMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.MessageService.GreetMessageResponse> formMassGreetMessage(
        com.example.grpc.MessageService.GreetMessageRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFormMassGreetMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetMessageServiceFutureStub extends io.grpc.stub.AbstractStub<GreetMessageServiceFutureStub> {
    private GreetMessageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetMessageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetMessageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetMessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.MessageService.GreetMessageResponse> formGreetMessage(
        com.example.grpc.MessageService.GreetMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFormGreetMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FORM_GREET_MESSAGE = 0;
  private static final int METHODID_FORM_MASS_GREET_MESSAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetMessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetMessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FORM_GREET_MESSAGE:
          serviceImpl.formGreetMessage((com.example.grpc.MessageService.GreetMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse>) responseObserver);
          break;
        case METHODID_FORM_MASS_GREET_MESSAGE:
          serviceImpl.formMassGreetMessage((com.example.grpc.MessageService.GreetMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.MessageService.GreetMessageResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetMessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetMessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.MessageService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetMessageService");
    }
  }

  private static final class GreetMessageServiceFileDescriptorSupplier
      extends GreetMessageServiceBaseDescriptorSupplier {
    GreetMessageServiceFileDescriptorSupplier() {}
  }

  private static final class GreetMessageServiceMethodDescriptorSupplier
      extends GreetMessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetMessageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetMessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetMessageServiceFileDescriptorSupplier())
              .addMethod(getFormGreetMessageMethod())
              .addMethod(getFormMassGreetMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
