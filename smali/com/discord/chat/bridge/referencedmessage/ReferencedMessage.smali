.class public abstract Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;",
        "",
        "()V",
        "Companion",
        "Lcom/discord/chat/bridge/referencedmessage/LoadedReferencedMessage;",
        "Lcom/discord/chat/bridge/referencedmessage/SystemReferencedMessage;",
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

.annotation runtime Lyi/f;
    with = Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;->Companion:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;-><init>()V

    return-void
.end method
