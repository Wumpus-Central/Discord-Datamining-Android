.class public Lcom/otaliastudios/zoom/ZoomLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Lcom/otaliastudios/zoom/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/zoom/ZoomLayout$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0013\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001}B/\u0008\u0002\u0012\u0006\u0010v\u001a\u00020u\u0012\u0008\u0010x\u001a\u0004\u0018\u00010w\u0012\u0008\u0008\u0001\u0010y\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010]\u001a\u00020\\\u00a2\u0006\u0004\u0008z\u0010{B\'\u0008\u0017\u0012\u0006\u0010v\u001a\u00020u\u0012\n\u0008\u0002\u0010x\u001a\u0004\u0018\u00010w\u0012\u0008\u0008\u0003\u0010y\u001a\u00020\u0006\u00a2\u0006\u0004\u0008z\u0010|J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\t\u0010\u0008\u001a\u00020\u0006H\u0096\u0001J\t\u0010\n\u001a\u00020\tH\u0096\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u0096\u0001J\t\u0010\r\u001a\u00020\u000bH\u0096\u0001J)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J$\u0010\u0013\u001a\u00020\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\u0019\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\u0011\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH\u0096\u0001J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001J\u0011\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010*\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0096\u0001J\u0011\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\tH\u0096\u0001J\u0011\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\tH\u0096\u0001J\u0011\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020\tH\u0096\u0001J\u0011\u00104\u001a\u00020\u00042\u0006\u0010,\u001a\u000203H\u0096\u0001J\u0011\u00105\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u00106\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0006H\u0096\u0001J\u0019\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0096\u0001J\u0011\u0010:\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010;\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0011\u0010<\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH\u0096\u0001J\u0019\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\t\u0010?\u001a\u00020\u0004H\u0096\u0001J\t\u0010@\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0096\u0001J\u0008\u0010B\u001a\u00020\u0004H\u0016J\u0008\u0010C\u001a\u00020\u0004H\u0014J\u0008\u0010D\u001a\u00020\u0004H\u0014J\u0018\u0010G\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0006H\u0014J \u0010M\u001a\u00020\u00042\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0016J\u0010\u0010Q\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0017J\u0008\u0010R\u001a\u00020\u0006H\u0014J\u0008\u0010S\u001a\u00020\u0006H\u0014J\u0008\u0010T\u001a\u00020\u0006H\u0014J\u0008\u0010U\u001a\u00020\u0006H\u0014J \u0010Y\u001a\u00020\t2\u0006\u0010W\u001a\u00020V2\u0006\u0010I\u001a\u00020H2\u0006\u0010X\u001a\u00020\u001fH\u0014J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\tR\u0017\u0010]\u001a\u00020\\8\u0006\u00a2\u0006\u000c\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`R\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010aR\u0014\u0010d\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010cR\u0014\u0010f\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010cR\u0014\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008g\u0010cR\u0014\u0010i\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010cR\u0014\u0010k\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008j\u0010cR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010cR\u0014\u0010p\u001a\u00020m8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008n\u0010oR\u0014\u0010t\u001a\u00020q8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008r\u0010s\u00a8\u0006~"
    }
    d2 = {
        "Lcom/otaliastudios/zoom/ZoomLayout;",
        "Landroid/widget/FrameLayout;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Lcom/otaliastudios/zoom/c;",
        "",
        "onUpdate",
        "",
        "getMaxZoomType",
        "getMinZoomType",
        "",
        "cancelAnimations",
        "",
        "getMaxZoom",
        "getMinZoom",
        "zoom",
        "x",
        "y",
        "animate",
        "moveTo",
        "moveToCenter",
        "(Ljava/lang/Float;Z)V",
        "dx",
        "dy",
        "panBy",
        "panTo",
        "realZoom",
        "realZoomTo",
        "alignment",
        "setAlignment",
        "allow",
        "setAllowFlingInOverscroll",
        "",
        "duration",
        "setAnimationDuration",
        "enabled",
        "setFlingEnabled",
        "setHorizontalPanEnabled",
        "maxZoom",
        "setMaxZoom",
        "type",
        "minZoom",
        "setMinZoom",
        "setOneFingerScrollEnabled",
        "Lcom/otaliastudios/zoom/OverPanRangeProvider;",
        "provider",
        "setOverPanRange",
        "overPinchable",
        "setOverPinchable",
        "overScroll",
        "setOverScrollHorizontal",
        "setOverScrollVertical",
        "Lcom/otaliastudios/zoom/OverZoomRangeProvider;",
        "setOverZoomRange",
        "setScrollEnabled",
        "setThreeFingersScrollEnabled",
        "transformation",
        "setTransformation",
        "gravity",
        "setTwoFingersScrollEnabled",
        "setVerticalPanEnabled",
        "setZoomEnabled",
        "zoomFactor",
        "zoomBy",
        "zoomIn",
        "zoomOut",
        "zoomTo",
        "onGlobalLayout",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "Landroid/view/View;",
        "child",
        "index",
        "Landroid/view/ViewGroup$LayoutParams;",
        "params",
        "addView",
        "Landroid/view/MotionEvent;",
        "ev",
        "onInterceptTouchEvent",
        "onTouchEvent",
        "computeHorizontalScrollOffset",
        "computeHorizontalScrollRange",
        "computeVerticalScrollOffset",
        "computeVerticalScrollRange",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawingTime",
        "drawChild",
        "hasClickableChildren",
        "setHasClickableChildren",
        "Lcom/otaliastudios/zoom/ZoomEngine;",
        "engine",
        "Lcom/otaliastudios/zoom/ZoomEngine;",
        "getEngine",
        "()Lcom/otaliastudios/zoom/ZoomEngine;",
        "Z",
        "getPanX",
        "()F",
        "panX",
        "getPanY",
        "panY",
        "getRealZoom",
        "getScaledPanX",
        "scaledPanX",
        "getScaledPanY",
        "scaledPanY",
        "getZoom",
        "Lcom/otaliastudios/zoom/AbsolutePoint;",
        "getPan",
        "()Lcom/otaliastudios/zoom/AbsolutePoint;",
        "pan",
        "Lcom/otaliastudios/zoom/ScaledPoint;",
        "getScaledPan",
        "()Lcom/otaliastudios/zoom/ScaledPoint;",
        "scaledPan",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Companion",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lcom/otaliastudios/zoom/ZoomLayout$Companion;

.field private static final LOG:Lcom/otaliastudios/zoom/ZoomLogger;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final engine:Lcom/otaliastudios/zoom/ZoomEngine;

.field private hasClickableChildren:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/otaliastudios/zoom/ZoomLayout$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/otaliastudios/zoom/ZoomLayout;->Companion:Lcom/otaliastudios/zoom/ZoomLayout$Companion;

    .line 8
    .line 9
    const-class v0, Lcom/otaliastudios/zoom/ZoomLayout;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/otaliastudios/zoom/ZoomLayout;->TAG:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, Lcom/otaliastudios/zoom/ZoomLogger;->b:Lcom/otaliastudios/zoom/ZoomLogger$a;

    .line 18
    .line 19
    const-string v2, "TAG"

    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/otaliastudios/zoom/ZoomLogger$a;->a(Ljava/lang/String;)Lcom/otaliastudios/zoom/ZoomLogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/otaliastudios/zoom/ZoomLayout;->LOG:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 29
    .line 30
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/otaliastudios/zoom/ZoomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/otaliastudios/zoom/ZoomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v0, Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-direct {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/otaliastudios/zoom/ZoomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 49
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    .line 3
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object v1, v0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lcom/otaliastudios/zoom/b;->a:[I

    const/4 v4, 0x0

    move-object/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v2, v5, v3, v6, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    const-string v3, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, defStyleAttr, 0)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget v3, Lcom/otaliastudios/zoom/b;->n:I

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 7
    sget v6, Lcom/otaliastudios/zoom/b;->o:I

    invoke-virtual {v2, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    .line 8
    sget v7, Lcom/otaliastudios/zoom/b;->g:I

    invoke-virtual {v2, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    .line 9
    sget v8, Lcom/otaliastudios/zoom/b;->u:I

    invoke-virtual {v2, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    .line 10
    sget v9, Lcom/otaliastudios/zoom/b;->m:I

    invoke-virtual {v2, v9, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    .line 11
    sget v10, Lcom/otaliastudios/zoom/b;->v:I

    invoke-virtual {v2, v10, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 12
    sget v11, Lcom/otaliastudios/zoom/b;->e:I

    invoke-virtual {v2, v11, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v11

    .line 13
    sget v12, Lcom/otaliastudios/zoom/b;->p:I

    invoke-virtual {v2, v12, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    .line 14
    sget v13, Lcom/otaliastudios/zoom/b;->l:I

    invoke-virtual {v2, v13, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v13

    .line 15
    sget v14, Lcom/otaliastudios/zoom/b;->t:I

    invoke-virtual {v2, v14, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    .line 16
    sget v15, Lcom/otaliastudios/zoom/b;->q:I

    invoke-virtual {v2, v15, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 17
    sget v4, Lcom/otaliastudios/zoom/b;->c:I

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 18
    sget v5, Lcom/otaliastudios/zoom/b;->f:I

    move/from16 p2, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 19
    sget v4, Lcom/otaliastudios/zoom/b;->j:I

    move/from16 p3, v5

    const v5, 0x3f4ccccd    # 0.8f

    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 20
    sget v5, Lcom/otaliastudios/zoom/b;->h:I

    move/from16 v16, v4

    const/high16 v4, 0x40200000    # 2.5f

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4

    .line 21
    sget v5, Lcom/otaliastudios/zoom/b;->k:I

    move/from16 v17, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    move/from16 v18, v5

    .line 22
    sget v5, Lcom/otaliastudios/zoom/b;->i:I

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    move/from16 v19, v5

    .line 23
    sget v5, Lcom/otaliastudios/zoom/b;->r:I

    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    move/from16 v20, v15

    .line 24
    sget v15, Lcom/otaliastudios/zoom/b;->s:I

    invoke-virtual {v2, v15, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    .line 25
    sget v4, Lcom/otaliastudios/zoom/b;->b:I

    move/from16 v21, v14

    const/16 v14, 0x33

    invoke-virtual {v2, v4, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 26
    sget v14, Lcom/otaliastudios/zoom/b;->d:I

    move/from16 v22, v13

    const/16 v13, 0x118

    invoke-virtual {v2, v14, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v13

    int-to-long v13, v13

    .line 27
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    invoke-virtual {v1, v0}, Lcom/otaliastudios/zoom/ZoomEngine;->W(Landroid/view/View;)V

    .line 29
    new-instance v2, Lcom/otaliastudios/zoom/ZoomLayout$a;

    invoke-direct {v2, v0}, Lcom/otaliastudios/zoom/ZoomLayout$a;-><init>(Lcom/otaliastudios/zoom/ZoomLayout;)V

    invoke-virtual {v1, v2}, Lcom/otaliastudios/zoom/ZoomEngine;->l(Lcom/otaliastudios/zoom/ZoomEngine$c;)V

    .line 30
    invoke-virtual {v0, v5, v15}, Lcom/otaliastudios/zoom/ZoomLayout;->setTransformation(II)V

    .line 31
    invoke-virtual {v0, v4}, Lcom/otaliastudios/zoom/ZoomLayout;->setAlignment(I)V

    .line 32
    invoke-virtual {v0, v3}, Lcom/otaliastudios/zoom/ZoomLayout;->setOverScrollHorizontal(Z)V

    .line 33
    invoke-virtual {v0, v6}, Lcom/otaliastudios/zoom/ZoomLayout;->setOverScrollVertical(Z)V

    .line 34
    invoke-virtual {v0, v7}, Lcom/otaliastudios/zoom/ZoomLayout;->setHorizontalPanEnabled(Z)V

    .line 35
    invoke-virtual {v0, v8}, Lcom/otaliastudios/zoom/ZoomLayout;->setVerticalPanEnabled(Z)V

    .line 36
    invoke-virtual {v0, v9}, Lcom/otaliastudios/zoom/ZoomLayout;->setOverPinchable(Z)V

    .line 37
    invoke-virtual {v0, v10}, Lcom/otaliastudios/zoom/ZoomLayout;->setZoomEnabled(Z)V

    .line 38
    invoke-virtual {v0, v11}, Lcom/otaliastudios/zoom/ZoomLayout;->setFlingEnabled(Z)V

    .line 39
    invoke-virtual {v0, v12}, Lcom/otaliastudios/zoom/ZoomLayout;->setScrollEnabled(Z)V

    move/from16 v1, v22

    .line 40
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout;->setOneFingerScrollEnabled(Z)V

    move/from16 v1, v21

    .line 41
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout;->setTwoFingersScrollEnabled(Z)V

    move/from16 v1, v20

    .line 42
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout;->setThreeFingersScrollEnabled(Z)V

    move/from16 v1, p2

    .line 43
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout;->setAllowFlingInOverscroll(Z)V

    .line 44
    invoke-virtual {v0, v13, v14}, Lcom/otaliastudios/zoom/ZoomLayout;->setAnimationDuration(J)V

    move/from16 v1, v16

    move/from16 v2, v18

    .line 45
    invoke-virtual {v0, v1, v2}, Lcom/otaliastudios/zoom/ZoomLayout;->setMinZoom(FI)V

    move/from16 v1, v17

    move/from16 v2, v19

    .line 46
    invoke-virtual {v0, v1, v2}, Lcom/otaliastudios/zoom/ZoomLayout;->setMaxZoom(FI)V

    move/from16 v1, p3

    .line 47
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLayout;->setHasClickableChildren(Z)V

    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 1
    new-instance p4, Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-direct {p4, p1}, Lcom/otaliastudios/zoom/ZoomEngine;-><init>(Landroid/content/Context;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/otaliastudios/zoom/ZoomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/otaliastudios/zoom/ZoomEngine;)V

    return-void
.end method

.method public static final synthetic access$onUpdate(Lcom/otaliastudios/zoom/ZoomLayout;)V
    .locals 0

    invoke-direct {p0}, Lcom/otaliastudios/zoom/ZoomLayout;->onUpdate()V

    return-void
.end method

.method private final onUpdate()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotY(F)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/otaliastudios/zoom/ZoomEngine;->I()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/otaliastudios/zoom/ZoomEngine;->J()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-void
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
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    sget-object p2, Lcom/otaliastudios/zoom/ZoomLayout;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    const-string p3, " accepts only a single child."

    .line 26
    .line 27
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public cancelAnimations()Z
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->m()Z

    move-result v0

    return v0
.end method

.method protected computeHorizontalScrollOffset()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->n()I

    move-result v0

    return v0
.end method

.method protected computeHorizontalScrollRange()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->o()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollOffset()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->s()I

    move-result v0

    return v0
.end method

.method protected computeVerticalScrollRange()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->t()I

    move-result v0

    return v0
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "child"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/otaliastudios/zoom/ZoomEngine;->y()Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 26
    .line 27
    .line 28
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    :goto_0
    return p2
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
.end method

.method public final getEngine()Lcom/otaliastudios/zoom/ZoomEngine;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    return-object v0
.end method

.method public getMaxZoom()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->z()F

    move-result v0

    return v0
.end method

.method public getMaxZoomType()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->A()I

    move-result v0

    return v0
.end method

.method public getMinZoom()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->B()F

    move-result v0

    return v0
.end method

.method public getMinZoomType()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->C()I

    move-result v0

    return v0
.end method

.method public getPan()Lcom/otaliastudios/zoom/AbsolutePoint;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->D()Lcom/otaliastudios/zoom/AbsolutePoint;

    move-result-object v0

    return-object v0
.end method

.method public getPanX()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->E()F

    move-result v0

    return v0
.end method

.method public getPanY()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->F()F

    move-result v0

    return v0
.end method

.method public getRealZoom()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    move-result v0

    return v0
.end method

.method public getScaledPan()Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->H()Lcom/otaliastudios/zoom/ScaledPoint;

    move-result-object v0

    return-object v0
.end method

.method public getScaledPanX()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->I()F

    move-result v0

    return v0
.end method

.method public getScaledPanY()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->J()F

    move-result v0

    return v0
.end method

.method public getZoom()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->K()F

    move-result v0

    return v0
.end method

.method public moveTo(FFFZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/otaliastudios/zoom/ZoomEngine;->M(FFFZ)V

    return-void
.end method

.method public moveToCenter(Ljava/lang/Float;Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->N(Ljava/lang/Float;Z)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

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
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

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
.end method

.method public onGlobalLayout()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-float v2, v2

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v3, v0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x4

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Lcom/otaliastudios/zoom/ZoomEngine;->a0(Lcom/otaliastudios/zoom/ZoomEngine;FFZILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
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
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->O(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 28
    :goto_1
    return p1
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
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1, p1}, Landroid/view/ViewGroup;->measureChildren(II)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    sget-object p2, Lcom/otaliastudios/zoom/ZoomLayout;->TAG:Ljava/lang/String;

    .line 36
    .line 37
    const-string v0, " must be used with fixed dimensions (e.g. match_parent)"

    .line 38
    .line 39
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->P(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 28
    :goto_1
    return p1
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
.end method

.method public panBy(FFZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine;->Q(FFZ)V

    return-void
.end method

.method public panTo(FFZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine;->R(FFZ)V

    return-void
.end method

.method public realZoomTo(FZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->S(FZ)V

    return-void
.end method

.method public setAlignment(I)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->T(I)V

    return-void
.end method

.method public setAllowFlingInOverscroll(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->U(Z)V

    return-void
.end method

.method public setAnimationDuration(J)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->V(J)V

    return-void
.end method

.method public setFlingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->b0(Z)V

    return-void
.end method

.method public final setHasClickableChildren(Z)V
    .locals 5

    .line 1
    sget-object v0, Lcom/otaliastudios/zoom/ZoomLayout;->LOG:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "setHasClickableChildren:"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const-string v4, "old:"

    .line 13
    .line 14
    aput-object v4, v1, v2

    .line 15
    .line 16
    iget-boolean v2, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x2

    .line 23
    aput-object v2, v1, v4

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    const-string v4, "new:"

    .line 27
    .line 28
    aput-object v4, v1, v2

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    aput-object v4, v1, v2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/otaliastudios/zoom/ZoomLogger;->b([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-lez v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/high16 v1, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 69
    .line 70
    .line 71
    :cond_0
    iput-boolean p1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-lez p1, :cond_2

    .line 84
    .line 85
    iget-boolean p1, p0, Lcom/otaliastudios/zoom/ZoomLayout;->hasClickableChildren:Z

    .line 86
    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    invoke-direct {p0}, Lcom/otaliastudios/zoom/ZoomLayout;->onUpdate()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_0
    return-void
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
.end method

.method public setHorizontalPanEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->c0(Z)V

    return-void
.end method

.method public setMaxZoom(F)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->d0(F)V

    return-void
.end method

.method public setMaxZoom(FI)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->setMaxZoom(FI)V

    return-void
.end method

.method public setMinZoom(F)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->e0(F)V

    return-void
.end method

.method public setMinZoom(FI)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->setMinZoom(FI)V

    return-void
.end method

.method public setOneFingerScrollEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->f0(Z)V

    return-void
.end method

.method public setOverPanRange(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->g0(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V

    return-void
.end method

.method public setOverPinchable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->h0(Z)V

    return-void
.end method

.method public setOverScrollHorizontal(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->i0(Z)V

    return-void
.end method

.method public setOverScrollVertical(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->j0(Z)V

    return-void
.end method

.method public setOverZoomRange(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->k0(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V

    return-void
.end method

.method public setScrollEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->l0(Z)V

    return-void
.end method

.method public setThreeFingersScrollEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->m0(Z)V

    return-void
.end method

.method public setTransformation(I)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->n0(I)V

    return-void
.end method

.method public setTransformation(II)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->setTransformation(II)V

    return-void
.end method

.method public setTwoFingersScrollEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->o0(Z)V

    return-void
.end method

.method public setVerticalPanEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->p0(Z)V

    return-void
.end method

.method public setZoomEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1}, Lcom/otaliastudios/zoom/ZoomEngine;->q0(Z)V

    return-void
.end method

.method public zoomBy(FZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->r0(FZ)V

    return-void
.end method

.method public zoomIn()V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->s0()V

    return-void
.end method

.method public zoomOut()V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0}, Lcom/otaliastudios/zoom/ZoomEngine;->t0()V

    return-void
.end method

.method public zoomTo(FZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomLayout;->engine:Lcom/otaliastudios/zoom/ZoomEngine;

    invoke-virtual {v0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->u0(FZ)V

    return-void
.end method
