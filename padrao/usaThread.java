package padrao;

public class usaThread {
    public static void main(String[] args) {
    minhaThread t = new minhaThread();
    t.start();
    for (int i = 0 ; i<=10;i++){
        System.out.println("lion");
    }
    }
}
