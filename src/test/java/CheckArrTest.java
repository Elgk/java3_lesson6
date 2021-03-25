import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckArrTest {
    private ArraysTasks tasks;
    private boolean result;
    private int[] arrSource;

    public CheckArrTest(boolean result, int[] arrSource) {
        this.result = result;
        this.arrSource = arrSource;
    }

    @Before
    public void init(){
        tasks = new ArraysTasks();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {false, new int[]{1,4,1,4,5,1} },
                {false, new int[]{1,1,1,1,1} },
                {false, new int[]{4,4,4} },
                {true,  new int[]{1,1,4,4,1,1,4}}
        });
    }

    @Test
    public void checkArrTest(){
        Assert.assertEquals(result, tasks.checkArr(arrSource));
    }
}
