.class public final synthetic Landroidx/camera/view/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/view/t;

.field public final synthetic l:Landroidx/camera/core/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/t;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/q;->k:Landroidx/camera/view/t;

    iput-object p2, p0, Landroidx/camera/view/q;->l:Landroidx/camera/core/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/q;->k:Landroidx/camera/view/t;

    iget-object v1, p0, Landroidx/camera/view/q;->l:Landroidx/camera/core/v2;

    invoke-static {v0, v1}, Landroidx/camera/view/t;->j(Landroidx/camera/view/t;Landroidx/camera/core/v2;)V

    return-void
.end method
