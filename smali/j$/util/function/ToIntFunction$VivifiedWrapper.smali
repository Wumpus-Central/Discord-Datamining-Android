.class public final synthetic Lj$/util/function/ToIntFunction$VivifiedWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/ToIntFunction;


# instance fields
.field public final synthetic a:Ljava/util/function/ToIntFunction;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/ToIntFunction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/ToIntFunction$VivifiedWrapper;->a:Ljava/util/function/ToIntFunction;

    return-void
.end method

.method public static synthetic convert(Ljava/util/function/ToIntFunction;)Lj$/util/function/ToIntFunction;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/function/ToIntFunction$VivifiedWrapper;

    invoke-direct {v0, p0}, Lj$/util/function/ToIntFunction$VivifiedWrapper;-><init>(Ljava/util/function/ToIntFunction;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic applyAsInt(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lj$/util/function/ToIntFunction$VivifiedWrapper;->a:Ljava/util/function/ToIntFunction;

    invoke-interface {v0, p1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/ToIntFunction$VivifiedWrapper;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/ToIntFunction$VivifiedWrapper;

    iget-object p1, p1, Lj$/util/function/ToIntFunction$VivifiedWrapper;->a:Ljava/util/function/ToIntFunction;

    :cond_0
    iget-object v0, p0, Lj$/util/function/ToIntFunction$VivifiedWrapper;->a:Ljava/util/function/ToIntFunction;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/ToIntFunction$VivifiedWrapper;->a:Ljava/util/function/ToIntFunction;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
