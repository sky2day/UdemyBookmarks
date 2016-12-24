package com.astoma.thrillio.dao;

import com.astoma.thrillio.DataStore;
import com.astoma.thrillio.entities.Bookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}
}