.class public final Lcom/discord/chat/presentation/list/item/SystemMessageItem;
.super Lcom/discord/chat/presentation/list/item/ChatListItem;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/item/SystemMessageItem;",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "message",
        "Lcom/discord/chat/bridge/Message;",
        "messageContext",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "backgroundHighlight",
        "Lcom/discord/chat/bridge/BackgroundHighlight;",
        "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V",
        "getBackgroundHighlight",
        "()Lcom/discord/chat/bridge/BackgroundHighlight;",
        "getMessage",
        "()Lcom/discord/chat/bridge/Message;",
        "getMessageContext",
        "()Lcom/discord/chat/presentation/root/MessageContext;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
.field private final backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

.field private final message:Lcom/discord/chat/bridge/Message;

.field private final messageContext:Lcom/discord/chat/presentation/root/MessageContext;


# direct methods
.method public constructor <init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/discord/chat/presentation/list/item/ChatListItem;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    .line 5
    iput-object p3, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    .line 6
    invoke-static {p1}, Lcom/discord/chat/bridge/MessageKt;->isSystemMessage(Lcom/discord/chat/bridge/Message;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only system messages are allowed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/list/item/SystemMessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/list/item/SystemMessageItem;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;ILjava/lang/Object;)Lcom/discord/chat/presentation/list/item/SystemMessageItem;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->copy(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/SystemMessageItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/Message;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/presentation/root/MessageContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    return-object v0
.end method

.method public final component3()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final copy(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/SystemMessageItem;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;

    invoke-direct {v0, p1, p2, p3}, Lcom/discord/chat/presentation/list/item/SystemMessageItem;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/list/item/SystemMessageItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/list/item/SystemMessageItem;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    iget-object p1, p1, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBackgroundHighlight()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final getMessage()Lcom/discord/chat/bridge/Message;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    return-object v0
.end method

.method public final getMessageContext()Lcom/discord/chat/presentation/root/MessageContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/Message;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/root/MessageContext;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/discord/chat/bridge/BackgroundHighlight;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->message:Lcom/discord/chat/bridge/Message;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->messageContext:Lcom/discord/chat/presentation/root/MessageContext;

    iget-object v2, p0, Lcom/discord/chat/presentation/list/item/SystemMessageItem;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SystemMessageItem(message="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageContext="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundHighlight="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
