.class public final Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt$getEventHandler$1;
.super Lcom/discord/chat/reactevents/ChatViewEventHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt;->getEventHandler(Lcom/discord/chat/presentation/list/item/MessageItem;Landroid/content/Context;)Lcom/discord/chat/reactevents/ChatViewEventHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001RG\u0010\t\u001a,\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\u00088\u0016X\u0096\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR7\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "com/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt$getEventHandler$1",
        "Lcom/discord/chat/reactevents/ChatViewEventHandler;",
        "Lkotlin/Function4;",
        "Lcom/discord/primitives/MessageId;",
        "Lcom/discord/primitives/ChannelId;",
        "",
        "Lcom/discord/chat/bridge/MediaType;",
        "",
        "Lcom/discord/chat/presentation/events/MessageLongPress;",
        "onMessageLongPressed",
        "Lkotlin/jvm/functions/Function4;",
        "getOnMessageLongPressed",
        "()Lkotlin/jvm/functions/Function4;",
        "Lkotlin/Function2;",
        "Lcom/discord/chat/presentation/events/MessageTapped;",
        "onMessageTapped",
        "Lkotlin/jvm/functions/Function2;",
        "getOnMessageTapped",
        "()Lkotlin/jvm/functions/Function2;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final onMessageLongPressed:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/Integer;",
            "Lcom/discord/chat/bridge/MediaType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onMessageTapped:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt$getEventHandler$2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/reactevents/ChatViewEventHandler;-><init>(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method


# virtual methods
.method public getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Ljava/lang/Integer;",
            "Lcom/discord/chat/bridge/MediaType;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt$getEventHandler$1;->onMessageLongPressed:Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public getOnMessageTapped()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/discord/primitives/MessageId;",
            "Lcom/discord/primitives/ChannelId;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleDelegateUtilsKt$getEventHandler$1;->onMessageTapped:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
