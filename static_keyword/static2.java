package static_keyword;

public class static2{ 

    static{
        int y=2;
        System.out.println("y="+y);
    }

    {
    System.out.println("ggjh");
    }

    static int x;

    public static void main(String args[]){
        x--;
        System.out.println("X="+x);
        static2 obj=new static2();
        obj.meth();
    }
        
    static2(){
        System.out.println("Within constructor");
    }

    void meth(){
        int b=5;
    } 
    
}   