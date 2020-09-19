package cn.hx.user

import cn.hx.base.BaseApplication

object UserComponentHolder {
    val userComponent: UserComponent by lazy {
        (BaseApplication.instance as UserComponentProvider).provideUserComponent()
    }
}