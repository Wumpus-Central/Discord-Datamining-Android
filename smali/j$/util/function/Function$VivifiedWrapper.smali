.class public final synthetic Lj$/util/function/Function$VivifiedWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/Function;


# instance fields
.field public final synthetic a:Ljava/util/function/Function;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/Function;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    return-void
.end method

.method public static synthetic convert(Ljava/util/function/Function;)Lj$/util/function/Function;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lj$/util/function/u;

    if-eqz v0, :cond_1

    check-cast p0, Lj$/util/function/u;

    iget-object p0, p0, Lj$/util/function/u;->a:Lj$/util/function/Function;

    return-object p0

    :cond_1
    instance-of v0, p0, Ljava/util/function/UnaryOperator;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/function/UnaryOperator;

    invoke-static {p0}, Lj$/util/function/UnaryOperator$VivifiedWrapper;->convert(Ljava/util/function/UnaryOperator;)Lj$/util/function/UnaryOperator;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance v0, Lj$/util/function/Function$VivifiedWrapper;

    invoke-direct {v0, p0}, Lj$/util/function/Function$VivifiedWrapper;-><init>(Ljava/util/function/Function;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic andThen(Lj$/util/function/Function;)Lj$/util/function/Function;
    .locals 1

    iget-object v0, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    invoke-static {p1}, Lj$/util/function/u;->a(Lj$/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Function;->andThen(Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    invoke-static {p1}, Lj$/util/function/Function$VivifiedWrapper;->convert(Ljava/util/function/Function;)Lj$/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compose(Lj$/util/function/Function;)Lj$/util/function/Function;
    .locals 1

    iget-object v0, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    invoke-static {p1}, Lj$/util/function/u;->a(Lj$/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Function;->compose(Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    invoke-static {p1}, Lj$/util/function/Function$VivifiedWrapper;->convert(Ljava/util/function/Function;)Lj$/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/Function$VivifiedWrapper;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/Function$VivifiedWrapper;

    iget-object p1, p1, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    :cond_0
    iget-object v0, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/Function$VivifiedWrapper;->a:Ljava/util/function/Function;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
