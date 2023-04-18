.class public abstract Lmg/r;
.super Lmg/u;
.source "SourceFile"


# instance fields
.field private final a:Lmg/n1;


# direct methods
.method public constructor <init>(Lmg/n1;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lmg/u;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lmg/r;->a:Lmg/n1;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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


# virtual methods
.method public b()Lmg/n1;
    .locals 1

    iget-object v0, p0, Lmg/r;->a:Lmg/n1;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lmg/r;->b()Lmg/n1;

    move-result-object v0

    invoke-virtual {v0}, Lmg/n1;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Lmg/u;
    .locals 2

    invoke-virtual {p0}, Lmg/r;->b()Lmg/n1;

    move-result-object v0

    invoke-virtual {v0}, Lmg/n1;->d()Lmg/n1;

    move-result-object v0

    invoke-static {v0}, Lmg/t;->j(Lmg/n1;)Lmg/u;

    move-result-object v0

    const-string v1, "toDescriptorVisibility(delegate.normalize())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
