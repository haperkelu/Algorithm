import org.junit.Before;
import org.junit.Test;
import com.pieli.algorithm.sorting.QuickSortProvider;


public class sortingTetser {
	
	private QuickSortProvider quickSortProviderInstance;
	
	@Before
	public void init(){
		quickSortProviderInstance = new QuickSortProvider();
	}

	@Test
	public void testQuickSort() {
		double[] input = {1, 4, 7, 9, 20, 6, 4, 3};
		quickSortProviderInstance.sort(input, 0, input.length - 1);
		
		for(double item: input){
			System.out.println(item);
		}
	}

}
