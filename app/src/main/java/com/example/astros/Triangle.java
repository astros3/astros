package com.example.astros;

public class Triangle extends Shape {

    int base;
    int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }
}