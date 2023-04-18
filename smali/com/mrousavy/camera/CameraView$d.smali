.class final Lcom/mrousavy/camera/CameraView$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/CameraView;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.mrousavy.camera.CameraView"
    f = "CameraView.kt"
    l = {
        0x170,
        0x1c1,
        0x1c4
    }
    m = "configureSession"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:Ljava/lang/Object;

.field n:Ljava/lang/Object;

.field o:Ljava/lang/Object;

.field p:Ljava/lang/Object;

.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:J

.field synthetic t:Ljava/lang/Object;

.field final synthetic u:Lcom/mrousavy/camera/CameraView;

.field v:I


# direct methods
.method constructor <init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mrousavy/camera/CameraView;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/CameraView$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView$d;->u:Lcom/mrousavy/camera/CameraView;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView$d;->t:Ljava/lang/Object;

    iget p1, p0, Lcom/mrousavy/camera/CameraView$d;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/mrousavy/camera/CameraView$d;->v:I

    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$d;->u:Lcom/mrousavy/camera/CameraView;

    invoke-static {p1, p0}, Lcom/mrousavy/camera/CameraView;->e(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
