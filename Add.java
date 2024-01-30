


class A{
    public int add(int n1, int n2){

        return n1+n2;
    }
}
class B extends A{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
    public int add(int n1, int n2, int n3){

        return n1+n2+2;
    }
}

public class Add
{
    public static void main (String a[]){

        B obj=new B();
        int result=obj.add(2,7, 9);
        System.out.println(result);
    }
}