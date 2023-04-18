.class Ly/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/h;->e(Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:I

.field final synthetic l:Lfc/b;

.field final synthetic m:Ly/h;


# direct methods
.method constructor <init>(Ly/h;ILfc/b;)V
    .locals 0

    iput-object p1, p0, Ly/h$c;->m:Ly/h;

    iput p2, p0, Ly/h$c;->k:I

    iput-object p3, p0, Ly/h$c;->l:Lfc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ly/h$c;->m:Ly/h;

    iget v1, p0, Ly/h$c;->k:I

    iget-object v2, p0, Ly/h$c;->l:Lfc/b;

    invoke-virtual {v0, v1, v2}, Ly/h;->f(ILjava/util/concurrent/Future;)V

    return-void
.end method
