public class Main {
    public static void main(String[] args) {
        EstonianID est = new EstonianID("50005215230");
        FinnishID fin = new FinnishID("100190-003K");

        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());

        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getAge());

    }
}
