package lab2;

public class IPcutterSplit{
	String cmdline;
	IPcutterSplit(String cmdline){
		String commandLine = "163.121.12.30";
	}

	int doIpSplit(String cmdline){
		String[] arr; 
		for(int i=0;i<arr.length;i++){
			arr[i] = cmdline.split("."); 
		}		
		return arr;
	}
}
