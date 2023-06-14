package Homework.homework14.task2;

import java.util.LinkedList;
import java.util.Arrays;

public class Animal {
    private LinkedList<String> list = new LinkedList<>(Arrays.asList("Rabbit", "Shark"));

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }

    public void add(String str){
        list.addLast(str);
    }

    public void remove(){
        list.removeFirst();
    }
}
