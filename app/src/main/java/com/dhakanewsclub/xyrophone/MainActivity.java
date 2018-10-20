package com.dhakanewsclub.xyrophone;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.media.AudioManager;
import android.media.SoundPool;
import android.widget.AbsListView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private int SoundId;






    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=mSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
        mESoundId=mSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
        mFSoundId=mSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
        mGSoundId=mSoundPool.load(getApplicationContext(), R.raw.note5_g,1);
        mASoundId=mSoundPool.load(getApplicationContext(), R.raw.note6_a,1);
        //mBSoundId=mSoundPool.load(getApplicationContext(), R.raw.note7_b,1);
        mBSoundId=mSoundPool.load(getApplicationContext(), R.raw.videoplayback,1);


        //button id



    }


    // TODO: Add the play methods triggered by the buttons
    public void playC(View v)
    {
        mSoundPool.play(mCSoundId,1.0f,1.0f,0,0,1);

    }

    public void playA(View v)
    {
        mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1);
    }

    public void playB(View v)
    {
        mSoundPool.play(mBSoundId,1.0f,1.0f,0,0,1);
    }

    public void playD(View v)
    {
        mSoundPool.play(mDSoundId,1.0f,1.0f,0,0,1);
    }

    public void playE(View v)
    {
        mSoundPool.play(mESoundId,1.0f,1.0f,0,0,1);
    }

    public void playF(View v)
    {
        mSoundPool.play(mFSoundId,1.0f,1.0f,0,0,1);
    }

    public void playG(View v)
    {
        mSoundPool.play(mGSoundId,1.0f,1.0f,0,0,1);
    }



}
