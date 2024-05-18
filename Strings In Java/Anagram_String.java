import java.util.*;
public class Anagram_String {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string1:");
    String str1=sc.nextLine();
    System.out.println("Enter the string2:");
    String str2=sc.nextLine();
    char[] S1=str1.toCharArray();
    char[] S2=str2.toCharArray();
    int flag=0;
    for(int i=0;i<S1.length;i++){
        for(int j=i+1;j<S1.length;j++){
            if(S1[i]>S1[j]){
                char temp=S1[i];
                S1[i]=S1[j];
                S1[j]=temp;
            }
        }
    }
    for(int i=0;i<S2.length;i++){
        for(int j=i+1;j<S2.length;j++){
            if(S2[i]>S2[j]){
                char temp=S2[i];
                S2[i]=S2[j];
                S2[j]=temp;
            }
        }
    }
    for(int i=0;i<S1.length;i++){
        for(int j=0;j<S2.length;j++){
            if(S1[i]==S2[i]){
                continue;
            }
            else{
              flag=1;
              break;
            }
        }
    }
    if(flag==0){
        System.out.println("It Is A Anagram");
    }
    else{
        System.out.println("It Is Not A Anagra,");
    }
    }

}
