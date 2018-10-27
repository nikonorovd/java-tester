package ru.neolant.sandbox;

public class Point {
    public double x;
    public double y;
    public double x1;
    public double y1;

    public Point(double p1, double p2) {
        this.x = p1;
        this.y = p1;
        this.x1 = p2;
        this.y1 = p2;
    }

        public double area() {
            return Math.sqrt((this.x-this.x)-(2*this.x1-this.x)+(this.x*this.x)+(this.y1*this.y1)-(2*this.y1-this.y)+(this.y*this.y));

    }
}
//    public double distance(double){
//        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
//

//    }
//}
//((p2.x-p1.x)*(p2.x-p1.x)+this(p2.y-p1.y)*(p2.y-p1.y));