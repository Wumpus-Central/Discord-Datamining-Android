.class public final synthetic Landroidx/camera/core/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:Landroidx/camera/core/d;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lw/m1$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/d;Ljava/util/concurrent/Executor;Lw/m1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/b;->a:Landroidx/camera/core/d;

    iput-object p2, p0, Landroidx/camera/core/b;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/core/b;->c:Lw/m1$a;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/b;->a:Landroidx/camera/core/d;

    iget-object v1, p0, Landroidx/camera/core/b;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/camera/core/b;->c:Lw/m1$a;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/core/d;->c(Landroidx/camera/core/d;Ljava/util/concurrent/Executor;Lw/m1$a;Landroid/media/ImageReader;)V

    return-void
.end method
