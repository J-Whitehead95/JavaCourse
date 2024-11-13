package Chapter6;

public class Rectangle {
   private double Length;
   private double Width;

    public Rectangle(){
        Length = 0;
        Width = 0;
    }
    public Rectangle(double Length, double Width){
        setLength(Length);
        setWidth(Width);

    }

   public double getLength(){
        return Length;
    }
   public void setLength(double Length){
        this.Length = Length;
    }
    public double getWidth(){
        return Width;
    }
    public void setWidth(double Width){
        this.Width = Width;
    }

    public double CalculatePerimeter(){
        return (2 * Length) + (2 * Width);




    }
    public double CalculateArea(){
        return (Length * Width);


    }
}
