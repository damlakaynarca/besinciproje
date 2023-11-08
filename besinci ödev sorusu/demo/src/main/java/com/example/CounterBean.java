// CounterBean.java
package com.example;

import javax.ejb.Stateful;
import javax.ejb.Remote;

// Stateful session bean
@Stateful
public class CounterBean implements Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}

// Remote interface
@Remote
interface Counter {
    public void increment();
    public void decrement();
    public int getCount();
}

