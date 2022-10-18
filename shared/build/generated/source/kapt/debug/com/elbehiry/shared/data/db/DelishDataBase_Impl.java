package com.elbehiry.shared.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.elbehiry.shared.data.db.recipes.tables.RecipesTable;
import com.elbehiry.shared.data.db.recipes.tables.RecipesTable_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DelishDataBase_Impl extends DelishDataBase {
  private volatile RecipesTable _recipesTable;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recipes` (`recipeId` INTEGER NOT NULL, `recipeTitle` TEXT NOT NULL, `sustainable` INTEGER NOT NULL, `glutenFree` INTEGER NOT NULL, `veryPopular` INTEGER NOT NULL, `vegetarian` INTEGER NOT NULL, `dairyFree` INTEGER NOT NULL, `veryHealthy` INTEGER NOT NULL, `vegan` INTEGER NOT NULL, `cheap` INTEGER NOT NULL, `spoonScore` REAL NOT NULL, `aggregateLikes` INTEGER NOT NULL, `sourceName` TEXT NOT NULL, `creditsText` TEXT NOT NULL, `readyInMinutes` INTEGER NOT NULL, `image` TEXT NOT NULL, `percentCarbs` REAL NOT NULL, `percentProtein` REAL NOT NULL, `percentFat` REAL NOT NULL, `nutrientsAmount` REAL NOT NULL, `nutrientsName` TEXT NOT NULL, `ingredientOriginalString` TEXT NOT NULL, `steps` TEXT NOT NULL, `servings` INTEGER NOT NULL, PRIMARY KEY(`recipeId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'aaeb156a1e40ab9167bab71a36e9e437')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `recipes`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRecipes = new HashMap<String, TableInfo.Column>(24);
        _columnsRecipes.put("recipeId", new TableInfo.Column("recipeId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("recipeTitle", new TableInfo.Column("recipeTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("sustainable", new TableInfo.Column("sustainable", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("glutenFree", new TableInfo.Column("glutenFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("veryPopular", new TableInfo.Column("veryPopular", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("vegetarian", new TableInfo.Column("vegetarian", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("dairyFree", new TableInfo.Column("dairyFree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("veryHealthy", new TableInfo.Column("veryHealthy", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("vegan", new TableInfo.Column("vegan", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("cheap", new TableInfo.Column("cheap", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("spoonScore", new TableInfo.Column("spoonScore", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("aggregateLikes", new TableInfo.Column("aggregateLikes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("sourceName", new TableInfo.Column("sourceName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("creditsText", new TableInfo.Column("creditsText", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("readyInMinutes", new TableInfo.Column("readyInMinutes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("percentCarbs", new TableInfo.Column("percentCarbs", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("percentProtein", new TableInfo.Column("percentProtein", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("percentFat", new TableInfo.Column("percentFat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("nutrientsAmount", new TableInfo.Column("nutrientsAmount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("nutrientsName", new TableInfo.Column("nutrientsName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("ingredientOriginalString", new TableInfo.Column("ingredientOriginalString", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("steps", new TableInfo.Column("steps", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipes.put("servings", new TableInfo.Column("servings", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipes = new TableInfo("recipes", _columnsRecipes, _foreignKeysRecipes, _indicesRecipes);
        final TableInfo _existingRecipes = TableInfo.read(_db, "recipes");
        if (! _infoRecipes.equals(_existingRecipes)) {
          return new RoomOpenHelper.ValidationResult(false, "recipes(com.elbehiry.shared.data.db.recipes.entities.RecipeEntity).\n"
                  + " Expected:\n" + _infoRecipes + "\n"
                  + " Found:\n" + _existingRecipes);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "aaeb156a1e40ab9167bab71a36e9e437", "4b3d71ebf8e6dee3428097d2b3619092");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "recipes");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `recipes`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RecipesTable getRecipesTable() {
    if (_recipesTable != null) {
      return _recipesTable;
    } else {
      synchronized(this) {
        if(_recipesTable == null) {
          _recipesTable = new RecipesTable_Impl(this);
        }
        return _recipesTable;
      }
    }
  }
}
