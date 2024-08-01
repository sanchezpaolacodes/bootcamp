public class Debbuging {
    public static void main(String[] args) {
        System.out.println("iniciou o programa no main");
        a();
        System.out.println("terminou o programa no main");
    }
    public static void a(){
        System.out.println("entrou no metodo a");
        b();
        System.out.println("saiu do metodo a");
    }
    public static void b(){
        System.out.println("entrou no metodo b");
        for(int i = 0; i<=5; i++)
            System.out.println(i);;
        c();
        System.out.println("saiu do metodo b");
    }
    public static void c(){
        System.out.println("entrou no metodo c");
        Thread.dumpStack();
        System.out.println("saiu do metodo c");
    }

}
