public class function_example_1 {

    public static int minFunction(int a, int b){
        int min;
        if (a>b)
            min = b;
        else
            min = a;
        return min;        
    }
    
    public static void main(String[] args){
        System.out.println(minFunction(5,6));
    }
}
