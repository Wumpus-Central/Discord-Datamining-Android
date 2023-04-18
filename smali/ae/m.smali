.class public Lae/m;
.super Lae/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lae/k<",
        "Ljava/lang/Boolean;",
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
.method bridge synthetic c(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lae/m;->d(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method d(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asBoolean()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
