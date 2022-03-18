public class session9 {
    public static void main(String[] args){
        System.out.println("Diamond Pattern");
        int n=10;
        int i,j;
        // Diamond shape
        // upper part
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
             System.out.println();
        }
        // lower part
        for(i=n;i>=1;i--){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
