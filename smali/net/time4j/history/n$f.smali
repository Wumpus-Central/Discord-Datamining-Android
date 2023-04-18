.class final enum Lnet/time4j/history/n$f;
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
.method b(Lnet/time4j/history/j;I)Lnet/time4j/history/h;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Lnet/time4j/history/j;->a(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lnet/time4j/history/e;->l:Lnet/time4j/history/e;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lnet/time4j/history/e;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x2

    .line 12
    .line 13
    const/16 v1, 0x1f

    .line 14
    .line 15
    if-le v0, v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1f

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x3

    .line 22
    :goto_0
    invoke-static {p1, p2, v1, v0}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
