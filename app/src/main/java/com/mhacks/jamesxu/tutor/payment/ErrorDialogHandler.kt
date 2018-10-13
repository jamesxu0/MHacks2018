package com.mhacks.jamesxu.tutor.payment

import android.support.v4.app.FragmentManager
import com.mhacks.jamesxu.tutor.R
import com.mhacks.jamesxu.tutor.payment.dialog.ErrorDialogFragment


/**
 * A convenience class to handle displaying error dialogs.
 */
class ErrorDialogHandler(private var mFragmentManager: FragmentManager) {

    fun showError(errorMessage: String) {
        val fragment = ErrorDialogFragment.newInstance(
            R.string.validationErrors, errorMessage
        )
        fragment.show(mFragmentManager, "error")
    }
}