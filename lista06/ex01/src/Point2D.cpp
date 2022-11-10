#include <iostream>

#include "Point2D"

class Point2D
{    
    Point2D(int xcoord, int ycoord){
        x = xcoord;
        y = ycoord;
    };
    float getX(){
        return x;
    };
    float getY(){
        return y;
    };
    void setX(float xc){
        x = xc;
    };
    void setY(float yc){
        y = yc;
    };
};
