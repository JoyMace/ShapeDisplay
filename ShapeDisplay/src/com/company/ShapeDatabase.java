package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeDatabase {

    //creates random length for list up to 10
    Random random;
    int length;

    List<Shape> shapeCollection;

    public ShapeDatabase() {
        random = new Random();
        length = random.nextInt(10);
        //System.out.println(length);
        shapeCollection = generate_collection(length);
    }

    protected static List<Shape> generate_collection(int length)
    {
        Random random = new Random();
        //creates empty list
        List<Shape> shapeCollection = new ArrayList<>();

        for(int i = 0; i < length; i++)
        {
            int next_shape = random.nextInt(3);
            //switch statement
            switch(next_shape) {
                //case statements
                case 0:
                    //System.out.println("Adding a circle");
                    shapeCollection.add(new Circle("Circle"));
                    break;

                case 1:
                    //System.out.println("Adding a square");
                    shapeCollection.add(new Square("Square"));
                    break;

                case 2:
                    //System.out.println("Adding a triangle");
                    shapeCollection.add(new Triangle("Triangle"));
            }
        }
        System.out.println(shapeCollection);
        return shapeCollection;
    }
}
