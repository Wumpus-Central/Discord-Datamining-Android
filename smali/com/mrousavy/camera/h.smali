.class public final synthetic Lcom/mrousavy/camera/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/m0$a;


# instance fields
.field public final synthetic a:Lcom/mrousavy/camera/CameraView;


# direct methods
.method public synthetic constructor <init>(Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mrousavy/camera/h;->a:Lcom/mrousavy/camera/CameraView;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/ImageProxy;)V
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/h;->a:Lcom/mrousavy/camera/CameraView;

    invoke-static {v0, p1}, Lcom/mrousavy/camera/CameraView;->b(Lcom/mrousavy/camera/CameraView;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method
