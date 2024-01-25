public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(10, 5);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(10, 5);

        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}