.class Lbc/u1;
.super Lbc/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/i0<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final m:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient l:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbc/u1;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, Lbc/u1;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lbc/u1;->m:Lbc/i0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbc/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/u1;->l:[Ljava/lang/Object;

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
.end method


# virtual methods
.method e([Ljava/lang/Object;I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    array-length v2, v0

    .line 5
    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lbc/u1;->l:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    add-int/2addr p2, p1

    .line 12
    return p2
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

.method f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method h()I
    .locals 1

    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-virtual {p0, p1}, Lbc/u1;->w(I)Lbc/h2;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public spliterator()Lj$/util/Spliterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    const/16 v1, 0x510

    invoke-static {v0, v1}, Lj$/util/Spliterators;->spliterator([Ljava/lang/Object;I)Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lbc/u1;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public w(I)Lbc/h2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lbc/h2<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/u1;->l:[Ljava/lang/Object;

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2, p1}, Lbc/a1;->i([Ljava/lang/Object;III)Lbc/h2;

    move-result-object p1

    return-object p1
.end method
