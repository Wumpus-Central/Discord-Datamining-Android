.class Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;
.super Lcom/facebook/react/bridge/GuardedAsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/camera/ImageStoreManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetBase64Task"
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
.field private final mError:Lcom/facebook/react/bridge/Callback;

.field private final mSuccess:Lcom/facebook/react/bridge/Callback;

.field private final mUri:Ljava/lang/String;

.field final synthetic this$0:Lcom/facebook/react/modules/camera/ImageStoreManager;


# direct methods
.method private constructor <init>(Lcom/facebook/react/modules/camera/ImageStoreManager;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->this$0:Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedAsyncTask;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 4
    iput-object p3, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mUri:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mSuccess:Lcom/facebook/react/bridge/Callback;

    .line 6
    iput-object p5, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mError:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/modules/camera/ImageStoreManager;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/modules/camera/ImageStoreManager$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;-><init>(Lcom/facebook/react/modules/camera/ImageStoreManager;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackgroundGuarded([Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->doInBackgroundGuarded([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs doInBackgroundGuarded([Ljava/lang/Void;)V
    .locals 5

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->this$0:Lcom/facebook/react/modules/camera/ImageStoreManager;

    invoke-static {v1}, Lcom/facebook/react/modules/camera/ImageStoreManager;->access$100(Lcom/facebook/react/modules/camera/ImageStoreManager;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mUri:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    :try_start_1
    iget-object v2, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mSuccess:Lcom/facebook/react/bridge/Callback;

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->this$0:Lcom/facebook/react/modules/camera/ImageStoreManager;

    invoke-virtual {v4, v1}, Lcom/facebook/react/modules/camera/ImageStoreManager;->convertInputStreamToBase64OutputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, p1

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :goto_0
    :try_start_2
    invoke-static {v1}, Lcom/facebook/react/modules/camera/ImageStoreManager;->access$200(Ljava/io/Closeable;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_1

    :catch_0
    move-exception v2

    .line 7
    :try_start_3
    iget-object v3, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mError:Lcom/facebook/react/bridge/Callback;

    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, p1

    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 8
    :goto_1
    :try_start_4
    invoke-static {v1}, Lcom/facebook/react/modules/camera/ImageStoreManager;->access$200(Ljava/io/Closeable;)V

    .line 9
    throw v2
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v1

    .line 10
    iget-object v2, p0, Lcom/facebook/react/modules/camera/ImageStoreManager$GetBase64Task;->mError:Lcom/facebook/react/bridge/Callback;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, p1

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
