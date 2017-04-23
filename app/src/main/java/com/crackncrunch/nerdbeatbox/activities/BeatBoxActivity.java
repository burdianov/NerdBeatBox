package com.crackncrunch.nerdbeatbox.activities;

import android.support.v4.app.Fragment;

import com.crackncrunch.nerdbeatbox.fragments.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
