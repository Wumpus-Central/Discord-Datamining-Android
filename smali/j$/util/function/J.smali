.class public final synthetic Lj$/util/function/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/K;


# instance fields
.field public final synthetic a:Ljava/util/function/LongBinaryOperator;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/LongBinaryOperator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/J;->a:Ljava/util/function/LongBinaryOperator;

    return-void
.end method

.method public static synthetic a(Ljava/util/function/LongBinaryOperator;)Lj$/util/function/J;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/function/J;

    invoke-direct {v0, p0}, Lj$/util/function/J;-><init>(Ljava/util/function/LongBinaryOperator;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic applyAsLong(JJ)J
    .locals 1

    iget-object v0, p0, Lj$/util/function/J;->a:Ljava/util/function/LongBinaryOperator;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/function/LongBinaryOperator;->applyAsLong(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/J;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/J;

    iget-object p1, p1, Lj$/util/function/J;->a:Ljava/util/function/LongBinaryOperator;

    :cond_0
    iget-object v0, p0, Lj$/util/function/J;->a:Ljava/util/function/LongBinaryOperator;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/J;->a:Ljava/util/function/LongBinaryOperator;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
