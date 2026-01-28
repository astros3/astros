package com.example.astros;

abstract class Shape {
    protected int x;
    protected int y;
}

public class Rectangle extends Shape {
    public int getArea() {
        return x * y;
    }
}