package com.mhacks.jamesxu.tutor.payment.controller;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentManager;
import com.mhacks.jamesxu.tutor.payment.dialog.ProgressDialogFragment;

/**
 * Class used to show and hide the progress spinner.
 */
public class ProgressDialogController {

    private FragmentManager mFragmentManager;
    private ProgressDialogFragment mProgressFragment;

    public ProgressDialogController(@NonNull FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
        mProgressFragment = ProgressDialogFragment.newInstance(R.string.progressMessage);
    }

    public void setMessageResource(@StringRes int resId) {
        if (mProgressFragment.isVisible()) {
            mProgressFragment.dismiss();
            mProgressFragment = null;
        }
        mProgressFragment = ProgressDialogFragment.newInstance(resId);
    }

    public void startProgress() {
        mProgressFragment.show(mFragmentManager, "progress");
    }

    public void finishProgress() {
        mProgressFragment.dismiss();
    }
}
