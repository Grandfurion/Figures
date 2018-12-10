package com.yaros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] sides = scanner.nextLine().split(" ");
        float[] sidesFloat = new float[sides.length];
        int i = 0;
        for (String s : sides){
            sidesFloat[i] = Float.parseFloat(s);
            i++;
        }
        I2dGeometricFigure figure = new TwoDFigureFactory().createFigure(sidesFloat);

        System.out.println(figure.CalcArea());
        System.out.println(figure.calcPerimeter());
        System.out.println(figure.exists());
        System.out.println(figure.getSides());

    }

}
