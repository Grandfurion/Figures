package com.yaros;

public class TwoDFigureFactory {
    //  public TwoDFigureFactory(){
    //
    //}

    public I2dGeometricFigure createFigure(float ... sides){
        if(sides.length == 3){
            return new Triangle(sides[0], sides[1], sides[2]);
        }else if(sides.length == 4){
            return new Tetragon(sides[0],sides[1],sides[2],sides[3]);
        }
        return null;
    }

}
