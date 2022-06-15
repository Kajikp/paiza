import java.util.*;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 0; i <= n; i++){
            String s = sc.nextLine();
            if(s.contains("shift")){
                s = s.substring(s.length() - 1, s.length());
                s = s.toUpperCase();
            }
            
            if(s.equals("capslock")){
                if(c == 1){
                    c--;
                    continue;
                }
                c++;
                continue;
            }
            
            if(c == 1){
                s = s.toUpperCase();
            }
              System.out.print(s);
        }
    }
}
