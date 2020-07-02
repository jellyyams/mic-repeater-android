package com.kylecombes.micrepeater;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    private int[] mLayoutFiles;

    public ScreenSlidePagerAdapter(FragmentActivity fa, int[] layoutFiles) {
        super(fa);
        mLayoutFiles = layoutFiles;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ScreenSlidePageFragment.newInstance(position, mLayoutFiles[position]);
    }

    @Override
    public int getItemCount() {
        return mLayoutFiles.length;
    }
}