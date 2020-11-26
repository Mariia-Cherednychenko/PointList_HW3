package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Arrays;

public class PointList {
    Point[] points = new Point[0];

    public void add(Point p) {
        /*Point[] buffer = new Point[points.length+1];
        for (int i=0; i<points.length; i++){
            buffer [i]=points [i];
        }
        points=buffer;
        buffer[buffer.length-1]=p;*/
        points = Arrays.copyOf(points, points.length + 1);
        points[points.length - 1] = p;
    }

    public Point get(int i) {
        checkExistIndex(i);
        return points[i];
    }

    public void set(int i, Point p) {
        checkExistIndex(i);
        this.points[i] = p;
    }

    public void remove(int index) {

        checkExistIndex(index);

        Point[] buffer = new Point[points.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }
        points = buffer;
    }

    private void checkExistIndex(int index) {
        if (index >= points.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
    public int size(){
        return this.points.length;
    }
}
