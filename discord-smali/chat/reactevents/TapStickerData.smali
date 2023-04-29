.class public final Lcom/discord/chat/reactevents/TapStickerData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\r\u001a\u00020\u0005H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u0008J*\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/discord/chat/reactevents/TapStickerData;",
        "Lcom/discord/reactevents/ReactEvent;",
        "sticker",
        "Lcom/discord/chat/bridge/sticker/Sticker;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getMessageId-3Eiw7ao",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getSticker",
        "()Lcom/discord/chat/bridge/sticker/Sticker;",
        "component1",
        "component2",
        "component2-3Eiw7ao",
        "copy",
        "copy-Ayv7vGE",
        "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "serialize",
        "Lcom/facebook/react/bridge/WritableMap;",
        "toString",
        "",
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


# instance fields
.field private final messageId:Ljava/lang/String;

.field private final sticker:Lcom/discord/chat/bridge/sticker/Sticker;


# direct methods
.method private constructor <init>(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    iput-object p2, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/chat/reactevents/TapStickerData;-><init>(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy-Ayv7vGE$default(Lcom/discord/chat/reactevents/TapStickerData;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/reactevents/TapStickerData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/reactevents/TapStickerData;->copy-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/sticker/Sticker;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    return-object v0
.end method

.method public final component2-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;
    .locals 2

    const-string v0, "sticker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/reactevents/TapStickerData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/discord/chat/reactevents/TapStickerData;-><init>(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/reactevents/TapStickerData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/reactevents/TapStickerData;

    iget-object v1, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    iget-object v3, p1, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSticker()Lcom/discord/chat/bridge/sticker/Sticker;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/sticker/Sticker;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lkotlin/Pair;

    .line 3
    .line 4
    const-string v2, "messageId"

    .line 5
    .line 6
    iget-object v3, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v2, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    new-array v0, v0, [Lkotlin/Pair;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/discord/chat/bridge/sticker/Sticker;->getId()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v4, "id"

    .line 28
    .line 29
    invoke-static {v4, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    aput-object v2, v0, v3

    .line 34
    .line 35
    iget-object v2, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/discord/chat/bridge/sticker/Sticker;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "name"

    .line 42
    .line 43
    invoke-static {v3, v2}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v3, 0x1

    .line 48
    aput-object v2, v0, v3

    .line 49
    .line 50
    invoke-static {v0}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "sticker"

    .line 55
    .line 56
    invoke-static {v2, v0}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    aput-object v0, v1, v3

    .line 61
    .line 62
    invoke-static {v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapStickerData;->sticker:Lcom/discord/chat/bridge/sticker/Sticker;

    iget-object v1, p0, Lcom/discord/chat/reactevents/TapStickerData;->messageId:Ljava/lang/String;

    invoke-static {v1}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TapStickerData(sticker="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
