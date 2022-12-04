public class Main {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime(20,30,59);
        System.out.println(t.exibe());
        Time t2 = new Time();
        System.out.println(t2.exibe());
    }
}