.class public final synthetic Lbc/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/IntConsumer;


# instance fields
.field public final synthetic a:Lj$/util/function/Consumer;

.field public final synthetic b:Lj$/util/function/IntFunction;


# direct methods
.method public synthetic constructor <init>(Lj$/util/function/Consumer;Lj$/util/function/IntFunction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/r;->a:Lj$/util/function/Consumer;

    iput-object p2, p0, Lbc/r;->b:Lj$/util/function/IntFunction;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 2

    iget-object v0, p0, Lbc/r;->a:Lj$/util/function/Consumer;

    iget-object v1, p0, Lbc/r;->b:Lj$/util/function/IntFunction;

    invoke-static {v0, v1, p1}, Lbc/p$b;->a(Lj$/util/function/Consumer;Lj$/util/function/IntFunction;I)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/IntConsumer$-CC;->$default$andThen(Lj$/util/function/IntConsumer;Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
