.class final Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/qr/scanner/QRScannerViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/qr/scanner/QRScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "code",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $scanner:Lcom/discord/qr/scanner/QRScanner;

.field final synthetic this$0:Lcom/discord/qr/scanner/QRScannerViewManager;


# direct methods
.method constructor <init>(Lcom/discord/qr/scanner/QRScannerViewManager;Lcom/discord/qr/scanner/QRScanner;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;->this$0:Lcom/discord/qr/scanner/QRScannerViewManager;

    iput-object p2, p0, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;->$scanner:Lcom/discord/qr/scanner/QRScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 4

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;->this$0:Lcom/discord/qr/scanner/QRScannerViewManager;

    invoke-static {v0}, Lcom/discord/qr/scanner/QRScannerViewManager;->access$getReactEvents$p(Lcom/discord/qr/scanner/QRScannerViewManager;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/qr/scanner/QRScannerViewManager$createViewInstance$1$1;->$scanner:Lcom/discord/qr/scanner/QRScanner;

    new-instance v2, Lcom/discord/qr/scanner/events/OnQRCodeFoundEvent;

    const-string v3, "SUCCEEDED"

    invoke-direct {v2, v3, p1}, Lcom/discord/qr/scanner/events/OnQRCodeFoundEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitEvent(Landroid/view/View;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method