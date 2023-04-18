.class public final synthetic Lq/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/k2$c;

.field public final synthetic l:Lw/k2;


# direct methods
.method public synthetic constructor <init>(Lw/k2$c;Lw/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/c0;->k:Lw/k2$c;

    iput-object p2, p0, Lq/c0;->l:Lw/k2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/c0;->k:Lw/k2$c;

    iget-object v1, p0, Lq/c0;->l:Lw/k2;

    invoke-static {v0, v1}, Lq/j0;->t(Lw/k2$c;Lw/k2;)V

    return-void
.end method
