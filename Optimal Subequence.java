/** In a URL shortening service, the URL is given as a string url consisting of lowercase English letters. The task is to extract a subsequence of exactly k characters from the 'url' that minizes the URL compression, defined as the difference between the length of the subsequence and the number of distinct characters in the subsequence. Implement a function to compute the minimum possible compression for any subsequence of length k. The function minimizeURLCompression takes the following inputs: -stringurl: a string representing the original URL code, -int k: the desired length of the subsequence. 

The function should return the minimum posssible compression in any subsequence of length k. Note: The subsequence of a string is a string obtained by deleting any set of characters from the original string while retaining the order of remaining characters. 

Example:
url = "ooxoxo"
k = 4 

One optimal subsequence of length exactly k is "ooxx". The length of the subequence is 4 and it contains two distinct characters, '0' and 'x'. The URL compression is 4 - 2 = 2. 

Constraints:
2 <= k <= length(url) <= 10^5; String 'url' consists of lowercase English letters only */

import java.io.*;
import java.util.*;

class Result {
    public static int minimizeURLCompression(String url, int k) {
        // Step 1: Use a Set to store all distinct characters in the given URL
        Set<Character> distinctSet = new HashSet<>();
        for (char c : url.toCharArray()) {
            distinctSet.add(c);
        }

        // Step 2: Count total distinct characters in the URL
        int totalDistinct = distinctSet.size();

        // Step 3: The max number of distinct chars we can have in any subsequence of length k
        int maxDistinctInSubsequence = Math.min(k, totalDistinct);

        // Step 4: Minimum possible compression = k - maxDistinct
        return k - maxDistinctInSubsequence;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String url = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minimizeURLCompression(url, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
