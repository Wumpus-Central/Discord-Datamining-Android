.class public final Lcom/discord/chat/reactevents/TapInviteToSpeakData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0006J \u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001c\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/chat/reactevents/TapInviteToSpeakData;",
        "Lcom/discord/reactevents/ReactEvent;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getMessageId-3Eiw7ao",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "component1",
        "component1-3Eiw7ao",
        "copy",
        "copy-1xi1bu0",
        "(Ljava/lang/String;)Lcom/discord/chat/reactevents/TapInviteToSpeakData;",
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


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/reactevents/TapInviteToSpeakData;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy-1xi1bu0$default(Lcom/discord/chat/reactevents/TapInviteToSpeakData;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/chat/reactevents/TapInviteToSpeakData;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->copy-1xi1bu0(Ljava/lang/String;)Lcom/discord/chat/reactevents/TapInviteToSpeakData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-1xi1bu0(Ljava/lang/String;)Lcom/discord/chat/reactevents/TapInviteToSpeakData;
    .locals 2

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/discord/chat/reactevents/TapInviteToSpeakData;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/reactevents/TapInviteToSpeakData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/reactevents/TapInviteToSpeakData;

    iget-object v1, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMessageId-3Eiw7ao()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lkotlin/Pair;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v1}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "messageId"

    .line 11
    .line 12
    invoke-static {v2, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    invoke-static {v0}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 20
    .line 21
    .line 22
    move-result-object v0

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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapInviteToSpeakData;->messageId:Ljava/lang/String;

    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TapInviteToSpeakData(messageId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
