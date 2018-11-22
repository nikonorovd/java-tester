package ru.neolant.sandbox;

import org.testng.Assert;

public class PointTest {

    public void testDistance(){
        Point p1 = new Point(9,5);
        Point p2 = new Point(2,4);
        double area = Math.sqrt((p2.x-p1.x)-(2*p2.x*p1.x)+(p1.x*p1.x)+(p1.y*p1.y)-(2*p1.y-p1.y)+(p1.y*p1.y));
        Assert.assertEquals (p1.distance(p1),p2.distance(p2),12.529964086141668);
    }
}
