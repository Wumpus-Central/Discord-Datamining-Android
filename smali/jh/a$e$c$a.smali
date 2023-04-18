.class final Ljh/a$e$c$a;
.super Lnh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/a$e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/b<",
        "Ljh/a$e$c;",
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

    invoke-virtual {p0, p1, p2}, Ljh/a$e$c$a;->m(Lnh/e;Lnh/g;)Ljh/a$e$c;

    move-result-object p1

    return-object p1
.end method

.method public m(Lnh/e;Lnh/g;)Ljh/a$e$c;
    .locals 2

    new-instance v0, Ljh/a$e$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Ljh/a$e$c;-><init>(Lnh/e;Lnh/g;Ljh/a$a;)V

    return-object v0
.end method
