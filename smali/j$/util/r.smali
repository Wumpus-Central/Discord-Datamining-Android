.class public final synthetic Lj$/util/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/PrimitiveIterator$OfInt;


# instance fields
.field public final synthetic a:Lj$/util/s;


# direct methods
.method private synthetic constructor <init>(Lj$/util/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/r;->a:Lj$/util/s;

    return-void
.end method

.method public static synthetic a(Lj$/util/s;)Lj$/util/r;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/r;

    invoke-direct {v0, p0}, Lj$/util/r;-><init>(Lj$/util/s;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    instance-of v1, p1, Lj$/util/r;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/r;

    iget-object p1, p1, Lj$/util/r;->a:Lj$/util/s;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    check-cast p1, Lj$/util/function/IntConsumer;

    invoke-virtual {v0, p1}, Lj$/util/F;->a(Lj$/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0, p1}, Lj$/util/F;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    invoke-static {p1}, Lj$/util/function/y;->a(Ljava/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0, p1}, Lj$/util/F;->a(Lj$/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Lj$/util/F;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-boolean v1, Lj$/util/T;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lj$/util/F;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const-class v0, Lj$/util/F;

    const-string v1, "{0} calling PrimitiveIterator.OfInt.nextInt()"

    invoke-static {v0, v1}, Lj$/util/T;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Lj$/util/F;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic nextInt()I
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Lj$/util/F;->nextInt()I

    move-result v0

    return v0
.end method

.method public final synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/r;->a:Lj$/util/s;

    check-cast v0, Lj$/util/F;

    invoke-virtual {v0}, Lj$/util/F;->remove()V

    const/4 v0, 0x0

    throw v0
.end method
