.class public interface abstract Lcom/facebook/react/uimanager/ReactShadowNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/react/uimanager/ReactShadowNode;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addChildAt(Lcom/facebook/react/uimanager/ReactShadowNode;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation
.end method

.method public abstract addNativeChildAt(Lcom/facebook/react/uimanager/ReactShadowNode;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation
.end method

.method public abstract calculateLayout()V
.end method

.method public abstract calculateLayout(FF)V
.end method

.method public abstract calculateLayoutOnChildren()Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/facebook/react/uimanager/ReactShadowNode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract dirty()V
.end method

.method public abstract dispatchUpdates(FFLcom/facebook/react/uimanager/UIViewOperationQueue;Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)Z
.end method

.method public abstract dispose()V
.end method

.method public abstract getChildAt(I)Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract getChildCount()I
.end method

.method public abstract getFlex()F
.end method

.method public abstract getHeightMeasureSpec()Ljava/lang/Integer;
.end method

.method public abstract getHierarchyInfo()Ljava/lang/String;
.end method

.method public abstract getLayoutDirection()Lcom/facebook/yoga/YogaDirection;
.end method

.method public abstract getLayoutHeight()F
.end method

.method public abstract getLayoutParent()Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getLayoutWidth()F
.end method

.method public abstract getLayoutX()F
.end method

.method public abstract getLayoutY()F
.end method

.method public abstract getNativeChildCount()I
.end method

.method public abstract getNativeKind()Lcom/facebook/react/uimanager/NativeKind;
.end method

.method public abstract getNativeOffsetForChild(Lcom/facebook/react/uimanager/ReactShadowNode;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public abstract getNativeParent()Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getPadding(I)F
.end method

.method public abstract getParent()Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getReactTag()I
.end method

.method public abstract getRootTag()I
.end method

.method public abstract getScreenHeight()I
.end method

.method public abstract getScreenWidth()I
.end method

.method public abstract getScreenX()I
.end method

.method public abstract getScreenY()I
.end method

.method public abstract getStyleHeight()Lcom/facebook/yoga/YogaValue;
.end method

.method public abstract getStylePadding(I)Lcom/facebook/yoga/YogaValue;
.end method

.method public abstract getStyleWidth()Lcom/facebook/yoga/YogaValue;
.end method

.method public abstract getThemedContext()Lcom/facebook/react/uimanager/ThemedReactContext;
.end method

.method public abstract getTotalNativeChildren()I
.end method

.method public abstract getViewClass()Ljava/lang/String;
.end method

.method public abstract getWidthMeasureSpec()Ljava/lang/Integer;
.end method

.method public abstract hasNewLayout()Z
.end method

.method public abstract hasUnseenUpdates()Z
.end method

.method public abstract hasUpdates()Z
.end method

.method public abstract hoistNativeChildren()Z
.end method

.method public abstract indexOf(Lcom/facebook/react/uimanager/ReactShadowNode;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public abstract indexOfNativeChild(Lcom/facebook/react/uimanager/ReactShadowNode;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public abstract isDescendantOf(Lcom/facebook/react/uimanager/ReactShadowNode;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

.method public abstract isDirty()Z
.end method

.method public abstract isLayoutOnly()Z
.end method

.method public abstract isMeasureDefined()Z
.end method

.method public abstract isVirtual()Z
.end method

.method public abstract isVirtualAnchor()Z
.end method

.method public abstract isYogaLeafNode()Z
.end method

.method public abstract markLayoutSeen()V
.end method

.method public abstract markUpdateSeen()V
.end method

.method public abstract markUpdated()V
.end method

.method public abstract onAfterUpdateTransaction()V
.end method

.method public abstract onBeforeLayout(Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)V
.end method

.method public abstract onCollectExtraUpdates(Lcom/facebook/react/uimanager/UIViewOperationQueue;)V
.end method

.method public abstract removeAllNativeChildren()V
.end method

.method public abstract removeAndDisposeAllChildren()V
.end method

.method public abstract removeChildAt(I)Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract removeNativeChildAt(I)Lcom/facebook/react/uimanager/ReactShadowNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract setAlignContent(Lcom/facebook/yoga/YogaAlign;)V
.end method

.method public abstract setAlignItems(Lcom/facebook/yoga/YogaAlign;)V
.end method

.method public abstract setAlignSelf(Lcom/facebook/yoga/YogaAlign;)V
.end method

.method public abstract setBaselineFunction(Lcom/facebook/yoga/YogaBaselineFunction;)V
.end method

.method public abstract setBorder(IF)V
.end method

.method public abstract setDefaultPadding(IF)V
.end method

.method public abstract setDisplay(Lcom/facebook/yoga/YogaDisplay;)V
.end method

.method public abstract setFlex(F)V
.end method

.method public abstract setFlexBasis(F)V
.end method

.method public abstract setFlexBasisAuto()V
.end method

.method public abstract setFlexBasisPercent(F)V
.end method

.method public abstract setFlexDirection(Lcom/facebook/yoga/YogaFlexDirection;)V
.end method

.method public abstract setFlexGrow(F)V
.end method

.method public abstract setFlexShrink(F)V
.end method

.method public abstract setFlexWrap(Lcom/facebook/yoga/YogaWrap;)V
.end method

.method public abstract setIsLayoutOnly(Z)V
.end method

.method public abstract setJustifyContent(Lcom/facebook/yoga/YogaJustify;)V
.end method

.method public abstract setLayoutDirection(Lcom/facebook/yoga/YogaDirection;)V
.end method

.method public abstract setLayoutParent(Lcom/facebook/react/uimanager/ReactShadowNode;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract setLocalData(Ljava/lang/Object;)V
.end method

.method public abstract setMargin(IF)V
.end method

.method public abstract setMarginAuto(I)V
.end method

.method public abstract setMarginPercent(IF)V
.end method

.method public abstract setMeasureFunction(Lcom/facebook/yoga/YogaMeasureFunction;)V
.end method

.method public abstract setMeasureSpecs(II)V
.end method

.method public abstract setOverflow(Lcom/facebook/yoga/YogaOverflow;)V
.end method

.method public abstract setPadding(IF)V
.end method

.method public abstract setPaddingPercent(IF)V
.end method

.method public abstract setPosition(IF)V
.end method

.method public abstract setPositionPercent(IF)V
.end method

.method public abstract setPositionType(Lcom/facebook/yoga/YogaPositionType;)V
.end method

.method public abstract setReactTag(I)V
.end method

.method public abstract setRootTag(I)V
.end method

.method public abstract setShouldNotifyOnLayout(Z)V
.end method

.method public abstract setStyleAspectRatio(F)V
.end method

.method public abstract setStyleHeight(F)V
.end method

.method public abstract setStyleHeightAuto()V
.end method

.method public abstract setStyleHeightPercent(F)V
.end method

.method public abstract setStyleMaxHeight(F)V
.end method

.method public abstract setStyleMaxHeightPercent(F)V
.end method

.method public abstract setStyleMaxWidth(F)V
.end method

.method public abstract setStyleMaxWidthPercent(F)V
.end method

.method public abstract setStyleMinHeight(F)V
.end method

.method public abstract setStyleMinHeightPercent(F)V
.end method

.method public abstract setStyleMinWidth(F)V
.end method

.method public abstract setStyleMinWidthPercent(F)V
.end method

.method public abstract setStyleWidth(F)V
.end method

.method public abstract setStyleWidthAuto()V
.end method

.method public abstract setStyleWidthPercent(F)V
.end method

.method public abstract setThemedContext(Lcom/facebook/react/uimanager/ThemedReactContext;)V
.end method

.method public abstract setViewClassName(Ljava/lang/String;)V
.end method

.method public abstract shouldNotifyOnLayout()Z
.end method

.method public abstract updateProperties(Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V
.end method
