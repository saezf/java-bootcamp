package com.bootcamp.key3;

import java.util.ArrayList;
import java.util.List;

public class RecentList {

	public int position;
	private int size = 3;

	private List<String> recentList = new ArrayList<>(size);

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void addFile(String fileName) {
		if (fileName == null || fileName.isEmpty()) {
			// test if the filename is empty or null
			System.out.println("You can´t add a empty or null filename");
		}
		if (recentList.contains(fileName)) {
			//remove filename from the list
			recentList.remove(recentList.indexOf(fileName));
			//add filename at the top
			recentList.add(fileName);
		} else {
			if (getSize() == recentList.size() && !fileName.isEmpty()) { 
				// if the list is full we remove
				recentList.remove(size);
				recentList.add(0,fileName);
			}else{
				recentList.add(0,fileName);
			}
		}
	}
	
	public String getFiles() {
		return recentList.toString();
	}
}
