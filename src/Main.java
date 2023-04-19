import model.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle newRectangle = new Rectangle(4,5);
        //a.b.
        System.out.println("\nRectangle successfully created. Width : "+newRectangle.getWidth() + ", height : " + newRectangle.getHeight());
        //c.
        System.out.println("Area of the rectangle : " +newRectangle.getArea());
        System.out.println("Perimeter of the rectangle : " +newRectangle.getPerimeter());
        //d.
        newRectangle.setHeight(20);
        newRectangle.setWidth(15);
        System.out.println("\nNew Width : "+newRectangle.getWidth() + ", height : " + newRectangle.getHeight());
        //e.
        System.out.println("New Area of the rectangle : " +newRectangle.getArea());
        System.out.println("New Perimeter of the rectangle : " +newRectangle.getPerimeter());
        //f.
        Rectangle anotherRectangle = new Rectangle();
        System.out.println("\nAnother rectangle successfully created. Width : "+anotherRectangle.getWidth() + ", height : " + anotherRectangle.getHeight());



    }
}