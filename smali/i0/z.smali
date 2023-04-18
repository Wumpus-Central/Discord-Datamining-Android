.class public final synthetic Li0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Li0/o0;

.field public final synthetic l:Landroidx/camera/core/v2;


# direct methods
.method public synthetic constructor <init>(Li0/o0;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/z;->k:Li0/o0;

    iput-object p2, p0, Li0/z;->l:Landroidx/camera/core/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li0/z;->k:Li0/o0;

    iget-object v1, p0, Li0/z;->l:Landroidx/camera/core/v2;

    invoke-static {v0, v1}, Li0/o0;->p(Li0/o0;Landroidx/camera/core/v2;)V

    return-void
.end method
