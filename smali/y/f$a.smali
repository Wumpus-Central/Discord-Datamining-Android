.class Ly/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/f;->o(Lfc/b;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lfc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/a<",
        "TI;TO;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/arch/core/util/Function;


# direct methods
.method constructor <init>(Landroidx/arch/core/util/Function;)V
    .locals 0

    iput-object p1, p0, Ly/f$a;->a:Landroidx/arch/core/util/Function;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lfc/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Ly/f$a;->a:Landroidx/arch/core/util/Function;

    invoke-interface {v0, p1}, Landroidx/arch/core/util/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
