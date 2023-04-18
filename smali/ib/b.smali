.class public Lib/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lib/d;


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getCircularRevealScrimColor()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getRevealInfo()Lib/d$e;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public isOpaque()Z
    .locals 1

    invoke-super {p0}, Landroid/widget/FrameLayout;->isOpaque()Z

    move-result v0

    return v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setCircularRevealScrimColor(I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setRevealInfo(Lib/d$e;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
