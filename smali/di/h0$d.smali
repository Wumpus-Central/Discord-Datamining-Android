.class final Ldi/h0$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;
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
.field final synthetic k:Ldi/g1;

.field final synthetic l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldi/k1;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic m:Ldi/c1;

.field final synthetic n:Z

.field final synthetic o:Lwh/h;


# direct methods
.method constructor <init>(Ldi/g1;Ljava/util/List;Ldi/c1;ZLwh/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g1;",
            "Ljava/util/List<",
            "+",
            "Ldi/k1;",
            ">;",
            "Ldi/c1;",
            "Z",
            "Lwh/h;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ldi/h0$d;->k:Ldi/g1;

    iput-object p2, p0, Ldi/h0$d;->l:Ljava/util/List;

    iput-object p3, p0, Ldi/h0$d;->m:Ldi/c1;

    iput-boolean p4, p0, Ldi/h0$d;->n:Z

    iput-object p5, p0, Ldi/h0$d;->o:Lwh/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lei/g;)Ldi/o0;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldi/h0;->a:Ldi/h0;

    .line 7
    .line 8
    iget-object v1, p0, Ldi/h0$d;->k:Ldi/g1;

    .line 9
    .line 10
    iget-object v2, p0, Ldi/h0$d;->l:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, p1, v2}, Ldi/h0;->a(Ldi/h0;Ldi/g1;Lei/g;Ljava/util/List;)Ldi/h0$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-virtual {p1}, Ldi/h0$b;->a()Ldi/o0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object v0, p0, Ldi/h0$d;->m:Ldi/c1;

    .line 28
    .line 29
    invoke-virtual {p1}, Ldi/h0$b;->b()Ldi/g1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Ldi/h0$d;->l:Ljava/util/List;

    .line 37
    .line 38
    iget-boolean v2, p0, Ldi/h0$d;->n:Z

    .line 39
    .line 40
    iget-object v3, p0, Ldi/h0$d;->o:Lwh/h;

    .line 41
    .line 42
    invoke-static {v0, p1, v1, v2, v3}, Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
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

    check-cast p1, Lei/g;

    invoke-virtual {p0, p1}, Ldi/h0$d;->a(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method
