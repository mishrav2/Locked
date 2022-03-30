import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllMethod {
	private File file,file2;
	private String foldername,filename,newpath;
	private static String path="D:\\";

	Scanner sc=new Scanner(System.in);
	public void addFiles()
	{
	
		System.out.println("Enter your name \n");
		foldername=sc.nextLine();
		System.out.println("Enter file name which you want to create");
	    filename=sc.nextLine();
		newpath=path+foldername;
		File file=new File(newpath);
		boolean b=file.mkdir();
		File file2=new File(newpath);
		if(b)
		{
			try {
				file2.createNewFile();
				System.out.println("File created Successfully in  "+foldername+ " directory");
			} 
			catch (IOException e) {
				System.out.println("file not created");
			}
			
		}
		else {
			System.out.println("folder not created or it is allready exist");
			try {
				file2.createNewFile();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public void deleteFiles()
	{
		System.out.println("Enter your name");
		 foldername=sc.nextLine();
	     newpath=path;
		 file=new File(newpath);
		if(file.isDirectory())
		{
			System.out.println("Enter File name");
			filename=sc.nextLine();
		     file2=new File(newpath+"\\"+filename);
			
			if(file2.delete())
			{
				System.out.println("File deleted Successfully");
			}
			else {
				System.out.println("File not Found");
			}
		}
		else {
				System.out.println("No such directory found");
			}
		
		

	}
	public void searchFiles()
	{
		System.out.println("Enter your name:");
		foldername=sc.nextLine();
		System.out.println("Enter file name which you want to search:");
		filename=sc.nextLine();
		file=new File(path+foldername+"//"+filename);
		if(file.exists())
		{
			System.out.println("File is present in directory: "+foldername);
		}
		else {
			System.out.println("file is not found in "+foldername+" directory");
		}
		}
	public void getAllFiles()
	{
		File file = new File(path);
		ArrayList<String> arrayList = new ArrayList<String>();
		for(File file2 : file.listFiles())
		{
			String fileNames = file2+"";
			String[] ss = fileNames.split("\\\\");
			arrayList.add(ss[ss.length-1]);
		}	
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));	
		}
	}
}
	
	