public class JavaLabOneOne{
	public static void main(String args[]){
		int i=0;
		for(i=0;i<args.length;i++){		
			if(args.length>0 && args[0].equals("coreId"))
				System.out.println("true value "+args[i]);	
			else 
				System.out.println("No input");
		}
	}
}