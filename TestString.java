public class TestString {
    public static void main(String[] args){
String s1 = new String("test");
String s2 = "test";
String s3 = String.valueOf("test");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s2==s3);
String s4 = new String("test");
String s5 = "test";
String s6 = String.valueOf("test");
System.out.println(s1==s4);
System.out.println(s2==s5);
System.out.println(s3==s6);
}
}
