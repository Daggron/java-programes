
 class asliroom{
    int width;
    int height;

    public asliroom(int width,int height){
        this.width=width;
        this.height=height;

    }
    public final double area(){
        return (height*width);
    }
}
 class livingroom extends asliroom{

    public livingroom(int height,int width){
        super(width,height);
    }
 }
public class room{
   public static void main(String[] args){

     livingroom lv = new livingroom(3,5);
     double area = lv.area();
     System.out.println("The area of the room is "+area);

   }
}
