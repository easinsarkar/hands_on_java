public class Main {
    public static void main(String[] args){
        String string = "easinali";


        System.out.println(string.length());
        System.out.println(string.charAt(4));
        System.out.println(string.indexOf('a'));
        System.out.println(string.lastIndexOf('a',2));
        System.out.println(string.isBlank());
        System.out.println(string.isEmpty());
        System.out.println("comparison");
        System.out.println(string.contentEquals("easin"));
        System.out.println(string.equals("Easinali"));
        System.out.println(string.equalsIgnoreCase("EasInali"));
        System.out.println(string.contains("ina"));
        System.out.println(string.endsWith("e"));
        System.out.println(string.startsWith("eas"));
//        System.out.println(string.regionMatches());


    }
}
