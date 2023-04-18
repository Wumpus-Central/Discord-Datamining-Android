.class public abstract Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;
.super Lcom/discord/mobile_voice_overlay/views/OverlayView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0015\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008l\u0010mB\u001b\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010o\u001a\u0004\u0018\u00010n\u00a2\u0006\u0004\u0008l\u0010pB#\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010o\u001a\u0004\u0018\u00010n\u0012\u0006\u0010q\u001a\u00020\u000b\u00a2\u0006\u0004\u0008l\u0010rJ\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0018\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0082\u0008J\u0008\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J\u0008\u0010\u0018\u001a\u00020\u0006H\u0004J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\u0008\u0010\u001d\u001a\u00020\u001cH\u0016J0\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0014J\u0012\u0010&\u001a\u00020\u00062\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0015J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\'H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\'H\u0016J\u0008\u0010+\u001a\u00020\u0003H\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0003H\u0016J\u0008\u0010.\u001a\u00020\u0003H\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0003H\u0016J \u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0008\u0008\u0002\u00103\u001a\u00020\u0016J\u0008\u00105\u001a\u0004\u0018\u00010\u0008J\u0010\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0016J\u0012\u0010:\u001a\u00020\u00062\u0008\u0008\u0002\u00109\u001a\u00020\u0019H\u0016R\"\u0010;\u001a\u00020\u001c8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R.\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00060A8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\u0017\u0010H\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010KR\u0014\u0010L\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR+\u0010Q\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00198V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR0\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010A8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008U\u0010C\u001a\u0004\u0008V\u0010E\"\u0004\u0008W\u0010GR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010MR\u0016\u0010\\\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010MR \u0010]\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u0012\n\u0004\u0008]\u0010^\u0012\u0004\u0008a\u0010b\u001a\u0004\u0008_\u0010`R \u0010c\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u0012\n\u0004\u0008c\u0010^\u0012\u0004\u0008e\u0010b\u001a\u0004\u0008d\u0010`R\u0016\u0010f\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010gR\u0011\u0010\u000c\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008i\u0010jR\u0011\u0010\r\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008k\u0010j\u00a8\u0006s"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayView;",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        "",
        "fromPosition",
        "toPosition",
        "",
        "animateTo",
        "Landroid/graphics/Point;",
        "newAnchorPoint",
        "setAnchorAt",
        "",
        "centerX",
        "centerY",
        "setAnchorAround",
        "minValue",
        "desiredValue",
        "maxValue",
        "boundAllowedArea",
        "computeScreenOffset",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/Rect;",
        "getAllowedAreaBounds",
        "updateViewLayout",
        "",
        "isTouchable",
        "setBubbleTouchable",
        "Landroid/view/WindowManager$LayoutParams;",
        "getInitialLayoutParams",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "dispatchTouchEvent",
        "onInterceptTouchEvent",
        "getX",
        "x",
        "setX",
        "getY",
        "y",
        "setY",
        "dockX",
        "dockY",
        "screenBounds",
        "animateToCoordinate",
        "moveToAnchorPoint",
        "Landroid/view/View;",
        "targetView",
        "anchorOn",
        "animate",
        "anchorOff",
        "windowLayoutParams",
        "Landroid/view/WindowManager$LayoutParams;",
        "getWindowLayoutParams",
        "()Landroid/view/WindowManager$LayoutParams;",
        "setWindowLayoutParams",
        "(Landroid/view/WindowManager$LayoutParams;)V",
        "Lkotlin/Function1;",
        "touchDispatchSideEffectHandler",
        "Lkotlin/jvm/functions/Function1;",
        "getTouchDispatchSideEffectHandler$mobile_voice_overlay_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setTouchDispatchSideEffectHandler$mobile_voice_overlay_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "insetMargins",
        "Landroid/graphics/Rect;",
        "getInsetMargins",
        "()Landroid/graphics/Rect;",
        "moveThresholdPx",
        "I",
        "<set-?>",
        "isMoving$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "isMoving",
        "()Z",
        "setMoving",
        "(Z)V",
        "onMovingStateChanged",
        "getOnMovingStateChanged",
        "setOnMovingStateChanged",
        "",
        "screenOffset",
        "[I",
        "deltaX",
        "deltaY",
        "springAnimationX",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        "getSpringAnimationX",
        "()Landroidx/dynamicanimation/animation/SpringAnimation;",
        "getSpringAnimationX$annotations",
        "()V",
        "springAnimationY",
        "getSpringAnimationY",
        "getSpringAnimationY$annotations",
        "actualPosition",
        "Landroid/graphics/Point;",
        "anchorPosition",
        "getCenterX",
        "()I",
        "getCenterY",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "attributeSetId",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "mobile_voice_overlay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private actualPosition:Landroid/graphics/Point;

.field private anchorPosition:Landroid/graphics/Point;

.field private deltaX:I

.field private deltaY:I

.field private final insetMargins:Landroid/graphics/Rect;

.field private final isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final moveThresholdPx:I

.field private onMovingStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final screenOffset:[I

.field private final springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

.field private final springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

.field private touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;
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

.field private windowLayoutParams:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/w;

    .line 5
    .line 6
    const-string v2, "isMoving"

    .line 7
    .line 8
    const-string v3, "isMoving()Z"

    .line 9
    .line 10
    const-class v4, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/w;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->e(Lkotlin/jvm/internal/v;)Ldg/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v5

    .line 21
    .line 22
    sput-object v0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 23
    .line 24
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayView;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object p1, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->createWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/16 v0, 0x33

    .line 3
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 4
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 5
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->insetMargins:Landroid/graphics/Rect;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/discord/mobile_voice_overlay/R$dimen;->movement_threshold_dp:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->moveThresholdPx:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/discord/mobile_voice_overlay/R$drawable;->bubble_state_selector:I

    invoke-static {p1, v0}, Landroid/animation/AnimatorInflater;->loadStateListAnimator(Landroid/content/Context;I)Landroid/animation/StateListAnimator;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 10
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    new-instance v0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$1;

    invoke-direct {v0, p1, p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    .line 12
    iput-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 13
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 14
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->u:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    const/high16 v0, 0x42480000    # 50.0f

    .line 15
    invoke-virtual {p1, v0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 16
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v2

    const/high16 v3, 0x43480000    # 200.0f

    invoke-virtual {v2, v3}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 17
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v2

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-virtual {v2, v4}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 18
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 19
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object v2, Landroidx/dynamicanimation/animation/DynamicAnimation;->v:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    invoke-direct {p1, p0, v2, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    .line 20
    invoke-virtual {p1, v0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 21
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 22
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 23
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 24
    new-instance p1, Landroid/graphics/Point;

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-direct {p1, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/views/OverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    sget-object p1, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->createWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/16 p2, 0x33

    .line 27
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 28
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 29
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    .line 30
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->insetMargins:Landroid/graphics/Rect;

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/discord/mobile_voice_overlay/R$dimen;->movement_threshold_dp:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->moveThresholdPx:I

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/discord/mobile_voice_overlay/R$drawable;->bubble_state_selector:I

    invoke-static {p1, p2}, Landroid/animation/AnimatorInflater;->loadStateListAnimator(Landroid/content/Context;I)Landroid/animation/StateListAnimator;

    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 34
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    new-instance p2, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$2;

    invoke-direct {p2, p1, p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    .line 36
    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 37
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 38
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object p2, Landroidx/dynamicanimation/animation/DynamicAnimation;->u:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    const/high16 p2, 0x42480000    # 50.0f

    .line 39
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 40
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v1

    const/high16 v2, 0x43480000    # 200.0f

    invoke-virtual {v1, v2}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 41
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v1

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-virtual {v1, v3}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 42
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 43
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object v1, Landroidx/dynamicanimation/animation/DynamicAnimation;->v:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    invoke-direct {p1, p0, v1, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    .line 44
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 45
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 46
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 47
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 48
    new-instance p1, Landroid/graphics/Point;

    iget-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v0, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-direct {p1, v0, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/mobile_voice_overlay/views/OverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    sget-object p1, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->createWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/16 p2, 0x33

    .line 51
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 52
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 53
    sget-object p1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$touchDispatchSideEffectHandler$1;

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    .line 54
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->insetMargins:Landroid/graphics/Rect;

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/discord/mobile_voice_overlay/R$dimen;->movement_threshold_dp:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->moveThresholdPx:I

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/discord/mobile_voice_overlay/R$drawable;->bubble_state_selector:I

    invoke-static {p1, p2}, Landroid/animation/AnimatorInflater;->loadStateListAnimator(Landroid/content/Context;I)Landroid/animation/StateListAnimator;

    move-result-object p1

    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 58
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    new-instance p2, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$3;

    invoke-direct {p2, p1, p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    .line 60
    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 61
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 62
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object p2, Landroidx/dynamicanimation/animation/DynamicAnimation;->u:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p2, p3}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    const/high16 p2, 0x42480000    # 50.0f

    .line 63
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 64
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v0

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 65
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object v0

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-virtual {v0, v2}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 66
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 67
    new-instance p1, Landroidx/dynamicanimation/animation/SpringAnimation;

    sget-object v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->v:Landroidx/dynamicanimation/animation/DynamicAnimation$s;

    invoke-direct {p1, p0, v0, p3}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Lj1/a;F)V

    .line 68
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->k(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 69
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroidx/dynamicanimation/animation/b;->d(F)Landroidx/dynamicanimation/animation/b;

    .line 70
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->q()Landroidx/dynamicanimation/animation/b;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroidx/dynamicanimation/animation/b;->f(F)Landroidx/dynamicanimation/animation/b;

    .line 71
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 72
    new-instance p1, Landroid/graphics/Point;

    iget-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget p3, p2, Landroid/view/WindowManager$LayoutParams;->x:I

    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-direct {p1, p3, p2}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    return-void
.end method

.method public static final synthetic access$computeScreenOffset(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->computeScreenOffset()V

    return-void
.end method

.method public static synthetic anchorOff$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->anchorOff(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: anchorOff"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final animateTo(Landroidx/dynamicanimation/animation/SpringAnimation;FF)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->j(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p3}, Landroidx/dynamicanimation/animation/SpringAnimation;->o(F)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
.end method

.method public static synthetic animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    const-string p4, "context"

    .line 12
    .line 13
    invoke-static {p3, p4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p3}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getAllowedAreaBounds(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate(IILandroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: animateToCoordinate"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
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
.end method

.method private final boundAllowedArea(III)I
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method private final computeScreenOffset()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget v2, v0, v1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    iget v4, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 14
    .line 15
    sub-int/2addr v2, v4

    .line 16
    aput v2, v0, v1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    aget v2, v0, v1

    .line 20
    .line 21
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 22
    .line 23
    sub-int/2addr v2, v3

    .line 24
    aput v2, v0, v1

    .line 25
    .line 26
    return-void
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
.end method

.method protected static synthetic getSpringAnimationX$annotations()V
    .locals 0

    return-void
.end method

.method protected static synthetic getSpringAnimationY$annotations()V
    .locals 0

    return-void
.end method

.method private final setAnchorAround(II)Landroid/graphics/Point;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    sub-int/2addr p1, v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    div-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    sub-int/2addr p2, v0

    .line 15
    new-instance v0, Landroid/graphics/Point;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setAnchorAt(Landroid/graphics/Point;)V

    .line 21
    .line 22
    .line 23
    return-object v0
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

.method private final setAnchorAt(Landroid/graphics/Point;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    float-to-int v1, v1

    .line 8
    iput v1, v0, Landroid/graphics/Point;->x:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getY()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    float-to-int v1, v1

    .line 17
    iput v1, v0, Landroid/graphics/Point;->y:I

    .line 18
    .line 19
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->anchorPosition:Landroid/graphics/Point;

    .line 20
    .line 21
    return-void
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
.end method


# virtual methods
.method public anchorOff(Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->anchorPosition:Landroid/graphics/Point;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->c()V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 17
    .line 18
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 19
    .line 20
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x4

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-static/range {v0 .. v5}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 33
    .line 34
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 35
    .line 36
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 37
    .line 38
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 39
    .line 40
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void
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
.end method

.method public anchorOn(Landroid/view/View;)V
    .locals 6

    .line 1
    const-string v0, "targetView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [I

    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->getCenterPointOnScreen(Landroid/view/View;[I)[I

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    aget v1, p1, v0

    .line 17
    .line 18
    iget-object v2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 19
    .line 20
    aget v0, v2, v0

    .line 21
    .line 22
    sub-int/2addr v1, v0

    .line 23
    const/4 v0, 0x1

    .line 24
    aget p1, p1, v0

    .line 25
    .line 26
    aget v0, v2, v0

    .line 27
    .line 28
    sub-int/2addr p1, v0

    .line 29
    invoke-direct {p0, v1, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setAnchorAround(II)Landroid/graphics/Point;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 34
    .line 35
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x4

    .line 39
    const/4 v5, 0x0

    .line 40
    move-object v0, p0

    .line 41
    invoke-static/range {v0 .. v5}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method public final animateToCoordinate(IILandroid/graphics/Rect;)V
    .locals 3

    .line 1
    const-string v0, "screenBounds"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p3, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    iget v1, p3, Landroid/graphics/Rect;->right:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 26
    .line 27
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    int-to-float p1, p1

    .line 31
    invoke-direct {p0, v0, v1, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateTo(Landroidx/dynamicanimation/animation/SpringAnimation;FF)V

    .line 32
    .line 33
    .line 34
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->screenOffset:[I

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    aget v0, v0, v1

    .line 40
    .line 41
    sub-int/2addr p1, v0

    .line 42
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sub-int/2addr p3, v0

    .line 49
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 58
    .line 59
    iget-object p3, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 60
    .line 61
    iget p3, p3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 62
    .line 63
    int-to-float p3, p3

    .line 64
    int-to-float p1, p1

    .line 65
    invoke-direct {p0, p2, p3, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateTo(Landroidx/dynamicanimation/animation/SpringAnimation;FF)V

    .line 66
    .line 67
    .line 68
    return-void
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
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v0, v3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->deltaX:I

    .line 28
    .line 29
    iget-object v3, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 30
    .line 31
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 32
    .line 33
    add-int/2addr v0, v3

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    float-to-int v3, v3

    .line 39
    sub-int/2addr v0, v3

    .line 40
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v3, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->moveThresholdPx:I

    .line 45
    .line 46
    if-le v0, v3, :cond_1

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_1
    if-eqz v1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setMoving(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    float-to-int v1, v1

    .line 62
    iget v2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->deltaX:I

    .line 63
    .line 64
    sub-int/2addr v1, v2

    .line 65
    iput v1, v0, Landroid/graphics/Point;->x:I

    .line 66
    .line 67
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    float-to-int v1, v1

    .line 74
    iget v2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->deltaY:I

    .line 75
    .line 76
    sub-int/2addr v1, v2

    .line 77
    iput v1, v0, Landroid/graphics/Point;->y:I

    .line 78
    .line 79
    invoke-static {p0}, Landroidx/core/view/w0;->T(Landroid/view/View;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->anchorPosition:Landroid/graphics/Point;

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 92
    .line 93
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 94
    .line 95
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 96
    .line 97
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 98
    .line 99
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->setMoving(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    float-to-int v0, v0

    .line 120
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 121
    .line 122
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 123
    .line 124
    sub-int/2addr v0, v1

    .line 125
    iput v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->deltaX:I

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    float-to-int v0, v0

    .line 132
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 133
    .line 134
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 135
    .line 136
    sub-int/2addr v0, v1

    .line 137
    iput v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->deltaY:I

    .line 138
    .line 139
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    .line 140
    .line 141
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    return p1
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

.method protected final getAllowedAreaBounds(Landroid/content/Context;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->getScreenSize(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->insetMargins:Landroid/graphics/Rect;

    .line 15
    .line 16
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    iget v0, p1, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 24
    .line 25
    sub-int/2addr v0, v2

    .line 26
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    add-int/2addr v0, v2

    .line 33
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    sub-int/2addr v0, v1

    .line 40
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 41
    .line 42
    return-object p1
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
.end method

.method public final getCenterX()I
    .locals 2

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method public final getCenterY()I
    .locals 2

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method public getInitialLayoutParams()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final getInsetMargins()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->insetMargins:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final getOnMovingStateChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->onMovingStateChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method protected final getSpringAnimationX()Landroidx/dynamicanimation/animation/SpringAnimation;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationX:Landroidx/dynamicanimation/animation/SpringAnimation;

    return-object v0
.end method

.method protected final getSpringAnimationY()Landroidx/dynamicanimation/animation/SpringAnimation;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->springAnimationY:Landroidx/dynamicanimation/animation/SpringAnimation;

    return-object v0
.end method

.method public final getTouchDispatchSideEffectHandler$mobile_voice_overlay_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method protected final getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public getX()F
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v0, v0

    return v0
.end method

.method public getY()F
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    int-to-float v0, v0

    return v0
.end method

.method public isMoving()Z
    .locals 3

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final moveToAnchorPoint()Landroid/graphics/Point;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->anchorPosition:Landroid/graphics/Point;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->actualPosition:Landroid/graphics/Point;

    .line 6
    .line 7
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 8
    .line 9
    iput v2, v1, Landroid/graphics/Point;->x:I

    .line 10
    .line 11
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 12
    .line 13
    iput v2, v1, Landroid/graphics/Point;->y:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return-object v0
    .line 18
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
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Landroidx/core/view/w0;->U(Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->access$computeScreenOffset(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$onConfigurationChanged$$inlined$doOnLayout$1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap$onConfigurationChanged$$inlined$doOnLayout$1;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
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
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    return p1
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
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->computeScreenOffset()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
.end method

.method public final setBubbleTouchable(Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->INSTANCE:Lcom/discord/mobile_voice_overlay/utils/WindowUtils;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/discord/mobile_voice_overlay/utils/WindowUtils;->setFlagTouchable(Landroid/view/WindowManager$LayoutParams;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public setMoving(Z)V
    .locals 3

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->isMoving$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnMovingStateChanged(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->onMovingStateChanged:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->touchDispatchSideEffectHandler:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method protected final setWindowLayoutParams(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public setX(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public setY(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->updateViewLayout()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method protected final updateViewLayout()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayView;->isManagedByWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "window"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast v0, Landroid/view/WindowManager;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->windowLayoutParams:Landroid/view/WindowManager$LayoutParams;

    .line 31
    .line 32
    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
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
.end method
