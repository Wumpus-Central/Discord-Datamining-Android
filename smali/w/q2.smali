.class public abstract Lw/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/q2$a;,
        Lw/q2$b;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lw/q2$b;Lw/q2$a;)Lw/q2;
    .locals 1

    new-instance v0, Lw/g;

    invoke-direct {v0, p0, p1}, Lw/g;-><init>(Lw/q2$b;Lw/q2$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lw/q2$a;
.end method

.method public abstract c()Lw/q2$b;
.end method

.method public final d(Lw/q2;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lw/q2;->c()Lw/q2$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lw/q2;->b()Lw/q2$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lw/q2$a;->a()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Lw/q2;->b()Lw/q2$a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lw/q2$a;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-gt p1, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lw/q2;->c()Lw/q2$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-ne v0, p1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    :goto_0
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
