.class public final synthetic Landroidx/camera/video/internal/encoder/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/video/internal/encoder/a0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/u;->k:Landroidx/camera/video/internal/encoder/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/u;->k:Landroidx/camera/video/internal/encoder/a0;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/a0;->b(Landroidx/camera/video/internal/encoder/a0;)V

    return-void
.end method
