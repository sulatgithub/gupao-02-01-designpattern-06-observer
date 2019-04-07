package com.sul.pattern;

import com.google.common.eventbus.EventBus;

public class GuavaGPerObserverTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        Question question = new Question();
        question.setSource("GPer生态圈");
        question.setUserName("学员");
        question.setContent("观察者设计模式适用于哪些场景？");
        Teacher teacher = new Teacher("Tom");
        eventBus.register(teacher);
        eventBus.post(question);
    }
}
