package com.test.node;

import java.io.IOException;
import java.net.Socket;

import com.test.node.ActiveNode;

public abstract class ProcessNode extends ActiveNode {
    String host;

    public ProcessNode(String name) {
        super(name);
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
    
}
