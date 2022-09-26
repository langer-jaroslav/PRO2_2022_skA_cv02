package models;

public class ExampleClass {
    public int x = 10;
    private int y = 15;
    protected float f1 = 10f;

    public void publicMethod(){
        privateMethod();
        protectedMethod();
    }
    private void privateMethod(){

    }
    protected void protectedMethod(){

    }

    public class InnerClass{
        public static final int x = 16;
    }
}
