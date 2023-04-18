.class Landroidx/core/provider/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/provider/h$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/core/util/b;

.field final synthetic l:Ljava/lang/Object;

.field final synthetic m:Landroidx/core/provider/h$b;


# direct methods
.method constructor <init>(Landroidx/core/provider/h$b;Landroidx/core/util/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/provider/h$b$a;->m:Landroidx/core/provider/h$b;

    iput-object p2, p0, Landroidx/core/provider/h$b$a;->k:Landroidx/core/util/b;

    iput-object p3, p0, Landroidx/core/provider/h$b$a;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/provider/h$b$a;->k:Landroidx/core/util/b;

    iget-object v1, p0, Landroidx/core/provider/h$b$a;->l:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroidx/core/util/b;->accept(Ljava/lang/Object;)V

    return-void
.end method
