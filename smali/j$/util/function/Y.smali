.class public final synthetic Lj$/util/function/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/Z;


# instance fields
.field public final synthetic a:Ljava/util/function/ObjDoubleConsumer;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/ObjDoubleConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/Y;->a:Ljava/util/function/ObjDoubleConsumer;

    return-void
.end method

.method public static synthetic a(Ljava/util/function/ObjDoubleConsumer;)Lj$/util/function/Y;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/function/Y;

    invoke-direct {v0, p0}, Lj$/util/function/Y;-><init>(Ljava/util/function/ObjDoubleConsumer;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;D)V
    .locals 1

    iget-object v0, p0, Lj$/util/function/Y;->a:Ljava/util/function/ObjDoubleConsumer;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/function/ObjDoubleConsumer;->accept(Ljava/lang/Object;D)V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/Y;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/Y;

    iget-object p1, p1, Lj$/util/function/Y;->a:Ljava/util/function/ObjDoubleConsumer;

    :cond_0
    iget-object v0, p0, Lj$/util/function/Y;->a:Ljava/util/function/ObjDoubleConsumer;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/Y;->a:Ljava/util/function/ObjDoubleConsumer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
