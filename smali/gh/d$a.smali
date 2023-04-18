.class final Lgh/d$a;
.super Lnh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgh/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/b<",
        "Lgh/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnh/b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lnh/e;Lnh/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lgh/d$a;->m(Lnh/e;Lnh/g;)Lgh/d;

    move-result-object p1

    return-object p1
.end method

.method public m(Lnh/e;Lnh/g;)Lgh/d;
    .locals 2

    new-instance v0, Lgh/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lgh/d;-><init>(Lnh/e;Lnh/g;Lgh/a;)V

    return-object v0
.end method
