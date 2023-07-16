class Logical{
    public static void main(String args[]){
        int w= 10;
        int x= 9;
        int y= 10;
        int z= 11;

        boolean r1= w > x && w == y;
        boolean r2= w > x && w > y;

        boolean r3= w > x || w == y;
        boolean r4= w > x || w > y;

        boolean r5= w > x ;
        boolean r6= w < x ;

        System.out.println("result :"+r1);
        System.out.println("result :"+r2);
        System.out.println("result :"+r3);
        System.out.println("result :"+r4);
        System.out.println("result :"+!r5);
        System.out.println("result :"+!r6);
    }
}