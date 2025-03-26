import java.util.ArrayList;

/**
 * The SharedData class is responsible for storing and managing shared data 
 * between two threads. It holds an array of integers (array), a boolean array 
 * (winArray), a flag (flag), and an integer value (b).
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	

	/**
	 * Constructor to initialize SharedData with an ArrayList and an integer value 'b'
	 *
	 * @param array An ArrayList of Integer values.
	 * @param b A numeric value for comparison.
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the winArray, which is a boolean array indicating if the condition
     * holds true for each element in the array.
     * 
     * @return A boolean array representing win states.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

    /**
     * Sets the winArray, which indicates whether the condition holds true for
     * each element.
     * 
     * @param winArray A new boolean array.
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	 /**
     * @return An ArrayList of Integer values.
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

    /**
     * @return The value of b.
     */
	public int getB() 
	{
		return b;
	}


    /**
     * @return true if a solution has been found, false otherwise.
     */
	public boolean getFlag() 
	{
		return flag;
	}

    /**
     * @param flag The new value of the flag (true/false).
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
