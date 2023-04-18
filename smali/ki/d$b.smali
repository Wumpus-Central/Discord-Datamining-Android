.class public final Lki/d$b;
.super Lmf/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lki/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lmf/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private m:I

.field final synthetic n:Lki/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lki/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lki/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lki/d<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lki/d$b;->n:Lki/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lmf/b;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lki/d$b;->m:I

    .line 8
    .line 9
    return-void
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
.end method


# virtual methods
.method protected b()V
    .locals 2

    .line 1
    :cond_0
    iget v0, p0, Lki/d$b;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lki/d$b;->m:I

    .line 6
    .line 7
    iget-object v1, p0, Lki/d$b;->n:Lki/d;

    .line 8
    .line 9
    invoke-static {v1}, Lki/d;->h(Lki/d;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v1, v1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lki/d$b;->n:Lki/d;

    .line 17
    .line 18
    invoke-static {v0}, Lki/d;->h(Lki/d;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, p0, Lki/d$b;->m:I

    .line 23
    .line 24
    aget-object v0, v0, v1

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lki/d$b;->m:I

    .line 29
    .line 30
    iget-object v1, p0, Lki/d$b;->n:Lki/d;

    .line 31
    .line 32
    invoke-static {v1}, Lki/d;->h(Lki/d;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    array-length v1, v1

    .line 37
    if-lt v0, v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lmf/b;->d()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v0, p0, Lki/d$b;->n:Lki/d;

    .line 44
    .line 45
    invoke-static {v0}, Lki/d;->h(Lki/d;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v1, p0, Lki/d$b;->m:I

    .line 50
    .line 51
    aget-object v0, v0, v1

    .line 52
    .line 53
    const-string v1, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lmf/b;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
