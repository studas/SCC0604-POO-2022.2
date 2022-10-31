#ifndef POLYGON_HPP
#define POLYGON_HPP

#include "Point2D.hpp"

class Polygon{
protected:
    Point2D* points; 
    int nPoints;

public:
    Polygon(Point2D _points[], int _nPoints) : points {_points}, nPoints {_nPoints}{};
    auto area() -> float;
    auto getPoints() -> Point2D*;
    auto getNPoints() -> int;
};

#endif /* POLYGON_HPP */

