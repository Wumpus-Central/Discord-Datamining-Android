.class public final synthetic Li0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Li0/o0$i;

.field public final synthetic l:Li0/i1;


# direct methods
.method public synthetic constructor <init>(Li0/o0$i;Li0/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/u0;->k:Li0/o0$i;

    iput-object p2, p0, Li0/u0;->l:Li0/i1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li0/u0;->k:Li0/o0$i;

    iget-object v1, p0, Li0/u0;->l:Li0/i1;

    invoke-static {v0, v1}, Li0/o0$i;->p(Li0/o0$i;Li0/i1;)V

    return-void
.end method
