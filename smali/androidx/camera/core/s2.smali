.class public final synthetic Landroidx/camera/core/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/core/util/b;

.field public final synthetic l:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/util/b;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/s2;->k:Landroidx/core/util/b;

    iput-object p2, p0, Landroidx/camera/core/s2;->l:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/s2;->k:Landroidx/core/util/b;

    iget-object v1, p0, Landroidx/camera/core/s2;->l:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/v2;->a(Landroidx/core/util/b;Landroid/view/Surface;)V

    return-void
.end method
