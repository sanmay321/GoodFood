package com.elbehiry.shared.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\r\u0010\u0011\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0004H\u0007J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0014H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/elbehiry/shared/di/SharedModule;", "", "()V", "provideCommonHeaderInterceptor", "Lokhttp3/Interceptor;", "provideDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "context", "Landroid/content/Context;", "provideDataStoreRepository", "Lcom/elbehiry/shared/data/pref/repository/DataStoreOperations;", "dataStore", "provideDelishApi", "Lcom/elbehiry/shared/data/remote/DelishApi;", "retrofit", "Lretrofit2/Retrofit;", "provideHttpLoggingInterceptor", "provideHttpLoggingInterceptor$shared_debug", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "provideOkHttp", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "provideRetroFit", "okHttpClient", "moshi", "shared_debug"})
@dagger.Module()
public final class SharedModule {
    
    public SharedModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> provideDataStore(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.elbehiry.shared.data.pref.repository.DataStoreOperations provideDataStoreRepository(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "logging")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Interceptor provideHttpLoggingInterceptor$shared_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "header")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideCommonHeaderInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttp(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "logging")
    okhttp3.Interceptor httpLoggingInterceptor) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetroFit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.elbehiry.shared.data.remote.DelishApi provideDelishApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}