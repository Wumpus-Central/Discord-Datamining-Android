.class public Lae/e;
.super Lae/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lae/k<",
        "Lzd/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lae/k;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lae/e;->d(Lcom/facebook/react/bridge/Dynamic;)Lzd/a;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/react/bridge/Dynamic;)Lzd/a;
    .locals 0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/a;->valueOf(Ljava/lang/String;)Lzd/a;

    move-result-object p1

    return-object p1
.end method
