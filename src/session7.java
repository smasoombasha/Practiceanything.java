public class session7 {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // full pyramid
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
