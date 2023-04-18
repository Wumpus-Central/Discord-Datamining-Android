.class public final synthetic Landroidx/camera/core/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/i0$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/ImageProxy;

.field public final synthetic b:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/l1;->a:Landroidx/camera/core/ImageProxy;

    iput-object p2, p0, Landroidx/camera/core/l1;->b:Landroidx/camera/core/ImageProxy;

    return-void
.end method


# virtual methods
.method public final c(Landroidx/camera/core/ImageProxy;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/l1;->a:Landroidx/camera/core/ImageProxy;

    iget-object v1, p0, Landroidx/camera/core/l1;->b:Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->b(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method
