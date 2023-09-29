public class Planet {
    // instance variables
    public double xxPos; // current x position
    public double yyPos; // current y position
    public double xxVel; // current velocity in the x direction
    public double yyVel; // current velocity in the y direction
    public double mass; // mass
    public String imgFileName; // name of the file that corresponds to the image that depicts the planet

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
}
