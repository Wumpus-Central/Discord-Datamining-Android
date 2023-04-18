.class public final synthetic Lj$/util/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/PrimitiveIterator$OfDouble;


# instance fields
.field public final synthetic a:Lj$/util/p;


# direct methods
.method private synthetic constructor <init>(Lj$/util/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/o;->a:Lj$/util/p;

    return-void
.end method

.method public static synthetic a(Lj$/util/p;)Lj$/util/o;
    .locals 1

    new-instance v0, Lj$/util/o;

    invoke-direct {v0, p0}, Lj$/util/o;-><init>(Lj$/util/p;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    instance-of v1, p1, Lj$/util/o;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/o;

    iget-object p1, p1, Lj$/util/o;->a:Lj$/util/p;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    check-cast p1, Lj$/util/function/i;

    invoke-virtual {v0, p1}, Lj$/util/H;->a(Lj$/util/function/i;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0, p1}, Lj$/util/H;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    invoke-static {p1}, Lj$/util/function/h;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0, p1}, Lj$/util/H;->a(Lj$/util/function/i;)V

    return-void
.end method

.method public final synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Lj$/util/H;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Double;
    .locals 2

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-boolean v1, Lj$/util/T;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lj$/util/H;->nextDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_0
    const-class v0, Lj$/util/H;

    const-string v1, "{0} calling PrimitiveIterator.OfDouble.nextLong()"

    invoke-static {v0, v1}, Lj$/util/T;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Lj$/util/H;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic nextDouble()D
    .locals 2

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Lj$/util/H;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/o;->a:Lj$/util/p;

    check-cast v0, Lj$/util/H;

    invoke-virtual {v0}, Lj$/util/H;->remove()V

    const/4 v0, 0x0

    throw v0
.end method
