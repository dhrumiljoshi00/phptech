public class PrintIntegerCharacter {
    public void print(int n, char c) {
        System.out.println("Integer followed by character: " + n + ", " + c);
    }

    public void print(char c, int n) {
        System.out.println("Character followed by integer: " + c + ", " + n);
    }

    public static void main(String[] args) {
        PrintIntegerCharacter printer = new PrintIntegerCharacter();

        printer.print(10, 'A');

        printer.print('B', 20);
    }
}
