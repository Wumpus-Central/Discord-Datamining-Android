.class final Lcom/swmansion/rnscreens/h0$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/h0;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/swmansion/rnscreens/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/c;",
        "newSearchView",
        "",
        "a",
        "(Lcom/swmansion/rnscreens/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lcom/swmansion/rnscreens/h0;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/h0;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/swmansion/rnscreens/c;)V
    .locals 2

    .line 1
    const-string v0, "newSearchView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/swmansion/rnscreens/h0;->d(Lcom/swmansion/rnscreens/h0;)Lcom/swmansion/rnscreens/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    .line 15
    .line 16
    new-instance v1, Lcom/swmansion/rnscreens/i0;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/i0;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/h0;->h(Lcom/swmansion/rnscreens/h0;Lcom/swmansion/rnscreens/i0;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/swmansion/rnscreens/h0;->i(Lcom/swmansion/rnscreens/h0;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/h0;->getAutoFocus()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lcom/swmansion/rnscreens/h0$c;->k:Lcom/swmansion/rnscreens/h0;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/swmansion/rnscreens/h0;->e(Lcom/swmansion/rnscreens/h0;)Lcom/swmansion/rnscreens/s;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/s;->D()Lcom/swmansion/rnscreens/c;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/c;->o0()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/swmansion/rnscreens/c;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/h0$c;->a(Lcom/swmansion/rnscreens/c;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
