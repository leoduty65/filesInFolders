package filesInFolders;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


// This is to get list of directories + numOfFiles in each dir
public class FoldersList {

	public static void main(String[] args) {

		String fullDirectoryName = "D:/FSExample";
		 File directory = new File(fullDirectoryName);
		 
		 File[] fileList=directory.listFiles();
		 
		 // open the file to write in
		 
		 FileWriter writer = null;
		 try {
			writer = new FileWriter( fullDirectoryName+"/list-of-directories.txt", true);
			for (File file : fileList) {
				if (file.isDirectory()) {
					String infoString = file.getName() + "-->" + numOfFiles(file.getAbsolutePath());
					System.out.println(infoString);
					writer.append(infoString);
					writer.append("\n");
				}
			} 
		} catch (Exception e) {
			System.out.println("Cant open file " );
		} finally {
			if (writer != null )
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Problem with closing writer for " + writer.toString());
				}
		}
	}

	public static int numOfFiles(String directoryName) {

		File directory = new File(directoryName);

		// get all the files from a directory
		if (directory.isDirectory()) {
			File[] fList = directory.listFiles();
			return fList.length;
		} else
			return 0;
	}
}

