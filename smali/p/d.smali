.class public final Lp/d;
.super Lw/v1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw/v1<",
        "Lp/c;",
        ">;"
    }
.end annotation


# direct methods
.method public varargs constructor <init>([Lp/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw/v1;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lw/v1;->a(Ljava/util/List;)V

    .line 9
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public static e()Lp/d;
    .locals 2

    new-instance v0, Lp/d;

    const/4 v1, 0x0

    new-array v1, v1, [Lp/c;

    invoke-direct {v0, v1}, Lp/d;-><init>([Lp/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lw/v1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw/v1<",
            "Lp/c;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lp/d;->e()Lp/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lw/v1;->c()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lw/v1;->a(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp/d;->b()Lw/v1;

    move-result-object v0

    return-object v0
.end method

.method public d()Lp/d$a;
    .locals 2

    new-instance v0, Lp/d$a;

    invoke-virtual {p0}, Lw/v1;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lp/d$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method
