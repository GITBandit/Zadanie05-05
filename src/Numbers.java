public class Numbers {
    public static void main(String[] args) {

        int x = 0;

        for (int i = 0; i<=100 ; i++){
            if (i%2==0){
                System.out.print(i + " ");
                x += i;
            }
        }
        System.out.println("Suma to : " + x);
    }
}
