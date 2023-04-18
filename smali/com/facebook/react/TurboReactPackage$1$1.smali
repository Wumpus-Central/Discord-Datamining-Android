.class Lcom/facebook/react/TurboReactPackage$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/TurboReactPackage$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/facebook/react/bridge/ModuleHolder;",
        ">;",
        "Lj$/util/Iterator;"
    }
.end annotation


# instance fields
.field nextEntry:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/module/model/ReactModuleInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$1:Lcom/facebook/react/TurboReactPackage$1;


# direct methods
.method constructor <init>(Lcom/facebook/react/TurboReactPackage$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/TurboReactPackage$1$1;->this$1:Lcom/facebook/react/TurboReactPackage$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method private findNext()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->this$1:Lcom/facebook/react/TurboReactPackage$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/facebook/react/TurboReactPackage$1;->val$entrySetIterator:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->this$1:Lcom/facebook/react/TurboReactPackage$1;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/facebook/react/TurboReactPackage$1;->val$entrySetIterator:Ljava/util/Iterator;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 26
    .line 27
    sget-boolean v2, Lcom/facebook/react/config/ReactFeatureFlags;->useTurboModules:Z

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/facebook/react/module/model/ReactModuleInfo;->isTurboModule()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method


# virtual methods
.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/react/TurboReactPackage$1$1;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage$1$1;->findNext()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method

.method public next()Lcom/facebook/react/bridge/ModuleHolder;
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage$1$1;->findNext()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/TurboReactPackage$1$1;->nextEntry:Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/facebook/react/TurboReactPackage$1$1;->findNext()V

    .line 6
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 8
    new-instance v2, Lcom/facebook/react/bridge/ModuleHolder;

    new-instance v3, Lcom/facebook/react/TurboReactPackage$ModuleHolderProvider;

    iget-object v4, p0, Lcom/facebook/react/TurboReactPackage$1$1;->this$1:Lcom/facebook/react/TurboReactPackage$1;

    iget-object v5, v4, Lcom/facebook/react/TurboReactPackage$1;->this$0:Lcom/facebook/react/TurboReactPackage;

    iget-object v4, v4, Lcom/facebook/react/TurboReactPackage$1;->val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {v3, v5, v1, v4}, Lcom/facebook/react/TurboReactPackage$ModuleHolderProvider;-><init>(Lcom/facebook/react/TurboReactPackage;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-direct {v2, v0, v3}, Lcom/facebook/react/bridge/ModuleHolder;-><init>(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V

    return-object v2

    .line 9
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "ModuleHolder not found"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/TurboReactPackage$1$1;->next()Lcom/facebook/react/bridge/ModuleHolder;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot remove native modules from the list"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
