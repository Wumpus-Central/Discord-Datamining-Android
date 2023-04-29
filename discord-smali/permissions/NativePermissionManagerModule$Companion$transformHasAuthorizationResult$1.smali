.class final synthetic Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/permissions/NativePermissionManagerModule$Companion;->transformHasAuthorizationResult(Lcom/facebook/react/bridge/Promise;)Lcom/discord/react/utilities/PromiseWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lcom/discord/permissions/NativePermissionStatus$Companion;

    const-string v4, "fromAndroidAuthorizationStatus"

    const-string v5, "fromAndroidAuthorizationStatus(Ljava/lang/Object;)Ljava/io/Serializable;"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/io/Serializable;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/e;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/discord/permissions/NativePermissionStatus$Companion;

    invoke-virtual {v0, p1}, Lcom/discord/permissions/NativePermissionStatus$Companion;->fromAndroidAuthorizationStatus(Ljava/lang/Object;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/discord/permissions/NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1;->invoke(Ljava/lang/Object;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
