.class public final Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;",
        "Landroid/view/View$OnTouchListener;",
        "view",
        "Landroid/view/View;",
        "viewManagesAccessibility",
        "",
        "(Landroid/view/View;Z)V",
        "onSupplementalMotionEventReceived",
        "Lkotlin/Function1;",
        "Landroid/view/MotionEvent;",
        "",
        "viewTouchTracker",
        "Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;",
        "onTouch",
        "event",
        "Companion",
        "react_gesture_handler_release"
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
.field public static final Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;

.field private static onAddNativeEventListener:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private static onRemoveNativeEventListener:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private onSupplementalMotionEventReceived:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final viewTouchTracker:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->Companion:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Z)V
    .locals 6

    .line 1
    const-string v0, "view"

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
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p2, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$1;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$1;-><init>(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Landroidx/core/view/w0;->q0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance p2, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v0, "view.context"

    .line 26
    .line 27
    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->getViewClickListeners()Ljava/util/WeakHashMap;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v2, v0

    .line 39
    check-cast v2, Landroid/view/View$OnClickListener;

    .line 40
    .line 41
    invoke-static {}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->getViewLongClickListeners()Ljava/util/WeakHashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v3, v0

    .line 50
    check-cast v3, Landroid/view/View$OnLongClickListener;

    .line 51
    .line 52
    new-instance v4, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;

    .line 53
    .line 54
    invoke-direct {v4, p0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$1;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$2;

    .line 58
    .line 59
    invoke-direct {v5, p0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$viewTouchTracker$2;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)V

    .line 60
    .line 61
    .line 62
    move-object v0, p2

    .line 63
    invoke-direct/range {v0 .. v5}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->viewTouchTracker:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;

    .line 67
    .line 68
    new-instance p2, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;

    .line 69
    .line 70
    invoke-direct {p2, p0, p1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener$onSupplementalMotionEventReceived$1;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onSupplementalMotionEventReceived:Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    return-void
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
.end method

.method public static final synthetic access$getOnAddNativeEventListener$cp()Lkotlin/jvm/functions/Function2;
    .locals 1

    sget-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onAddNativeEventListener:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public static final synthetic access$getOnRemoveNativeEventListener$cp()Lkotlin/jvm/functions/Function2;
    .locals 1

    sget-object v0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onRemoveNativeEventListener:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public static final synthetic access$getOnSupplementalMotionEventReceived$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onSupplementalMotionEventReceived:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getViewTouchTracker$p(Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;)Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;
    .locals 0

    iget-object p0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->viewTouchTracker:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;

    return-object p0
.end method

.method public static final synthetic access$setOnAddNativeEventListener$cp(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    sput-object p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onAddNativeEventListener:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public static final synthetic access$setOnRemoveNativeEventListener$cp(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    sput-object p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->onRemoveNativeEventListener:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchListener;->viewTouchTracker:Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchTracker;->handleTouch$react_gesture_handler_release(Landroid/view/View;Landroid/view/MotionEvent;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
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
.end method
