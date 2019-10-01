
public class Array3 {
	public static void main(String[] args) {
		
			String input="Hii My Name is Amit Amit Pradhan";
			String[] words=input.split(" ");
			for(int i=0;i<words.length;i++){
			    if(words[i]!=null){
			        for(int j=i+1;j<words.length;j++){
			            if(words[i].equals(words[j]))
			            {
			                words[j]=null;
			            }
			        }
			    }
			}
			for(int  k=0;k<words.length;k++){
			    if(words[k]!=null){
			        System.out.println(words[k]);
			    }
			}
		}
	
	
}
