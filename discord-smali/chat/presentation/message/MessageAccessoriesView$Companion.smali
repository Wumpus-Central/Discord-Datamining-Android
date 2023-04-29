.class public final Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/message/MessageAccessoriesView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;",
        "",
        "()V",
        "embedContentMarginPx",
        "",
        "leftMarginPx",
        "rightMarginPx",
        "getWidth",
        "constrainedWidth",
        "getWidthForEmbedContent",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getWidth(I)I
    .locals 1

    invoke-static {}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->access$getLeftMarginPx$cp()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-static {}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->access$getRightMarginPx$cp()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final getWidthForEmbedContent(I)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;->getWidth(I)I

    move-result p1

    invoke-static {}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->access$getEmbedContentMarginPx$cp()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr p1, v0

    return p1
.end method
