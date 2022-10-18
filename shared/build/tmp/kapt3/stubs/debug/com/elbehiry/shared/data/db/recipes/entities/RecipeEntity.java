package com.elbehiry.shared.data.db.recipes.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "recipes", primaryKeys = {"recipeId"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\bI\b\u0087\b\u0018\u00002\u00020\u0001:\u0001XB\u00c5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0010H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0010H\u00c6\u0003J\t\u0010D\u001a\u00020\u0010H\u00c6\u0003J\t\u0010E\u001a\u00020\u0010H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0010H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\u0007H\u00c6\u0003J\t\u0010N\u001a\u00020\u0007H\u00c6\u0003J\t\u0010O\u001a\u00020\u0007H\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\t\u0010R\u001a\u00020\u0007H\u00c6\u0003J\u00f9\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010T\u001a\u00020\u00072\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001J\t\u0010W\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\u0019\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0016\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0016\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0016\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\"\u00a8\u0006Y"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;", "", "recipeId", "", "title", "", "sustainable", "", "glutenFree", "veryPopular", "vegetarian", "dairyFree", "veryHealthy", "vegan", "cheap", "spoonScore", "", "aggregateLikes", "sourceName", "creditsText", "readyInMinutes", "image", "percentCarbs", "percentProtein", "percentFat", "nutrientsAmount", "nutrientsName", "ingredientOriginalString", "steps", "servings", "(ILjava/lang/String;ZZZZZZZZDILjava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAggregateLikes", "()I", "getCheap", "()Z", "getCreditsText", "()Ljava/lang/String;", "getDairyFree", "getGlutenFree", "getImage", "getIngredientOriginalString", "getNutrientsAmount", "()D", "getNutrientsName", "getPercentCarbs", "getPercentFat", "getPercentProtein", "getReadyInMinutes", "getRecipeId", "getServings", "getSourceName", "getSpoonScore", "getSteps", "getSustainable", "getTitle", "getVegan", "getVegetarian", "getVeryHealthy", "getVeryPopular", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Schema", "shared_debug"})
public final class RecipeEntity {
    @androidx.room.ColumnInfo(name = "recipeId")
    private final int recipeId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "recipeTitle")
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "sustainable")
    private final boolean sustainable = false;
    @androidx.room.ColumnInfo(name = "glutenFree")
    private final boolean glutenFree = false;
    @androidx.room.ColumnInfo(name = "veryPopular")
    private final boolean veryPopular = false;
    @androidx.room.ColumnInfo(name = "vegetarian")
    private final boolean vegetarian = false;
    @androidx.room.ColumnInfo(name = "dairyFree")
    private final boolean dairyFree = false;
    @androidx.room.ColumnInfo(name = "veryHealthy")
    private final boolean veryHealthy = false;
    @androidx.room.ColumnInfo(name = "vegan")
    private final boolean vegan = false;
    @androidx.room.ColumnInfo(name = "cheap")
    private final boolean cheap = false;
    @androidx.room.ColumnInfo(name = "spoonScore")
    private final double spoonScore = 0.0;
    @androidx.room.ColumnInfo(name = "aggregateLikes")
    private final int aggregateLikes = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sourceName")
    private final java.lang.String sourceName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "creditsText")
    private final java.lang.String creditsText = null;
    @androidx.room.ColumnInfo(name = "readyInMinutes")
    private final int readyInMinutes = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "image")
    private final java.lang.String image = null;
    @androidx.room.ColumnInfo(name = "percentCarbs")
    private final double percentCarbs = 0.0;
    @androidx.room.ColumnInfo(name = "percentProtein")
    private final double percentProtein = 0.0;
    @androidx.room.ColumnInfo(name = "percentFat")
    private final double percentFat = 0.0;
    @androidx.room.ColumnInfo(name = "nutrientsAmount")
    private final double nutrientsAmount = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nutrientsName")
    private final java.lang.String nutrientsName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ingredientOriginalString")
    private final java.lang.String ingredientOriginalString = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "steps")
    private final java.lang.String steps = null;
    @androidx.room.ColumnInfo(name = "servings")
    private final int servings = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.elbehiry.shared.data.db.recipes.entities.RecipeEntity copy(int recipeId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean sustainable, boolean glutenFree, boolean veryPopular, boolean vegetarian, boolean dairyFree, boolean veryHealthy, boolean vegan, boolean cheap, double spoonScore, int aggregateLikes, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceName, @org.jetbrains.annotations.NotNull()
    java.lang.String creditsText, int readyInMinutes, @org.jetbrains.annotations.NotNull()
    java.lang.String image, double percentCarbs, double percentProtein, double percentFat, double nutrientsAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String nutrientsName, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientOriginalString, @org.jetbrains.annotations.NotNull()
    java.lang.String steps, int servings) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RecipeEntity(int recipeId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean sustainable, boolean glutenFree, boolean veryPopular, boolean vegetarian, boolean dairyFree, boolean veryHealthy, boolean vegan, boolean cheap, double spoonScore, int aggregateLikes, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceName, @org.jetbrains.annotations.NotNull()
    java.lang.String creditsText, int readyInMinutes, @org.jetbrains.annotations.NotNull()
    java.lang.String image, double percentCarbs, double percentProtein, double percentFat, double nutrientsAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String nutrientsName, @org.jetbrains.annotations.NotNull()
    java.lang.String ingredientOriginalString, @org.jetbrains.annotations.NotNull()
    java.lang.String steps, int servings) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getRecipeId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getSustainable() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getGlutenFree() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getVeryPopular() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getVegetarian() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getDairyFree() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getVeryHealthy() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getVegan() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getCheap() {
        return false;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getSpoonScore() {
        return 0.0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getAggregateLikes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreditsText() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getReadyInMinutes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double getPercentCarbs() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double getPercentProtein() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double getPercentFat() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getNutrientsAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNutrientsName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIngredientOriginalString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSteps() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int getServings() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity$Schema;", "", "()V", "AGGREGATE_LIKES", "", "CHEAP", "CREDIT_TEXT", "DAIRY_FREE", "GLUTEN_FREE", "IMAGE", "INGREDIENT_TITLE", "NUTRIENTS_AMOUNT", "NUTRIENTS_NAME", "PERCENT_CARBS", "PERCENT_FAT", "PERCENT_PROTEIN", "READY_MINUTES", "RECIPE_ID", "RECIPE_TITLE", "SERVINGS", "SOURCE_NAME", "SPOON_SCORE", "STEPS", "SUSTAINABLE", "TABLE_NAME", "VEGAN", "VEGETARIAN", "VERY_HEALTHY", "VERY_POPULAR", "shared_debug"})
    public static final class Schema {
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.data.db.recipes.entities.RecipeEntity.Schema INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "recipes";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RECIPE_ID = "recipeId";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RECIPE_TITLE = "recipeTitle";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUSTAINABLE = "sustainable";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GLUTEN_FREE = "glutenFree";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VERY_POPULAR = "veryPopular";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VEGETARIAN = "vegetarian";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DAIRY_FREE = "dairyFree";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VERY_HEALTHY = "veryHealthy";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VEGAN = "vegan";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CHEAP = "cheap";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AGGREGATE_LIKES = "aggregateLikes";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SOURCE_NAME = "sourceName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CREDIT_TEXT = "creditsText";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String READY_MINUTES = "readyInMinutes";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IMAGE = "image";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String INGREDIENT_TITLE = "ingredientOriginalString";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String STEPS = "steps";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PERCENT_CARBS = "percentCarbs";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PERCENT_PROTEIN = "percentProtein";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PERCENT_FAT = "percentFat";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NUTRIENTS_AMOUNT = "nutrientsAmount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NUTRIENTS_NAME = "nutrientsName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPOON_SCORE = "spoonScore";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SERVINGS = "servings";
        
        private Schema() {
            super();
        }
    }
}