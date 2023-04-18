.class public interface abstract Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$ShadowNodeSetter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$Settable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ShadowNodeSetter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/react/uimanager/ReactShadowNode;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/react/uimanager/ViewManagerPropertyUpdater$Settable;"
    }
.end annotation


# virtual methods
.method public abstract setProperty(Lcom/facebook/react/uimanager/ReactShadowNode;Ljava/lang/String;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method
