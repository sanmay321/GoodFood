package com.elbehiry.shared.data.db.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/elbehiry/shared/data/db/di/DatabaseModule;", "", "()V", "provideDelishDatabase", "Lcom/elbehiry/shared/data/db/DelishDataBase;", "context", "Landroid/content/Context;", "provideJsonConverter", "Lcom/elbehiry/shared/data/db/JsonConverter;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideRecipeDataStore", "Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;", "recipesTable", "Lcom/elbehiry/shared/data/db/recipes/tables/RecipesTable;", "recipeMapper", "Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapper;", "provideRecipesMapper", "jsonConverter", "provideRecipesTable", "delishDataBase", "shared_debug"})
@dagger.Module()
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.elbehiry.shared.data.db.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.elbehiry.shared.data.db.DelishDataBase provideDelishDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.elbehiry.shared.data.db.recipes.tables.RecipesTable provideRecipesTable(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.DelishDataBase delishDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.elbehiry.shared.data.db.JsonConverter provideJsonConverter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.elbehiry.shared.data.db.recipes.mapper.RecipeMapper provideRecipesMapper(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.JsonConverter jsonConverter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore provideRecipeDataStore(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.tables.RecipesTable recipesTable, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.mapper.RecipeMapper recipeMapper) {
        return null;
    }
}