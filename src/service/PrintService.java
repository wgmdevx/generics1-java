package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintService {
    private List<Object> list = new ArrayList<>();

    public PrintService() {
    }

    public List<Object> getList() {
        return list;
    }

    public void addValue(Integer value) {
        list.add(value);
    }

    public Object first(){
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }

        for (int i = 1; i < list.size(); i++) {
            System.out.print("," + list.get(i));
        }
        System.out.println("]");
    }
}
