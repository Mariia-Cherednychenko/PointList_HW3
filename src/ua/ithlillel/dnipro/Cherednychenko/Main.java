package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        PointList pointList = new PointList();
        for (int i=0; i<10; i++){
            pointList.add(new Point((int) (Math.random()*100), (int) (Math.random()*100)));
        }

        for (int i = 0; i < pointList.size; i++) {
            System.out.println(pointList.get(i));
        }

        pointList.remove(0);
        pointList.remove(0);
        pointList.remove(0);
        pointList.remove(0);
        pointList.remove(0);
        pointList.remove(0);


    }
}
