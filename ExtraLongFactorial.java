import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static BigInteger fact(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
           f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
            System.out.println(fact(n));
    }

