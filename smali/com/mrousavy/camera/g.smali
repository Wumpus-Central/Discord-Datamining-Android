.class public final synthetic Lcom/mrousavy/camera/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/mrousavy/camera/CameraView;

.field public final synthetic l:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mrousavy/camera/g;->k:Lcom/mrousavy/camera/CameraView;

    iput-object p2, p0, Lcom/mrousavy/camera/g;->l:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/mrousavy/camera/g;->k:Lcom/mrousavy/camera/CameraView;

    iget-object v1, p0, Lcom/mrousavy/camera/g;->l:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/mrousavy/camera/CameraView;->c(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V

    return-void
.end method
