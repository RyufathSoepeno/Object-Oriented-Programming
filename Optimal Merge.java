/** 
In a data processing system, there are n data points, each with an integer value representated by the array dataPoints. The objective is to perform operations on the dataPoints until only one data point remains. In one operation, any two elements can be merged to create new data point whose value is the sum of the two merged points. The computational cost of each operation is the value of the new data point.

Implement a function that computers the minimum possible computational cost to merge all data points into one. The function getMinCost takes the following input: int dataPoints[n]: the values of data points. 

The function should return the minimum possible cost to merge all data points into one. 

Example:
n = 3 
dataPoints = [20, 30, 40]

an Optimal sequence is: 1. Select data points with values 20 and 30 and merge them to obtain [50, 40]. The cost is 20 + 30 = 50. 2. Select data points with values 50 and 40 = 90. 

The total cost for the mrges is 50 + 90 = 140, so the function should return 140. 

Constraints:
2 <= n <= 10^5
1 <= dataPoints[i] <= 100
*/

import java.io.*;
import java.util.*;

class Result {
    public static int getMinCost(List<Integer> dataPoints) {
        // Step 1: Use a PriorityQueue (min-heap) to always access the smallest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(dataPoints);

        int totalCost = 0;

        // Step 2: Continue merging until only one element remains
        while (minHeap.size() > 1) {
            // Remove the two smallest values
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Cost of this merge
            int mergeCost = first + second;
            totalCost += mergeCost;

            // Add the merged value back into the heap
            minHeap.add(mergeCost);
        }

        // Step 3: Return the accumulated total cost
        return totalCost;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dataPointsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> dataPoints = new ArrayList<>();
        for (int i = 0; i < dataPointsCount; i++) {
            dataPoints.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int result = Result.getMinCost(dataPoints);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
