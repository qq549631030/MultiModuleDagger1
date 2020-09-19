package cn.hx.multimoduledagger

import cn.hx.news.NewsComponent
import cn.hx.user.UserComponent
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module(subcomponents = [NewsComponent::class, UserComponent::class])
class AppModule {

    @IntoSet
    @Provides
    fun provideString(): String {
        return "app"
    }
}