#ifndef SQUARE_HPP
#define SQUARE_HPP

#include "Polygon.hpp"
#include "Point2D.hpp"

class Square : public Polygon{
protected:
    float side;
public:
    auto getSide() -> float;
    auto area() -> float;
    Square(Point2D _points[], int nPoints, float _side);
};

#endif /* SQUARE_HPP */

