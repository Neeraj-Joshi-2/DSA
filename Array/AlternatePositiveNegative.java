 

class AlternatePositiveNegative {

	static void rearrange(int arr[], int n)
	{ 
		int i = -1, temp = 0;
		for (int j = 0; j < n; j++)
		{ 
			if (arr[j] < 0)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int pos = i+1, neg = 0;

		while (pos < n && neg < pos && arr[neg] < 0)
		{
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg += 2;
		}
	}

	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main (String[] args)
	{
		int arr[] = {-5,-2,5,2,4,-7};
		int n = arr.length;
		rearrange(arr,n);
		System.out.println("Array after rearranging: ");
		printArray(arr,n);
	} 
}
 
