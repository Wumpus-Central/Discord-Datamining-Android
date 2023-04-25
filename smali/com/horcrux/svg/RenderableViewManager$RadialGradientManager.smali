.class Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;
.super Lcom/horcrux/svg/VirtualViewManager;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RadialGradientManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/VirtualViewManager<",
        "Lcom/horcrux/svg/a0;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface<",
        "Lcom/horcrux/svg/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGRadialGradient"


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGRadialGradient:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/horcrux/svg/VirtualViewManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/horcrux/svg/VirtualViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public bridge synthetic setClipPath(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "clipPath"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setClipPath(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setClipRule(Landroid/view/View;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "clipRule"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setClipRule(Lcom/horcrux/svg/VirtualView;I)V

    return-void
.end method

.method public bridge synthetic setCx(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setCx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setCx(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setCx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setCx(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cx"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->a(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setCx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->b(Ljava/lang/Double;)V

    return-void
.end method

.method public setCx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setCy(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setCy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setCy(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setCy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setCy(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cy"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->d(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setCy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->e(Ljava/lang/Double;)V

    return-void
.end method

.method public setCy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->f(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDisplay(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "display"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setDisplay(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setFx(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setFx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setFx(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setFx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setFx(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "fx"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->g(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->h(Ljava/lang/Double;)V

    return-void
.end method

.method public setFx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->i(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setFy(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setFy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setFy(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setFy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setFy(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "fy"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->j(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->k(Ljava/lang/Double;)V

    return-void
.end method

.method public setFy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->l(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setGradient(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradient"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setGradient(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setGradient(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradient"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->m(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic setGradientTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradientTransform"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setGradientTransform(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setGradientTransform(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradientTransform"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->n(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic setGradientUnits(Landroid/view/View;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradientUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setGradientUnits(Lcom/horcrux/svg/a0;I)V

    return-void
.end method

.method public setGradientUnits(Lcom/horcrux/svg/a0;I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "gradientUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->o(I)V

    return-void
.end method

.method public bridge synthetic setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerEnd"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerEnd(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setMarkerMid(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerMid"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerMid(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setMarkerStart(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "markerStart"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMarkerStart(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setMask(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "mask"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMask(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setMatrix(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic setName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "name"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setName(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setOpacity(Landroid/view/View;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultFloat = 1.0f
        name = "opacity"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setOpacity(Lcom/horcrux/svg/VirtualView;F)V

    return-void
.end method

.method public bridge synthetic setPointerEvents(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "pointerEvents"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setPointerEvents(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setResponsible(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "responsible"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setResponsible(Lcom/horcrux/svg/VirtualView;Z)V

    return-void
.end method

.method public bridge synthetic setRx(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setRx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setRx(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setRx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setRx(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "rx"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->p(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setRx(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->q(Ljava/lang/Double;)V

    return-void
.end method

.method public setRx(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->r(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setRy(Landroid/view/View;Ljava/lang/Double;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setRy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic setRy(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/horcrux/svg/a0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$RadialGradientManager;->setRy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V

    return-void
.end method

.method public setRy(Lcom/horcrux/svg/a0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "ry"
    .end annotation

    .line 3
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->s(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setRy(Lcom/horcrux/svg/a0;Ljava/lang/Double;)V
    .locals 0

    .line 5
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->t(Ljava/lang/Double;)V

    return-void
.end method

.method public setRy(Lcom/horcrux/svg/a0;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/a0;->u(Ljava/lang/String;)V

    return-void
.end method
