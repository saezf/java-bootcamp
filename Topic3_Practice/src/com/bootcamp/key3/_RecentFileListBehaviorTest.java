package com.bootcamp.key3;

import static org.junit.Assert.*;

import org.junit.Test;

public class _RecentFileListBehaviorTest {

	@Test
	public void setup() {
		new RecentList().setSize(3);
		assertEquals(new RecentList().getSize(),3);
	}
	
	@Test
	public void test() {
		RecentList fileList = new RecentList();
		fileList.setSize(3);
		fileList.addFile("something.txt");
		fileList.addFile("to.xml");
		fileList.addFile("add.jpg");
		assertEquals(fileList.getFiles(),"[add.jpg, to.xml, something.txt]");
	}
}
