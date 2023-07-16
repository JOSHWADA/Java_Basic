class Conversion{

    public static void main(String args[]){

        //type cast

        byte a= 127;
        int b= a;


        int c=12;
        byte d=(byte)c;

        int e=257;
        byte f=(byte)e;

        float g=5.6f;
        int h=(int)g;
 //type promotion
          byte num1= 10;
          byte num2= 30;

          int result= num1*num2;

        System.out.println(a);
        System.out.println(d);
          System.out.println(f);
          System.out.println(h);
            System.out.println(result);

    }

}