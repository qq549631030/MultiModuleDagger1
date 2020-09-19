package cn.hx.news

import dagger.Subcomponent

@Subcomponent(modules = [NewsModule::class])
interface NewsComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): NewsComponent
    }

    fun inject(newsActivity: NewsActivity)
}