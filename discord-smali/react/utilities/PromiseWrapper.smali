.class public final Lcom/discord/react/utilities/PromiseWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Promise;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react/utilities/PromiseWrapper$Rejection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B?\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0018\u0008\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\t\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0016J&\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J$\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0012\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0016J0\u0010\t\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016R\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR$\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/react/utilities/PromiseWrapper;",
        "Lcom/facebook/react/bridge/Promise;",
        "",
        "value",
        "",
        "resolve",
        "",
        "code",
        "message",
        "reject",
        "",
        "throwable",
        "Lcom/facebook/react/bridge/WritableMap;",
        "userInfo",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "Lkotlin/Function1;",
        "resolveTransform",
        "Lkotlin/jvm/functions/Function1;",
        "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
        "rejectTransform",
        "<init>",
        "(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Rejection",
        "react_utilities_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final promise:Lcom/facebook/react/bridge/Promise;

.field private final rejectTransform:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
            "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
            ">;"
        }
    .end annotation
.end field

.field private final resolveTransform:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/Promise;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
            "Lcom/discord/react/utilities/PromiseWrapper$Rejection;",
            ">;)V"
        }
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolveTransform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rejectTransform"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 3
    iput-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->resolveTransform:Lkotlin/jvm/functions/Function1;

    .line 4
    iput-object p3, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Lcom/discord/react/utilities/PromiseWrapper$1;->INSTANCE:Lcom/discord/react/utilities/PromiseWrapper$1;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Lcom/discord/react/utilities/PromiseWrapper$2;->INSTANCE:Lcom/discord/react/utilities/PromiseWrapper$2;

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/react/utilities/PromiseWrapper;-><init>(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public reject(Ljava/lang/String;)V
    .locals 2

    .line 51
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, v1, v1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 52
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 53
    iget-object v0, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 54
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 55
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    const-string v0, "userInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1, p2}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 32
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 33
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 34
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getUserInfo()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 36
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1, v1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 2
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 3
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 4
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    const-string p1, "userInfo"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2, v0, p3}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 45
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 46
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 47
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 48
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getUserInfo()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 50
    invoke-interface {p2, p3, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 13
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 14
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 15
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 16
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 17
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    .line 19
    invoke-interface {p2, p3, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 56
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 57
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 58
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 59
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 60
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getMessage()Ljava/lang/String;

    move-result-object p4

    .line 61
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    .line 62
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getUserInfo()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 63
    invoke-interface {p2, p3, p4, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 7
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2, v1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 9
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 10
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    .line 12
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 37
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 38
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 39
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 40
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 41
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getUserInfo()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 43
    invoke-interface {p2, p3, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public reject(Ljava/lang/Throwable;)V
    .locals 2

    .line 20
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, v1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 21
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 22
    iget-object v0, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 23
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    .line 24
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    return-void
.end method

.method public reject(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 25
    new-instance v0, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, p2}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    .line 26
    iget-object p1, p0, Lcom/discord/react/utilities/PromiseWrapper;->rejectTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/react/utilities/PromiseWrapper$Rejection;

    .line 27
    iget-object p2, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    .line 28
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    .line 29
    invoke-virtual {p1}, Lcom/discord/react/utilities/PromiseWrapper$Rejection;->getUserInfo()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 30
    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public resolve(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/react/utilities/PromiseWrapper;->promise:Lcom/facebook/react/bridge/Promise;

    iget-object v1, p0, Lcom/discord/react/utilities/PromiseWrapper;->resolveTransform:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method
