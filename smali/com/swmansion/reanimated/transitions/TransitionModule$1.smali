.class Lcom/swmansion/reanimated/transitions/TransitionModule$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/transitions/TransitionModule;->animateNextTransition(ILcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/transitions/TransitionModule;

.field final synthetic val$config:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic val$rootTag:I


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/transitions/TransitionModule;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/transitions/TransitionModule$1;->this$0:Lcom/swmansion/reanimated/transitions/TransitionModule;

    iput p2, p0, Lcom/swmansion/reanimated/transitions/TransitionModule$1;->val$rootTag:I

    iput-object p3, p0, Lcom/swmansion/reanimated/transitions/TransitionModule$1;->val$config:Lcom/facebook/react/bridge/ReadableMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 5

    .line 1
    :try_start_0
    iget v0, p0, Lcom/swmansion/reanimated/transitions/TransitionModule$1;->val$rootTag:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/swmansion/reanimated/transitions/TransitionModule$1;->val$config:Lcom/facebook/react/bridge/ReadableMap;

    .line 12
    .line 13
    const-string v1, "transitions"

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_0

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Lcom/swmansion/reanimated/transitions/TransitionUtils;->inflate(Lcom/facebook/react/bridge/ReadableMap;)Landroidx/transition/Transition;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v3, v4}, Landroidx/transition/a0;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    :cond_0
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method