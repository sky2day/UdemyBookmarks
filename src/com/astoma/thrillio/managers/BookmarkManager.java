package com.astoma.thrillio.managers;

import com.astoma.thrillio.dao.BookmarkDao;
import com.astoma.thrillio.entities.Book;
import com.astoma.thrillio.entities.Bookmark;
import com.astoma.thrillio.entities.Movie;
import com.astoma.thrillio.entities.WebLink;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();
	
	private BookmarkManager(){}
	
	public static BookmarkManager getInstance(){
		return instance;
	}
	public Movie createMovie(long id, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}
	
	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre, double amazonRating){
		Book book = new Book();
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		return book;
		}
	
	public WebLink createWebLink(long id, String url, String host, String title){
		WebLink weblink = new WebLink();
		weblink.setId(id);
		weblink.setHost(host);
		weblink.setUrl(url);
		weblink.setTitle(title);
		return weblink;
		}
	public Bookmark[][] getBookmarks(){
		return dao.getBookmarks();
	}
}
