import java.util.Scanner;

public class TheRuntimeClass001 {
	public static void main(String[] args) 
	
	{
		// fetch the object of runtime from the JVM
				Runtime rt = Runtime.getRuntime();
				
				// get total memory available to the JVM
				long total = rt.totalMemory();
				System.out.println("total :"+total / 1024+" kilobytes");
				
				// get free memory available to the JVM
				long free = rt.freeMemory();
				System.out.println("free :"+free / 1024+" kilobytes");
				
				// get allocated memory
				long allocated = total - free;
				System.out.println("allocated :"+allocated / 1024+" kilobytes");
				
				// get max memory which can be given by OS to the JVM
				long max = rt.maxMemory();
				System.out.println("max memory :"+max / 1024 / 1024+" megabytes");

				// kill JVM 
				rt.exit(0);
	}
}
