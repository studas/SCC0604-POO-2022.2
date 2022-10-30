#include <iostream>

#include "Polygon.hpp"

auto Polygon::getPoints() -> Point2D*{
    return points;
}
auto Polygon::getNPoints() -> int{
    return nPoints;
}

auto Polygon::area() -> float {
    float _area = 0;
    int x1, y1, x2, y2;
    for(int i = 0; i < nPoints - 1; i++){
        x1 = points[i].getX();
        y1 = points[i].getY();
        x2 = points[i+1].getX();
        y2 = points[i+1].getY();
        _area += (x1*y2 - y1*x2);
        std::cout << "S: " << (x1*y2) << "S2: " << (-y1 * x2) << std::endl;
    }
    x1 = points[nPoints-1].getX();
    y1 = points[nPoints-1].getY();
    x2 = points[0].getX();
    y2 = points[0].getY();
        std::cout << "S: " << (x1*y2) << "S2: " << (-y1 * x2) << std::endl;
    _area += (x1*y2 - y1*x2);
    _area /= 2;
    if(_area < 0){
        _area *= -1;
    }
    return _area;
}
