.class public final synthetic Lcom/mrousavy/camera/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/mrousavy/camera/CameraViewModule;


# direct methods
.method public synthetic constructor <init>(Lcom/mrousavy/camera/CameraViewModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mrousavy/camera/k;->k:Lcom/mrousavy/camera/CameraViewModule;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/k;->k:Lcom/mrousavy/camera/CameraViewModule;

    invoke-static {v0}, Lcom/mrousavy/camera/CameraViewModule;->c(Lcom/mrousavy/camera/CameraViewModule;)V

    return-void
.end method
