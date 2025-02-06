package com.sddevops.jenkins_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongTest {
	
	private Song s1;
	

	@BeforeEach
	void setUp() throws Exception {
		s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59);
	}

	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
	}

	@Test
	void testGetId() {
		assertEquals(s1.getId(), "001");
	}

	@Test
	void testSetId() {
		s1.setId("005");
		assertEquals(s1.getId(), "005");
	}

	@Test
	void testGetTitle() {
		String songTitle = s1.getTitle();
		assertEquals(songTitle, "good 4 u");
	}

	@Test
	void testSetTitle() {
		s1.setTitle("hello world");
		assertEquals(s1.getTitle(), "hello world");
	}

	@Test
	void testGetArtiste() {
		assertEquals(s1.getArtiste(), "Olivia Rodrigo");
	}

	@Test
	void testSetArtiste() {
		s1.setArtiste("hello world");
		assertEquals(s1.getArtiste(), "hello world");
	}

	@Test
	void testGetSongLength() {
		assertEquals(s1.getSongLength(), 3.59);
	}

	@Test
	void testSetSongLength() {
		s1.setSongLength(3.33);
		assertEquals(s1.getSongLength(), 3.33);
	}

}
