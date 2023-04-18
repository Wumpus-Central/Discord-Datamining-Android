.class final Lki/p$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lki/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/y;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lki/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lki/p$b;

    invoke-direct {v0}, Lki/p$b;-><init>()V

    sput-object v0, Lki/p$b;->k:Lki/p$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method

.method private static final b(Lmg/m;)Z
    .locals 1

    instance-of v0, p0, Lmg/e;

    if-eqz v0, :cond_0

    check-cast p0, Lmg/e;

    invoke-static {p0}, Ljg/h;->a0(Lmg/e;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final a(Lmg/y;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "$this$$receiver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lki/p;->a:Lki/p;

    .line 7
    .line 8
    invoke-interface {p1}, Lmg/y;->b()Lmg/m;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "containingDeclaration"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lki/p$b;->b(Lmg/m;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-nez v0, :cond_4

    .line 23
    .line 24
    invoke-interface {p1}, Lmg/y;->e()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "overriddenDescriptors"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :cond_0
    move p1, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lmg/y;

    .line 57
    .line 58
    invoke-interface {v0}, Lmg/y;->b()Lmg/m;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v3, "it.containingDeclaration"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lki/p$b;->b(Lmg/m;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    move p1, v1

    .line 74
    :goto_0
    if-eqz p1, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v1, v2

    .line 78
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 79
    .line 80
    const-string p1, "must override \'\'equals()\'\' in Any"

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    const/4 p1, 0x0

    .line 84
    :goto_2
    return-object p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/y;

    invoke-virtual {p0, p1}, Lki/p$b;->a(Lmg/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
