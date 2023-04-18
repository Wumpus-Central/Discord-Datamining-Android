.class public final synthetic Lcom/mrousavy/camera/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/modules/core/PermissionListener;


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(ILcom/facebook/react/bridge/Promise;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/mrousavy/camera/i;->k:I

    iput-object p2, p0, Lcom/mrousavy/camera/i;->l:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 2

    iget v0, p0, Lcom/mrousavy/camera/i;->k:I

    iget-object v1, p0, Lcom/mrousavy/camera/i;->l:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/mrousavy/camera/CameraViewModule;->a(ILcom/facebook/react/bridge/Promise;I[Ljava/lang/String;[I)Z

    move-result p1

    return p1
.end method
