.class final Lra/e;
.super Lra/f0;
.source "SourceFile"


# instance fields
.field private final transient m:Lra/e0;

.field private final transient n:Lra/b0;


# direct methods
.method constructor <init>(Lra/e0;Lra/b0;)V
    .locals 0

    invoke-direct {p0}, Lra/f0;-><init>()V

    iput-object p1, p0, Lra/e;->m:Lra/e0;

    iput-object p2, p0, Lra/e;->n:Lra/b0;

    return-void
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Lra/e;->n:Lra/b0;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lra/y;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lra/e;->m:Lra/e0;

    invoke-virtual {v0, p1}, Lra/e0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h()Lra/b0;
    .locals 1

    iget-object v0, p0, Lra/e;->n:Lra/b0;

    return-object v0
.end method

.method public final i()Lra/i;
    .locals 2

    iget-object v0, p0, Lra/e;->n:Lra/b0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lra/b0;->v(I)Lra/j;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lra/e;->n:Lra/b0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lra/b0;->v(I)Lra/j;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lra/e;->m:Lra/e0;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
