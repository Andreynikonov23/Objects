package nick.pack;

public class Rectangle {
    public int width;
    public int height;
    public int left;
    public int top;



    public Rectangle(int left, int top, int width, int height) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }
    public Rectangle (int left, int top){
        this.left = left;
        this.top = top;
    }
    public Rectangle (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}
