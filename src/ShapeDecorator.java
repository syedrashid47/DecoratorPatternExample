public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

     public ShapeDecorator(Shape decorationRequest){
         this.decoratedShape =decorationRequest;
     }

    @Override
    public void Draw() {
        decoratedShape.Draw();
    }
}
