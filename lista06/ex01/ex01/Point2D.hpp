#ifndef POINT2D_HPP
#define POINT2D_HPP

class Point2D{
    protected:
        float x;
        float y;

    public:
        auto getX() -> float;

        auto getY() -> float;

        Point2D(float xcoord, float ycoord) : x {xcoord}, y {ycoord} {};
};

#endif /* POINT2D_HPP */

