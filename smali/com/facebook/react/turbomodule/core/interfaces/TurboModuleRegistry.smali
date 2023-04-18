.class public interface abstract Lcom/facebook/react/turbomodule/core/interfaces/TurboModuleRegistry;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getEagerInitModuleNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getModule(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;
.end method

.method public abstract getModules()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;",
            ">;"
        }
    .end annotation
.end method

.method public abstract hasModule(Ljava/lang/String;)Z
.end method
