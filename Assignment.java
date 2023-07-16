class Assignment{
    public static void main(String args[]){

        int num1= 25;
        int num2= 7;

        int num= 5;
        int num3= 5;

        int r1= num1 + num2 ;
        int r2= num1 - num2 ;
        int r3= num1 * num2 ;
        int r4= num1 / num2 ;
        int r5= num1 % num2 ;

        num1 = num1+3;

        num2 += 2;

        //num++; Post increment
        //++num; Pre increment

        int result1=num++;
         int result2=++num3;
        

        System.out.println("addition        "+r1);
        System.out.println("subtraction     "+r2);
        System.out.println("multiplication  "+r3);
        System.out.println("division        "+r4);
        System.out.println("modulus         "+r5);
        System.out.println("increment       "+num1);
        System.out.println("increment       "+num2);
        System.out.println("increment       "+result1);
        System.out.println("increment       "+result2);
        

    }

}