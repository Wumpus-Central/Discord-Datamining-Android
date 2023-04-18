.class public final Lcom/discord/safearea/SafeAreaProviderManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/safearea/SafeAreaProviderManager$Companion;,
        Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0008\u0010\u0018\u001a\u00020\u0016H\u0016J\"\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/discord/safearea/SafeAreaProviderManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;",
        "()V",
        "changeData",
        "Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;",
        "dimensions",
        "Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;",
        "imeInsets",
        "Landroidx/core/graphics/Insets;",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "safeAreaEdgeInsets",
        "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;",
        "addEventEmitters",
        "",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "view",
        "createViewInstance",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "",
        "",
        "getName",
        "handleInsetsChanged",
        "Companion",
        "SafeAreaProviderDimensions",
        "safe_area_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/safearea/SafeAreaProviderManager$Companion;

.field private static final DEFAULT_CHANGE_DATA:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

.field private static final DEFAULT_IME_INSETS_BOTTOM:F

.field private static final DEFAULT_SAFE_AREA_INSETS:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;


# instance fields
.field private changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

.field private dimensions:Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

.field private imeInsets:Landroidx/core/graphics/Insets;

.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;

.field private safeAreaEdgeInsets:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/discord/safearea/SafeAreaProviderManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/safearea/SafeAreaProviderManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/safearea/SafeAreaProviderManager;->Companion:Lcom/discord/safearea/SafeAreaProviderManager$Companion;

    .line 8
    .line 9
    new-instance v0, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1, v1, v1, v1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/discord/safearea/SafeAreaProviderManager;->DEFAULT_SAFE_AREA_INSETS:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 16
    .line 17
    new-instance v1, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->d()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->a()F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->b()F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->c()F

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v2, v1

    .line 37
    invoke-direct/range {v2 .. v7}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;-><init>(FFFFF)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lcom/discord/safearea/SafeAreaProviderManager;->DEFAULT_CHANGE_DATA:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 41
    .line 42
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/discord/reactevents/ReactEvents;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lkotlin/Pair;

    .line 8
    .line 9
    const-class v2, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "onSafeAreaInsetsDidChange"

    .line 16
    .line 17
    invoke-static {v3, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    aput-object v2, v1, v3

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 28
    .line 29
    sget-object v0, Lcom/discord/safearea/SafeAreaProviderManager;->DEFAULT_CHANGE_DATA:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 32
    .line 33
    sget-object v0, Lcom/discord/safearea/SafeAreaProviderManager;->DEFAULT_SAFE_AREA_INSETS:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->safeAreaEdgeInsets:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 36
    .line 37
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method

.method public static final synthetic access$getImeInsets$p(Lcom/discord/safearea/SafeAreaProviderManager;)Landroidx/core/graphics/Insets;
    .locals 0

    iget-object p0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->imeInsets:Landroidx/core/graphics/Insets;

    return-object p0
.end method

.method public static final synthetic access$getSafeAreaEdgeInsets$p(Lcom/discord/safearea/SafeAreaProviderManager;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    .locals 0

    iget-object p0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->safeAreaEdgeInsets:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    return-object p0
.end method

.method public static final synthetic access$handleInsetsChanged(Lcom/discord/safearea/SafeAreaProviderManager;Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;Landroidx/core/graphics/Insets;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/safearea/SafeAreaProviderManager;->handleInsetsChanged(Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;Landroidx/core/graphics/Insets;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    return-void
.end method

.method public static final synthetic access$setImeInsets$p(Lcom/discord/safearea/SafeAreaProviderManager;Landroidx/core/graphics/Insets;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/safearea/SafeAreaProviderManager;->imeInsets:Landroidx/core/graphics/Insets;

    return-void
.end method

.method private final handleInsetsChanged(Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;Landroidx/core/graphics/Insets;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
    .locals 7

    .line 1
    new-instance v6, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->d()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->a()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->b()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->c()F

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget p1, p2, Landroidx/core/graphics/Insets;->d:I

    .line 22
    .line 23
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    move v5, p1

    .line 30
    move-object v0, v6

    .line 31
    invoke-direct/range {v0 .. v5}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;-><init>(FFFFF)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    .line 35
    .line 36
    invoke-direct {p1, p3}, Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;-><init>(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lcom/discord/safearea/SafeAreaProviderManager;->dimensions:Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    .line 40
    .line 41
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    sget-object p2, Lcom/discord/safearea/SafeAreaProviderManager;->DEFAULT_CHANGE_DATA:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 48
    .line 49
    iput-object p2, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/discord/safearea/SafeAreaProviderManager;->dimensions:Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;

    .line 52
    .line 53
    :cond_1
    new-instance p1, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 54
    .line 55
    invoke-virtual {v6}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getTop()F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getTop()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v6}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getBottom()F

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getBottom()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v6}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getLeft()F

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getLeft()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v6}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getRight()F

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getRight()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {v6}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;->getImeInsetsBottom()F

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    move-object v0, p1

    .line 116
    invoke-direct/range {v0 .. v5}, Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;-><init>(FFFFF)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lcom/discord/safearea/SafeAreaProviderManager;->changeData:Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;

    .line 120
    .line 121
    iget-object p2, p0, Lcom/discord/safearea/SafeAreaProviderManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 122
    .line 123
    invoke-virtual {p2, p3, p1}, Lcom/discord/reactevents/ReactEvents;->emitEvent(Landroid/view/View;Lcom/discord/reactevents/ReactEvent;)V

    .line 124
    .line 125
    .line 126
    return-void
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
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
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


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

    invoke-virtual {p0, p1, p2}, Lcom/discord/safearea/SafeAreaProviderManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;->a:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;

    .line 3
    new-instance p1, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$$inlined$setOnInsetsChangeListener$1;

    invoke-direct {p1, p0, p2}, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$$inlined$setOnInsetsChangeListener$1;-><init>(Lcom/discord/safearea/SafeAreaProviderManager;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    invoke-virtual {p2, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;->setOnInsetsChangeListener(Lcom/th3rdwave/safeareacontext/SafeAreaProvider$a;)V

    .line 4
    sget-object p1, Lcom/discord/safearea/extensions/ImmersiveMode;->INSTANCE:Lcom/discord/safearea/extensions/ImmersiveMode;

    new-instance v0, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;

    invoke-direct {v0, p0, p2}, Lcom/discord/safearea/SafeAreaProviderManager$addEventEmitters$2;-><init>(Lcom/discord/safearea/SafeAreaProviderManager;Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V

    invoke-virtual {p1, v0}, Lcom/discord/safearea/extensions/ImmersiveMode;->addRootViewInsetUpdateCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/safearea/SafeAreaProviderManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/th3rdwave/safeareacontext/SafeAreaProvider;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;

    invoke-direct {v0, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/safearea/SafeAreaProviderManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    invoke-virtual {v0}, Lcom/discord/reactevents/ReactEvents;->exportEventConstants()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "DCDSafeArea"

    return-object v0
.end method
