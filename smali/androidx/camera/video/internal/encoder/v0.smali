.class public final synthetic Landroidx/camera/video/internal/encoder/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/v0;->k:Landroidx/camera/video/internal/encoder/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/v0;->k:Landroidx/camera/video/internal/encoder/l;

    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/l;->d()V

    return-void
.end method
