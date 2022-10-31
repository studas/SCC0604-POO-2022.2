#include "Triangle.hpp"

auto Triangle::area() -> float {
    return base * height / 2;
}

auto Triangle::getHeight() -> float{
    return height;
}

auto Triangle::getBase() -> float{
    return base;
}

Triangle::Triangle(Point2D _points[], int nPoints, float _height, float _base) : Polygon(_points, nPoints) {
    base = _base;
    height = _height;
}

