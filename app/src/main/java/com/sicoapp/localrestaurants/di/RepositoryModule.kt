package com.sicoapp.localrestaurants.di

import com.sicoapp.localrestaurants.data.local.database.DatabaseDataSource
import com.sicoapp.localrestaurants.data.remote.NetworkDataSource
import com.sicoapp.localrestaurants.domain.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        networkDataSource: NetworkDataSource,
        databaseDataSource: DatabaseDataSource
    ): Repository {
        return Repository(
            networkDataSource = networkDataSource,
            databaseDataSource = databaseDataSource
        )
    }
}



