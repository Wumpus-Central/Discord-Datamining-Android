.class public abstract Lih/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lih/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lih/b$d;->a:I

    .line 4
    iput p2, p0, Lih/b$d;->b:I

    return-void
.end method

.method synthetic constructor <init>(IILih/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lih/b$d;-><init>(II)V

    return-void
.end method

.method public static a(Lih/b$d;[Lnh/j$a;)Lih/b$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lnh/j$a;",
            ">(",
            "Lih/b$d<",
            "*>;[TE;)",
            "Lih/b$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lih/b$d;->a:I

    .line 2
    .line 3
    iget p0, p0, Lih/b$d;->b:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    new-instance p0, Lih/b$c;

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Lih/b$c;-><init>(I[Lnh/j$a;)V

    .line 9
    .line 10
    .line 11
    return-object p0
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

.method public static b(Lih/b$d;)Lih/b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lih/b$d<",
            "*>;)",
            "Lih/b$b;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lih/b$d;->a:I

    .line 2
    .line 3
    iget p0, p0, Lih/b$d;->b:I

    .line 4
    .line 5
    add-int/2addr v0, p0

    .line 6
    new-instance p0, Lih/b$b;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lih/b$b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object p0
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

.method public static c()Lih/b$b;
    .locals 2

    new-instance v0, Lih/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lih/b$b;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public abstract d(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation
.end method
