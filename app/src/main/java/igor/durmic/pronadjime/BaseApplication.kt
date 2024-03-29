package igor.durmic.pronadjime

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import igor.durmic.pronadjime.di.DaggerAppComponent

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}