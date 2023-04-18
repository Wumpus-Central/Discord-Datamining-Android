.class public interface abstract Landroidx/camera/core/ImageProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/ImageProxy$a;
    }
.end annotation


# virtual methods
.method public abstract c0(Landroid/graphics/Rect;)V
.end method

.method public abstract close()V
.end method

.method public abstract e0()Landroidx/camera/core/k1;
.end method

.method public abstract getFormat()I
.end method

.method public abstract getHeight()I
.end method

.method public abstract getWidth()I
.end method

.method public abstract n()[Landroidx/camera/core/ImageProxy$a;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ArrayReturn"
        }
    .end annotation
.end method

.method public abstract p0()Landroid/media/Image;
.end method
