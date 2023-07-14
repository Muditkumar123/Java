
interface sample1{
    void meth1();
    void  meth2();
}

interface childesample extends sample1{
    void meth3();
    void meth4();
}

class MySampleClass implements childesample{

    @Override
    public void meth1() {
        System.out.println("Meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth 3");
    }

    @Override
    public void meth4() {
        System.out.println(" Meth 4");
    }
}




public class CHW_CH_11_Inheritance_Interfaces {
    public static void main(String[] args) {
    MySampleClass s=new MySampleClass();
    s.meth4();
    s.meth1();
    s.meth2();
    s.meth3();


    }

}
