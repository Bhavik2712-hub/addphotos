public class Cal{
    add(int a,int b){
        int x;
        System.out.println(a+b);
    }
}
class Hello{
    public static void main(String[] args) {
        Cal c =new Cal();
        c.add(2,3);
    }
}