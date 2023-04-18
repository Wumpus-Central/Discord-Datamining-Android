.class final Lcom/discord/file_manager/FileManagerModule$writeFile$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/file_manager/FileManagerModule;->writeFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.file_manager.FileManagerModule$writeFile$1"
    f = "FileManagerModule.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $data:Ljava/lang/String;

.field final synthetic $encoding:Ljava/lang/String;

.field final synthetic $path:Ljava/lang/String;

.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;

.field final synthetic $storageDir:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/discord/file_manager/FileManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/file_manager/FileManagerModule;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/file_manager/FileManagerModule;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/Promise;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/file_manager/FileManagerModule$writeFile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->this$0:Lcom/discord/file_manager/FileManagerModule;

    iput-object p2, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$storageDir:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iput-object p4, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$path:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$encoding:Ljava/lang/String;

    iput-object p6, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$data:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/discord/file_manager/FileManagerModule$writeFile$1;

    iget-object v1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->this$0:Lcom/discord/file_manager/FileManagerModule;

    iget-object v2, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$storageDir:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iget-object v4, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$path:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$encoding:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$data:Ljava/lang/String;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/discord/file_manager/FileManagerModule$writeFile$1;-><init>(Lcom/discord/file_manager/FileManagerModule;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/file_manager/FileManagerModule$writeFile$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 1
    iget v0, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->label:I

    if-nez v0, :cond_6

    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->this$0:Lcom/discord/file_manager/FileManagerModule;

    invoke-static {p1}, Lcom/discord/file_manager/FileManagerModule;->access$getStorageDirs$p(Lcom/discord/file_manager/FileManagerModule;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$storageDir:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 4
    iget-object v0, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$storageDir:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->this$0:Lcom/discord/file_manager/FileManagerModule;

    invoke-static {v1}, Lcom/discord/file_manager/FileManagerModule;->access$getStorageDirs$p(Lcom/discord/file_manager/FileManagerModule;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown storage directory "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Supported storage directories: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "err"

    .line 5
    invoke-interface {p1, v1, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    .line 7
    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->this$0:Lcom/discord/file_manager/FileManagerModule;

    invoke-static {p1}, Lcom/discord/file_manager/FileManagerModule;->access$getStorageDirs$p(Lcom/discord/file_manager/FileManagerModule;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$storageDir:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    .line 8
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$path:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    if-eqz v1, :cond_4

    .line 10
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v3

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to create parent directory "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-interface {p1, v3, v1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_4
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$encoding:Ljava/lang/String;

    const-string v1, "base64"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/io/FileOutputStream;

    .line 14
    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget-object v1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$data:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/FileOutputStream;->write([B)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p1, v3}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {p1, v0}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_5
    new-instance p1, Ljava/io/FileOutputStream;

    .line 15
    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget-object v1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$data:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    sget-object v2, Lpi/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/io/FileOutputStream;->write([B)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-static {p1, v3}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 16
    :goto_3
    iget-object p1, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_4

    :catchall_2
    move-exception v0

    .line 17
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v1

    :try_start_8
    invoke-static {p1, v0}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p1

    .line 18
    iget-object v0, p0, Lcom/discord/file_manager/FileManagerModule$writeFile$1;->$promise:Lcom/facebook/react/bridge/Promise;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 19
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    .line 20
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
