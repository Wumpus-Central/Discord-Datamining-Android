.class public final Lcom/discord/qr/scanner/QRScannerViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/discord/qr/scanner/QRScanner;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0008H\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0016J\u0008\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/discord/qr/scanner/QRScannerViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/discord/qr/scanner/QRScanner;",
        "()V",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "",
        "",
        "getName",
        "qr_scanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;


# direct methods
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
    const-class v2, Lcom/discord/qr/scanner/events/OnQRCodeFoundEvent;

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "onQRCodeFound"

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
    iput-object v0, p0, Lcom/discord/qr/scanner/QRScannerViewManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 28
    .line 29
    return-void
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
.end method

.method public static final synthetic access$getReactEvents$p(Lcom/discord/qr/scanner/QRScannerViewManager;)Lcom/discord/reactevents/ReactEvents;
    .locals 0

    iget-object p0, p0, Lcom/discord/qr/scanner/QRScannerViewManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/qr/scanner/QRScannerViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/qr/scanner/QRScanner;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/qr/scanner/QRScanner;
    .locals 7

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/discord/qr/scanner/QRScanner;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/qr/scanner/QRScanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    new-instance p1, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;

    invoke-direct {p1, p0, v0}, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;-><init>(Lcom/discord/qr/scanner/QRScannerViewManager;Lcom/discord/qr/scanner/QRScanner;)V

    invoke-virtual {v0, p1}, Lcom/discord/qr/scanner/QRScanner;->setOnCodeFound(Lkotlin/jvm/functions/Function1;)V

    .line 4
    new-instance p1, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$2;

    invoke-direct {p1, p0, v0}, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$2;-><init>(Lcom/discord/qr/scanner/QRScannerViewManager;Lcom/discord/qr/scanner/QRScanner;)V

    invoke-virtual {v0, p1}, Lcom/discord/qr/scanner/QRScanner;->setOnCodeNotFound(Lkotlin/jvm/functions/Function0;)V

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

    iget-object v0, p0, Lcom/discord/qr/scanner/QRScannerViewManager;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    invoke-virtual {v0}, Lcom/discord/reactevents/ReactEvents;->exportEventConstants()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "DCDQRScanner"

    return-object v0
.end method