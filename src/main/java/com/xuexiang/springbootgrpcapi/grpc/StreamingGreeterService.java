package com.xuexiang.springbootgrpcapi.grpc;

import com.xuexiang.springbootgrpcapi.HelloStreaming.HelloReply;
import com.xuexiang.springbootgrpcapi.HelloStreaming.HelloRequest;
import com.xuexiang.springbootgrpcapi.HelloStreaming.StreamingGreeterGrpc;
import com.xuexiang.springbootgrpcapi.LogInterceptor;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@Slf4j
@GRpcService(interceptors = {LogInterceptor.class})
public class StreamingGreeterService extends StreamingGreeterGrpc.StreamingGreeterImplBase {


    @Override
    public StreamObserver<HelloRequest> sayHelloStreaming(StreamObserver<HelloReply> responseObserver) {
        return super.sayHelloStreaming(responseObserver);
    }
}
