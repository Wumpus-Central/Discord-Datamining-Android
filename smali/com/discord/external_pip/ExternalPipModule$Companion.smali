.class public final Lcom/discord/external_pip/ExternalPipModule$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/external_pip/ExternalPipModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0008H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/discord/external_pip/ExternalPipModule$Companion;",
        "",
        "()V",
        "NAME",
        "",
        "onPipModeChanged",
        "",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "isInPipMode",
        "",
        "(Lcom/facebook/react/bridge/ReactContext;Z)Lkotlin/Unit;",
        "onUserLeaveHint",
        "(Lcom/facebook/react/bridge/ReactContext;)Lkotlin/Unit;",
        "getModule",
        "Lcom/discord/external_pip/ExternalPipModule;",
        "external_pip_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/external_pip/ExternalPipModule$Companion;-><init>()V

    return-void
.end method

.method private final getModule(Lcom/facebook/react/bridge/ReactContext;)Lcom/discord/external_pip/ExternalPipModule;
    .locals 1

    const-class v0, Lcom/discord/external_pip/ExternalPipModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/discord/external_pip/ExternalPipModule;

    return-object p1
.end method


# virtual methods
.method public final onPipModeChanged(Lcom/facebook/react/bridge/ReactContext;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/discord/external_pip/ExternalPipModule$Companion;->getModule(Lcom/facebook/react/bridge/ReactContext;)Lcom/discord/external_pip/ExternalPipModule;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1, p2}, Lcom/discord/external_pip/ExternalPipModule;->access$onPipModeChanged(Lcom/discord/external_pip/ExternalPipModule;Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final onUserLeaveHint(Lcom/facebook/react/bridge/ReactContext;)Lkotlin/Unit;
    .locals 2

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/discord/external_pip/ExternalPipModule$Companion;->getModule(Lcom/facebook/react/bridge/ReactContext;)Lcom/discord/external_pip/ExternalPipModule;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    sget-object v1, Lcom/discord/external_pip/ExternalPipModule$Companion$onUserLeaveHint$1;->INSTANCE:Lcom/discord/external_pip/ExternalPipModule$Companion$onUserLeaveHint$1;

    invoke-virtual {p1, v0, v1}, Lcom/discord/external_pip/ExternalPipModule;->enterPipMode(ZLkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
