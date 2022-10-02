public class Check{
    public static void main(String[] args){
        
        int[]data={3,1,2,7,5};

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"");

        }
        System.out.println();
        for (int i = 0; i <data.length ; i++){
            for (int j = data.length; j > i; j--){

                if(data[3] > data[4]){
                    int box = data[0];
                    data[3] = data[4];
                    data[2] = box;
                }
            }

        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}