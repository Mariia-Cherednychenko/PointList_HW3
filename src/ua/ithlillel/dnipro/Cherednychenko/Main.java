package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {
        // write your code here

        PointList pointList = new PointList();
        pointList.add(new Point(1, 5));
        pointList.add(new Point(2, 6));
        pointList.add(new Point(3, 7));

        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(pointList.get(i));
        }

        System.out.println("abc".hashCode());
        System.out.println("abc".hashCode());

    }
}
