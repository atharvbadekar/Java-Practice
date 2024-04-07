class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr [] = {95,2,6,3,2,7,4,5,8,23,62} ;
		int temp = 0 ;
		
		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 1;j < arr.length -i ;j++ )
			{
				if (arr[j-1] > arr [j])
				{
					temp = arr[j-1] ;
					arr[j-1] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		for (int i =0 ;i<arr.length ;i++ )
		{
			System.out.print(arr[i] + " ") ;
		}
	}
}
