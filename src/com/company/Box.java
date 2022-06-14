package com.company;

public class Box <T,Y>{
    private T t;
    private Y y;

    public Box(T t, Y y) {
        this.t = t;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                ", y=" + y +
                '}';
    }
    static Box method(Integer t1,String y1){
        Box box = new Box(t1,y1);
        return box;
    }
}
