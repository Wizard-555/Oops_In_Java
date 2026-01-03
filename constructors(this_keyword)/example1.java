package constructors;

class A{

    int a,b;

    A() {
    System.out.println("Default");
    }

    A(int x, int y) 
    {
    System.out.println("param");
    a=x;b=y;
    }

    A(int x) {
    System.out.println("one param");
    a=b=x;
    }   
}

class example1{
        public static void main(String args[]){
        A obj=new A();
        A obj2=new A(1,2);
        A obj3=new A(10);
        }
}  