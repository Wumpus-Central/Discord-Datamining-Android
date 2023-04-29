.class public final Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "getTranslatedBottom",
        "",
        "Landroid/view/View;",
        "getTranslatedLeft",
        "getTranslatedRight",
        "getTranslatedTop",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$getTranslatedBottom(Landroid/view/View;)F
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawerKt;->getTranslatedBottom(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTranslatedLeft(Landroid/view/View;)F
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawerKt;->getTranslatedLeft(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTranslatedRight(Landroid/view/View;)F
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawerKt;->getTranslatedRight(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTranslatedTop(Landroid/view/View;)F
    .locals 0

    invoke-static {p0}, Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawerKt;->getTranslatedTop(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method private static final getTranslatedBottom(Landroid/view/View;)F
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p0

    add-float/2addr v0, p0

    return v0
.end method

.method private static final getTranslatedLeft(Landroid/view/View;)F
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result p0

    add-float/2addr v0, p0

    return v0
.end method

.method private static final getTranslatedRight(Landroid/view/View;)F
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result p0

    int-to-float p0, p0

    return p0
.end method

.method private static final getTranslatedTop(Landroid/view/View;)F
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result p0

    add-float/2addr v0, p0

    return v0
.end method
