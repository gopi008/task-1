import java.util.Scanner;

public class splitOddEven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        String odd = "";
        String even = "";
        for(int i=start ; i<=end ; i++){
            if(i%2 != 0){
                odd+=i;
            }
            else{
                even+=i;
            }
        }
        System.out.println(odd+"\n"+even);
    }
}

