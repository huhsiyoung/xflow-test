package com.test.node;

import com.test.message.Message;
import com.test.node.ActiveNode;
import com.test.wire.Wire;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TraceNode extends ActiveNode implements Runnable {
    com.test.wire.Wire[] wires;

    public TraceNode(String name, int count) {
        super(name);
        wires = new Wire[count];
    }


    public void preprocess() {
    }

    public void process() {
        for(int i = 0; i < wires.length; i++) {
            if (wires[i] != null && wires[i].hasMessage()) {
                log.trace(wires[i].get().toString());
            }
        }
    }

    public void postprocess() {

    }


    @Override
    public void run() {
    }
}
