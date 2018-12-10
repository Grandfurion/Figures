package com.yaros;

public class Tetragon implements ITetragon{

    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public Tetragon(float a, float b, float c, float d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean areOppositeSidesEqual() {
        if ((a == c)&&(b==d)){
            return true;
        }
        return false;
    }

    @Override
    public float CalcArea() {
        if (exists()){
            return ((float)Math.sqrt((calcPerimeter()/2 - a)*(calcPerimeter()/2 - b)*(calcPerimeter()/2 - c)*(calcPerimeter()/2 - d)));
        }
        return -1;
    }

    @Override
    public float calcPerimeter() {
        if(exists()){
            return a+b+c+d;
        }
        return -1;
    }

    @Override
    public float[] getSides() {
        return new float[]{a,b,c,d};
    }

    @Override
    public boolean exists() {
        if((a<b+c+d) && (b<a+c+d) && (c<a+b+d) && (d<a+b+c)){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Tetragon{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
