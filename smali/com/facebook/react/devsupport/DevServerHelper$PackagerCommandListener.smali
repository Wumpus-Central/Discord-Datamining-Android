.class public interface abstract Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/DevServerHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PackagerCommandListener"
.end annotation


# virtual methods
.method public abstract customCommandHandlers()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onCaptureHeapCommand(Lcom/facebook/react/packagerconnection/Responder;)V
.end method

.method public abstract onPackagerConnected()V
.end method

.method public abstract onPackagerDevMenuCommand()V
.end method

.method public abstract onPackagerDisconnected()V
.end method

.method public abstract onPackagerReloadCommand()V
.end method
