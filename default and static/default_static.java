interface A{

    default void show(){
        System.out.println("Default");
    }
    
    static void display(){
        System.out.println("Static");
    }
    
    }
    
    class Matrix implements A{
    
    }
    
    class default_static{
    
    public static void main(String args[]){
    
    Matrix obj=new Matrix();
    
    obj.show();

    // obj.display()  // it will give error
    
    A.display(); 
    
    }
    
}