package com.itc.fileiomodule;

import java.io.*;

/**
 * @author Vijayraj Nathe class design to demonstrate the use of
 *         FileInputStream/FileOutputStream.
 */
class FileOperation {
	private File file;

	public FileOperation(String f) {
		file = new File(f);
	}

	/**
	 * @return void
	 * @param dest
	 * @throws Exception
	 *             method for copying one file to other
	 */
	public void copyToFile(String dest) throws Exception {
		if (file.exists()) {
			InputStream reader = new FileInputStream(file);
			OutputStream writer = new FileOutputStream(dest);
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}
			reader.close();
			writer.close();
			System.out.println("Copied Succesfully !!!\n\n");
			return;
		}
		System.out.println("Source File Not Present !!!");
		return;
	}

	/**
	 * @return void
	 * @param file
	 * @throws Exception
	 *             method for printing the output file.
	 */
	public void printFile(String file) throws Exception {
		this.file = new File(file);
		int ch;
		if (this.file.exists()) {
			System.out.println("Output File:=\n");
			InputStream reader = new FileInputStream(this.file);
			while ((ch = reader.read()) != -1)
				System.out.print(Character.toChars(ch));
			reader.close();
			this.file.delete();
			return;
		}
		System.out.println("Output File Not Available to Print !!!");
		return;
	}

	/**
	 * @param args
	 * @throws Exception
	 *             main method starting point for execution.
	 */
	public static void main(String[] args) throws Exception {
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Source File to Copy(input.txt):=");
		
		@SuppressWarnings("deprecation")
		String inputFile =in.readLine();
		String outputFile = "output.txt";
		FileOperation fileobj = new FileOperation(inputFile);
		fileobj.copyToFile(outputFile);
		fileobj.printFile(outputFile);
	}

}
