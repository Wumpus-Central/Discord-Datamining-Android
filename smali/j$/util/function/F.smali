.class public final synthetic Lj$/util/function/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/G;


# instance fields
.field public final synthetic a:Ljava/util/function/IntToLongFunction;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/IntToLongFunction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/F;->a:Ljava/util/function/IntToLongFunction;

    return-void
.end method

.method public static synthetic a(Ljava/util/function/IntToLongFunction;)Lj$/util/function/F;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/function/F;

    invoke-direct {v0, p0}, Lj$/util/function/F;-><init>(Ljava/util/function/IntToLongFunction;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic applyAsLong(I)J
    .locals 2

    iget-object v0, p0, Lj$/util/function/F;->a:Ljava/util/function/IntToLongFunction;

    invoke-interface {v0, p1}, Ljava/util/function/IntToLongFunction;->applyAsLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/F;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/F;

    iget-object p1, p1, Lj$/util/function/F;->a:Ljava/util/function/IntToLongFunction;

    :cond_0
    iget-object v0, p0, Lj$/util/function/F;->a:Ljava/util/function/IntToLongFunction;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/F;->a:Ljava/util/function/IntToLongFunction;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
