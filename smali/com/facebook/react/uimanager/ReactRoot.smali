.class public interface abstract Lcom/facebook/react/uimanager/ReactRoot;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final STATE_STARTED:I = 0x1

.field public static final STATE_STOPPED:I


# virtual methods
.method public abstract getAppProperties()Landroid/os/Bundle;
.end method

.method public abstract getHeightMeasureSpec()I
.end method

.method public abstract getInitialUITemplate()Ljava/lang/String;
.end method

.method public abstract getJSModuleName()Ljava/lang/String;
.end method

.method public abstract getRootViewGroup()Landroid/view/ViewGroup;
.end method

.method public abstract getRootViewTag()I
.end method

.method public abstract getState()Ljava/util/concurrent/atomic/AtomicInteger;
.end method

.method public abstract getSurfaceID()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getUIManagerType()I
.end method

.method public abstract getWidthMeasureSpec()I
.end method

.method public abstract onStage(I)V
.end method

.method public abstract runApplication()V
.end method

.method public abstract setRootViewTag(I)V
.end method

.method public abstract setShouldLogContentAppeared(Z)V
.end method
