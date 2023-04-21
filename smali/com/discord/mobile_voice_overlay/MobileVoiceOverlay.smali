.class public final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\u0008\u0014J\u001c\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0002J\u0008\u0010\u001b\u001a\u00020\u000fH\u0002J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001\u00a2\u0006\u0002\u0008\u001fJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0001\u00a2\u0006\u0002\u0008#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;",
        "",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "menuDialogProvider",
        "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
        "selectorDialogProvider",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;",
        "trashWrapProvider",
        "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
        "voiceBubbleProvider",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        "closeMenuDialog",
        "",
        "floatBubbleToHorizontalEdge",
        "bubble",
        "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;",
        "hideOverlay",
        "hideOverlay$mobile_voice_overlay_release",
        "invokeJs",
        "methodName",
        "",
        "query",
        "isOverlayShowing",
        "",
        "onTrashVoiceBubble",
        "setData",
        "data",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;",
        "setData$mobile_voice_overlay_release",
        "showOverlay",
        "assets",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;",
        "showOverlay$mobile_voice_overlay_release",
        "Companion",
        "mobile_voice_overlay_release"
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
.field private static final ANCHOR_TAG:Ljava/lang/String; = "Active Voice Bubble"

.field public static final Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

.field private static final JS_INTERFACE_NAME:Ljava/lang/String; = "MobileVoiceOverlayManager"


# instance fields
.field private final context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final menuDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
            ">;"
        }
    .end annotation
.end field

.field private final selectorDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;",
            ">;"
        }
    .end annotation
.end field

.field private final trashWrapProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
            ">;"
        }
    .end annotation
.end field

.field private final voiceBubbleProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 12
    .line 13
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->voiceBubbleProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 22
    .line 23
    new-instance p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 24
    .line 25
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->trashWrapProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 34
    .line 35
    new-instance p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 36
    .line 37
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->menuDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 46
    .line 47
    new-instance p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 48
    .line 49
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$selectorDialogProvider$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->selectorDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 58
    .line 59
    return-void
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
.end method

.method public static final synthetic access$closeMenuDialog(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->closeMenuDialog()V

    return-void
.end method

.method public static final synthetic access$floatBubbleToHorizontalEdge(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->floatBubbleToHorizontalEdge(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getMenuDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .locals 0

    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->menuDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    return-object p0
.end method

.method public static final synthetic access$getSelectorDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .locals 0

    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->selectorDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    return-object p0
.end method

.method public static final synthetic access$getTrashWrapProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .locals 0

    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->trashWrapProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    return-object p0
.end method

.method public static final synthetic access$getVoiceBubbleProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;
    .locals 0

    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->voiceBubbleProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    return-object p0
.end method

.method public static final synthetic access$invokeJs(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->invokeJs(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$isOverlayShowing(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Z
    .locals 0

    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->isOverlayShowing()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$onTrashVoiceBubble(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->onTrashVoiceBubble()V

    return-void
.end method

.method private final closeMenuDialog()V
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->menuDialogProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->removeViewFromOverlay()V

    return-void
.end method

.method private final floatBubbleToHorizontalEdge(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getCenterX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->getScreenSize(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-le v0, v1, :cond_0

    .line 18
    .line 19
    const v3, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getY()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    float-to-int v4, v0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x4

    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-static/range {v2 .. v7}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/high16 v9, -0x80000000

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    float-to-int v10, v0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x4

    .line 44
    const/4 v13, 0x0

    .line 45
    move-object v8, p1

    .line 46
    invoke-static/range {v8 .. v13}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void
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
.end method

.method private final invokeJs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/facebook/react/bridge/WritableNativeArray;->pushString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p2, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-interface {p2}, Lcom/facebook/react/bridge/CatalystInstance;->isDestroyed()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    xor-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p2, 0x0

    .line 29
    :goto_0
    if-eqz p2, :cond_2

    .line 30
    .line 31
    const-string v1, "MobileVoiceOverlayManager"

    .line 32
    .line 33
    invoke-interface {p2, v1, p1, v0}, Lcom/facebook/react/bridge/CatalystInstance;->callFunction(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void
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
.end method

.method static synthetic invokeJs$default(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->invokeJs(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final isOverlayShowing()Z
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->trashWrapProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->isInOverlay()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->voiceBubbleProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->isInOverlay()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final onTrashVoiceBubble()V
    .locals 2

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->voiceBubbleProvider:Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;

    invoke-direct {v1, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    invoke-virtual {v0, v1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->withView(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final hideOverlay$mobile_voice_overlay_release()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getSelectorDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->removeViewFromOverlay()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getMenuDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->removeViewFromOverlay()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getVoiceBubbleProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->removeViewFromOverlay()V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getTrashWrapProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->removeViewFromOverlay()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "Expected to be on android main thread. Current: "

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1
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
.end method

.method public final setData$mobile_voice_overlay_release(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
    .locals 2

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getVoiceBubbleProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getMenuDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getSelectorDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getTrashWrapProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v1, "Expected to be on android main thread. Current: "

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
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
.end method

.method public final showOverlay$mobile_voice_overlay_release(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V
    .locals 2

    .line 1
    const-string v0, "assets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/discord/misc/utilities/threading/ThreadUtilsKt;->isOnMainThread()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getSelectorDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setAssets(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getMenuDialogProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setAssets(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getVoiceBubbleProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setAssets(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getTrashWrapProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setAssets(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$isOverlayShowing(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getVoiceBubbleProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$showOverlay$1$1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$showOverlay$1$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->withView(Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v1, "Expected to be on android main thread. Current: "

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0
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
.end method
