import java.io.*;

public class Driver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cube c = new Cube();
        Cuboid cd = new Cuboid();
        Sphere s = new Sphere();
        Cylinder cr = new Cylinder();

        System.out.println("1. Cube"); 
        System.out.println("2. Cuboid");
        System.out.println("3. Sphere");
        System.out.println("4. Cylinder");

        System.out.println("enter your choice:"); 
        int a = Integer.parseInt(br.readLine());

        switch (a) 
        {
            case 1:

                System.out.println("Enter value for side:");
                Float side = Float.parseFloat(br.readLine());

                System.out.println("The surface area for cube is=" + c.surfaceArea(side));
                System.out.println("The volume of cube=" + c.volume(side));
                break;

            case 2:
                System.out.println("Enter value of length:");
                float length = Float.parseFloat(br.readLine());

                System.out.println("Enter value of breadth");
                Float breadth = Float.parseFloat(br.readLine());

                System.out.println("Enter value of height:");
                Float height = Float.parseFloat(br.readLine());

                System.out.println("Surface area of cuboid is=" + cd.surfaceArea(length, breadth, height));

                System.out.println("volume of cuboid is=" + cd.volume(length, breadth, height));
                break;

            case 3:

                System.out.println("Enter value for radius:");
                Float radius = Float.parseFloat(br.readLine());

                System.out.println("The surface area for Sphere is=" + s.surfaceArea(radius));
                System.out.println("The volume of Sphere=" + s.volume(radius));
                break;

            case 4:

                System.out.println("Enter value for radius:");
                float radius1 = Float.parseFloat(br.readLine());

                System.out.println("Enter value for height:");
                float height1 = Float.parseFloat(br.readLine());

                System.out.println("The surface area for Sphere is=" + cr.surfaceArea(radius1, height1));
                System.out.println("The volume of Sphere=" + cr.volume(radius1, height1));
                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("Invalid Entry!");
        }
    }
}

class Cube {
    public float surfaceArea(float side) 
    {
        return 6 * side * side;
    }

    public float volume(float side) 
    {
        return (side * side * side);
    }
}

class Cuboid {
    public float surfaceArea(float length, float breadth, float height) {
        return (2 * ((length * breadth) + (breadth * height) + (height * length)));
    }

    public float volume(float length, float breadth, float height) {
        return (length * breadth * height);
    }
}

class Cylinder {
    public float surfaceArea(float radius, float height) {
        return (2 * 22 / 7 * radius * height);
    }

    public float volume(float radius, float height) {
        return (22 / 7 * radius * radius * height);
    }
}

class Sphere {
    public float surfaceArea(float radius) {
        return 4 / 3 * 22 / 7 * radius * radius;
    }

    public float volume(float radius) {
        return (4 / 3 * 22 / 7 * radius * radius * radius);
    }
}
