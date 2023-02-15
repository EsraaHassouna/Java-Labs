package lab2;
public class JavaLab2One{
	public static void main(String args[]){
		String commandLine = "163.121.12.30";
		IPcutterSplit cut = new IPcutterSplit(commandLine);
		int[] out = cut.doIpSplit();
		System.out.println("the output is:");
		for(int i=0;i<=out.length;i++){
			System.out.println(out[i]);
		
		}
	}
}