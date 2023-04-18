.class public abstract Lmg/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmg/u;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "visibility"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lmg/u;->b()Lmg/n1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lmg/u;->b()Lmg/n1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lmg/n1;->a(Lmg/n1;)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public abstract b()Lmg/n1;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lmg/u;->b()Lmg/n1;

    move-result-object v0

    invoke-virtual {v0}, Lmg/n1;->c()Z

    move-result v0

    return v0
.end method

.method public abstract e(Lxh/g;Lmg/q;Lmg/m;Z)Z
.end method

.method public abstract f()Lmg/u;
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lmg/u;->b()Lmg/n1;

    move-result-object v0

    invoke-virtual {v0}, Lmg/n1;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
