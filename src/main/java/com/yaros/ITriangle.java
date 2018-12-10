package com.yaros;

public interface ITriangle extends I2dGeometricFigure {
    int getTriangleRatio();

    public final int TYPE_USUAL = 0;
    public final int TYPE_ISOSCELES = 1;
    public final int TYPE_EQUILATERAL = 2;
}
