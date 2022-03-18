public class session6 {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // half pyramid rotated 180deg
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
