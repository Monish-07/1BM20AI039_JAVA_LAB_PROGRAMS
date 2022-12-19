package gcd;
public class GCD
{

public static double logic(double x,double y){
    double gcd=1;
for(int i = 1; i <= x && i <= y; i++)  
{   
if(x%i==0 && y%i==0)   
gcd = i;  
}  
return gcd;
}
}