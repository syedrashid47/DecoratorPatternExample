public class Main {

    public static void main(String[] args) {
	// write your code here




        Shape myCircle01= new Circle();


        myCircle01.Draw();


        myCircle01= new RedShapeDecorator(myCircle01);


        myCircle01.Draw();

    }
}
