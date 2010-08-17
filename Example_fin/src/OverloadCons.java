/**
 *  Just for fun
 * 
 */
class Box8  {
    double width;
    double height;
    double depth;

    Box8(double w, double h, double d)  {
        width = w;
        height = h;
        depth = d;
    }

    Box8()  {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box8(double len)  {
        width = height = depth = len;
    }

    double volume()  {
        return width * height * depth;
    }
}
class OverloadCons {
    public static void main(String args[])  {
        Box8 mybox1 = new Box8(10,20,15);
        Box8 mybox2 = new Box8();
        Box8 mycube = new Box8(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
