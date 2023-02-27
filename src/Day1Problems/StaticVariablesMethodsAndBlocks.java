package Day1Problems;

public class StaticVariablesMethodsAndBlocks {
    static int x=10;
    static int y;
    static void function(int z){
        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("z= " +z);
    }
    static{
        System.out.println("Running static initialization block.");
        y=x+5;
    }
    public static void main(String[] args){
        function(8);
    }
}
