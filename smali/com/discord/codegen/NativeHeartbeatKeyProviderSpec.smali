.class public abstract Lcom/discord/codegen/NativeHeartbeatKeyProviderSpec;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReactModuleWithSpec;
.implements Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method


# virtual methods
.method public abstract getHeartbeatInitializedTimestamp()Ljava/lang/String;
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract getHeartbeatRefreshedTimestamp()Ljava/lang/String;
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract getHeartbeatUUID()Ljava/lang/String;
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract getLatestHeartbeatEventTimestamp()Ljava/lang/String;
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract setHeartbeatInitializedTimestamp(Ljava/lang/String;)V
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract setHeartbeatRefreshedTimestamp(Ljava/lang/String;)V
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract setHeartbeatUUID(Ljava/lang/String;)V
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public abstract setLatestHeartbeatEventTimestamp(Ljava/lang/String;)V
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method
