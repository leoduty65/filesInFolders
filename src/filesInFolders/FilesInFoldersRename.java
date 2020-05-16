package filesInFolders;

import java.io.File;

public class FilesInFoldersRename {
	public static void main(String[] args) {
		String fullDirectoryName = "D:\\FSExample";
		 File directory = new File(fullDirectoryName);
		 
		 File[] fileList=directory.listFiles();
		 for (File file : fileList) {
			if (file.isDirectory()) {
			String newName = file.getAbsolutePath() + "-"+numOfFiles(file.getAbsolutePath());
			System.out.println(newName);
			file.renameTo(new File(newName));
			}
		}
				
	}
	
	public static int numOfFiles(String directoryName) {

	    File directory = new File(directoryName);

	    // get all the files from a directory
	    if(directory.isDirectory()) {
	    File[] fList = directory.listFiles();
	    return fList.length;
	    } else return 0;
	} 
	
//	public static  File[] listOfFiles(String directoryName) {
//
//	    // .............list file
//	    File directory = new File(directoryName);
//
//	    // get all the files from a directory
//	    File[] fList = directory.listFiles();
//
//	    for (File file : fList) {
//	        if (file.isFile()) {
//	            System.out.println(file.getAbsolutePath());
//	        } else if (file.isDirectory()) {
//	            listOfFiles(file.getAbsolutePath());
//	        }
//	    }
//	    System.out.println(fList);
//	    return fList;
//	}  
}
