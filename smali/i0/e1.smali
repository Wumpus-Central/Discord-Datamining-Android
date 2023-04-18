.class public final synthetic Li0/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Li0/c1$b;

.field public final synthetic l:Lfc/b;

.field public final synthetic m:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Li0/c1$b;Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/e1;->k:Li0/c1$b;

    iput-object p2, p0, Li0/e1;->l:Lfc/b;

    iput-object p3, p0, Li0/e1;->m:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li0/e1;->k:Li0/c1$b;

    iget-object v1, p0, Li0/e1;->l:Lfc/b;

    iget-object v2, p0, Li0/e1;->m:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1, v2}, Li0/c1$b;->b(Li0/c1$b;Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
