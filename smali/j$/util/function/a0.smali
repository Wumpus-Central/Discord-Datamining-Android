.class public final synthetic Lj$/util/function/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/b0;


# instance fields
.field public final synthetic a:Ljava/util/function/ObjIntConsumer;


# direct methods
.method private synthetic constructor <init>(Ljava/util/function/ObjIntConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/function/a0;->a:Ljava/util/function/ObjIntConsumer;

    return-void
.end method

.method public static synthetic b(Ljava/util/function/ObjIntConsumer;)Lj$/util/function/a0;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/function/a0;

    invoke-direct {v0, p0}, Lj$/util/function/a0;-><init>(Ljava/util/function/ObjIntConsumer;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/function/a0;->a:Ljava/util/function/ObjIntConsumer;

    invoke-interface {v0, p2, p1}, Ljava/util/function/ObjIntConsumer;->accept(Ljava/lang/Object;I)V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lj$/util/function/a0;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/a0;

    iget-object p1, p1, Lj$/util/function/a0;->a:Ljava/util/function/ObjIntConsumer;

    :cond_0
    iget-object v0, p0, Lj$/util/function/a0;->a:Ljava/util/function/ObjIntConsumer;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/function/a0;->a:Ljava/util/function/ObjIntConsumer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
