package com.yaros;

public interface ITetragon extends I2dGeometricFigure {
     boolean areOppositeSidesEqual();


     final int TYPE_NONE = 0;
    final int TYPE_RECTANGLE = 1;
    final int TYPE_SQUARE = 2;
    final int TYPE_PARALLELOGRAM = 3;
    final int TYPE_RHOMBUS = 4;
    final int TYPE_TRAPEZIUM = 5;

}
