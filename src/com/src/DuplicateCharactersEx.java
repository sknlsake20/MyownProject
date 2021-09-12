package day7;

public class DuplicateCharactersEx {

	public static void main(String[] args) {
		String str="GeeksGeeksForLearn";
		String str1=str.toLowerCase();
		System.out.println(str1);
		System.out.println("Duplicate characters:");
		char[] chararr=str1.toCharArray();
		int count;
		for(int i=0;i<str1.length();i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(chararr[i]==(chararr[j])) {
					count++;
					chararr[j]='0';
				}
				
				
			}
			if(count>1 &&  chararr[i]!='0') {
				System.out.print(chararr[i]+" ");
			}
			
		}

	}

}
