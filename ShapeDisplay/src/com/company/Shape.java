package com.company;

public abstract class Shape implements Comparable<Shape> {

    public String name;
    public Shape(String shape_name){
        name = shape_name;
    }

    public abstract String getName();

    public final int compareTo(Shape s) {
        return getName().compareTo(s.getName());
    }

    public String toString()
    {
        return name;
    }
}

class Circle extends Shape {

    public Circle(String shape_name){ super(shape_name);}

    public String getName() { return name; }

}

class Square extends Shape {

    public Square(String shape_name){ super(shape_name);}

    public String getName() { return name; }
}

class Triangle extends Shape {

    public Triangle(String shape_name){ super(shape_name);}

    public String getName() { return name;}
}
