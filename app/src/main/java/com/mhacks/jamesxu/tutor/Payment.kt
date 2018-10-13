package com.mhacks.jamesxu.tutor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.stripe.android.view.CardInputWidget
import kotlinx.android.synthetic.main.activity_payment.*
import com.stripe.android.Stripe
import com.stripe.android.model.Card
import com.stripe.android.model.Token

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        var mCardInputWidget = findViewById(R.id.card_input_widget) as CardInputWidget
        var cardToSave = mCardInputWidget.getCard()

        confirmButton.setOnClickListener {
            var email = emailText.text.toString()
            var name = cardName.text.toString()
            var zipcode = cardZipcode.text.toString()
            if (cardToSave == null || email.isEmpty() || name.isEmpty() || zipcode.isEmpty()) {
                // required thing not filled out, show error
                mErrorDialogHandler.showError("Invalid Card Data")
            } else{
                cardToSave.setName(name)
                cardToSave.setAddressZip(zipcode)
                Stripe stripe = new Stripe(this, "pk_test_CEoosQdAEJVayfcUxgFCuwJ7")
            }
        }
    }
}
