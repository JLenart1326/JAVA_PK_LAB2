package mainapp;

public class Main {
    public static void main(String[] args) {
        Color color_1 = new Color();
        Color color_2 = new Color(145,255,15);
        Color color_3 = new Color(255,234,25,143);
        //Color color_4 = new Color(453,-14,-34,777);

        color_1.print();
        color_2.print();
        color_3.print();

        System.out.println(color_1.toString());
    }
}