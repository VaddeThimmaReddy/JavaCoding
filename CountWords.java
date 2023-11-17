package MainPrograms;

public class CountWords {

	public static void main(String[] args) {
		// Let's count the how many words are present inside in one sentence.
		String snt = "Palle technology will make their students as job holders";
		int count = 0;
		for(int i=0;i<=snt.length()-1;i++) {
			if(snt.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
