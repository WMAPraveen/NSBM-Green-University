package com.mycompany.question_10;

public class Question_10 {

    public static void main(String[] args) 
    {
       Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        
        circle.draw();
        circle.erase();
        triangle.draw();
        triangle.erase();
        square.draw();
        square.erase();
    }
}
