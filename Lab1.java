import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Point3d Cor1, Cor2, Cor3; // создание объектов класса Point3d
        Scanner Scan = new Scanner(System.in);// ввод с клавы коки

        // ввод координат каждой точки
        double x, y, z;
        double x1, y1, z1;
        double x2, y2, z2;
        x = Scan.nextDouble();
        y = Scan.nextDouble();
        z = Scan.nextDouble();
        Cor1 = new Point3d(x, y, z);

        x1 = Scan.nextDouble();
        y1 = Scan.nextDouble();
        z1 = Scan.nextDouble();
        Cor2 = new Point3d(x1, y1, z1);

        x2 = Scan.nextDouble();
        y2 = Scan.nextDouble();
        z2 = Scan.nextDouble();
        Cor3= new Point3d(x2, y2, z2);

        if ((x==x1 && y==y1 && z==z1) || (x==x2 && y==y2 && z==z2)) {
            System.out.println("Одна из точек равна другой, измените начальные значения");
        }
        else {
            System.out.println(computeArea(Cor1, Cor2, Cor3));
        }
    }
    public static double computeArea(Point3d Cor1, Point3d Cor2, Point3d Cor3){
        double Dist1 = Cor1.distanceTo(Cor2);
        double Dist2 = Cor2.distanceTo(Cor3);
        double Dist3 = Cor3.distanceTo(Cor1);
        double PolyPerim = (Dist1 + Dist2 + Dist3) / 2;
        double Geron = Math.sqrt(PolyPerim * (PolyPerim - Dist1)* (PolyPerim - Dist2)* (PolyPerim - Dist3));

        return Geron;
    }



}
