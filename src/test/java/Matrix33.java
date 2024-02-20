import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Matrix33 {
    @Test
    public void testRowSum() {
        int[][] matrix = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };

        int[] expectedRowSums = {6, 6, 6};

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            assertEquals("Row " + (i+1) + " sum is incorrect", expectedRowSums[i], sum);
        }
    }}


