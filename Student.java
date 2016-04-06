public class Student {
       public static void main(String[]args){
       
         String text = "This is a String";
         System.out.println(getLastChar(text));


   }
   public static String getLastChar(String text){
      String newText = "";
    for(int i = text.length()-5; i<text.length();i++){
       newText = newText +text.charAt(i);
        
         }
        

      return newText ;
    }

}
