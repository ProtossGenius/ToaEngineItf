package com.suremoon.game;

import java.util.LinkedList;

/**
 * 用于生成Jar包的
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 10; ++i){
            list.add(i);
        }

        for(var it = list.iterator(); it.hasNext(); ){
            System.out.println(it.next());
            it.remove();
        }

        System.out.println(list.size());
    }
}
