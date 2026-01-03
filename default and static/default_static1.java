interface A{

    default void show(){System.out.println("Default");}
    
    static void display(){System.out.println("Static");}
    
    }
    
    class Matrix implements A{
    
    public void show(){System.out.println("Sub_default");}
    
    }
    
    class default_static1{
    
    public static void main(String args[]){
    
    Matrix obj=new Matrix();
    
    obj.show();
    
    //obj.display() will give error 
    
    A.display(); 
    
    
    }
    
    }