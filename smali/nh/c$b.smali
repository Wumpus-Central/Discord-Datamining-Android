.class Lnh/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/d$a;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private k:I

.field private final l:I

.field final synthetic m:Lnh/c;


# direct methods
.method private constructor <init>(Lnh/c;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lnh/c$b;->m:Lnh/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Lnh/c;->H()I

    move-result v0

    iput v0, p0, Lnh/c$b;->k:I

    .line 4
    invoke-virtual {p1}, Lnh/c;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lnh/c$b;->l:I

    return-void
.end method

.method synthetic constructor <init>(Lnh/c;Lnh/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnh/c$b;-><init>(Lnh/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p0}, Lnh/c$b;->c()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public c()B
    .locals 3

    .line 1
    iget v0, p0, Lnh/c$b;->k:I

    .line 2
    .line 3
    iget v1, p0, Lnh/c$b;->l:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lnh/c$b;->m:Lnh/c;

    .line 8
    .line 9
    iget-object v1, v1, Lnh/p;->l:[B

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iput v2, p0, Lnh/c$b;->k:I

    .line 14
    .line 15
    aget-byte v0, v1, v0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0
    .line 24
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

    invoke-virtual {p0, p1}, Lnh/c$b;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lnh/c$b;->k:I

    iget v1, p0, Lnh/c$b;->l:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnh/c$b;->a()Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
