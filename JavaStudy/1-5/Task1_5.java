public class Task1_5{
    public static void main(String[] args){
     String[]fruits={"みかん","りんご","ぶどう","メロン"};
     for(int i = 0; i< fruits.length; i++){
      System.out.println(fruits[i]);
     }

     /*1~100の整数を表示する */
     int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();
   

    for (int l = 1; l <= 9; l++) { 

      System.out.print(l+"||");
      
      for (int j = 1; j <= 9; j++){

         System.out.print( (l * j) + "|" +" "); 
      }
            
      System.out.println();
  
     }
  }
}