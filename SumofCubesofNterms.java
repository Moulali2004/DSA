public class SumofCubesofNterms {
    static long sumOfSeries(long N) {
        // code here
        if(N==0)
        {
            return 0; 
        }
        return (N*N*N) + sumOfSeries(N-1);
    }
    public static void main(String[] args){
        long n=5;
        System.out.println(sumOfSeries(5));
    }
}
