public class CHW_CH_14_Try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        // With try
        try{
            int c=a/b;
            System.out.println("Result:"+c);
        }catch (Exception e){
            System.out.println("We failed to divide . Reason:"+e);
        }


    }
}
