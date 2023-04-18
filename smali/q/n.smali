.class public final synthetic Lq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/w;

.field public final synthetic l:Ljava/util/concurrent/Executor;

.field public final synthetic m:Lw/k;


# direct methods
.method public synthetic constructor <init>(Lq/w;Ljava/util/concurrent/Executor;Lw/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/n;->k:Lq/w;

    iput-object p2, p0, Lq/n;->l:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lq/n;->m:Lw/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/n;->k:Lq/w;

    iget-object v1, p0, Lq/n;->l:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lq/n;->m:Lw/k;

    invoke-static {v0, v1, v2}, Lq/w;->o(Lq/w;Ljava/util/concurrent/Executor;Lw/k;)V

    return-void
.end method
