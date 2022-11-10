#ifndef POINT2D_H_
#define POINT2D_H_

class Point2D{
    protected:
        float x;
        float y;

    public:
        auto getX() -> float;

        auto getY() -> float;

        auto setX(float xc);

        auto setY(float yc);

        Point2D(int xcoord, int ycoord) : x {xcoord}, y {ycoord} {};
}

#endif // POINT2D_H_