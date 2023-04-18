.class public Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U::",
        "Lcom/facebook/react/uimanager/BaseViewManagerInterface<",
        "TT;>;:",
        "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManagerInterface;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
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
    const-string v0, "topInsetEnabled"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x18

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "largeTitle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x17

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "largeTitleHideShadow"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x16

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "titleFontSize"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x15

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "backTitle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x14

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "backgroundColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "hideBackButton"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "largeTitleFontWeight"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "hideShadow"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "backTitleFontFamily"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "backTitleFontSize"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "title"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "color"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "largeTitleFontFamily"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "backButtonInCustomView"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "largeTitleBackgroundColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "direction"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "largeTitleFontSize"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_12
    const-string v0, "hidden"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_13
    const-string v0, "titleFontWeight"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_14
    const-string v0, "disableBackButtonMenu"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_15
    const-string v0, "titleFontFamily"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_16
    const-string v0, "largeTitleColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_0

    :cond_16
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_17
    const-string v0, "titleColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_0

    :cond_17
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_18
    const-string v0, "translucent"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_0

    :cond_18
    move v2, v1

    :goto_0
    const/4 v0, 0x0

    packed-switch v2, :pswitch_data_0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_14

    .line 3
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_19

    goto :goto_1

    :cond_19
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTopInsetEnabled(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 4
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1a

    goto :goto_2

    :cond_1a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitle(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 5
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1b

    goto :goto_3

    :cond_1b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleHideShadow(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 6
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1c

    goto :goto_4

    :cond_1c
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v1

    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_14

    .line 7
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1d

    goto :goto_5

    :cond_1d
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 8
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_14

    .line 9
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1e

    goto :goto_6

    :cond_1e
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideBackButton(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 10
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_1f

    goto :goto_7

    :cond_1f
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 11
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_20

    goto :goto_8

    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideShadow(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 12
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_21

    goto :goto_9

    :cond_21
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 13
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_22

    goto :goto_a

    :cond_22
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v1

    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_14

    .line 14
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_23

    goto :goto_b

    :cond_23
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 15
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_14

    .line 16
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_24

    goto :goto_c

    :cond_24
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 17
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_25

    goto :goto_d

    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackButtonInCustomView(Landroid/view/View;Z)V

    goto/16 :goto_14

    .line 18
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_14

    .line 19
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDirection(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 20
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_26

    goto :goto_e

    :cond_26
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v1

    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_14

    .line 21
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_27

    goto :goto_f

    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHidden(Landroid/view/View;Z)V

    goto :goto_14

    .line 22
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_28

    goto :goto_10

    :cond_28
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_10
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_14

    .line 23
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_29

    goto :goto_11

    :cond_29
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDisableBackButtonMenu(Landroid/view/View;Z)V

    goto :goto_14

    .line 24
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_2a

    goto :goto_12

    :cond_2a
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_14

    .line 25
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_14

    .line 26
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_14

    .line 27
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManagerInterface;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    if-nez p3, :cond_2b

    goto :goto_13

    :cond_2b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_13
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTranslucent(Landroid/view/View;Z)V

    :goto_14
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6ca400a7 -> :sswitch_18
        -0x6b402c15 -> :sswitch_17
        -0x69c7227a -> :sswitch_16
        -0x663e72f5 -> :sswitch_15
        -0x59a25300 -> :sswitch_14
        -0x49058be1 -> :sswitch_13
        -0x48916256 -> :sswitch_12
        -0x413de413 -> :sswitch_11
        -0x395ff881 -> :sswitch_10
        -0x17336ac8 -> :sswitch_f
        -0x85931ac -> :sswitch_e
        0x54c50 -> :sswitch_d
        0x5a72f63 -> :sswitch_c
        0x6942258 -> :sswitch_b
        0xaf5e9c1 -> :sswitch_a
        0xe7cf524 -> :sswitch_9
        0x143bc902 -> :sswitch_8
        0x1d3e3364 -> :sswitch_7
        0x3dea1ddb -> :sswitch_6
        0x4cb7f6d5 -> :sswitch_5
        0x4ef525b1 -> :sswitch_4
        0x5a7d4f68 -> :sswitch_3
        0x5d4078bf -> :sswitch_2
        0x78fc43dd -> :sswitch_1
        0x7d247559 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
