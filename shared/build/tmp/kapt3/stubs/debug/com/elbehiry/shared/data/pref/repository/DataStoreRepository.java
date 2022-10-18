package com.elbehiry.shared.data.pref.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\'\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/elbehiry/shared/data/pref/repository/DataStoreRepository;", "Lcom/elbehiry/shared/data/pref/repository/DataStoreOperations;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "read", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "save", "", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class DataStoreRepository implements com.elbehiry.shared.data.pref.repository.DataStoreOperations {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    
    @javax.inject.Inject()
    public DataStoreRepository(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.lang.Boolean>> read(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key) {
        return null;
    }
}