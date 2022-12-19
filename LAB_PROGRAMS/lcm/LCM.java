package lcm;
import gcd.GCD;

public class LCM
{
public static double logic(double x, double y){
double lcm;
lcm=(x*y)/GCD.logic(x,y);
return lcm;
}
}