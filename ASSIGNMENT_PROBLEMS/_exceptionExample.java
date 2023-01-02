class _exceptionExample{
    public static void main(String[] args){
        int a=6,b=0,c;
        
        try{
        c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("b value =0");
        }
        finally
        {
            System.out.println("program is over");
        }

    }
}