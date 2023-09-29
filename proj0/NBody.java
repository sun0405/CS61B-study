public class NBody {
    public static double readRadius(String filename) {
        In in = new In(filename);
        int N = in.readInt();
        double R = in.readDouble();
        return R;
    }

    public static Planet[] readPlanets(String filename) {
        In in = new In(filename);
        int N = in.readInt();
        double R = in.readDouble();
        Planet[] allPlanets = new Planet[N];
        for (int i = 0; i < N; i++) {
            allPlanets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
        }
        return allPlanets;
    }

    public static void main(String[] args)  {
        // first: Collecting All Needed Input
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double R = readRadius(filename);
        Planet[] allPlanets = readPlanets(filename);
        
        // second: Drawing the Background
        StdDraw.setScale(-R, R);
        StdDraw.clear();
        StdDraw.picture(0, 0, "images/starfield.jpg");
        StdDraw.show();

        // third: Drawing More than One Planet
        for (Planet p : allPlanets) {
            p.draw();
        } 

        // fourth: Creating an Animation
        StdDraw.enableDoubleBuffering();
        double t = 0;
        while (t < T) {
            double[] xForces = new double[allPlanets.length];
            double[] yForces = new double[allPlanets.length];
            for (int i = 0; i < allPlanets.length; i++) {
                xForces[i] = allPlanets[i].calcNetForceExertedByX(allPlanets);
                yForces[i] = allPlanets[i].calcNetForceExertedByY(allPlanets);
                allPlanets[i].update(dt, xForces[i], yForces[i]);
            }
            StdDraw.picture(0, 0, "images/starfield.jpg");
            for (Planet p : allPlanets) {
                p.draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
            t += dt;
        }

        // fifth: Printing the Universe
        StdOut.printf("%d\n", allPlanets.length);
        StdOut.printf("%.2e\n", R);
        for (Planet p : allPlanets) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n", p.xxPos, p.yyPos, p.xxVel, p.yyVel, p.mass, p.imgFileName);
        }


    }


}