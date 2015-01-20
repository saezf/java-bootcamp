package com.bootcamp.recenfilelist;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList {
	public int position;
	private int size=3;
	private List<String> fileList = new ArrayList<>(size);

	public void setSize(int sizeOfTheList) {
		this.size = sizeOfTheList;		
	}
	
	public int getSize(){
		return this.size;
	}

	public void addFile(String fileName) {
		if(fileName == null || fileName.isEmpty()){ //test if the filename is empty or null
			System.out.println("You can´t add a empty or null filename");
		}
		
		if (getSize() == fileList.size() && !fileName.isEmpty()) { //if the list is full we remove 
            fileList.remove(size);
        }
				
		if (fileIsUnique(fileName)) {
            fileList.add(0,fileName);
        }else{
        	fileList.remove(fileName);
        	fileList.add(0,fileName);
        	        	
        }
	}

	private boolean fileIsUnique(String fileName) {
		if(!fileList.isEmpty()){
			for(int i=0; i < fileList.size();i++){
			//for(String element: fileList){
				//if(element.equals(fileName)){
				if(fileList.get(i) == fileName)
					return false;
					position = fileList.indexOf(fileName);
				}
			}
					
		return true;
	}

	public String getFiles() {
		return fileList.toString();
	}
	
}
