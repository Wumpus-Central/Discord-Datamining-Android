.class public final Lsi/c$b;
.super Lkotlinx/coroutines/internal/p$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsi/c;->i(Lsi/w;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "si/c$b",
        "Lkotlinx/coroutines/internal/p$b;",
        "Lkotlinx/coroutines/internal/p;",
        "Lkotlinx/coroutines/internal/Node;",
        "affected",
        "",
        "k",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field final synthetic d:Lsi/c;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/p;Lsi/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lsi/c$b;->d:Lsi/c;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lkotlinx/coroutines/internal/p$b;-><init>(Lkotlinx/coroutines/internal/p;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/p;

    invoke-virtual {p0, p1}, Lsi/c$b;->k(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lsi/c$b;->d:Lsi/c;

    invoke-virtual {p1}, Lsi/c;->w()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlinx/coroutines/internal/o;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
