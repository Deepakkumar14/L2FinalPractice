package Patterns;

public class HallowDiamond {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
                for (int k=0;k<2*i-1;k++) {
                    if (k == 0 || k==(2*i-1)-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        for(int i=rows-1;i>=0;i--){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++) {
                if (k == 0 || k==(2*i-1)-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

