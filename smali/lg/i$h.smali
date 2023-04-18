.class public final Llg/i$h;
.super Lni/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/i;->r(Lmg/y;)Llg/i$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lni/b$b<",
        "Lmg/e;",
        "Llg/i$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Llg/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Llg/i$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llg/i$h;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    invoke-direct {p0}, Lni/b$b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llg/i$h;->e()Llg/i$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lmg/e;

    invoke-virtual {p0, p1}, Llg/i$h;->d(Lmg/e;)Z

    move-result p1

    return p1
.end method

.method public d(Lmg/e;)Z
    .locals 2

    .line 1
    const-string v0, "javaClassDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Leh/y;->a:Leh/y;

    .line 7
    .line 8
    iget-object v1, p0, Llg/i$h;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, p1, v1}, Leh/v;->a(Leh/y;Lmg/e;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Llg/k;->a:Llg/k;

    .line 15
    .line 16
    invoke-virtual {v0}, Llg/k;->e()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 27
    .line 28
    sget-object v0, Llg/i$a;->k:Llg/i$a;

    .line 29
    .line 30
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Llg/k;->h()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 44
    .line 45
    sget-object v0, Llg/i$a;->l:Llg/i$a;

    .line 46
    .line 47
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Llg/k;->c()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 61
    .line 62
    sget-object v0, Llg/i$a;->n:Llg/i$a;

    .line 63
    .line 64
    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 65
    .line 66
    :cond_2
    :goto_0
    iget-object p1, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 67
    .line 68
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 p1, 0x0

    .line 75
    :goto_1
    return p1
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

.method public e()Llg/i$a;
    .locals 1

    iget-object v0, p0, Llg/i$h;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v0, Llg/i$a;

    if-nez v0, :cond_0

    sget-object v0, Llg/i$a;->m:Llg/i$a;

    :cond_0
    return-object v0
.end method
