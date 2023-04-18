.class final Lmg/g1$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/g1;->d(Lmg/i;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/m;",
        "Lkotlin/sequences/Sequence<",
        "+",
        "Lmg/f1;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final k:Lmg/g1$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/g1$c;

    invoke-direct {v0}, Lmg/g1$c;-><init>()V

    sput-object v0, Lmg/g1$c;->k:Lmg/g1$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/m;)Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/m;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lmg/a;

    .line 7
    .line 8
    invoke-interface {p1}, Lmg/a;->getTypeParameters()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "it as CallableDescriptor).typeParameters"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/collections/h;->K(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/m;

    invoke-virtual {p0, p1}, Lmg/g1$c;->a(Lmg/m;)Lkotlin/sequences/Sequence;

    move-result-object p1

    return-object p1
.end method
