package cn.hx.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user.*
import javax.inject.Inject

class UserActivity : AppCompatActivity() {

    @Inject
    lateinit var set: Set<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        UserComponentHolder.userComponent.inject(this)
        text.text = set.toString()
    }
}