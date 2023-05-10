package org.example;

import com.example.grpc.GreetMessageServiceGrpc;
import com.example.grpc.MessageService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * GRPC - Client
 */
public class ClientApplication {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext().build();

        GreetMessageServiceGrpc.GreetMessageServiceBlockingStub stub = GreetMessageServiceGrpc.newBlockingStub(channel);

        MessageService.GreetMessageRequest request = MessageService.GreetMessageRequest
                .newBuilder()
                .setUserName("Ilon")
                .setUserSurname("Mask")
                .build();

        MessageService.GreetMessageResponse response = stub.formGreetMessage(request);

        System.out.println(response);


        MessageService.GreetMessageRequest requestForMany = MessageService.GreetMessageRequest
                .newBuilder()
                .setUserName("Ilon")
                .setUserSurname("Mask")
                .build();

        Iterator<MessageService.GreetMessageResponse> responseManyIterator = stub.formMassGreetMessage(requestForMany);

        while (responseManyIterator.hasNext())
            System.out.println(responseManyIterator.next());

        channel.shutdownNow();
    }
}
