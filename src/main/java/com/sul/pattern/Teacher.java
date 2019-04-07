package com.sul.pattern;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * Created by Tom on 2019/3/17.
 */
public class Teacher  {
    private String name;
    public Teacher(String name){
        this.name = name;
    }


    @Subscribe
    public void update(Question question) {

        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getSource() + "”的提问，希望您解答，问题内容如下      ：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
