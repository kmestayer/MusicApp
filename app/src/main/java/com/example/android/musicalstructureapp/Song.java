package com.example.android.musicalstructureapp;

/**
 * {@link Song} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Song {

    /** Default translation for the word */
    private String mSongName;

    /** Miwok translation for the word */
    private String mBandName;

    /**
     * Create a new Word object.
     *
     * @param songName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param bandName is the word in the Miwok language
     */
    public Song(String songName, String bandName) {
        mSongName = songName;
        mBandName = bandName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getBandName() {
        return mBandName;
    }

}
