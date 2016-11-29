class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
       int sum = 0;
       for (int i = 1; i <= (int) Math.sqrt(n); i++)
           if (n%i == 0)
               sum += i + n/i;
       
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n)
           sum -= Math.sqrt(n);
  
        return sum;
    }
}
