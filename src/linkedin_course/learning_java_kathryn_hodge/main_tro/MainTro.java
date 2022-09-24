package linkedin_course.learning_java_kathryn_hodge.main_tro;

import linkedin_course.learning_java_kathryn_hodge.triangle.Triangle;

public class MainTro {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        // Triangle.findArea()? --> Math.pow(2,3)?


    }

}