package ObjectOrientedJava.overridingEX;

public class main {
    public static void main(String[] args) {
        parent parent = new parent();
        parent.career();
        son son = new son();
        son.career();
        parent parent1 = new son();
        parent1.career();
    }
}
