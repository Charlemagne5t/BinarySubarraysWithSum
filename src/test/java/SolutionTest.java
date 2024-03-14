import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int expected = 4;
        int actual = new Solution().numSubarraysWithSum(nums, goal);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {0,0,0,0,0};
        int goal = 0;
        int expected = 15;
        int actual = new Solution().numSubarraysWithSum(nums, goal);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] nums = {0,1,1,1,1};
        int goal = 3;
        int expected = 3;
        int actual = new Solution().numSubarraysWithSum(nums, goal);
        Assert.assertEquals(expected, actual);
    }
}
