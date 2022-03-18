public class session5 {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // inverted half pyramid
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
