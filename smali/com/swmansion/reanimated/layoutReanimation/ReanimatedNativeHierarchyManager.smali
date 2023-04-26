.class public Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;
.super Lcom/facebook/react/uimanager/NativeViewHierarchyManager;
.source "SourceFile"


# instance fields
.field private final cleanerCallback:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private initOk:Z

.field private mPendingDeletionsForTag:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

.field private final toBeRemoved:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 6

    const-string v0, "accessFlags"

    .line 1
    const-class v1, Ljava/lang/reflect/Field;

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;-><init>(Lcom/facebook/react/uimanager/ViewManagerRegistry;)V

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mPendingDeletionsForTag:Ljava/util/HashMap;

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    .line 7
    new-instance v2, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;

    invoke-direct {v2, p2, p0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V

    iput-object v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p1, "reanimated"

    const-string p2, "unable to resolve super class of ReanimatedNativeHierarchyManager"

    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    const-string v3, "mLayoutAnimator"

    .line 10
    invoke-virtual {p2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 11
    invoke-virtual {v3, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 12
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 13
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, -0x11

    .line 15
    invoke-virtual {v4, v3, v5}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    goto :goto_0

    :catch_1
    move-exception v4

    .line 16
    :goto_0
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    :goto_1
    iget-object v4, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v3

    goto :goto_2

    :catch_3
    move-exception v3

    .line 18
    :goto_2
    iput-boolean v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    .line 19
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_3
    :try_start_3
    const-string v3, "mPendingDeletionsForTag"

    .line 20
    invoke-virtual {p2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_6

    .line 22
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, -0x11

    .line 25
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_5

    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v0

    .line 26
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    :goto_5
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mPendingDeletionsForTag:Ljava/util/HashMap;

    invoke-virtual {p2, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_7

    :catch_6
    move-exception p2

    goto :goto_6

    :catch_7
    move-exception p2

    .line 28
    :goto_6
    iput-boolean v2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    .line 29
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    :goto_7
    iget-boolean p2, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    if-eqz p2, :cond_1

    .line 31
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->setLayoutAnimationEnabled(Z)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/RootViewManager;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;-><init>(Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/RootViewManager;)V

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 34
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    .line 36
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mPendingDeletionsForTag:Ljava/util/HashMap;

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    return-void
.end method

.method private isLayoutAnimationDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->initOk:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mReaLayoutAnimator:Lcom/facebook/react/uimanager/layoutanimation/LayoutAnimationController;

    check-cast v0, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;

    invoke-virtual {v0}, Lcom/swmansion/reanimated/layoutReanimation/ReaLayoutAnimator;->isLayoutAnimationEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method protected declared-synchronized dropView(Landroid/view/View;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->isLayoutAnimationDisabled()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->dropView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/Runnable;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->dropView(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    monitor-exit p0

    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    monitor-exit p0

    .line 97
    throw p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
.end method

.method public declared-synchronized manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->isLayoutAnimationDisabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-super/range {p0 .. p4}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual/range {p0 .. p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveView(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v10, v0

    .line 24
    check-cast v10, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveViewManager(I)Lcom/facebook/react/uimanager/ViewManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v11, v0

    .line 31
    check-cast v11, Lcom/facebook/react/uimanager/ViewGroupManager;
    :try_end_1
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/ViewManager;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "RNSScreenStack"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-super/range {p0 .. p4}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    .line 48
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :cond_1
    :try_start_3
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/util/ArrayList;

    .line 73
    .line 74
    new-instance v1, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    :goto_1
    invoke-virtual {v11, v10}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    invoke-virtual {v11, v10}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-int/lit8 v0, v0, -0x1

    .line 118
    .line 119
    invoke-virtual {v11, v10, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    invoke-virtual {v11, v10}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    add-int/lit8 v0, v0, -0x1

    .line 142
    .line 143
    invoke-virtual {v11, v10, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;->removeViewAt(Landroid/view/ViewGroup;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    if-eqz v9, :cond_5

    .line 148
    .line 149
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_4

    .line 160
    .line 161
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v2, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_4
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move-object v12, v0

    .line 186
    check-cast v12, Ljava/util/ArrayList;

    .line 187
    .line 188
    array-length v13, v9

    .line 189
    const/4 v0, 0x0

    .line 190
    move v14, v0

    .line 191
    :goto_2
    if-ge v14, v13, :cond_5

    .line 192
    .line 193
    aget v0, v9, v14

    .line 194
    .line 195
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-virtual {v7, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveView(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v4
    :try_end_4
    .catch Lcom/facebook/react/uimanager/IllegalViewOperationException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 207
    :try_start_5
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->cleanerCallback:Ljava/util/HashMap;

    .line 211
    .line 212
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    new-instance v6, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;

    .line 221
    .line 222
    move-object v1, v6

    .line 223
    move-object/from16 v2, p0

    .line 224
    .line 225
    move-object v3, v12

    .line 226
    move-object v5, v11

    .line 227
    move-object/from16 v16, v12

    .line 228
    .line 229
    move-object v12, v6

    .line 230
    move-object v6, v10

    .line 231
    invoke-direct/range {v1 .. v6}, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager$1;-><init>(Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;Ljava/util/ArrayList;Landroid/view/View;Lcom/facebook/react/uimanager/ViewGroupManager;Landroid/view/ViewGroup;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v15, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :catch_0
    move-exception v0

    .line 239
    move-object/from16 v16, v12

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 242
    .line 243
    .line 244
    :goto_3
    add-int/lit8 v14, v14, 0x1

    .line 245
    .line 246
    move-object/from16 v12, v16

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_5
    iget-object v0, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->mPendingDeletionsForTag:Ljava/util/HashMap;

    .line 250
    .line 251
    if-eqz v0, :cond_6

    .line 252
    .line 253
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Ljava/util/Set;

    .line 262
    .line 263
    if-eqz v0, :cond_6

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 266
    .line 267
    .line 268
    :cond_6
    const/4 v0, 0x0

    .line 269
    move-object/from16 v1, p2

    .line 270
    .line 271
    move-object/from16 v2, p3

    .line 272
    .line 273
    invoke-super {v7, v8, v1, v2, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V

    .line 274
    .line 275
    .line 276
    iget-object v1, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 277
    .line 278
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_7

    .line 287
    .line 288
    iget-object v1, v7, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->toBeRemoved:Ljava/util/HashMap;

    .line 289
    .line 290
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    check-cast v1, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_7

    .line 309
    .line 310
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Landroid/view/View;

    .line 315
    .line 316
    invoke-virtual {v11, v10}, Lcom/facebook/react/uimanager/ViewGroupManager;->getChildCount(Landroid/view/ViewGroup;)I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    invoke-virtual {v11, v10, v2, v3}, Lcom/facebook/react/uimanager/ViewGroupManager;->addView(Landroid/view/ViewGroup;Landroid/view/View;I)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_7
    invoke-super {v7, v8, v0, v0, v9}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 325
    .line 326
    .line 327
    monitor-exit p0

    .line 328
    return-void

    .line 329
    :catch_1
    move-exception v0

    .line 330
    move-object/from16 v1, p2

    .line 331
    .line 332
    move-object/from16 v2, p3

    .line 333
    .line 334
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 335
    .line 336
    .line 337
    invoke-super/range {p0 .. p4}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->manageChildren(I[I[Lcom/facebook/react/uimanager/ViewAtIndex;[I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 338
    .line 339
    .line 340
    monitor-exit p0

    .line 341
    return-void

    .line 342
    :catchall_0
    move-exception v0

    .line 343
    monitor-exit p0

    .line 344
    throw v0
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
.end method

.method public publicDropView(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/swmansion/reanimated/layoutReanimation/ReanimatedNativeHierarchyManager;->dropView(Landroid/view/View;)V

    return-void
.end method
