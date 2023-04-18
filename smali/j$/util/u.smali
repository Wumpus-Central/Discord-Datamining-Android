.class public final synthetic Lj$/util/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/PrimitiveIterator$OfLong;


# instance fields
.field public final synthetic a:Lj$/util/v;


# direct methods
.method private synthetic constructor <init>(Lj$/util/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/u;->a:Lj$/util/v;

    return-void
.end method

.method public static synthetic a(Lj$/util/v;)Lj$/util/u;
    .locals 1

    new-instance v0, Lj$/util/u;

    invoke-direct {v0, p0}, Lj$/util/u;-><init>(Lj$/util/v;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    instance-of v1, p1, Lj$/util/u;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/u;

    iget-object p1, p1, Lj$/util/u;->a:Lj$/util/v;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    check-cast p1, Lj$/util/function/M;

    invoke-virtual {v0, p1}, Lj$/util/G;->a(Lj$/util/function/M;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0, p1}, Lj$/util/G;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    invoke-static {p1}, Lj$/util/function/L;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/L;

    move-result-object p1

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0, p1}, Lj$/util/G;->a(Lj$/util/function/M;)V

    return-void
.end method

.method public final synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Lj$/util/G;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-boolean v1, Lj$/util/T;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lj$/util/G;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const-class v0, Lj$/util/G;

    const-string v1, "{0} calling PrimitiveIterator.OfLong.nextLong()"

    invoke-static {v0, v1}, Lj$/util/T;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Lj$/util/G;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic nextLong()J
    .locals 2

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Lj$/util/G;->nextLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/u;->a:Lj$/util/v;

    check-cast v0, Lj$/util/G;

    invoke-virtual {v0}, Lj$/util/G;->remove()V

    const/4 v0, 0x0

    throw v0
.end method
