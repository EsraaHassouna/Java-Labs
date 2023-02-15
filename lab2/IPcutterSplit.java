

public class IPcutterSplit{
	String cmdline;
	IPcutterSplit(String cmdline2){
		cmdline = cmdline2;
	}

	String [] doIpSplit(){
		
		String [] arr = cmdline.split("\\."); 
		//arr = Integer.parseInt(cmdline); 		
		return arr;
	}
}
















