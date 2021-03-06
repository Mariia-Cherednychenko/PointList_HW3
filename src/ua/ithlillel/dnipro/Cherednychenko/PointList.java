package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Arrays;

public class PointList {

    final double RATE = 1.5;
    int limitSize = 4;
    Point[] points = new Point[limitSize];
    int size = 0;


    public int getLimitLength() {
        return limitSize;
    }

    public void add(Point p) {
        checkLengthLimit();
        points[size] = p;
        size++;


    }

    private void checkLengthLimit() {
        if (size == limitSize) {
            limitSize = (int) Math.ceil(limitSize * RATE);
            points = Arrays.copyOf(points, limitSize);
        }
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

        if (points.length-size >= points.length/2) {
            Point[] buffer = new Point[(int) ((size-1)*RATE)];
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = points[i < index ? i : i + 1];
            }
            points = buffer;


        } else {
            for (int i = index; i < size; i++) {
                points[i] = points[i + 1];
            }


        }
        size--;

    }

    private void checkExistIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

}
