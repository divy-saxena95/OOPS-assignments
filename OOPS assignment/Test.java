//inheritance of multiple interfaces
interface pet1
{

    public abstract void pet1();
}

interface pet2
{
    public abstract void pet2();
}

class Test implements pet1,pet2
{
    public void pet1() 
    {
        System.out.println("this is method of pet1 interface");

    }

    public void pet2() {
        System.out.println("this is method of pet2 interface");

    }   
    public static void main(String a[])
{
        pet1 obj1=new Test();

        pet2 obj2=new Test(); 

        obj1.pet1();

        obj2.pet2();
    }       
}
