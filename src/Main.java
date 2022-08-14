public class Main {
    public static void main(String[] args) {
// Задача 1
        // 1.1
        int [] a = new int [3];
        a [0] = 1;
        a [1] = 2;
        a [2] = 3;
       // 1.2
        double [] b = {1.57, 7.654, 9.986};
       // 1.3
        int [] C ={12, 17, 28};
        //Задача 2
        System.out.println();
       for (int i=0; i<a.length;i++){
           System.out.print(a[i]);
           if (i != a.length-1){
               System.out.print(", ");

           }
       }
        System.out.println();
        for (int i=0; i<b.length;i++){
            System.out.print(b[i]);
            if (i != b.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i<C.length;i++){
            System.out.print(C[i]);
            if (i != C.length-1){
                System.out.print(", ");
}
}
        //Задание 3
        System.out.println();
        for (int i=a.length- 1; i >= 0; i--){
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i=b.length- 1; i >= 0; i--){
            System.out.print(b[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=C.length- 1; i >= 0; i--){
            System.out.print(C[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание
        System.out.println();
        for (int i=0; i<a.length; i++){
            if (a[i]%2==1){
                a[i]++;
                System.out.print(a[i]);
                if (i != a.length-1){
                    System.out.print(", ");

                }
            }
            }
        }

    }