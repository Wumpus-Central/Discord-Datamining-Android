.class public final synthetic Lq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lq/w;

.field public final synthetic l:Lw/k;


# direct methods
.method public synthetic constructor <init>(Lq/w;Lw/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/k;->k:Lq/w;

    iput-object p2, p0, Lq/k;->l:Lw/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq/k;->k:Lq/w;

    iget-object v1, p0, Lq/k;->l:Lw/k;

    invoke-static {v0, v1}, Lq/w;->k(Lq/w;Lw/k;)V

    return-void
.end method
