.class Lcom/horcrux/svg/h0;
.super Lcom/horcrux/svg/t0;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private A:Lcom/horcrux/svg/SVGLength;

.field private B:Lcom/horcrux/svg/p0;

.field private C:Lcom/horcrux/svg/s0;

.field private x:Ljava/lang/String;

.field private y:Lcom/horcrux/svg/r0;

.field private z:Lcom/horcrux/svg/q0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/t0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/horcrux/svg/p0;->k:Lcom/horcrux/svg/p0;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/h0;->B:Lcom/horcrux/svg/p0;

    .line 7
    .line 8
    sget-object p1, Lcom/horcrux/svg/s0;->l:Lcom/horcrux/svg/s0;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/h0;->C:Lcom/horcrux/svg/s0;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    return-void
.end method

.method f()V
    .locals 0

    return-void
.end method

.method g()V
    .locals 0

    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/t0;->l(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method p()Lcom/horcrux/svg/q0;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/h0;->z:Lcom/horcrux/svg/q0;

    return-object v0
.end method

.method q()Lcom/horcrux/svg/r0;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/h0;->y:Lcom/horcrux/svg/r0;

    return-object v0
.end method

.method r()Lcom/horcrux/svg/SVGLength;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/h0;->A:Lcom/horcrux/svg/SVGLength;

    return-object v0
.end method

.method s(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/horcrux/svg/h0;->x:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->getDefinedTemplate(Ljava/lang/String;)Lcom/horcrux/svg/VirtualView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/horcrux/svg/RenderableView;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    check-cast v0, Lcom/horcrux/svg/RenderableView;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/horcrux/svg/RenderableView;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public setHref(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "href"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/h0;->x:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "method"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/p0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/p0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h0;->B:Lcom/horcrux/svg/p0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setSharp(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "midLine"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/q0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/q0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h0;->z:Lcom/horcrux/svg/q0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setSide(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "side"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/r0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h0;->y:Lcom/horcrux/svg/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setSpacing(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "spacing"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/s0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/s0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h0;->C:Lcom/horcrux/svg/s0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setStartOffset(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "startOffset"
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h0;->A:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/t0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
