public class Main {
    public static void main(String[] args) {
        Lambda lambda= l-> (l%2!=0) ? l+1:l+2 ;
        System.out.println(lambda.nextEven(1000000009));
    }
}
