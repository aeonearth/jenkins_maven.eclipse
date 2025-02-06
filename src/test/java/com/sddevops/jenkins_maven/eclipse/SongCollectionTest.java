package com.sddevops.jenkins_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongCollectionTest {
	private SongCollection sc;
	private Song s1;
	private Song s2;
	private Song s3;
	private Song s4;
private final int SONG_COLLECTION_SIZE=4;


	@BeforeEach
	void setUp() throws Exception {
		sc=new SongCollection();
		s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59);
		s2 = new Song("002","Peaches","Justin Bieber",3.18);
		s3 = new Song("003","MONTERO","Lil Nas",2.3);
		s4 = new Song("004","bad guy","billie eilish",3.14);
		sc.addSong(s1);
		sc.addSong(s2);
		sc.addSong(s3);
	sc.addSong(s4);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetSongs() {
		List<Song> s = sc.getSongs();
		assertEquals(s.size(),SONG_COLLECTION_SIZE);
	}

	@Test
	void testAddSong() {
		List<Song> testSc=sc.getSongs();
		//Assert that Song Collection is equals to Song Collection Size 4
		assertEquals(testSc.size(),SONG_COLLECTION_SIZE);
		//Act
		sc.addSong(s1);
		//Assert that Song Collection is equals to Song Collection Size 4 + 1
		assertEquals(testSc.size(),SONG_COLLECTION_SIZE+1);

	}

	@Test
	void testSortSongsByTitle() {
		ArrayList<Song> s = sc.sortSongsByTitle();
		assertEquals(s.get(0).getTitle(), "MONTERO");
	}

	@Test
	void testSortSongsBySongLength() {
		ArrayList<Song> s = sc.sortSongsBySongLength();
		Collections.sort(s, Song.songLengthComparator);
		
		assertEquals(s.get(0), s1);
	}

	@Test
	void testFindSongsById() {
		Song findSongByID = sc.findSongsById("001");	
		assertEquals(findSongByID, s1);
	}

	@Test
	void testFindSongByTitle() {
		Song findSongByTitle = sc.findSongByTitle("MONTERO");
		assertEquals(findSongByTitle, s3);
	}

}
