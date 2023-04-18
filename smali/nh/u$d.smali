.class Lnh/u$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/d$a;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private final k:Lnh/u$c;

.field private l:Lnh/d$a;

.field m:I

.field final synthetic n:Lnh/u;


# direct methods
.method private constructor <init>(Lnh/u;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lnh/u$d;->n:Lnh/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lnh/u$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lnh/u$c;-><init>(Lnh/d;Lnh/u$a;)V

    iput-object v0, p0, Lnh/u$d;->k:Lnh/u$c;

    .line 4
    invoke-virtual {v0}, Lnh/u$c;->d()Lnh/p;

    move-result-object v0

    invoke-virtual {v0}, Lnh/p;->u()Lnh/d$a;

    move-result-object v0

    iput-object v0, p0, Lnh/u$d;->l:Lnh/d$a;

    .line 5
    invoke-virtual {p1}, Lnh/u;->size()I

    move-result p1

    iput p1, p0, Lnh/u$d;->m:I

    return-void
.end method

.method synthetic constructor <init>(Lnh/u;Lnh/u$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnh/u$d;-><init>(Lnh/u;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p0}, Lnh/u$d;->c()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public c()B
    .locals 1

    .line 1
    iget-object v0, p0, Lnh/u$d;->l:Lnh/d$a;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnh/u$d;->k:Lnh/u$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lnh/u$c;->d()Lnh/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lnh/p;->u()Lnh/d$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lnh/u$d;->l:Lnh/d$a;

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lnh/u$d;->m:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    iput v0, p0, Lnh/u$d;->m:I

    .line 26
    .line 27
    iget-object v0, p0, Lnh/u$d;->l:Lnh/d$a;

    .line 28
    .line 29
    invoke-interface {v0}, Lnh/d$a;->c()B

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnh/u$d;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Lnh/u$d;->m:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnh/u$d;->a()Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
