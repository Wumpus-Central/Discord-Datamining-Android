.class final Lnet/time4j/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/v<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final k:Lfj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final l:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Lfj/v;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/v<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/t0;->k:Lfj/v;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/time4j/t0;->l:Ljava/lang/Object;

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

.method static a(Lfj/v;Ljava/lang/Object;)Lnet/time4j/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/v<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")",
            "Lnet/time4j/t0;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/t0;

    invoke-direct {v0, p0, p1}, Lnet/time4j/t0;-><init>(Lfj/v;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/t0;->k:Lfj/v;

    invoke-interface {v0, p1}, Lfj/v;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
