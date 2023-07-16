class Relational{
    public static void main(String args[]){
        int w= 10;
        int x= 9;
        int y= 10;
        int z= 11;

            boolean r1= w < x;
            boolean r2= w > x;
            boolean r3= w <= x;
            boolean r4= w >= x;
            boolean r5= w == x;
            boolean r6= w != x;

            boolean r7= w == y;
            boolean r8= w != y;

            System.out.println("result :"+r1);
            System.out.println("result :"+r2);
            System.out.println("result :"+r3);
            System.out.println("result :"+r4);
            System.out.println("result :"+r5);
            System.out.println("result :"+r6); 
            
            System.out.println("result :"+r7);
            System.out.println("result :"+r8);
    }
}