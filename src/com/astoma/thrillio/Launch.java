package com.astoma.thrillio;

import com.astoma.thrillio.entities.Bookmark;
import com.astoma.thrillio.entities.User;
import com.astoma.thrillio.managers.BookmarkManager;
import com.astoma.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading data");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

		System.out.println("Printing data...");
		printUserData();
		printBookmarkData();
	}

	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void printBookmarkData() {
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	public static void main(String[] args) {
		loadData();
	}

}
