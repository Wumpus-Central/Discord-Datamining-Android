.class public final synthetic Lbc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/Consumer;


# instance fields
.field public final synthetic a:Lbc/p$c;

.field public final synthetic b:Lj$/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Lbc/p$c;Lj$/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc/s;->a:Lbc/p$c;

    iput-object p2, p0, Lbc/s;->b:Lj$/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lbc/s;->a:Lbc/p$c;

    iget-object v1, p0, Lbc/s;->b:Lj$/util/function/Consumer;

    invoke-static {v0, v1, p1}, Lbc/p$c;->a(Lbc/p$c;Lj$/util/function/Consumer;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
