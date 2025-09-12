public class string_builder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello World!");
        System.out.println("sb1: " + sb1);

        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("This has initial capacity 50");
        System.out.println("sb2: " + sb2);

        StringBuilder sb3 = new StringBuilder("Testing ");
        sb3.append("StringBuilder");
        System.out.println("sb3: " + sb3);

        CharSequence cs = "Java";
        StringBuilder sb4 = new StringBuilder(cs);
        sb4.append("Programming");
        System.out.println("sb4: " + sb4);
    }
}