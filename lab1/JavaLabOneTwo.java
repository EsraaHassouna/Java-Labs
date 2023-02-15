public class JavaLabOneTwo{
	public static void main(String args[]){
		int i=0;
		int size = Integer.parseInt(args[0]);
		for(i=0;i<size;i++){		
			if(args.length>0)
				System.out.println(args[1]);	
			else 
				System.out.println("No input");
		}
	}
}