package com.test.node;

import com.test.node.ActiveNode;
import com.test.wire.Wire;

public class OutputNode extends ActiveNode implements Runnable {
    protected Wire[] wires;   

    public OutputNode(String name) {
        super(name);
        wires = new Wire[count];
    }

    @Override
    void preprocess() {
    }

    // @Override
    // void process(int index, Wire wire) {
    //     if (inputPorts.length < index) {
    //         throw new Exception();
    //     }

    //     inputPorts[index] = Wire();
    // }

    @Override
    void postprocess() {
    }

    @Override
    void process() {
    }

    @Override
    public void run() {
    }
}
