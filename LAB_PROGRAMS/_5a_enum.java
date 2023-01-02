// create a enum called size to indicates size of pizza regular, medium, large, extralarge
// create a class called test which has instance of size, constructor, method called orderpizza which has a switch statement having case labels of size
// driver class for main method creates a instance of test and orders pizza.

enum size{regular, medium, large, extralarge}

class test{
size psize;
test(size pizzasize){
    this.psize=pizzasize;
}
public void orderpizza(){
    switch(psize){
        case regular:System.out.println("regular pizza ordered");
        break;
        case medium:System.out.println("medium pizza ordered");
        break;
        case large:System.out.println("large pizza ordered");
        break;
        case extralarge:System.out.println("extralarge pizza ordered");
        break;
        default:System.out.println("error");
    }
}
}

class _5a_enum{
    public static void main(String[] args){
        test t1=new test(size.regular);
        t1.orderpizza();

    }
}