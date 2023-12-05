package practise;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.withRecusion();
        System.out.println();
        pascalTriangle.withoutRecursion();
    }

    private void withoutRecursion() {
        int n=7, i, j;
        for(i=0; i<-n ; i++){
            for(j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            int c = 1;
            for(j=1; j<=i; j++){
                System.out.print(c + " ");
                c= c * (i-j)/j;
            }
            System.out.println();
        }
    }

    private int factorial(int i) {
        if(i==0){
            return 1;
        }
        return i * factorial(i-1);
    }

    public void withRecusion(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        int n=7, i, j;
        for(i=0; i<n; i++){
            for(j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print(" "
                        + pascalTriangle.factorial(i)
                        / (
                        pascalTriangle.factorial(i-j)
                                * pascalTriangle.factorial(j)
                ));
            }
            System.out.println();
        }
    }


}
