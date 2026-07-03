class Solution {
    int MOD = 1000000007;
    public int countGoodNumbers(long n) {

        // if(n==1){
        //     return 5;
        // }

        // if(n%2==0){
        //     return 4*countGoodNumbers(n-1)%MOD;
        // }else{
        //     return 5*countGoodNumbers(n-1)%MOD;
        // }
        long result=(power(5,(n-n/2))*power(4,n/2))%MOD; //yaa aise socho ki even place ko fill karne ke 5 ways and odd ko karne ke 4 ways and n digit number me odd place n/2 and even place n-n/2 so total power(5,n-n/2) * power(4,n/2);
        return (int) result;
    }

    private long power(long x,long n){
        if(n==0){
            return 1;
        }


        long halfpow=power(x,(n/2))% MOD;
        long sqpow=(halfpow*halfpow)% MOD;

        if(n%2==0){
            return sqpow;
        }else{
            return (x*sqpow)% MOD;
        }
    }
}