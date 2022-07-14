package com.ads.web.one.aceoneadmin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AdapterDetails extends FragmentPagerAdapter {
    public AdapterDetails(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new KYCVerificationFragment();

        } else {
            return new ToBeApprovedLoansFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "KYC Verification";
        } else {
            return "To Be Approved";
        }
    }
}
