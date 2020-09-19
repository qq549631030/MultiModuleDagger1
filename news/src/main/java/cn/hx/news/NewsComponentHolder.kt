package cn.hx.news

import cn.hx.base.BaseApplication

object NewsComponentHolder {
    val newsComponent: NewsComponent by lazy {
        (BaseApplication.instance as NewsComponentProvider).provideNewsComponent()
    }
}