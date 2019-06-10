package com.lanqiao.javac;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.Iterator;  
import java.util.StringTokenizer;  
  
class Reader {  
    static BufferedReader reader;  
    static StringTokenizer tokenizer;  
  
    static void init(InputStream input) {  
        reader = new BufferedReader(new InputStreamReader(input));  
        tokenizer = new StringTokenizer("");  
    }  
  
    static String next() throws IOException {  
        while (!tokenizer.hasMoreTokens()) {  
            tokenizer = new StringTokenizer(reader.readLine());  
        }  
        return tokenizer.nextToken();  
    }  
  
    static int nextInt() throws IOException {  
        return Integer.parseInt(next());  
    }  
}  
  
public class test8 {  
  
    /** 
     * @param args 
     */  
    static long monum = Integer.MAX_VALUE;  
    static long mulnum = 100000007;  
    static long ansmo = 1000000007;  
    static long val, mval, ans, cnt;  
    static int n, m, k, len, nums, v;  
    static char ch[][];  
    static long chval[];  
    static String str;  
    static int arr[], hashnum[], size[];  
    static int hval[][];  
    static HashMap<Integer, Integer> hashMap[];  
    static HashSet<Integer> hashSet[];  
    static boolean flag;  
    private static void dfs(int num, int st) {  
        if (num == m + 1) {  
            for (int i = 1; i <= size[arr[1]]; i++) {  
                v = hval[arr[1]][i];  
                cnt = (long) hashMap[arr[1]].get(v) % ansmo;  
                flag=true;  
                for (int j = 2; j <= m; j++)  
                    if (hashMap[arr[j]].containsKey(v))  
                        cnt = cnt * (long) hashMap[arr[j]].get(v) % ansmo;  
                    else {  
                        flag=false;  
                        break;  
                    }  
                if (flag) ans = ans + cnt;  
  
            }  
            return;  
        }  
        for (int i = st; i <= n - m + num; i++) {  
            arr[num] = i;  
            dfs(num + 1, i + 1);  
        }  
  
    }  
  
    private static void dealStr(int num) {  
        val = 0;  
        len = ch[num].length;  
        if (len < k)  
            return;  
        mval = 1;  
        for (int i = 1; i <= k; i++) {  
            val = (val * mulnum + chval[ch[num][i - 1]]) % monum;  
            mval = (mval * mulnum) % monum;  
        }  
        hashMap[num].put((int) val, 1);  
        hashSet[num].add((int) val);  
        for (int i = k + 1; i <= len; i++) {  
            val = (val * mulnum + chval[ch[num][i - 1]]) % monum;  
            val = ((val - chval[ch[num][i - k - 1]] * mval) % monum + monum)  
                    % monum;  
            if (!hashMap[num].containsKey((int) val)) {  
                hashMap[num].put((int) val, 1);  
                hashSet[num].add((int) val);  
            } else {  
                nums = hashMap[num].get((int) val);  
                hashMap[num].put((int) val, nums + 1);  
            }  
        }  
        size[num] = hashSet[num].size();  
        hval[num] = new int[size[num] + 1];  
        Iterator<Integer> iter = hashSet[num].iterator();  
        int cnt = 0;  
        while (iter.hasNext()) {  
            cnt++;  
            hval[num][cnt] = iter.next();  
        }  
        
    }  
  
    public static void main(String[] args) throws IOException {  
        // TODO Auto-generated method stub  
        Reader.init(System.in);  
        n = Reader.nextInt();  
        m = Reader.nextInt();  
        k = Reader.nextInt();  
        ch = new char[n + 1][];  
        for (int i = 1; i <= n; i++) {  
            str = Reader.next();  
            ch[i] = str.toCharArray();  
        }  
        hashMap = new HashMap[n + 1];  
        hashSet = new HashSet[n + 1];  
        hval = new int[n + 1][];  
        size = new int[n + 1];  
        chval = new long[200];  
        chval['A'] = 0;  
        chval['T'] = 1;  
        chval['G'] = 2;  
        chval['C'] = 3;  
        for (int i = 1; i <= n; i++)  
            hashMap[i] = new HashMap<Integer, Integer>();  
        for (int i = 1; i <= n; i++)  
            hashSet[i] = new HashSet<Integer>();  
        arr = new int[m + 1];  
        for (int i = 1; i <= n; i++)  
            dealStr(i);  
        ans = 0;  
        dfs(1, 1);  
        System.out.println(ans);  
    }  
  
} 