.class public Lw0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lw0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw0/e<",
            "Lw0/b;",
            ">;"
        }
    .end annotation
.end field

.field b:Lw0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw0/e<",
            "Lw0/b;",
            ">;"
        }
    .end annotation
.end field

.field c:Lw0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw0/e<",
            "Lw0/h;",
            ">;"
        }
    .end annotation
.end field

.field d:[Lw0/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw0/f;

    .line 5
    .line 6
    const/16 v1, 0x100

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lw0/f;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lw0/c;->a:Lw0/e;

    .line 12
    .line 13
    new-instance v0, Lw0/f;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lw0/f;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lw0/c;->b:Lw0/e;

    .line 19
    .line 20
    new-instance v0, Lw0/f;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lw0/f;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lw0/c;->c:Lw0/e;

    .line 26
    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    new-array v0, v0, [Lw0/h;

    .line 30
    .line 31
    iput-object v0, p0, Lw0/c;->d:[Lw0/h;

    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
