.class public final synthetic Ls7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/f;


# instance fields
.field public final synthetic k:Ls7/g;


# direct methods
.method public synthetic constructor <init>(Ls7/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/e;->k:Ls7/g;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Lj$/util/function/Function;)Lj$/util/function/Function;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Function$-CC;->$default$andThen(Lj$/util/function/Function;Lj$/util/function/Function;)Lj$/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls7/e;->k:Ls7/g;

    check-cast p1, Ls7/o;

    invoke-virtual {v0, p1}, Ls7/g;->n(Ls7/o;)Ls7/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Lj$/util/function/Function;)Lj$/util/function/Function;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Function$-CC;->$default$compose(Lj$/util/function/Function;Lj$/util/function/Function;)Lj$/util/function/Function;

    move-result-object p1

    return-object p1
.end method
