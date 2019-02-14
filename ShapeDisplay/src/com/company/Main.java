package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeDatabase db = new ShapeDatabase();

        /* used generics to get rid of compiler warning (List<Shape> vs List) */
        List<Shape> ShapeCollection = new ArrayList<>(db.shapeCollection);
        Collections.sort(ShapeCollection, Comparator.comparing(Shape::toString));
        for (int i = 0; i < db.length; i++) {
            Object next = db.shapeCollection.get(i);

            //prints the name of the shape
            System.out.println(next.toString());
        }

        ShapeDisplay s = new ShapeDisplay(ShapeCollection);
        System.out.println("There are this many circles");
        System.out.println(s.getCircles());
        System.out.println(s.getSquares());
        System.out.println(s.getTriangles());
    }
}
// So far this does populate a database
// and it does print the name of each object
// but it does not sort
// problem with the comparator.
