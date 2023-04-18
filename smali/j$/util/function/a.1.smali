.class public final synthetic Lj$/util/function/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:Lj$/util/function/BiConsumer;


# direct methods
.method private synthetic constructor <init>(Lj$/util/function/BiConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    return-void
.end method

.method public static synthetic a(Lj$/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lj$/util/function/BiConsumer$VivifiedWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Lj$/util/function/BiConsumer$VivifiedWrapper;

    iget-object p0, p0, Lj$/util/function/BiConsumer$VivifiedWrapper;->a:Ljava/util/function/BiConsumer;

    return-object p0

    :cond_1
    new-instance v0, Lj$/util/function/a;

    invoke-direct {v0, p0}, Lj$/util/function/a;-><init>(Lj$/util/function/BiConsumer;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    invoke-interface {v0, p1, p2}, Lj$/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 1

    iget-object v0, p0, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    invoke-static {p1}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/function/BiConsumer;->andThen(Lj$/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p1

    invoke-static {p1}, Lj$/util/function/a;->a(Lj$/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    instance-of v1, p1, Lj$/util/function/a;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/function/a;

    iget-object p1, p1, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/a;->a:Lj$/util/function/BiConsumer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
