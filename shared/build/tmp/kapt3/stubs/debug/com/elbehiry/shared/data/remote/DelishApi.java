package com.elbehiry.shared.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J%\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ3\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J3\u0010\u0014\u001a\u00020\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019JW\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u000b2\b\b\u0003\u0010\u001e\u001a\u00020\u000b2\b\b\u0003\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010 \u001a\u00020\u00122\b\b\u0001\u0010!\u001a\u00020\u00122\b\b\u0003\u0010\"\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#JU\u0010$\u001a\u00020%2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010)\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/elbehiry/shared/data/remote/DelishApi;", "", "getAvailableCuisines", "", "Lcom/elbehiry/model/CuisineItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIngredients", "Lcom/elbehiry/model/IngredientItem;", "getMealsPlan", "Lcom/elbehiry/model/MealsPlan;", "apiKey", "", "timeFrame", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomRecipes", "Lcom/elbehiry/model/Recipes;", "tags", "number", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeInformation", "Lcom/elbehiry/model/Recipe;", "id", "includeNutrition", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/elbehiry/model/VenuesResult;", "latLng", "version", "clientId", "clientSecret", "radius", "limit", "categoryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRecipes", "Lcom/elbehiry/model/SearchItem;", "query", "cuisine", "addRecipeInformation", "offset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public abstract interface DelishApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "recipes/random")
    public abstract java.lang.Object getRandomRecipes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "tags")
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "number")
    java.lang.Integer number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.Recipes> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://firebasestorage.googleapis.com/v0/b/delish-d4e2b.appspot.com/o/getCuisines.json?alt=media&token=20daa785-e0e4-4ef5-97f8-b8c62f106900")
    public abstract java.lang.Object getAvailableCuisines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.CuisineItem>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://firebasestorage.googleapis.com/v0/b/delish-d4e2b.appspot.com/o/ingredients.json?alt=media&token=9361ddbe-b7e9-4d18-b9a9-530f222e4890")
    public abstract java.lang.Object getIngredients(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.IngredientItem>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "recipes/{id}/information")
    public abstract java.lang.Object getRecipeInformation(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "id")
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "includeNutrition")
    java.lang.Boolean includeNutrition, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.Recipe> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/recipes/complexSearch")
    public abstract java.lang.Object searchRecipes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "cuisine")
    java.lang.String cuisine, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "addRecipeInformation")
    java.lang.Boolean addRecipeInformation, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "number")
    java.lang.Integer number, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.SearchItem> p6);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/mealplanner/generate")
    public abstract java.lang.Object getMealsPlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "timeFrame")
    java.lang.String timeFrame, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.MealsPlan> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://api.foursquare.com/v2/venues/search")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ll")
    java.lang.String latLng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "v")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_secret")
    java.lang.String clientSecret, @retrofit2.http.Query(value = "radius")
    int radius, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "categoryId")
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.VenuesResult> p7);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}