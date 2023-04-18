.class abstract Lnet/time4j/a;
.super Lgj/d;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Ljava/lang/Comparable<",
        "TV;>;>",
        "Lgj/d<",
        "TV;>;",
        "Lnet/time4j/c<",
        "TV;",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# instance fields
.field private final transient l:Lnet/time4j/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/o<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field

.field private final transient m:Lnet/time4j/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/o<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lgj/d;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lnet/time4j/i;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, Lnet/time4j/i;-><init>(Lfj/p;I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lnet/time4j/a;->l:Lnet/time4j/o;

    .line 11
    .line 12
    new-instance p1, Lnet/time4j/i;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-direct {p1, p0, v0}, Lnet/time4j/i;-><init>(Lfj/p;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lnet/time4j/a;->m:Lnet/time4j/o;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public x(Ljava/lang/Comparable;)Lnet/time4j/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Lnet/time4j/o<",
            "Lnet/time4j/f0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/i;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1, p1}, Lnet/time4j/i;-><init>(Lfj/p;ILjava/lang/Object;)V

    return-object v0
.end method
