package lab3;

public class Application {

    public int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Application application = new Application();
        final int N = 3;
        int count = 0;
        double array[][] = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                array[i][j] = ((int) (Math.random() * 30) - 15);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

               if (array[i][j]>0){
                   if(i==0){
                       count++;
                   } else if (i==array.length-1){
                       count++;
                   } else if (j==0){
                       if(i>0&&i<array.length-1){
                           count++;
                       }
                   } else if (j==array.length-1){
                       if(i>0&&i<array.length-1){
                           count++;
                       }
                   }
               }

                System.out.print(array[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("Додатнiх елементiв : "+count);
        System.out.println("Факторiал кiлькостi додатнiх елементiв : "+application.calculateFactorial(count));


    }
}
