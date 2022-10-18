package com.elbehiry.shared.data.pref.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\'\u0010\b\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/data/pref/repository/DataStoreOperations;", "", "read", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "save", "", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public abstract interface DataStoreOperations {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.lang.Boolean>> read(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> key);
}