package com.example.bottomnavigationwithtablayout.FragmentVideo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bottomnavigationwithtablayout.fragment.AccountFragment;
import com.example.bottomnavigationwithtablayout.fragment.HomeFragment;
import com.example.bottomnavigationwithtablayout.fragment.NotificationFragment;
import com.example.bottomnavigationwithtablayout.fragment.VideoFragment;

public class VideoViewPagerAdapter extends FragmentStateAdapter {


    public VideoViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new LongFragment();

            case 1:
                return new ShortFragment();

            case 2:
                return new WatchedFragment();

            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Long videos";
            case 1:
                return "Short videos";
            case 2:
                return "Videos watched";
            default:
                return "Long videos";
        }
    }
}
