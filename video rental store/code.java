package prac;

class video{
	String title;
	String checker;
	int avg_user_rating;
	void checked(){
		checker="unavailable";
	}
	void returned(){
		checker="available";
	}
	void rating(int r){
		avg_user_rating=r;
	}
}
class video_store{
	static int c=0;
	video arr[]= new video[10];
	void refer(){
	for(int i=0;i<arr.length;i++){
		arr[i]=new video();
	}
	}
	void addvideo(String a){
		arr[c].title =a;
		arr[c].checker="available";
		c+=1;
	}
	void checkout(String c){
		for(int i=0;i<arr.length;i++)
			if(arr[i].title==c){
				arr[i].checked();;
			}
	}
	void returnvideo(String r){
		for(int i=0;i<arr.length;i++)
			if(arr[i].title==r){
				arr[i].returned();
			}
	}
	void receiverating(String a, int b){
		String M=a;
		int r=b;
		for(int i=0;i<arr.length;i++)
		if(arr[i].title==M){
			arr[i].rating(r);
		}
	}
	void inventory(){
		System.out.println("  Availability"+"      "+"Movie"+"      "+"Rating");
		for(int i=0;i<c;i++){
			System.out.println(i+1+"."+arr[i].checker+"        "+arr[i].title+"      "+arr[i].avg_user_rating);
		}
	}
}
public class Language2 {
public static void main(String[] args) {
     video_store vs=new video_store();
     vs.refer();
     vs.addvideo("Godfather");
     vs.addvideo("Matrix");
     vs.addvideo("Star Wars");
     vs.receiverating("Matrix", 4);
    // vs.inventory();
     vs.checkout("Matrix");
     vs.receiverating("Godfather", 5);
     vs.inventory();
}
}
