class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;

        while(top <= bottom && left <= right)
        {
            // left to right 

            for(int j= left;j<=right;j++)
            {
                ans.add(arr[top][j]);
            }
            top++;

            // top to bottom 
            for(int i =top;i<=bottom;i++)
            {
                ans.add(arr[i][right]);
            }
            right--;

            // right to left
            if(top <= bottom)
            {
            for(int j=right;j>=left;j--)
            {
                ans.add(arr[bottom][j]);
            }
            bottom--;

            }

            if(left <=right)
            {
                for(int i =bottom;i>=top;i--)
                {
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }return ans;






              
    }
}