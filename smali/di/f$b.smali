.class final Ldi/f$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/f;->u(Ldi/f1;Lhi/k;Lhi/k;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/f1$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhi/k;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic l:Ldi/f1;

.field final synthetic m:Lhi/p;

.field final synthetic n:Lhi/k;


# direct methods
.method constructor <init>(Ljava/util/List;Ldi/f1;Lhi/p;Lhi/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lhi/k;",
            ">;",
            "Ldi/f1;",
            "Lhi/p;",
            "Lhi/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ldi/f$b;->k:Ljava/util/List;

    iput-object p2, p0, Ldi/f$b;->l:Ldi/f1;

    iput-object p3, p0, Ldi/f$b;->m:Lhi/p;

    iput-object p4, p0, Ldi/f$b;->n:Lhi/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/f1$a;)V
    .locals 6

    .line 1
    const-string v0, "$this$runForkingPoint"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldi/f$b;->k:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lhi/k;

    .line 23
    .line 24
    new-instance v2, Ldi/f$b$a;

    .line 25
    .line 26
    iget-object v3, p0, Ldi/f$b;->l:Ldi/f1;

    .line 27
    .line 28
    iget-object v4, p0, Ldi/f$b;->m:Lhi/p;

    .line 29
    .line 30
    iget-object v5, p0, Ldi/f$b;->n:Lhi/k;

    .line 31
    .line 32
    invoke-direct {v2, v3, v4, v1, v5}, Ldi/f$b$a;-><init>(Ldi/f1;Lhi/p;Lhi/k;Lhi/k;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v2}, Ldi/f1$a;->a(Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
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

    check-cast p1, Ldi/f1$a;

    invoke-virtual {p0, p1}, Ldi/f$b;->a(Ldi/f1$a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
