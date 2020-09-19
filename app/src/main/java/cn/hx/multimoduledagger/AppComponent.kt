package cn.hx.multimoduledagger

import android.content.Context
import cn.hx.news.NewsComponent
import cn.hx.user.UserComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun newsComponentFactory(): NewsComponent.Factory

    fun userComponentFactory(): UserComponent.Factory
}