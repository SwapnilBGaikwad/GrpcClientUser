package com.github.grpcuser;

public class Application {
    public static void main(String[] args) throws Exception {
        CalculatorClient client = new CalculatorClient("localhost", 50051);
        client.execute();
        client.execute();
        client.shutdown();
    }
}

