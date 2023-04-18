.class public final Lcom/discord/sticker/react/StickerViewManagerLottie;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/discord/sticker/StickerView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u00142\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/discord/sticker/react/StickerViewManagerLottie;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/discord/sticker/StickerView;",
        "()V",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getCommandsMap",
        "",
        "",
        "",
        "getName",
        "onDropViewInstance",
        "",
        "view",
        "receiveCommand",
        "node",
        "commandId",
        "args",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "Companion",
        "sticker_release"
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
.field public static final Companion:Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;

.field private static final SETUP_COMMAND_INDEX:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/sticker/react/StickerViewManagerLottie;->Companion:Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/sticker/react/StickerViewManagerLottie;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/sticker/StickerView;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/sticker/StickerView;
    .locals 7

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/discord/sticker/StickerView;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    invoke-virtual {v0}, Lcom/discord/sticker/StickerView;->inflateLottieView()V

    return-object v0
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "setup"

    invoke-static {v1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lmf/s;->e(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "NativeLottieNode"

    return-object v0
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/sticker/StickerView;

    invoke-virtual {p0, p1}, Lcom/discord/sticker/react/StickerViewManagerLottie;->onDropViewInstance(Lcom/discord/sticker/StickerView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/discord/sticker/StickerView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/discord/image/animated_image/apng/APNGImageView;->recycle()V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/sticker/StickerView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/sticker/react/StickerViewManagerLottie;->receiveCommand(Lcom/discord/sticker/StickerView;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/discord/sticker/StickerView;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 8

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 2
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 3
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 p2, 0x2

    .line 4
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    const/4 p2, 0x3

    .line 5
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v4

    const/4 p2, 0x4

    .line 6
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v7

    const/4 p2, 0x5

    .line 7
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result v5

    const-string p2, "getString(1)"

    .line 8
    invoke-static {v2, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "getString(0)"

    .line 9
    invoke-static {v6, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    .line 10
    invoke-virtual/range {v1 .. v7}, Lcom/discord/sticker/StickerView;->asLottie(Ljava/lang/String;IIZLjava/lang/String;I)V

    :cond_1
    return-void
.end method
