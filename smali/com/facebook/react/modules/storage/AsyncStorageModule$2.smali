.class Lcom/facebook/react/modules/storage/AsyncStorageModule$2;
.super Lcom/facebook/react/bridge/GuardedAsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/storage/AsyncStorageModule;->multiSet(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/bridge/GuardedAsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

.field final synthetic val$callback:Lcom/facebook/react/bridge/Callback;

.field final synthetic val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/storage/AsyncStorageModule;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    iput-object p3, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$callback:Lcom/facebook/react/bridge/Callback;

    iput-object p4, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedAsyncTask;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackgroundGuarded([Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->doInBackgroundGuarded([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs doInBackgroundGuarded([Ljava/lang/Void;)V
    .locals 7

    const-string p1, "ReactNative"

    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v0}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$000(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$callback:Lcom/facebook/react/bridge/Callback;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getDBError(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v0}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);"

    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    .line 5
    :try_start_0
    iget-object v4, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v4}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    move v4, v1

    .line 6
    :goto_0
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_7

    .line 7
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    .line 8
    invoke-static {v3}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getInvalidValueError(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :try_start_1
    iget-object v1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v1}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v0, :cond_1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    :cond_1
    :goto_1
    return-void

    .line 12
    :cond_2
    :try_start_2
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    .line 13
    invoke-static {v3}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getInvalidKeyError(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    :try_start_3
    iget-object v1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v1}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v0, :cond_3

    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    :cond_3
    :goto_2
    return-void

    .line 17
    :cond_4
    :try_start_4
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    .line 18
    invoke-static {v3}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getInvalidValueError(Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 19
    :try_start_5
    iget-object v1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v1}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    move-exception v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v0, :cond_5

    .line 21
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    :cond_5
    :goto_3
    return-void

    .line 22
    :cond_6
    :try_start_6
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 23
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 24
    iget-object v5, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$keyValueArray:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v5, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v6, v5}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 26
    :cond_7
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v0}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 27
    :try_start_7
    iget-object v0, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v0}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v0}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v0

    .line 30
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4, v0}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 32
    :try_start_9
    iget-object v4, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v4}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    :cond_8
    move-object v3, v0

    goto :goto_4

    :catch_5
    move-exception v4

    .line 33
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5, v4}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v0, :cond_8

    .line 34
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    move-object v3, p1

    :goto_4
    if-eqz v3, :cond_9

    .line 35
    iget-object p1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$callback:Lcom/facebook/react/bridge/Callback;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v3, v0, v1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    goto :goto_5

    .line 36
    :cond_9
    iget-object p1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->val$callback:Lcom/facebook/react/bridge/Callback;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    :goto_5
    return-void

    .line 37
    :goto_6
    :try_start_a
    iget-object v1, p0, Lcom/facebook/react/modules/storage/AsyncStorageModule$2;->this$0:Lcom/facebook/react/modules/storage/AsyncStorageModule;

    invoke-static {v1}, Lcom/facebook/react/modules/storage/AsyncStorageModule;->access$100(Lcom/facebook/react/modules/storage/AsyncStorageModule;)Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/storage/ReactDatabaseSupplier;->get()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    goto :goto_7

    :catch_6
    move-exception v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lw3/a;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/facebook/react/modules/storage/AsyncStorageErrorUtil;->getError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    .line 40
    :goto_7
    throw v0
.end method
