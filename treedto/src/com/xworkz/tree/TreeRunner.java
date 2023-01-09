package com.xworkz.tree;

import com.xworkz.tree.repos.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {
		
	TreeRepoImpl repo = new TreeRepoImpl();
	
	repo.save();
	
	}
}
