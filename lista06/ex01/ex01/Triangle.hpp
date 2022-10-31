#ifndef TRIANGLE_HPP
#define TRIANGLE_HPP

#include "Polygon.hpp"
#include "Point2D.hpp"

class Triangle : public Polygon{
protected:
    float height;
    float base;
public:
    auto getHeight() -> float;
    auto getBase() -> float;
    auto area() -> float;
    Triangle(Point2D _points[], int nPoints, float _height, float _base);
};

#endif /* TRIANGLE_HPP */

