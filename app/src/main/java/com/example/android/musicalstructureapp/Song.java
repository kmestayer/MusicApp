package com.example.android.musicalstructureapp;

/**
 * {@link Song} represents a song the user has in the Music Library.
 */
public class Song {

    /** Song name */
    private String mSongName;

    /** Band name */
    private String mBandName;

    /**
     * Create a new Song object.
     *
     * @param songName is the song name
     * @param bandName is the band name
     */
    public Song(String songName, String bandName) {
        mSongName = songName;
        mBandName = bandName;
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the band name.
     */
    public String getBandName() {
        return mBandName;
    }

}
