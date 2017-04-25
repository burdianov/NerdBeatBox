package com.crackncrunch.nerdbeatbox.view_models;

import com.crackncrunch.nerdbeatbox.BeatBox;
import com.crackncrunch.nerdbeatbox.Sound;

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
    }
}
