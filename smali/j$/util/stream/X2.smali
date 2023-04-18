.class final Lj$/util/stream/X2;
.super Lj$/util/stream/Y2;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/M;


# instance fields
.field final c:[J


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj$/util/stream/Y2;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [J

    iput-object v0, p0, Lj$/util/stream/X2;->c:[J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;J)V
    .locals 4

    check-cast p1, Lj$/util/function/M;

    const/4 v0, 0x0

    :goto_0
    int-to-long v1, v0

    cmp-long v1, v1, p2

    if-gez v1, :cond_0

    .line 0
    iget-object v1, p0, Lj$/util/stream/X2;->c:[J

    aget-wide v2, v1, v0

    invoke-interface {p1, v2, v3}, Lj$/util/function/M;->accept(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final accept(J)V
    .locals 2

    iget v0, p0, Lj$/util/stream/Y2;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lj$/util/stream/Y2;->b:I

    iget-object v1, p0, Lj$/util/stream/X2;->c:[J

    aput-wide p1, v1, v0

    return-void
.end method
