#include <cstdlib>

#include "Point2D.hpp"
#include "Polygon.hpp"
#include "Square.hpp"
#include "Triangle.hpp"
#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    Point2D A = Point2D(0,0);
    Point2D B = Point2D(0,2);
    Point2D C = Point2D(4,0);
    Point2D D = Point2D(0,4);
    Point2D E = Point2D(4,4);
    Point2D F = Point2D(10,0);
    Point2D G = Point2D(8,2);
    Point2D H = Point2D(8,4);
    Point2D I = Point2D(10,6);
    Point2D J = Point2D(12,6);
    Point2D K = Point2D(14,4);
    Point2D L = Point2D(14,2);
    Point2D M = Point2D(12,0);
    
    Point2D octagonPoints[8] = {F,M,L,K,J,I,H,G};
    Polygon octagon = Polygon(octagonPoints, 8);
    std::cout << "Area do octagono: " << octagon.area() << "u²" << std::endl; 
    
    Point2D trianglePoints[3] = {A, B, C};
    Triangle triangle = Triangle(trianglePoints, 8, 2, 4);
    std::cout << "Area do triângulo: " << triangle.area() << "u²" << std::endl; 
    
    Point2D squarePoints[4] = {A, D, E, C};
    Square square = Square(squarePoints, 8, 4);
    std::cout << "Area do quadrado: " << square.area() << "u²" << std::endl; 
    return 0;
}

