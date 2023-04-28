.class public final Lcom/discord/chat/reactevents/TapLinkData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001a\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006BB\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JP\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0008\u0010%\u001a\u00020&H\u0016J\t\u0010\'\u001a\u00020\u0008H\u00d6\u0001J\u000c\u0010(\u001a\u00020)*\u00020\u000cH\u0002R\u0011\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000f\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006*"
    }
    d2 = {
        "Lcom/discord/chat/reactevents/TapLinkData;",
        "Lcom/discord/reactevents/ReactEvent;",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "node",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "title",
        "",
        "target",
        "content",
        "context",
        "Lcom/discord/chat/bridge/contentnode/LinkContext;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getContent",
        "()Ljava/lang/String;",
        "getContext",
        "()Lcom/discord/chat/bridge/contentnode/LinkContext;",
        "getMessageId-N_6c4I0",
        "Ljava/lang/String;",
        "getTarget",
        "getTitle",
        "component1",
        "component1-N_6c4I0",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "copy-fCSJrew",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "serialize",
        "Lcom/facebook/react/bridge/WritableMap;",
        "toString",
        "toMap",
        "Lcom/facebook/react/bridge/WritableNativeMap;",
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
.field private final content:Ljava/lang/String;

.field private final context:Lcom/discord/chat/bridge/contentnode/LinkContext;

.field private final messageId:Ljava/lang/String;

.field private final target:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V
    .locals 8

    const/4 v2, 0x0

    .line 8
    invoke-virtual {p2}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getTarget()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {p2}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getTextContent()Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-virtual {p2}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getContext()Lcom/discord/chat/bridge/contentnode/LinkContext;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/reactevents/TapLinkData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/chat/reactevents/TapLinkData;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const-string p4, ""

    :cond_3
    move-object v5, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move-object v6, v0

    goto :goto_3

    :cond_4
    move-object v6, p5

    :goto_3
    const/4 v7, 0x0

    move-object v1, p0

    .line 7
    invoke-direct/range {v1 .. v7}, Lcom/discord/chat/reactevents/TapLinkData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/discord/chat/reactevents/TapLinkData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)V

    return-void
.end method

.method public static synthetic copy-fCSJrew$default(Lcom/discord/chat/reactevents/TapLinkData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;ILjava/lang/Object;)Lcom/discord/chat/reactevents/TapLinkData;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/discord/chat/reactevents/TapLinkData;->copy-fCSJrew(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;

    move-result-object p0

    return-object p0
.end method

.method private final toMap(Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/facebook/react/bridge/WritableNativeMap;
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    new-array v2, v1, [Lkotlin/Pair;

    .line 1
    invoke-static {v2}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v2

    .line 2
    iget-object v3, v0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "messageId"

    const/4 v6, 0x3

    const-string v7, "loggingName"

    const/4 v8, 0x2

    const-string v9, "id"

    const-string v10, "message"

    const-string v11, "channel_id"

    const/4 v12, 0x1

    const-string v13, "userId"

    const-string v14, "messageChannelId"

    const-string v15, "action"

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "commandNameOnClick"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getCommandNameOnClick()Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 4
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v13, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getMessageType()Lcom/discord/chat/bridge/MessageType;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {v3}, Lcom/discord/chat/bridge/MessageType;->getSerialNumber()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "messageType"

    invoke-static {v2, v4, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    :cond_1
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getMessageId-N_6c4I0()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, "null"

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v2, v5, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getApplicationUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "applicationUserId"

    invoke-static {v2, v4, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->getMessageChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v14, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_1
    const-string v4, "handleMessage"

    .line 11
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    .line 12
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getHandleMessage()Lcom/discord/chat/bridge/contentnode/HandleMessage;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 13
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleMessage;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v15, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    new-array v4, v6, [Lkotlin/Pair;

    .line 14
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleMessage;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v1

    .line 15
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleMessage;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;->getChannelId-o4g7jtM()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v12

    .line 16
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleMessage;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;->getLoggingName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v8

    .line 17
    invoke-static {v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v1

    .line 18
    invoke-static {v2, v10, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_2
    const-string v1, "otherUsernameOnClick"

    .line 19
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_1

    .line 20
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getOtherUsernameOnClick()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 21
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getUserId-re6GcUE()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->toString-impl(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v13, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getMessageChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    .line 24
    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v14, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_3
    const-string v1, "actorHook"

    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_1

    .line 26
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getActorHook()Lcom/discord/chat/bridge/contentnode/ActorHook;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 27
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/ActorHook;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/ActorHook;->getUserId-re6GcUE()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v13, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_4
    const-string v1, "roleSubscriptionOnClick"

    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_1

    .line 30
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getRoleSubscriptionOnClick()Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 31
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "guildId"

    .line 32
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->getGuildId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "channelId"

    .line 33
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->getChannelId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v5, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "roleSubscriptionListingId"

    .line 35
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->getRoleSubscriptionListingId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_5
    const-string v1, "usernameOnClick"

    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_1

    .line 37
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getUsernameOnClick()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 38
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getUserId-re6GcUE()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/UserId;->toString-impl(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v13, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getMessageChannelId-qMVnFVQ()Lcom/discord/primitives/ChannelId;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    .line 41
    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v14, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_6
    const-string v1, "pinsOnClick"

    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_1

    .line 43
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getPinsOnClick()Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 44
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/PinsOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/PinsOnClick;->getMessageChannelId-o4g7jtM()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v14, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_7
    const-string v4, "webhookNameOnClick"

    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_1

    .line 47
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getWebhookNameOnClick()Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 48
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v15, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;->getMessageReference()Lcom/discord/chat/bridge/contentnode/MessageReference;

    move-result-object v3

    if-eqz v3, :cond_e

    new-array v1, v1, [Lkotlin/Pair;

    .line 50
    invoke-static {v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v1

    .line 51
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/MessageReference;->getChannelId-o4g7jtM()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v11, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/MessageReference;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    move-result-wide v3

    const-string v5, "guild_id"

    invoke-static {v3, v4}, Lcom/discord/primitives/GuildId;->toString-impl(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v5, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    :cond_a
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    const-string v3, "messageReference"

    .line 54
    invoke-static {v2, v3, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_8
    const-string v1, "threadOnClick"

    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_1

    .line 56
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getThreadOnClick()Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 57
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/ThreadOnClick;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v15, v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "threadId"

    .line 58
    invoke-virtual {v1}, Lcom/discord/chat/bridge/contentnode/ThreadOnClick;->getThreadId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_9
    const-string v4, "handleDelete"

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_1

    .line 60
    :cond_c
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getHandleDelete()Lcom/discord/chat/bridge/contentnode/HandleDelete;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 61
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v15, v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v4, 0x4

    new-array v4, v4, [Lkotlin/Pair;

    .line 62
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v1

    .line 63
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;->getChannelId-o4g7jtM()J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v11, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v12

    .line 64
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;->getLoggingName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v8

    new-array v5, v12, [Lkotlin/Pair;

    .line 65
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->getMessage()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;->getAuthor()Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/HandleDeleteMessageAuthor;->getUsername()Ljava/lang/String;

    move-result-object v3

    const-string v7, "username"

    invoke-static {v7, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v5}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v1

    const-string v3, "author"

    invoke-static {v3, v1}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v6

    .line 66
    invoke-static {v4}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v1

    .line 67
    invoke-static {v2, v10, v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->put(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 68
    :cond_d
    :goto_1
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    const-string v4, "TapLink"

    iget-object v1, v0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Missing target type in context: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->e$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_e
    :goto_2
    return-object v2

    :sswitch_data_0
    .sparse-switch
        -0x67435e0d -> :sswitch_9
        -0x491cda81 -> :sswitch_8
        -0x43d65919 -> :sswitch_7
        -0x379f5875 -> :sswitch_6
        -0x3792d2cd -> :sswitch_5
        -0x52f194a -> :sswitch_4
        0x162810b8 -> :sswitch_3
        0x4e9d6403 -> :sswitch_2
        0x5b586cbf -> :sswitch_1
        0x7b74b193 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final component1-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/contentnode/LinkContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    return-object v0
.end method

.method public final copy-fCSJrew(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;
    .locals 8

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/reactevents/TapLinkData;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/discord/chat/reactevents/TapLinkData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/reactevents/TapLinkData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/reactevents/TapLinkData;

    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    if-nez v1, :cond_2

    if-nez v3, :cond_3

    move v1, v0

    goto :goto_0

    :cond_2
    if-nez v3, :cond_4

    :cond_3
    move v1, v2

    goto :goto_0

    :cond_4
    invoke-static {v1, v3}, Lcom/discord/primitives/MessageId;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    iget-object p1, p1, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getContext()Lcom/discord/chat/bridge/contentnode/LinkContext;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    return-object v0
.end method

.method public final getMessageId-N_6c4I0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTarget()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/discord/primitives/MessageId;->hashCode-impl(Ljava/lang/String;)I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/LinkContext;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/discord/chat/reactevents/TapLinkData;->toMap(Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x3

    .line 14
    new-array v3, v0, [Lkotlin/Pair;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    const-string v4, "null"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {v4}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :goto_0
    const-string v5, "messageId"

    .line 28
    .line 29
    invoke-static {v5, v4}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v3, v2

    .line 34
    .line 35
    const-string v4, "url"

    .line 36
    .line 37
    iget-object v5, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    aput-object v4, v3, v1

    .line 44
    .line 45
    new-array v0, v0, [Lkotlin/Pair;

    .line 46
    .line 47
    const-string v4, "title"

    .line 48
    .line 49
    iget-object v5, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v4, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    aput-object v4, v0, v2

    .line 56
    .line 57
    const-string v4, "target"

    .line 58
    .line 59
    iget-object v5, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v4, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    aput-object v4, v0, v1

    .line 66
    .line 67
    const-string v4, "content"

    .line 68
    .line 69
    iget-object v5, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v4, v5}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const/4 v5, 0x2

    .line 76
    aput-object v4, v0, v5

    .line 77
    .line 78
    invoke-static {v0}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v4, "node"

    .line 83
    .line 84
    invoke-static {v4, v0}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    aput-object v0, v3, v5

    .line 89
    .line 90
    invoke-static {v3}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_2
    new-array v1, v1, [Lkotlin/Pair;

    .line 95
    .line 96
    const-string v3, "data"

    .line 97
    .line 98
    invoke-static {v3, v0}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    aput-object v0, v1, v2

    .line 103
    .line 104
    invoke-static {v1}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
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
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/discord/chat/reactevents/TapLinkData;->messageId:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/discord/chat/reactevents/TapLinkData;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/chat/reactevents/TapLinkData;->target:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/chat/reactevents/TapLinkData;->content:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/chat/reactevents/TapLinkData;->context:Lcom/discord/chat/bridge/contentnode/LinkContext;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TapLinkData(messageId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", target="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", context="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
