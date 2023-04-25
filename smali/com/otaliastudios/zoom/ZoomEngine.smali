.class public Lcom/otaliastudios/zoom/ZoomEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/otaliastudios/zoom/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/otaliastudios/zoom/ZoomEngine$a;,
        Lcom/otaliastudios/zoom/ZoomEngine$c;,
        Lcom/otaliastudios/zoom/ZoomEngine$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 \u0097\u00012\u00020\u0001:\u0006\u00a0\u0001\u00a1\u0001\u00a2\u0001B\u0013\u0012\u0008\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u000e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\"\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0008\u0008\u0002\u0010-\u001a\u00020\rH\u0007J\"\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0008\u0008\u0002\u0010-\u001a\u00020\rH\u0007J\u000e\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200J\u000e\u00103\u001a\u00020\r2\u0006\u00101\u001a\u000200J(\u00108\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J!\u00109\u001a\u00020\u000b2\u0008\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u00107\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00089\u0010:J \u0010;\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J \u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010?\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0008\u0010B\u001a\u00020\u000bH\u0016J\u0008\u0010C\u001a\u00020\u000bH\u0016J\u0018\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0008\u0010F\u001a\u00020\u0002H\u0016J\u0008\u0010G\u001a\u00020\u0006H\u0016J\u0018\u0010J\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\u0008\u0010K\u001a\u00020\u0002H\u0016J\u0008\u0010L\u001a\u00020\u0006H\u0016J\u0018\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\u0010\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020OH\u0016J\u0008\u0010R\u001a\u00020\rH\u0016J\u0006\u0010S\u001a\u00020\u0006J\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0006J\u0006\u0010V\u001a\u00020\u0006R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010XR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008R\u0010[R\u0018\u0010^\u001a\u00060\\R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010]R\u001a\u0010c\u001a\u00020_8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008T\u0010`\u0012\u0004\u0008a\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010eR\u001a\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010h\u0012\u0004\u0008i\u0010bR \u0010p\u001a\u00020k8\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010l\u0012\u0004\u0008o\u0010b\u001a\u0004\u0008m\u0010nR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u001a\u0010D\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u000c\u0012\u0004\u0008}\u0010b\u001a\u0004\u0008{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u007f\u0010\u0080\u0001R\u001d\u0010\u0084\u0001\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u000e\u0012\u0005\u0008\u0083\u0001\u0010b\u001a\u0005\u0008\u0082\u0001\u0010|R\u001d\u0010\u0087\u0001\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u000e\u0012\u0005\u0008\u0086\u0001\u0010b\u001a\u0005\u0008\u0085\u0001\u0010|R\u0017\u0010\u008a\u0001\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u008b\u0001\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010|R\u0016\u0010\u008d\u0001\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u008c\u0001\u0010|R\u001b\u0010\u0091\u0001\u001a\u00030\u008e\u00018F\u00a2\u0006\u000e\u0012\u0005\u0008\u0090\u0001\u0010b\u001a\u0005\u00086\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00028F\u00a2\u0006\r\u0012\u0005\u0008\u0092\u0001\u0010b\u001a\u0004\u00085\u0010|R\u001a\u0010\u0096\u0001\u001a\u00020\u00028F\u00a2\u0006\u000e\u0012\u0005\u0008\u0095\u0001\u0010b\u001a\u0005\u0008\u0094\u0001\u0010|R\u0013\u0010\u0098\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\u0008\u0097\u0001\u0010|R\u0012\u0010\u0099\u0001\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010|R\u001c\u00104\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u000e\u0012\u0005\u0008\u009b\u0001\u0010b\u001a\u0005\u0008\u009a\u0001\u0010|\u00a8\u0006\u00a3\u0001"
    }
    d2 = {
        "Lcom/otaliastudios/zoom/ZoomEngine;",
        "Lcom/otaliastudios/zoom/c;",
        "",
        "r",
        "Lcom/otaliastudios/zoom/ScaledPoint;",
        "q",
        "",
        "input",
        "p",
        "Lcom/otaliastudios/zoom/ZoomEngine$c;",
        "listener",
        "",
        "l",
        "",
        "overScroll",
        "i0",
        "j0",
        "Lcom/otaliastudios/zoom/OverPanRangeProvider;",
        "provider",
        "g0",
        "enabled",
        "c0",
        "p0",
        "overPinchable",
        "h0",
        "Lcom/otaliastudios/zoom/OverZoomRangeProvider;",
        "k0",
        "q0",
        "b0",
        "l0",
        "f0",
        "o0",
        "m0",
        "allow",
        "U",
        "transformation",
        "gravity",
        "setTransformation",
        "alignment",
        "T",
        "Landroid/view/View;",
        "container",
        "W",
        "width",
        "height",
        "applyTransformation",
        "Z",
        "X",
        "Landroid/view/MotionEvent;",
        "ev",
        "O",
        "P",
        "zoom",
        "x",
        "y",
        "animate",
        "M",
        "N",
        "(Ljava/lang/Float;Z)V",
        "R",
        "dx",
        "dy",
        "Q",
        "u0",
        "zoomFactor",
        "r0",
        "s0",
        "t0",
        "realZoom",
        "S",
        "z",
        "A",
        "maxZoom",
        "type",
        "setMaxZoom",
        "B",
        "C",
        "minZoom",
        "setMinZoom",
        "",
        "duration",
        "V",
        "m",
        "n",
        "o",
        "s",
        "t",
        "k",
        "I",
        "transformationType",
        "transformationGravity",
        "Landroid/view/View;",
        "Lcom/otaliastudios/zoom/ZoomEngine$a;",
        "Lcom/otaliastudios/zoom/ZoomEngine$a;",
        "callbacks",
        "Lte/b;",
        "Lte/b;",
        "getDispatcher$annotations",
        "()V",
        "dispatcher",
        "Lte/a;",
        "Lte/a;",
        "stateController",
        "Lwe/b;",
        "Lwe/b;",
        "getPanManager$annotations",
        "panManager",
        "Lwe/c;",
        "Lwe/c;",
        "L",
        "()Lwe/c;",
        "getZoomManager$library_release$annotations",
        "zoomManager",
        "Lve/b;",
        "Lve/b;",
        "matrixController",
        "Lue/b;",
        "Lue/b;",
        "scrollFlingDetector",
        "Lue/a;",
        "u",
        "Lue/a;",
        "pinchDetector",
        "G",
        "()F",
        "getRealZoom$annotations",
        "Lcom/otaliastudios/zoom/AbsolutePoint;",
        "D",
        "()Lcom/otaliastudios/zoom/AbsolutePoint;",
        "pan",
        "E",
        "getPanX$annotations",
        "panX",
        "F",
        "getPanY$annotations",
        "panY",
        "H",
        "()Lcom/otaliastudios/zoom/ScaledPoint;",
        "scaledPan",
        "scaledPanX",
        "J",
        "scaledPanY",
        "Landroid/graphics/Matrix;",
        "()Landroid/graphics/Matrix;",
        "getMatrix$annotations",
        "matrix",
        "getContentWidth$annotations",
        "contentWidth",
        "w",
        "getContentHeight$annotations",
        "contentHeight",
        "v",
        "containerWidth",
        "containerHeight",
        "K",
        "getZoom$annotations",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "a",
        "b",
        "c",
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
.field public static final v:Lcom/otaliastudios/zoom/ZoomEngine$b;

.field private static final w:Ljava/lang/String;

.field private static final x:Lcom/otaliastudios/zoom/ZoomLogger;


# instance fields
.field private k:I

.field private l:I

.field private m:Landroid/view/View;

.field private final n:Lcom/otaliastudios/zoom/ZoomEngine$a;

.field private final o:Lte/b;

.field private final p:Lte/a;

.field private final q:Lwe/b;

.field private final r:Lwe/c;

.field private final s:Lve/b;

.field private final t:Lue/b;

.field private final u:Lue/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/otaliastudios/zoom/ZoomEngine$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/otaliastudios/zoom/ZoomEngine$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/otaliastudios/zoom/ZoomEngine;->v:Lcom/otaliastudios/zoom/ZoomEngine$b;

    .line 8
    .line 9
    const-class v0, Lcom/otaliastudios/zoom/ZoomEngine;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/otaliastudios/zoom/ZoomEngine;->w:Ljava/lang/String;

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
    sput-object v0, Lcom/otaliastudios/zoom/ZoomEngine;->x:Lcom/otaliastudios/zoom/ZoomLogger;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

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
    new-instance v0, Lcom/otaliastudios/zoom/ZoomEngine$a;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/otaliastudios/zoom/ZoomEngine$a;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->n:Lcom/otaliastudios/zoom/ZoomEngine$a;

    .line 15
    .line 16
    new-instance v1, Lte/b;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lte/b;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->o:Lte/b;

    .line 22
    .line 23
    new-instance v6, Lte/a;

    .line 24
    .line 25
    invoke-direct {v6, v0}, Lte/a;-><init>(Lte/a$a;)V

    .line 26
    .line 27
    .line 28
    iput-object v6, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 29
    .line 30
    new-instance v5, Lwe/b;

    .line 31
    .line 32
    new-instance v1, Lcom/otaliastudios/zoom/ZoomEngine$f;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/otaliastudios/zoom/ZoomEngine$f;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v5, p0, v1}, Lwe/b;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    .line 40
    iput-object v5, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 41
    .line 42
    new-instance v4, Lwe/c;

    .line 43
    .line 44
    new-instance v1, Lcom/otaliastudios/zoom/ZoomEngine$i;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lcom/otaliastudios/zoom/ZoomEngine$i;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v4, p0, v1}, Lwe/c;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    iput-object v4, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 53
    .line 54
    new-instance v7, Lve/b;

    .line 55
    .line 56
    invoke-direct {v7, v4, v5, v6, v0}, Lve/b;-><init>(Lwe/c;Lwe/b;Lte/a;Lve/b$a;)V

    .line 57
    .line 58
    .line 59
    iput-object v7, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 60
    .line 61
    new-instance v0, Lue/b;

    .line 62
    .line 63
    invoke-direct {v0, p1, v5, v6, v7}, Lue/b;-><init>(Landroid/content/Context;Lwe/b;Lte/a;Lve/b;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    .line 67
    .line 68
    new-instance v0, Lue/a;

    .line 69
    .line 70
    move-object v2, v0

    .line 71
    move-object v3, p1

    .line 72
    invoke-direct/range {v2 .. v7}, Lue/a;-><init>(Landroid/content/Context;Lwe/c;Lwe/b;Lte/a;Lve/b;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->u:Lue/a;

    .line 76
    .line 77
    return-void
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
.end method

.method public static synthetic Y(Lcom/otaliastudios/zoom/ZoomEngine;FFZILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine;->X(FFZ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setContainerSize"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic a(Lcom/otaliastudios/zoom/ZoomEngine;)Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 0

    invoke-direct {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->q()Lcom/otaliastudios/zoom/ScaledPoint;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/otaliastudios/zoom/ZoomEngine;FFZILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine;->Z(FFZ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setContentSize"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic b(Lcom/otaliastudios/zoom/ZoomEngine;)F
    .locals 0

    invoke-direct {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->r()F

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lcom/otaliastudios/zoom/ZoomEngine;)Lcom/otaliastudios/zoom/ZoomEngine$a;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->n:Lcom/otaliastudios/zoom/ZoomEngine$a;

    return-object p0
.end method

.method public static final synthetic d(Lcom/otaliastudios/zoom/ZoomEngine;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->m:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic e(Lcom/otaliastudios/zoom/ZoomEngine;)Lte/b;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->o:Lte/b;

    return-object p0
.end method

.method public static final synthetic f()Lcom/otaliastudios/zoom/ZoomLogger;
    .locals 1

    sget-object v0, Lcom/otaliastudios/zoom/ZoomEngine;->x:Lcom/otaliastudios/zoom/ZoomLogger;

    return-object v0
.end method

.method public static final synthetic g(Lcom/otaliastudios/zoom/ZoomEngine;)Lve/b;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    return-object p0
.end method

.method public static final synthetic h(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/a;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->u:Lue/a;

    return-object p0
.end method

.method public static final synthetic i(Lcom/otaliastudios/zoom/ZoomEngine;)Lue/b;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    return-object p0
.end method

.method public static final synthetic j(Lcom/otaliastudios/zoom/ZoomEngine;)Lte/a;
    .locals 0

    iget-object p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    return-object p0
.end method

.method public static final synthetic k(Lcom/otaliastudios/zoom/ZoomEngine;)I
    .locals 0

    iget p0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->k:I

    return p0
.end method

.method private final p(I)I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RtlHardcoded"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/otaliastudios/zoom/a;->a:Lcom/otaliastudios/zoom/a;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lwe/b;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/otaliastudios/zoom/a;->d(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 17
    .line 18
    invoke-virtual {v1}, Lwe/b;->e()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x10

    .line 23
    .line 24
    invoke-virtual {p1, v1, v2}, Lcom/otaliastudios/zoom/a;->e(II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    or-int/2addr p1, v0

    .line 29
    :cond_0
    return p1
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
.end method

.method private final q()Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->x()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->v()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-float/2addr v0, v1

    .line 15
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->w()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    mul-float/2addr v1, v2

    .line 24
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->u()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-float/2addr v1, v2

    .line 29
    iget v2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->l:I

    .line 30
    .line 31
    invoke-direct {p0, v2}, Lcom/otaliastudios/zoom/ZoomEngine;->p(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-object v3, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-virtual {v3, v2, v0, v4}, Lwe/b;->b(IFZ)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    neg-float v0, v0

    .line 43
    iget-object v3, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {v3, v2, v1, v4}, Lwe/b;->b(IFZ)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    neg-float v1, v1

    .line 51
    new-instance v2, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 52
    .line 53
    invoke-direct {v2, v0, v1}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 54
    .line 55
    .line 56
    return-object v2
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
.end method

.method private final r()F
    .locals 13

    .line 1
    iget v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->k:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const-string v2, "scaleY:"

    .line 5
    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const-string v5, "scaleX:"

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const-string v7, "computeTransformationZoom"

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x6

    .line 15
    const/4 v10, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-eq v0, v10, :cond_0

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->v()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->x()F

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    div-float/2addr v0, v11

    .line 32
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->u()F

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->w()F

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    div-float/2addr v11, v12

    .line 41
    sget-object v12, Lcom/otaliastudios/zoom/ZoomEngine;->x:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 42
    .line 43
    new-array v9, v9, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object v7, v9, v8

    .line 46
    .line 47
    const-string v7, "centerCrop"

    .line 48
    .line 49
    aput-object v7, v9, v10

    .line 50
    .line 51
    aput-object v5, v9, v6

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    aput-object v5, v9, v4

    .line 58
    .line 59
    aput-object v2, v9, v3

    .line 60
    .line 61
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    aput-object v2, v9, v1

    .line 66
    .line 67
    invoke-virtual {v12, v9}, Lcom/otaliastudios/zoom/ZoomLogger;->f([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v11}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    return v0

    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->v()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->x()F

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    div-float/2addr v0, v11

    .line 84
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->u()F

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->w()F

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    div-float/2addr v11, v12

    .line 93
    sget-object v12, Lcom/otaliastudios/zoom/ZoomEngine;->x:Lcom/otaliastudios/zoom/ZoomLogger;

    .line 94
    .line 95
    new-array v9, v9, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v7, v9, v8

    .line 98
    .line 99
    const-string v7, "centerInside"

    .line 100
    .line 101
    aput-object v7, v9, v10

    .line 102
    .line 103
    aput-object v5, v9, v6

    .line 104
    .line 105
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    aput-object v5, v9, v4

    .line 110
    .line 111
    aput-object v2, v9, v3

    .line 112
    .line 113
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    aput-object v2, v9, v1

    .line 118
    .line 119
    invoke-virtual {v12, v9}, Lcom/otaliastudios/zoom/ZoomLogger;->f([Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v11}, Ljava/lang/Math;->min(FF)F

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    return v0
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
.end method


# virtual methods
.method public A()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0}, Lwe/c;->g()I

    move-result v0

    return v0
.end method

.method public B()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0}, Lwe/c;->h()F

    move-result v0

    return v0
.end method

.method public C()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0}, Lwe/c;->j()I

    move-result v0

    return v0
.end method

.method public D()Lcom/otaliastudios/zoom/AbsolutePoint;
    .locals 4

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->s()Lcom/otaliastudios/zoom/AbsolutePoint;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, Lcom/otaliastudios/zoom/AbsolutePoint;->b(Lcom/otaliastudios/zoom/AbsolutePoint;FFILjava/lang/Object;)Lcom/otaliastudios/zoom/AbsolutePoint;

    move-result-object v0

    return-object v0
.end method

.method public E()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->t()F

    move-result v0

    return v0
.end method

.method public F()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->u()F

    move-result v0

    return v0
.end method

.method public G()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->y()F

    move-result v0

    return v0
.end method

.method public H()Lcom/otaliastudios/zoom/ScaledPoint;
    .locals 4

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->v()Lcom/otaliastudios/zoom/ScaledPoint;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, Lcom/otaliastudios/zoom/ScaledPoint;->b(Lcom/otaliastudios/zoom/ScaledPoint;FFILjava/lang/Object;)Lcom/otaliastudios/zoom/ScaledPoint;

    move-result-object v0

    return-object v0
.end method

.method public I()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->w()F

    move-result v0

    return v0
.end method

.method public J()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->x()F

    move-result v0

    return v0
.end method

.method public K()F
    .locals 2

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    move-result v1

    invoke-virtual {v0, v1}, Lwe/c;->n(F)F

    move-result v0

    return v0
.end method

.method public final L()Lwe/c;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    return-object v0
.end method

.method public M(FFFZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lwe/c;->u(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget-object v0, Lve/c;->l:Lve/c$b;

    .line 8
    .line 9
    new-instance v1, Lcom/otaliastudios/zoom/ZoomEngine$d;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine$d;-><init>(FFF)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lve/c$b;->a(Lkotlin/jvm/functions/Function1;)Lve/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p4, :cond_0

    .line 19
    .line 20
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lve/b;->f(Lve/c;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->m()Z

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lve/b;->h(Lve/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
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
.end method

.method public N(Ljava/lang/Float;Z)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lwe/c;->i()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Lwe/c;->n(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 20
    .line 21
    invoke-virtual {v1}, Lwe/c;->f()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1, v2}, Lwe/c;->n(F)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p1, v0, v1}, Lcg/h;->i(FFF)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    if-nez p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->K()F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lwe/c;->u(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->v()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    div-float/2addr v1, v0

    .line 59
    const/high16 v2, 0x40000000    # 2.0f

    .line 60
    .line 61
    div-float/2addr v1, v2

    .line 62
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->u()F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    div-float/2addr v3, v0

    .line 67
    div-float/2addr v3, v2

    .line 68
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->x()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    div-float/2addr v0, v2

    .line 73
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->w()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    div-float/2addr v4, v2

    .line 78
    sub-float/2addr v0, v1

    .line 79
    sub-float/2addr v4, v3

    .line 80
    neg-float v0, v0

    .line 81
    neg-float v1, v4

    .line 82
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->M(FFFZ)V

    .line 83
    .line 84
    .line 85
    return-void
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
.end method

.method public final O(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lte/a;->h(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public final P(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lte/a;->i(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public Q(FFZ)V
    .locals 2

    .line 1
    sget-object v0, Lve/c;->l:Lve/c$b;

    .line 2
    .line 3
    new-instance v1, Lcom/otaliastudios/zoom/ZoomEngine$e;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine$e;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lve/c$b;->a(Lkotlin/jvm/functions/Function1;)Lve/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lve/b;->f(Lve/c;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->m()Z

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lve/b;->h(Lve/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
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
.end method

.method public R(FFZ)V
    .locals 1

    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->E()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->F()F

    move-result v0

    sub-float/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/otaliastudios/zoom/ZoomEngine;->Q(FFZ)V

    return-void
.end method

.method public S(FZ)V
    .locals 2

    .line 1
    sget-object v0, Lve/c;->l:Lve/c$b;

    .line 2
    .line 3
    new-instance v1, Lcom/otaliastudios/zoom/ZoomEngine$g;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/otaliastudios/zoom/ZoomEngine$g;-><init>(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lve/c$b;->a(Lkotlin/jvm/functions/Function1;)Lve/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lve/b;->f(Lve/c;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->m()Z

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Lve/b;->h(Lve/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
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
.end method

.method public T(I)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->o(I)V

    return-void
.end method

.method public U(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->j(Z)V

    return-void
.end method

.method public V(J)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0, p1, p2}, Lve/b;->D(J)V

    return-void
.end method

.method public final W(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->m:Landroid/view/View;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->m:Landroid/view/View;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/otaliastudios/zoom/ZoomEngine$h;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/otaliastudios/zoom/ZoomEngine$h;-><init>(Lcom/otaliastudios/zoom/ZoomEngine;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "container already set"

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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
.end method

.method public final X(FFZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0, p1, p2, p3}, Lve/b;->E(FFZ)V

    return-void
.end method

.method public final Z(FFZ)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0, p1, p2, p3}, Lve/b;->F(FFZ)V

    return-void
.end method

.method public b0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->i(Z)V

    return-void
.end method

.method public c0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->q(Z)V

    return-void
.end method

.method public d0(F)V
    .locals 0

    invoke-static {p0, p1}, Lcom/otaliastudios/zoom/c$a;->a(Lcom/otaliastudios/zoom/c;F)V

    return-void
.end method

.method public e0(F)V
    .locals 0

    invoke-static {p0, p1}, Lcom/otaliastudios/zoom/c$a;->b(Lcom/otaliastudios/zoom/c;F)V

    return-void
.end method

.method public f0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->k(Z)V

    return-void
.end method

.method public g0(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lwe/b;->r(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V

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
.end method

.method public h0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0, p1}, Lwe/c;->r(Z)V

    return-void
.end method

.method public i0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->p(Z)V

    return-void
.end method

.method public j0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->s(Z)V

    return-void
.end method

.method public k0(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lwe/c;->s(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V

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
.end method

.method public final l(Lcom/otaliastudios/zoom/ZoomEngine$c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->m:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->o:Lte/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lte/b;->a(Lcom/otaliastudios/zoom/ZoomEngine$c;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "container is not initialized."

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
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
.end method

.method public l0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->l(Z)V

    return-void
.end method

.method public m()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lte/a;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    .line 11
    .line 12
    invoke-virtual {v0}, Lue/b;->e()V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lte/a;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->p:Lte/a;

    .line 25
    .line 26
    invoke-virtual {v0}, Lte/a;->f()Z

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
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
.end method

.method public m0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->m(Z)V

    return-void
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->w()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    return v0
.end method

.method public n0(I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/otaliastudios/zoom/c$a;->c(Lcom/otaliastudios/zoom/c;I)V

    return-void
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->p()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public o0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->t:Lue/b;

    invoke-virtual {v0, p1}, Lue/b;->n(Z)V

    return-void
.end method

.method public p0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->q:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->t(Z)V

    return-void
.end method

.method public q0(Z)V
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0, p1}, Lwe/c;->o(Z)V

    return-void
.end method

.method public r0(FZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->K()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    invoke-virtual {p0, v0, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->u0(FZ)V

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
.end method

.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->x()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    return v0
.end method

.method public s0()V
    .locals 2

    const v0, 0x3fa66666    # 1.3f

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/otaliastudios/zoom/ZoomEngine;->r0(FZ)V

    return-void
.end method

.method public setMaxZoom(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lwe/c;->p(FI)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->K()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 11
    .line 12
    invoke-virtual {p2}, Lwe/c;->f()F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    cmpl-float p1, p1, p2

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Lwe/c;->f()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->S(FZ)V

    .line 28
    .line 29
    .line 30
    :cond_0
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
.end method

.method public setMinZoom(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lwe/c;->q(FI)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/otaliastudios/zoom/ZoomEngine;->G()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 11
    .line 12
    invoke-virtual {p2}, Lwe/c;->i()F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    cmpg-float p1, p1, p2

    .line 17
    .line 18
    if-gtz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Lwe/c;->i()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->S(FZ)V

    .line 28
    .line 29
    .line 30
    :cond_0
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
.end method

.method public setTransformation(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/otaliastudios/zoom/ZoomEngine;->k:I

    .line 2
    .line 3
    iput p2, p0, Lcom/otaliastudios/zoom/ZoomEngine;->l:I

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
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
.end method

.method public final t()I
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->o()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public t0()V
    .locals 2

    const v0, 0x3f333333    # 0.7f

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/otaliastudios/zoom/ZoomEngine;->r0(FZ)V

    return-void
.end method

.method public final u()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->l()F

    move-result v0

    return v0
.end method

.method public u0(FZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lwe/c;->u(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/otaliastudios/zoom/ZoomEngine;->S(FZ)V

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
.end method

.method public final v()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->m()F

    move-result v0

    return v0
.end method

.method public final w()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->n()F

    move-result v0

    return v0
.end method

.method public final x()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->q()F

    move-result v0

    return v0
.end method

.method public final y()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->s:Lve/b;

    invoke-virtual {v0}, Lve/b;->r()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public z()F
    .locals 1

    iget-object v0, p0, Lcom/otaliastudios/zoom/ZoomEngine;->r:Lwe/c;

    invoke-virtual {v0}, Lwe/c;->e()F

    move-result v0

    return v0
.end method
