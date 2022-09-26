import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.MemoryDataSaver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int x = 10;
        final double pi = 3.14;

        ExampleClass exCls = new ExampleClass();
        System.out.println(exCls.x);
        exCls.publicMethod();

        System.out.println(MyMathClass.pi);

        System.out.println(MyMathClass.sum(5, 8));

        //MyMathClass aa = new MyMathClass();

        System.out.println(ExampleClass.InnerClass.x);

        Box<ExampleClass> box = new Box<>(exCls);

        Box<String> boxString = new Box<>("Ahoj");
        Box<Integer> boxInteger = new Box<>(15);

        Pair<Integer, String> myPair = new Pair<>(1, "Praha");
        Pair<Integer, String> myPair2 = new Pair<>(2, "Hradec K.");

        Car car1 = new Car("Skoda", "Fabia");

        boolean condToFile = false;

        DataSaver<Integer> mySaver;
        if(condToFile){
            mySaver = new FileDataSaver<>();
        }
        else{
            mySaver = new MemoryDataSaver<>();
        }
        mySaver.save(20);
        System.out.println(mySaver.load());

        mySaver = new FileDataSaver<>();
        mySaver.save(30);

        printStar(5);

        try{
            System.out.println("Saving");
            throw new Exception("File is locked");
        }
        catch (NullPointerException e){

        }
        catch (Exception e){
            System.out.println("Soubor je uzamčen, opakujte");
        }


    }

    private static void printStar(int x){
        if(x<1)
            return;
        System.out.println("*");
        x = x-1;
        printStar(x);
    }
}