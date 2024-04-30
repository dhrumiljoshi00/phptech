public class PrintNumber {
    public void printn(int num) {
        System.out.println("Integer: " + num);
    }

    public void printn(double num) {
        System.out.println("Double: " + num);
    }

   public void printn(float num) {
        System.out.println("Float: " + num);
    }

    public void printn(long num) {
        System.out.println("Long: " + num);
    }

    public void printn(byte num) {
        System.out.println("Byte: " + num);
    }

    public void printn(short num) {
        System.out.println("Short: " + num);
    }

    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();
        
        printer.printn(10);
        printer.printn(3.14);
        printer.printn(5.67f);
        printer.printn(1234567890123456789L);
        printer.printn((byte) 5);
        printer.printn((short) 1000);
    }
}
