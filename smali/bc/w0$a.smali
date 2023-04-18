.class abstract Lbc/w0$a;
.super Lbc/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/w0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private transient l:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/w0;-><init>()V

    return-void
.end method


# virtual methods
.method B()Lbc/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/i0<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lbc/t1;

    invoke-virtual {p0}, Lbc/d0;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lbc/t1;-><init>(Lbc/d0;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public b()Lbc/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/i0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/w0$a;->l:Lbc/i0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbc/w0$a;->B()Lbc/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lbc/w0$a;->l:Lbc/i0;

    .line 10
    .line 11
    :cond_0
    return-object v0
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
.end method
