.class Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;
.implements Landroid/widget/PopupMenu$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/NativeViewHierarchyManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PopupMenuCallbackHandler"
.end annotation


# instance fields
.field mConsumed:Z

.field final mSuccess:Lcom/facebook/react/bridge/Callback;


# direct methods
.method private constructor <init>(Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mConsumed:Z

    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mSuccess:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/uimanager/NativeViewHierarchyManager$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;-><init>(Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/widget/PopupMenu;)V
    .locals 4

    .line 1
    iget-boolean p1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mConsumed:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mSuccess:Lcom/facebook/react/bridge/Callback;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    new-array v1, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "dismissed"

    .line 12
    .line 13
    aput-object v3, v1, v2

    .line 14
    .line 15
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mConsumed:Z

    .line 19
    .line 20
    :cond_0
    return-void
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
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mConsumed:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mSuccess:Lcom/facebook/react/bridge/Callback;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v3, "itemSelected"

    .line 12
    .line 13
    aput-object v3, v2, v1

    .line 14
    .line 15
    invoke-interface {p1}, Landroid/view/MenuItem;->getOrder()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x1

    .line 24
    aput-object p1, v2, v1

    .line 25
    .line 26
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/facebook/react/uimanager/NativeViewHierarchyManager$PopupMenuCallbackHandler;->mConsumed:Z

    .line 30
    .line 31
    :cond_0
    return v1
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
.end method
