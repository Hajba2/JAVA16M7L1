public class Main {
    public static void main(String[] args) {
        Line line = new Line(0, 0, 2, 3);
        System.out.println("line.toString() = " + line.toString());

        line.setY2(-3);
        System.out.println("line.toString() = " + line.toString());

        Planet earth1 = new Planet("Earth1");
        MutablePoint pStart = new MutablePoint(1, 2, earth1);
        MutablePoint pEnd = new MutablePoint(3, 4, new Planet("Earth2"));

        ImmutableLine immutableLine = new ImmutableLine(pStart, pEnd, "timeLine", 1);
        System.out.println("immutableLine.getLineLength() = " + immutableLine.getLineLength());

        pEnd.setY(99);
        System.out.println("immutableLine.getLineLength() = " + immutableLine.getLineLength());

        MutablePoint endPointGeter = immutableLine.getpEnd();
        endPointGeter.setX(99);
        System.out.println("immutableLine.getLineLength() = " + immutableLine.getLineLength());
        System.out.println("immutableLine = " + immutableLine);

        earth1.setName("earth3");
        System.out.println("immutableLine = " + immutableLine);
    }
}