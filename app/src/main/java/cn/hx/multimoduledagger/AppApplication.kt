package cn.hx.multimoduledagger

import cn.hx.base.BaseApplication
import cn.hx.news.NewsComponent
import cn.hx.news.NewsComponentProvider
import cn.hx.user.UserComponent
import cn.hx.user.UserComponentProvider

class AppApplication : BaseApplication(), NewsComponentProvider, UserComponentProvider {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }

    override fun provideNewsComponent(): NewsComponent {
        return appComponent.newsComponentFactory().create()
    }

    override fun provideUserComponent(): UserComponent {
        return appComponent.userComponentFactory().create()
    }
}