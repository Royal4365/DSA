package DSA_450.Searching_And_Sorting;

public class MiddleTerm {
    public static void main(String[] args) {
        int a = 500,b = 200,c = 300;
        System.out.println(middle(a,b,c)+" is middle element");
    }
    static int middle(int a,int b,int c){
        if(a>b){
            if(b>c && a>c){
                return b;
            }else if(c>b && c>a) {
                return a;
            }
        }else if(b>a){
            if(c>b && c>a){
                return b;
            }else if(b>c && a>c){
                return a;
            }
        }
        return c;
    }
}
