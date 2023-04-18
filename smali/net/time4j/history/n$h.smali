.class final enum Lnet/time4j/history/n$h;
.super Lnet/time4j/history/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/history/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/history/n;-><init>(Ljava/lang/String;ILnet/time4j/history/n$a;)V

    return-void
.end method


# virtual methods
.method a(Lnet/time4j/history/o;Lnet/time4j/history/h;)I
    .locals 1

    .line 1
    invoke-virtual {p2}, Lnet/time4j/history/h;->f()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    invoke-virtual {p2}, Lnet/time4j/history/h;->c()Lnet/time4j/history/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0, p1}, Lnet/time4j/history/n$h;->b(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-gez p2, :cond_0

    .line 20
    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    :cond_0
    return p1
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method b(Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    .locals 1

    sget-object v0, Lnet/time4j/history/n;->q:Lnet/time4j/history/n;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p1, p2}, Lnet/time4j/history/n;->b(Lnet/time4j/history/j;I)Lnet/time4j/history/h;

    move-result-object p1

    return-object p1
.end method

.method c(ZLnet/time4j/history/o;Lnet/time4j/history/j;III)I
    .locals 7

    sget-object v0, Lnet/time4j/history/n;->q:Lnet/time4j/history/n;

    add-int/lit8 v4, p4, 0x1

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lnet/time4j/history/n;->c(ZLnet/time4j/history/o;Lnet/time4j/history/j;III)I

    move-result p1

    return p1
.end method
