.class public final synthetic Lq/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/h3;

.field public final synthetic l:Landroidx/concurrent/futures/c$a;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Lq/h3;Landroidx/concurrent/futures/c$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/g3;->k:Lq/h3;

    iput-object p2, p0, Lq/g3;->l:Landroidx/concurrent/futures/c$a;

    iput-boolean p3, p0, Lq/g3;->m:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/g3;->k:Lq/h3;

    iget-object v1, p0, Lq/g3;->l:Landroidx/concurrent/futures/c$a;

    iget-boolean v2, p0, Lq/g3;->m:Z

    invoke-static {v0, v1, v2}, Lq/h3;->a(Lq/h3;Landroidx/concurrent/futures/c$a;Z)V

    return-void
.end method
