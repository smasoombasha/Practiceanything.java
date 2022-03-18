public class session10 {
    public static void main(String[] args){
        System.out.println("Rhombus Pattern");
        int n = 5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
