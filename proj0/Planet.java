public class Planet {
    // instance variables
    public double xxPos; // current x position
    public double yyPos; // current y position
    public double xxVel; // current velocity in the x direction
    public double yyVel; // current velocity in the y direction
    public double mass; // mass
    public String imgFileName; // name of the file that corresponds to the image that depicts the plane
    private static double G = 6.67e-11;

    // first constructor
    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img) {
        // initialize instance variables
        xxPos = xP; // current x position
        yyPos = yP; // current y position
        xxVel = xV; // current velocity in the x direction
        yyVel = yV; // current velocity in the y direction
        mass = m; // mass
        imgFileName = img; // name of the file that corresponds to the image that depicts the planet
    }

    // second constructor, copy from another planet
    public Planet(Planet p) {
        // initialize instance variables
        xxPos = p.xxPos; // current x position
        yyPos = p.yyPos; // current y position
        xxVel = p.xxVel; // current velocity in the x direction
        yyVel = p.yyVel; // current velocity in the y direction
        mass = p.mass; // mass
        imgFileName = p.imgFileName; // name of the file that corresponds to the image that depicts the planet
    }
    // 求距离
    public double calcDistance(Planet P) {
        double dx = P.xxPos - xxPos;
        double dy = P.yyPos - yyPos;
        double r = Math.sqrt(dx * dx + dy * dy);
        return r;
    }

    // calculate the Force
    public double calcForceExertedBy(Planet P) {
        double r = this.calcDistance(P);
        double F = G * this.mass * P.mass / (r * r);
        return F;
    }

    // calculate the Force in x direction
    public double calcForceExertedByX(Planet P) {
        double F = this.calcForceExertedBy(P);
        double r = this.calcDistance(P);
        double dx = P.xxPos - xxPos;
        double Fx = F * dx / r;
        return Fx;
    }

    // calculate the Force in y direction
    public double calcForceExertedByY(Planet P) {
        double F = this.calcForceExertedBy(P);
        double r = this.calcDistance(P);
        double dy = P.yyPos - yyPos;
        double Fy = F * dy / r;
        return Fy;
    }

    // calculate the net Force in x direction
    public double calcNetForceExertedByX(Planet[] allPlanets) {
        double Fx = 0;
        for (Planet P : allPlanets) {
            if (this.equals(P)) {
                continue;
            }
            Fx += this.calcForceExertedByX(P);
        }
        return Fx;
    }

    // calculate the net Force in y direction
    public double calcNetForceExertedByY(Planet[] allPlanets) {
        double Fy = 0;
        for (Planet P : allPlanets) {
            if (this.equals(P)) {
                continue;
            }
            Fy += this.calcForceExertedByY(P);
        }
        return Fy;
    }

    // update the position and velocity
    public void update(double dt, double Fx, double Fy) {
        double ax = Fx / this.mass;
        double ay = Fy / this.mass;
        this.xxVel += ax * dt;
        this.yyVel += ay * dt;
        this.xxPos += this.xxVel * dt;
        this.yyPos += this.yyVel * dt;
    }

    // draw the planet
    public void draw() {
        StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
    }


}
