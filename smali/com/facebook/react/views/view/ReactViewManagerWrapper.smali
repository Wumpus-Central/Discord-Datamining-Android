.class public interface abstract Lcom/facebook/react/views/view/ReactViewManagerWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/ReactViewManagerWrapper$DefaultViewManager;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008f\u0018\u00002\u00020\u0001:\u0001%J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0008\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H&J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00122\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J0\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH&J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H&J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H&J&\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006&"
    }
    d2 = {
        "Lcom/facebook/react/views/view/ReactViewManagerWrapper;",
        "",
        "viewGroupManager",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "getViewGroupManager",
        "()Lcom/facebook/react/uimanager/ViewGroupManager;",
        "createView",
        "Landroid/view/View;",
        "reactTag",
        "",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "props",
        "stateWrapper",
        "Lcom/facebook/react/uimanager/StateWrapper;",
        "jsResponderHandler",
        "Lcom/facebook/react/touch/JSResponderHandler;",
        "getName",
        "",
        "onDropViewInstance",
        "",
        "view",
        "receiveCommand",
        "root",
        "commandId",
        "args",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "setPadding",
        "left",
        "top",
        "right",
        "bottom",
        "updateExtraData",
        "extraData",
        "updateProperties",
        "viewToUpdate",
        "updateState",
        "DefaultViewManager",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createView(ILcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/Object;Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/touch/JSResponderHandler;)Landroid/view/View;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getViewGroupManager()Lcom/facebook/react/uimanager/ViewGroupManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewGroupManager<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract onDropViewInstance(Landroid/view/View;)V
.end method

.method public abstract receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract setPadding(Landroid/view/View;IIII)V
.end method

.method public abstract updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public abstract updateProperties(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public abstract updateState(Landroid/view/View;Ljava/lang/Object;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;
.end method
