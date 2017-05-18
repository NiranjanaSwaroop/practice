public class SysPropDemo{
     public static void main(String[] args) {
     
        String property = System.getProperty(args[0]);
        System.out.println(property);
    }
}