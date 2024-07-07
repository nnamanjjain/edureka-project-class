import java.util.Scanner;

class AreaPerimeter {
    float length, width, radius;
    double area, perimeter;
    public double areaOfQuad(float l, float b){
        length=l;
        width=b;
        area=length*width;
        return area;
    }
    public double perimeterOfQuad(float l, float b){
        length=l;
        width=b;
        perimeter=2*(length+width);
        return perimeter;
    }
    public double perimeterOfCircle(float r){
        radius=r;
        perimeter=2*(Math.PI)*radius;  // use of Math.PI
        return perimeter;
    }
    public double areaOfCircle(float r){
        radius=r;
        area=(Math.PI)*radius*radius;  // use of Math.PI
        return area;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Area and Perimeter of Symmetrical Figures\n");
        System.out.print("Please Enter the figure: ");
        String str=input.next();
        if(str.equalsIgnoreCase("rectangle")
                ||str.equalsIgnoreCase("square")
                ||str.equalsIgnoreCase("quadrilateral")){
            AreaPerimeter obj1=new AreaPerimeter();
            System.out.print("Please enter the Length: ");
            obj1.length=input.nextFloat();
            System.out.print("Please enter the Breadth: ");
            obj1.width=input.nextFloat();
            System.out.println("The Perimeter of "+str+" is: "+obj1.perimeterOfQuad(obj1.length, obj1.width));
            System.out.println("The Area of "+str+" is: "+obj1.areaOfQuad(obj1.length, obj1.width));
        }else if(str.equalsIgnoreCase("circle")){
            AreaPerimeter obj2=new AreaPerimeter();
            System.out.print("Please enter the Radius: ");
            obj2.radius=input.nextFloat();
            System.out.println("The Circumference of Circle is: "+obj2.perimeterOfCircle(obj2.radius));
            System.out.println("The Area of Circle is: "+obj2.areaOfCircle(obj2.radius));
        }else{
            System.out.println("Please Enter the correct Choice from below:\n" +
                    "Enter either Quadrilateral, Rectangle, Square or Circle.");
        }
        System.out.println("\nThanks for Playing...");
    }

}
