package static_keyword;

// Demonstrate static variables, methods, and blocks.
class stat {
    static int a = 3;
    static int b;
    static void meth(int x) {
    System.out.println("x = " + x);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    }
    
    static{
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    {
        System.out.println("Non Static block initialized.");
        b = b * 4;
    }
}

class static_use{
    public static void main(String args[]) {
        // stat ref=new stat();
        stat.meth(10);
    }
}         