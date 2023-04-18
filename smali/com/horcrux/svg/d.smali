.class Lcom/horcrux/svg/d;
.super Lcom/horcrux/svg/VirtualView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/VirtualView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method hitTest([F)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method isResponsible()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
