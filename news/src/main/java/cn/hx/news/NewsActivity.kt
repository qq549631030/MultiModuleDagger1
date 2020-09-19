package cn.hx.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_news.*
import javax.inject.Inject

class NewsActivity : AppCompatActivity() {

    @Inject
    lateinit var set: Set<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        NewsComponentHolder.newsComponent.inject(this)
        text.text = set.toString()
    }
}