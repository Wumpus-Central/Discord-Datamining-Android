.class final Lpa/w;
.super Lpa/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lpa/q<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final o:Lpa/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpa/q<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient m:[Ljava/lang/Object;

.field private final transient n:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpa/w;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lpa/w;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lpa/w;->o:Lpa/q;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpa/q;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpa/w;->m:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lpa/w;->n:I

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
.method final b([Ljava/lang/Object;I)I
    .locals 2

    .line 1
    iget-object p2, p0, Lpa/w;->m:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lpa/w;->n:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lpa/w;->n:I

    .line 10
    .line 11
    add-int/2addr p1, v1

    .line 12
    return p1
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

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lpa/w;->n:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lpa/n;->a(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpa/w;->m:[Ljava/lang/Object;

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    return-object p1
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

.method final h()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpa/w;->m:[Ljava/lang/Object;

    return-object v0
.end method

.method final i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final l()I
    .locals 1

    iget v0, p0, Lpa/w;->n:I

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lpa/w;->n:I

    return v0
.end method
