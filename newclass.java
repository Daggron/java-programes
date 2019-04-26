
class box{
    int height;
    int breadth;
    void get_area(int height, int breadth){
        this.height=height;
        this.breadth=breadth;
    }
    void showarea(){
        System.out.println("The area of the box is "+(height*breadth));
    }
}

public  class newclass {
    public static void main(String[] args){
        box b = new box();
        b.get_area(5,6);
        b.showarea();

    }

}
