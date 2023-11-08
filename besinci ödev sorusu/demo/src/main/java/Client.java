// Client.java
package com.example;

import javax.naming.Context;
import javax.naming.InitialContext;

// Client class
public class Client {
    public static void main(String[] args) throws Exception {
        // Get the initial context
        Context context = new InitialContext();

        // Lookup the counter bean using its JNDI name
        Counter counter = (Counter) context.lookup("java:global/CounterBean");

        // Invoke the methods on the counter bean
        counter.increment();
        counter.increment();
        System.out.println("Count: " + counter.getCount());
        counter.decrement();
        System.out.println("Count: " + counter.getCount());
    }
}

