package com.bootcamp.recenfilelist;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void test() {
		new RecentFileList().setSize(3);
		assertEquals(new RecentFileList().getSize(),3);
	}
	
	@Test
	public void test2() {
		RecentFileList fileList = new RecentFileList();
		fileList.setSize(3);
		fileList.addFile("something");
		fileList.addFile("to");
		fileList.addFile("add");
		assertEquals(fileList.getFiles(),"[add, to, something]");
	}
	
	@Test
	public void test3() {
		RecentFileList fileList2 = new RecentFileList();
		fileList2.setSize(4);
		fileList2.addFile("1");
		fileList2.addFile("2");
		fileList2.addFile("1");
		fileList2.addFile("3");
		assertEquals(fileList2.getFiles(),"[3, 1, 2]");
	}

}
