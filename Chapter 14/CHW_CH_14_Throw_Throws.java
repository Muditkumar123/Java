class NegativeRadius extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class CHW_CH_14_Throw_Throws {
   public static double area(int r) throws NegativeRadius{
       if (r<0){
          throw new NegativeRadius();
       }

       double result =Math.PI*r*r;
       return result;
   }

    public static int divide(int a,int b)throws ArithmeticException {
     int result = a/b;
        return  result;
    }
    public static void main(String[] args) {
//   try{
//       int c=divide(6,0);
//       System.out.println(c);
//   }catch (Exception e){
//       System.out.println("Exception  ");
//   }
        try {
            double ar=area(-6);
            System.out.println(ar);
        } catch (NegativeRadius negativeRadius) {
            negativeRadius.printStackTrace();
        }


    }
}
