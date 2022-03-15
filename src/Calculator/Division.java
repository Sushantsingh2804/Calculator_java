package Calculator;

public class Division {

    public int quotient(int a,int b){
        if(a<b){
            return b/a;
        }
        else {
            return a/b;
        }

    }
    public int reminder(int a,int b){
        if(a<b){
            return b%a;
        }
        else {
            return a%b;
        }
    }
}
