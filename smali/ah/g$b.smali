.class final Lah/g$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lah/g;->j(Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lei/g;",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/e;

.field final synthetic l:Lah/g;

.field final synthetic m:Ldi/o0;

.field final synthetic n:Lah/a;


# direct methods
.method constructor <init>(Lmg/e;Lah/g;Ldi/o0;Lah/a;)V
    .locals 0

    iput-object p1, p0, Lah/g$b;->k:Lmg/e;

    iput-object p2, p0, Lah/g$b;->l:Lah/g;

    iput-object p3, p0, Lah/g$b;->m:Ldi/o0;

    iput-object p4, p0, Lah/g$b;->n:Lah/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lei/g;)Ldi/o0;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lah/g$b;->k:Lmg/e;

    .line 7
    .line 8
    instance-of v1, v0, Lmg/e;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v2

    .line 15
    :goto_0
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-static {v0}, Lth/c;->k(Lmg/h;)Llh/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p1, v0}, Lei/g;->b(Llh/b;)Lmg/e;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_2
    iget-object v0, p0, Lah/g$b;->k:Lmg/e;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_3
    iget-object v0, p0, Lah/g$b;->l:Lah/g;

    .line 41
    .line 42
    iget-object v1, p0, Lah/g$b;->m:Ldi/o0;

    .line 43
    .line 44
    iget-object v2, p0, Lah/g$b;->n:Lah/a;

    .line 45
    .line 46
    invoke-static {v0, v1, p1, v2}, Lah/g;->i(Lah/g;Ldi/o0;Lmg/e;Lah/a;)Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ldi/o0;

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_4
    :goto_1
    return-object v2
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

    check-cast p1, Lei/g;

    invoke-virtual {p0, p1}, Lah/g$b;->a(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method
