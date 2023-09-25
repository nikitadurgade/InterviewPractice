package Coding_Questions;

public class Sum_of_two_numbers {

	
	public static int[] sum_of_index_vlue(int num[],int target)
	{
		
		int n= num.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(num[i]+num[j]==target);
				num[0]=i;
			    num[1]=j;
			    return num;
			}
		}
		
		return num;
	}

	
	
	public static void main(String[] args) {
		
		int target=9;
		int num[]= {4,5,8,2};
		Sum_of_two_numbers add = new Sum_of_two_numbers();
		add.sum_of_index_vlue(num, target);
		System.out.println(num);

		
	}
}
