public class Palindrome{
    public static boolean is_palindrome(String s)
    { 
    int i=0;
    boolean pal=true;
    int longueur=s.length()-1;
    while(i<(longueur/2) && pal){
      if(s.charAt(i)==s.charAt(longueur)){
        i++;
        pal=true;
      }
      else{
        pal=false;
      }
    }
    return pal;
}
}
