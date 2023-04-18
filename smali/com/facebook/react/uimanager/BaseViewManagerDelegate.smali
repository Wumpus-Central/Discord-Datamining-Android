.class public abstract Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/ViewManagerDelegate;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U::",
        "Lcom/facebook/react/uimanager/BaseViewManagerInterface<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected final mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "nativeID"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x1c

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "accessibilityCollectionItem"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x1b

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "accessibilityLabelledBy"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x1a

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "accessibilityCollection"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x19

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "accessibilityActions"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x18

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "borderRadius"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x17

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "backgroundColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x16

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "accessibilityState"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x15

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "accessibilityLabel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x14

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "transform"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "importantForAccessibility"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "borderBottomRightRadius"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "borderBottomLeftRadius"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "borderTopRightRadius"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "accessibilityLiveRegion"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "elevation"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "rotation"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "renderToHardwareTextureAndroid"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "accessibilityRole"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "accessibilityHint"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "zIndex"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "testID"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_15

    goto :goto_0

    :cond_15
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_16
    const-string v0, "scaleY"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_16

    goto :goto_0

    :cond_16
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_17
    const-string v0, "scaleX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_17

    goto :goto_0

    :cond_17
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_18
    const-string v0, "borderTopLeftRadius"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_0

    :cond_18
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_19
    const-string v0, "opacity"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_19

    goto :goto_0

    :cond_19
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1a
    const-string v0, "shadowColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1b
    const-string v0, "translateY"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_1c
    const-string v0, "translateX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1c

    goto :goto_0

    :cond_1c
    move v2, v1

    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/high16 v3, 0x7fc00000    # Float.NaN

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_11

    .line 2
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 3
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityCollectionItem(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    .line 4
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/Dynamic;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityLabelledBy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    goto/16 :goto_11

    .line 5
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityCollection(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    .line 6
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityActions(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_11

    .line 7
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_1d

    goto :goto_1

    .line 8
    :cond_1d
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 9
    :goto_1
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBorderRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 10
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_1e

    goto :goto_2

    .line 11
    :cond_1e
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 12
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBackgroundColor(Landroid/view/View;I)V

    goto/16 :goto_11

    .line 13
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setViewState(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    .line 14
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityLabel(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 15
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_11

    .line 16
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setImportantForAccessibility(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 17
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_1f

    goto :goto_3

    .line 18
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 19
    :goto_3
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBorderBottomRightRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 20
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_20

    goto :goto_4

    .line 21
    :cond_20
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 22
    :goto_4
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBorderBottomLeftRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 23
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_21

    goto :goto_5

    .line 24
    :cond_21
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 25
    :goto_5
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBorderTopRightRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 26
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityLiveRegion(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 27
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_22

    goto :goto_6

    :cond_22
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setElevation(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 28
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_23

    goto :goto_7

    :cond_23
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setRotation(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 29
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_24

    goto :goto_8

    :cond_24
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setRenderToHardwareTexture(Landroid/view/View;Z)V

    goto/16 :goto_11

    .line 30
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityRole(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 31
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setAccessibilityHint(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 32
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_25

    goto :goto_9

    :cond_25
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setZIndex(Landroid/view/View;F)V

    goto/16 :goto_11

    .line 33
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setTestId(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 34
    :pswitch_16
    iget-object v0, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_26

    goto :goto_a

    :cond_26
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result p2

    :goto_a
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setScaleY(Landroid/view/View;F)V

    goto :goto_11

    .line 35
    :pswitch_17
    iget-object v0, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_27

    goto :goto_b

    :cond_27
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result p2

    :goto_b
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setScaleX(Landroid/view/View;F)V

    goto :goto_11

    .line 36
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_28

    goto :goto_c

    .line 37
    :cond_28
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    .line 38
    :goto_c
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setBorderTopLeftRadius(Landroid/view/View;F)V

    goto :goto_11

    .line 39
    :pswitch_19
    iget-object v0, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_29

    goto :goto_d

    :cond_29
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result p2

    :goto_d
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setOpacity(Landroid/view/View;F)V

    goto :goto_11

    .line 40
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_2a

    goto :goto_e

    .line 41
    :cond_2a
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 42
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setShadowColor(Landroid/view/View;I)V

    goto :goto_11

    .line 43
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_2b

    goto :goto_f

    :cond_2b
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_f
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setTranslateY(Landroid/view/View;F)V

    goto :goto_11

    .line 44
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    if-nez p3, :cond_2c

    goto :goto_10

    :cond_2c
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_10
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManagerInterface;->setTranslateX(Landroid/view/View;F)V

    :goto_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66a2c736 -> :sswitch_1c
        -0x66a2c735 -> :sswitch_1b
        -0x5ec185dd -> :sswitch_1a
        -0x4b8807f5 -> :sswitch_19
        -0x4932ce1e -> :sswitch_18
        -0x3621dfb2 -> :sswitch_17
        -0x3621dfb1 -> :sswitch_16
        -0x34488ed3 -> :sswitch_15
        -0x2b988b88 -> :sswitch_14
        -0x60f430b -> :sswitch_13
        -0x60aa11c -> :sswitch_12
        -0x4d24f13 -> :sswitch_11
        -0x266f082 -> :sswitch_10
        -0x42d1a3 -> :sswitch_f
        0x22936ee -> :sswitch_e
        0x13dfc885 -> :sswitch_d
        0x22a57450 -> :sswitch_c
        0x230fd3d7 -> :sswitch_b
        0x2c861b47 -> :sswitch_a
        0x3ebe6b6c -> :sswitch_9
        0x445b6e46 -> :sswitch_8
        0x44c6b3e3 -> :sswitch_7
        0x4cb7f6d5 -> :sswitch_6
        0x506afbde -> :sswitch_5
        0x59bdabcf -> :sswitch_4
        0x6904828c -> :sswitch_3
        0x6f2de13c -> :sswitch_2
        0x76cb4bbf -> :sswitch_1
        0x79eeaf72 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
