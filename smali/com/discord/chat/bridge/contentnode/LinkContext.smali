.class public final Lcom/discord/chat/bridge/contentnode/LinkContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/contentnode/LinkContext$$serializer;,
        Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002FGB}\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019B}\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0081\u0001\u00108\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\t\u0010=\u001a\u00020>H\u00d6\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u00c7\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-\u00a8\u0006H"
    }
    d2 = {
        "Lcom/discord/chat/bridge/contentnode/LinkContext;",
        "",
        "seen1",
        "",
        "usernameOnClick",
        "Lcom/discord/chat/bridge/contentnode/UserNameOnClick;",
        "otherUsernameOnClick",
        "commandNameOnClick",
        "Lcom/discord/chat/bridge/contentnode/CommandOnClick;",
        "actorHook",
        "Lcom/discord/chat/bridge/contentnode/ActorHook;",
        "threadOnClick",
        "Lcom/discord/chat/bridge/contentnode/ThreadOnClick;",
        "pinsOnClick",
        "Lcom/discord/chat/bridge/contentnode/PinsOnClick;",
        "webhookNameOnClick",
        "Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;",
        "handleDelete",
        "Lcom/discord/chat/bridge/contentnode/HandleDelete;",
        "roleSubscriptionOnClick",
        "Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;",
        "handleMessage",
        "Lcom/discord/chat/bridge/contentnode/HandleMessage;",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)V",
        "getActorHook",
        "()Lcom/discord/chat/bridge/contentnode/ActorHook;",
        "getCommandNameOnClick",
        "()Lcom/discord/chat/bridge/contentnode/CommandOnClick;",
        "getHandleDelete",
        "()Lcom/discord/chat/bridge/contentnode/HandleDelete;",
        "getHandleMessage",
        "()Lcom/discord/chat/bridge/contentnode/HandleMessage;",
        "getOtherUsernameOnClick",
        "()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;",
        "getPinsOnClick",
        "()Lcom/discord/chat/bridge/contentnode/PinsOnClick;",
        "getRoleSubscriptionOnClick",
        "()Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;",
        "getThreadOnClick",
        "()Lcom/discord/chat/bridge/contentnode/ThreadOnClick;",
        "getUsernameOnClick",
        "getWebhookNameOnClick",
        "()Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
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

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;


# instance fields
.field private final actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

.field private final commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

.field private final handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

.field private final handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

.field private final otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

.field private final pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

.field private final roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

.field private final threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

.field private final usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

.field private final webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->Companion:Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/discord/chat/bridge/contentnode/LinkContext;-><init>(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x0

    if-eqz p12, :cond_0

    .line 1
    sget-object p12, Lcom/discord/chat/bridge/contentnode/LinkContext$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/LinkContext$$serializer;

    invoke-virtual {p12}, Lcom/discord/chat/bridge/contentnode/LinkContext$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p12

    const/4 v0, 0x0

    invoke-static {p1, v0, p12}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_1

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    goto :goto_5

    :cond_6
    iput-object p7, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    goto :goto_6

    :cond_7
    iput-object p8, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    goto :goto_7

    :cond_8
    iput-object p9, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    goto :goto_8

    :cond_9
    iput-object p10, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    :goto_8
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_a

    iput-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    goto :goto_9

    :cond_a
    iput-object p11, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    :goto_9
    return-void
.end method

.method public constructor <init>(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 5
    iput-object p3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    .line 6
    iput-object p4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    .line 7
    iput-object p5, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    .line 8
    iput-object p6, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    .line 9
    iput-object p7, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    .line 10
    iput-object p8, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    .line 11
    iput-object p9, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    .line 12
    iput-object p10, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v2, p10

    :goto_9
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-object p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v2

    .line 13
    invoke-direct/range {p1 .. p11}, Lcom/discord/chat/bridge/contentnode/LinkContext;-><init>(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/contentnode/LinkContext;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;ILjava/lang/Object;)Lcom/discord/chat/bridge/contentnode/LinkContext;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/discord/chat/bridge/contentnode/LinkContext;->copy(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)Lcom/discord/chat/bridge/contentnode/LinkContext;

    move-result-object v0

    return-object v0
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    .line 1
    const-string v0, "self"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "output"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serialDesc"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :goto_0
    move v1, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v0

    .line 32
    :goto_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    sget-object v1, Lcom/discord/chat/bridge/contentnode/UserNameOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/UserNameOnClick$$serializer;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    :goto_2
    move v1, v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    move v1, v0

    .line 55
    :goto_3
    if-eqz v1, :cond_5

    .line 56
    .line 57
    sget-object v1, Lcom/discord/chat/bridge/contentnode/UserNameOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/UserNameOnClick$$serializer;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    .line 60
    .line 61
    invoke-interface {p1, p2, v2, v1, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_5
    const/4 v1, 0x2

    .line 65
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    :goto_4
    move v3, v2

    .line 72
    goto :goto_5

    .line 73
    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    .line 74
    .line 75
    if-eqz v3, :cond_7

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_7
    move v3, v0

    .line 79
    :goto_5
    if-eqz v3, :cond_8

    .line 80
    .line 81
    sget-object v3, Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/CommandOnClick$$serializer;

    .line 82
    .line 83
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    .line 84
    .line 85
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_8
    const/4 v1, 0x3

    .line 89
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_9

    .line 94
    .line 95
    :goto_6
    move v3, v2

    .line 96
    goto :goto_7

    .line 97
    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    .line 98
    .line 99
    if-eqz v3, :cond_a

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_a
    move v3, v0

    .line 103
    :goto_7
    if-eqz v3, :cond_b

    .line 104
    .line 105
    sget-object v3, Lcom/discord/chat/bridge/contentnode/ActorHook$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/ActorHook$$serializer;

    .line 106
    .line 107
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    .line 108
    .line 109
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_b
    const/4 v1, 0x4

    .line 113
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_c

    .line 118
    .line 119
    :goto_8
    move v3, v2

    .line 120
    goto :goto_9

    .line 121
    :cond_c
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    .line 122
    .line 123
    if-eqz v3, :cond_d

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_d
    move v3, v0

    .line 127
    :goto_9
    if-eqz v3, :cond_e

    .line 128
    .line 129
    sget-object v3, Lcom/discord/chat/bridge/contentnode/ThreadOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/ThreadOnClick$$serializer;

    .line 130
    .line 131
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    .line 132
    .line 133
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_e
    const/4 v1, 0x5

    .line 137
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_f

    .line 142
    .line 143
    :goto_a
    move v3, v2

    .line 144
    goto :goto_b

    .line 145
    :cond_f
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    .line 146
    .line 147
    if-eqz v3, :cond_10

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_10
    move v3, v0

    .line 151
    :goto_b
    if-eqz v3, :cond_11

    .line 152
    .line 153
    sget-object v3, Lcom/discord/chat/bridge/contentnode/PinsOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/PinsOnClick$$serializer;

    .line 154
    .line 155
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    .line 156
    .line 157
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_11
    const/4 v1, 0x6

    .line 161
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_12

    .line 166
    .line 167
    :goto_c
    move v3, v2

    .line 168
    goto :goto_d

    .line 169
    :cond_12
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    .line 170
    .line 171
    if-eqz v3, :cond_13

    .line 172
    .line 173
    goto :goto_c

    .line 174
    :cond_13
    move v3, v0

    .line 175
    :goto_d
    if-eqz v3, :cond_14

    .line 176
    .line 177
    sget-object v3, Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick$$serializer;

    .line 178
    .line 179
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    .line 180
    .line 181
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_14
    const/4 v1, 0x7

    .line 185
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_15

    .line 190
    .line 191
    :goto_e
    move v3, v2

    .line 192
    goto :goto_f

    .line 193
    :cond_15
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    .line 194
    .line 195
    if-eqz v3, :cond_16

    .line 196
    .line 197
    goto :goto_e

    .line 198
    :cond_16
    move v3, v0

    .line 199
    :goto_f
    if-eqz v3, :cond_17

    .line 200
    .line 201
    sget-object v3, Lcom/discord/chat/bridge/contentnode/HandleDelete$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/HandleDelete$$serializer;

    .line 202
    .line 203
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    .line 204
    .line 205
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_17
    const/16 v1, 0x8

    .line 209
    .line 210
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_18

    .line 215
    .line 216
    :goto_10
    move v3, v2

    .line 217
    goto :goto_11

    .line 218
    :cond_18
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    .line 219
    .line 220
    if-eqz v3, :cond_19

    .line 221
    .line 222
    goto :goto_10

    .line 223
    :cond_19
    move v3, v0

    .line 224
    :goto_11
    if-eqz v3, :cond_1a

    .line 225
    .line 226
    sget-object v3, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick$$serializer;

    .line 227
    .line 228
    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    .line 229
    .line 230
    invoke-interface {p1, p2, v1, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_1a
    const/16 v1, 0x9

    .line 234
    .line 235
    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_1b

    .line 240
    .line 241
    :goto_12
    move v0, v2

    .line 242
    goto :goto_13

    .line 243
    :cond_1b
    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    .line 244
    .line 245
    if-eqz v3, :cond_1c

    .line 246
    .line 247
    goto :goto_12

    .line 248
    :cond_1c
    :goto_13
    if-eqz v0, :cond_1d

    .line 249
    .line 250
    sget-object v0, Lcom/discord/chat/bridge/contentnode/HandleMessage$$serializer;->INSTANCE:Lcom/discord/chat/bridge/contentnode/HandleMessage$$serializer;

    .line 251
    .line 252
    iget-object p0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    .line 253
    .line 254
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_1d
    return-void
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
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    return-object v0
.end method

.method public final component10()Lcom/discord/chat/bridge/contentnode/HandleMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    return-object v0
.end method

.method public final component3()Lcom/discord/chat/bridge/contentnode/CommandOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    return-object v0
.end method

.method public final component4()Lcom/discord/chat/bridge/contentnode/ActorHook;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/contentnode/ThreadOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    return-object v0
.end method

.method public final component6()Lcom/discord/chat/bridge/contentnode/PinsOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    return-object v0
.end method

.method public final component7()Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    return-object v0
.end method

.method public final component8()Lcom/discord/chat/bridge/contentnode/HandleDelete;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    return-object v0
.end method

.method public final component9()Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    return-object v0
.end method

.method public final copy(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)Lcom/discord/chat/bridge/contentnode/LinkContext;
    .locals 12

    new-instance v11, Lcom/discord/chat/bridge/contentnode/LinkContext;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/discord/chat/bridge/contentnode/LinkContext;-><init>(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)V

    return-object v11
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContext;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    iget-object v3, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    iget-object p1, p1, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getActorHook()Lcom/discord/chat/bridge/contentnode/ActorHook;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    return-object v0
.end method

.method public final getCommandNameOnClick()Lcom/discord/chat/bridge/contentnode/CommandOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    return-object v0
.end method

.method public final getHandleDelete()Lcom/discord/chat/bridge/contentnode/HandleDelete;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    return-object v0
.end method

.method public final getHandleMessage()Lcom/discord/chat/bridge/contentnode/HandleMessage;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    return-object v0
.end method

.method public final getOtherUsernameOnClick()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    return-object v0
.end method

.method public final getPinsOnClick()Lcom/discord/chat/bridge/contentnode/PinsOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    return-object v0
.end method

.method public final getRoleSubscriptionOnClick()Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    return-object v0
.end method

.method public final getThreadOnClick()Lcom/discord/chat/bridge/contentnode/ThreadOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    return-object v0
.end method

.method public final getUsernameOnClick()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    return-object v0
.end method

.method public final getWebhookNameOnClick()Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/CommandOnClick;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/ActorHook;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/ThreadOnClick;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/PinsOnClick;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/HandleDelete;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/discord/chat/bridge/contentnode/HandleMessage;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->usernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    iget-object v1, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->otherUsernameOnClick:Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    iget-object v2, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->commandNameOnClick:Lcom/discord/chat/bridge/contentnode/CommandOnClick;

    iget-object v3, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->actorHook:Lcom/discord/chat/bridge/contentnode/ActorHook;

    iget-object v4, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->threadOnClick:Lcom/discord/chat/bridge/contentnode/ThreadOnClick;

    iget-object v5, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->pinsOnClick:Lcom/discord/chat/bridge/contentnode/PinsOnClick;

    iget-object v6, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->webhookNameOnClick:Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;

    iget-object v7, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleDelete:Lcom/discord/chat/bridge/contentnode/HandleDelete;

    iget-object v8, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->roleSubscriptionOnClick:Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;

    iget-object v9, p0, Lcom/discord/chat/bridge/contentnode/LinkContext;->handleMessage:Lcom/discord/chat/bridge/contentnode/HandleMessage;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "LinkContext(usernameOnClick="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", otherUsernameOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", commandNameOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actorHook="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", threadOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pinsOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", webhookNameOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", handleDelete="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", roleSubscriptionOnClick="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", handleMessage="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
