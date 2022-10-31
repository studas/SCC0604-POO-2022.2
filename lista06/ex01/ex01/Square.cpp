#include "Square.hpp"

auto Square::area() -> float {
    return side * side;
}

auto Square::getSide() -> float{
    return side;
}

Square::Square(Point2D _points[], int nPoints, float _side) : Polygon(_points, nPoints) {
    side = _side;
}