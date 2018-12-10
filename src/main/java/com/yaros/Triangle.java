package com.yaros;

public class Triangle implements ITriangle {

    private final float a;
    private final float b;
    private final float c;


    //bred kakoyto (в любом случае вызывается только третий конструктор)
    public Triangle(float a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Triangle(float a, float b){
        this.a = a;
        this.c = a;
        this.b = b;
    }

    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    public int getTriangleRatio() {
        if(exists()){
            if ((a == b) && (a == c)){
                return TYPE_EQUILATERAL;
            }else if((a == b) || (b == c) || (a == c)){
                return TYPE_ISOSCELES;
            }else{
                return TYPE_USUAL;
            }
        }
        return -1;   //if triangle doesn't exist it returns -1
    }

    @Override
    public boolean exists() {
        if((a < b+c) && (b<a+c) && (c<a+b)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public float CalcArea() {
        if (exists()){
            float area = (float)Math.sqrt((calcPerimeter()/2)*((calcPerimeter()/2) - a) * ((calcPerimeter()/2) - b) * ((calcPerimeter()/2) - c));
            return area;
        }
        return -1;
    }


    @Override
    public float calcPerimeter() {
        if (exists()){
            return a+b+c;
        }
        return -1;
    }

    @Override
    public float[] getSides() {
        return new float[]{a, b, c};
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
