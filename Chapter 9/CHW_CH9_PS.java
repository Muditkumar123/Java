
class Cylinder{
   private double radius;
   private double height;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}




public class CHW_CH9_PS {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.setHeight(13);
        cy.setRadius(13);
        double height=cy.getHeight();
        double radius=cy.getRadius();
      double volume=3.14*radius*radius*height;
      double area=(2*3.14*radius)*(radius+height);
        System.out.println(volume);
        System.out.println(area);


    }
}
