package com.test.node;

import java.time.OffsetDateTime;
import java.util.UUID;

import ch.qos.logback.classic.Logger;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public abstract class Node {
    int count;
    String name;
    Logger logger;
    OffsetDateTime createdDate;
    UUID id;

    public Node(String name) {
        count++; // 노드의 갯수를 표시하기 위해서 증가시키는 것 같음
        createdDate = OffsetDateTime.now();
        id = UUID.randomUUID();
        this.name = name;
        
        log.trace("create node : {},", id); // 중괄호 사이에 값이 누락 됬는지
    }

    public void setName(String Name) {
        this.name = name;
    }

}
