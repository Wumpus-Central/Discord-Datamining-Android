.class public final synthetic Landroidx/camera/video/internal/encoder/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/internal/encoder/b1;


# instance fields
.field public final synthetic a:Landroid/media/MediaFormat;


# direct methods
.method public synthetic constructor <init>(Landroid/media/MediaFormat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/u0;->a:Landroid/media/MediaFormat;

    return-void
.end method


# virtual methods
.method public final a()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/u0;->a:Landroid/media/MediaFormat;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/a0$f;->f(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method
