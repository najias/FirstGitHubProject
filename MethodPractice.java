public class MethodPractice {
    public static void main(String[]args){
       
       String  text = "Tasmiyah Najiat";
       System.out.println(getIndex(text));

    }
     public static int getIndex(String   text){
       int sum = 0;
     for(int i = 0; i <text.length(); i++){
       sum = sum + i;
       }
        return   sum;
     }

}
