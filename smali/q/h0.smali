.class public final synthetic Lq/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/j0;

.field public final synthetic l:Lq/t1;

.field public final synthetic m:Lw/w0;

.field public final synthetic n:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lq/j0;Lq/t1;Lw/w0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/h0;->k:Lq/j0;

    iput-object p2, p0, Lq/h0;->l:Lq/t1;

    iput-object p3, p0, Lq/h0;->m:Lw/w0;

    iput-object p4, p0, Lq/h0;->n:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq/h0;->k:Lq/j0;

    iget-object v1, p0, Lq/h0;->l:Lq/t1;

    iget-object v2, p0, Lq/h0;->m:Lw/w0;

    iget-object v3, p0, Lq/h0;->n:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lq/j0;->q(Lq/j0;Lq/t1;Lw/w0;Ljava/lang/Runnable;)V

    return-void
.end method
