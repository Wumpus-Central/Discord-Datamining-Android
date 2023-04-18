.class public final synthetic Lcom/mrousavy/camera/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic k:Lcom/mrousavy/camera/CameraView;


# direct methods
.method public synthetic constructor <init>(Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mrousavy/camera/f;->k:Lcom/mrousavy/camera/CameraView;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/f;->k:Lcom/mrousavy/camera/CameraView;

    invoke-static {v0, p1, p2}, Lcom/mrousavy/camera/CameraView;->a(Lcom/mrousavy/camera/CameraView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
