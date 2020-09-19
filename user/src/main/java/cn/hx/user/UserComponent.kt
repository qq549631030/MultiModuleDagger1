package cn.hx.user

import dagger.Subcomponent

@UserScope
@Subcomponent(modules = [UserModule::class])
interface UserComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(userActivity: UserActivity)
}