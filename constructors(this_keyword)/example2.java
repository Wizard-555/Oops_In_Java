package constructors;

class A{
    int a,b;
    A(){
        System.out.println("Default");
    }

    A(int x, int y){
        this();               //it calls the default constructor
        System.out.println("param");
        a=x;b=y;
    }

    A(int x){
        this(x,x);        
        System.out.println("one param");
        a=b=x;
    } 
}

class example2{
    public static void main(String args[]){
        A obj=new A();
        A obj2=new A(1,2);
        A obj3=new A(10);
    } 
}
            