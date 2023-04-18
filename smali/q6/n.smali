.class abstract Lq6/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/n$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lq6/n$a;
    .locals 1

    new-instance v0, Lq6/c$b;

    invoke-direct {v0}, Lq6/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lo6/b;
.end method

.method abstract c()Lo6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo6/c<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Lq6/n;->e()Lo6/e;

    move-result-object v0

    invoke-virtual {p0}, Lq6/n;->c()Lo6/c;

    move-result-object v1

    invoke-virtual {v1}, Lo6/c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lo6/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method abstract e()Lo6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo6/e<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lq6/o;
.end method

.method public abstract g()Ljava/lang/String;
.end method
