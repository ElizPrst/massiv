public class Main {
    public static void main(String[] args) {
// Задача 1
        // 1.1
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        // 1.2
        double [] fractions = {1.57, 7.654, 9.986};
        // 1.3
        int [] randomNumbers ={12, 17, 28};
        //Задача 2
        System.out.println();
        for (int i=0; i<number.length;i++){
            System.out.print(number[i]);
            if (i != number.length-1){
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int i=0; i<fractions.length;i++){
            System.out.print(fractions[i]);
            if (i != fractions.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i< randomNumbers.length;i++){
            System.out.print( randomNumbers[i]);
            if (i !=  randomNumbers.length-1){
                System.out.print(", ");
            }
        }
        //Задание 3
        System.out.println();
        for (int i=number.length- 1; i >= 0; i--){
            System.out.print(number[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i=fractions.length- 1; i >= 0; i--){
            System.out.print(fractions[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=randomNumbers.length- 1; i >= 0; i--){
            System.out.print( randomNumbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание
        System.out.println();
        for (int i=0; i<number.length; i++){
            if (number[i]%2==1){
                number[i]++;
                System.out.print(number[i]);
                if (i != number.length-1){
                    System.out.print(", ");
                }
            }
        }
    }

}