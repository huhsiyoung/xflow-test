package com.test.node;

import com.test.node.ActiveNode;
import com.test.wire.Wire;

public class InputNode extends ActiveNode implements Runnable {
    Wire[] outputPorts;

    public InputNode(String name, int count) {
        super(name);
    }


    public void connect(int index, Wire wire) {
    }

    @Override
    void preprocess() {
    }

    @Override
    void process() {
    }

    @Override
    void postprocess() {
    }


    @Override
    public void run() {
    }

    
    
}
