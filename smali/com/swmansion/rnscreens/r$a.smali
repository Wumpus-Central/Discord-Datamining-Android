.class public final Lcom/swmansion/rnscreens/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/r$a;",
        "",
        "Lcom/swmansion/rnscreens/s;",
        "fragment",
        "",
        "c",
        "d",
        "<init>",
        "()V",
        "react-native-screens_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/r$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/swmansion/rnscreens/r$a;Lcom/swmansion/rnscreens/s;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/r$a;->c(Lcom/swmansion/rnscreens/s;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/swmansion/rnscreens/r$a;Lcom/swmansion/rnscreens/s;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/r$a;->d(Lcom/swmansion/rnscreens/s;)Z

    move-result p0

    return p0
.end method

.method private final c(Lcom/swmansion/rnscreens/s;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->q()Lcom/swmansion/rnscreens/j;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/j;->getStackPresentation()Lcom/swmansion/rnscreens/j$d;

    move-result-object p1

    sget-object v0, Lcom/swmansion/rnscreens/j$d;->m:Lcom/swmansion/rnscreens/j$d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final d(Lcom/swmansion/rnscreens/s;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->q()Lcom/swmansion/rnscreens/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/j;->getStackAnimation()Lcom/swmansion/rnscreens/j$c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/swmansion/rnscreens/j$c;->n:Lcom/swmansion/rnscreens/j$c;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->q()Lcom/swmansion/rnscreens/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/j;->getStackAnimation()Lcom/swmansion/rnscreens/j$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lcom/swmansion/rnscreens/j$c;->q:Lcom/swmansion/rnscreens/j$c;

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    :goto_1
    return p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method
