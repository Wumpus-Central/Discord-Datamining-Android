.class final Lq/j0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/b0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lq/j0;


# direct methods
.method constructor <init>(Lq/j0;)V
    .locals 0

    iput-object p1, p0, Lq/j0$e;->a:Lq/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lq/j0$e;->a:Lq/j0;

    invoke-virtual {v0}, Lq/j0;->q0()V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lq/j0$e;->a:Lq/j0;

    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lq/j0;->k0(Ljava/util/List;)V

    return-void
.end method
