package igor.durmic.pronadjime.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import igor.durmic.pronadjime.view_models.ViewModelProviderFactory

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory?): ViewModelProvider.Factory?
}