.class public final synthetic Lq/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/j0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lq/j0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/a0;->k:Lq/j0;

    iput-boolean p2, p0, Lq/a0;->l:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/a0;->k:Lq/j0;

    iget-boolean v1, p0, Lq/a0;->l:Z

    invoke-static {v0, v1}, Lq/j0;->v(Lq/j0;Z)V

    return-void
.end method
