.class public Lae/n;
.super Lae/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lae/k<",
        "Lzd/c;",
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

    invoke-virtual {p0, p1}, Lae/n;->d(Lcom/facebook/react/bridge/Dynamic;)Lzd/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/facebook/react/bridge/Dynamic;)Lzd/c;
    .locals 0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/c;->valueOf(Ljava/lang/String;)Lzd/c;

    move-result-object p1

    return-object p1
.end method
