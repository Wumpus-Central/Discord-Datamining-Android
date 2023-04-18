.class public final synthetic Lq/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/j0;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lw/k2;


# direct methods
.method public synthetic constructor <init>(Lq/j0;Ljava/lang/String;Lw/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/d0;->k:Lq/j0;

    iput-object p2, p0, Lq/d0;->l:Ljava/lang/String;

    iput-object p3, p0, Lq/d0;->m:Lw/k2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq/d0;->k:Lq/j0;

    iget-object v1, p0, Lq/d0;->l:Ljava/lang/String;

    iget-object v2, p0, Lq/d0;->m:Lw/k2;

    invoke-static {v0, v1, v2}, Lq/j0;->n(Lq/j0;Ljava/lang/String;Lw/k2;)V

    return-void
.end method
