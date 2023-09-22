package LogicalQuestions;

public class Duplicates_in_string {
	public static void main(String[] args) {
		
		
		
		String str = "Nikita_Durgade";
		int count;
		
		char string[]=str.toCharArray();
		System.out.println("duplicate in string");
		
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  

	}

}
