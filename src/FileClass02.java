import java.io.File;

public class FileClass02 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	throws Exception
	{
		String path="c:/Song/";
		String path1="c:/Song/Old Song/";
		String path2="c:/Song/New Song/";
		String path3="c:/Song/Old Song/IMDMDN.mp3 ";
		String path4="c:/Song/New Song/TRKMPN.mp3 ";
		File f=new File(path);
		File f1=new File(path1);
		File f2=new File(path2);
		File f3=new File(path1);
		File f4=new File(path2);
		
		
		f.mkdirs();
		f1.mkdirs();
		f2.mkdirs();
		f3.createNewFile();
		f4.createNewFile();
		
		
		
		
		
		
		
		
		
	}

}
