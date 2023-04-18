.class public final Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;
.super Lcom/discord/serialization/IntEnumSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/discord/serialization/IntEnumSerializer<",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;",
        "Lcom/discord/serialization/IntEnumSerializer;",
        "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;",
        "()V",
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


# static fields
.field public static final INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    invoke-direct {v0}, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;-><init>()V

    sput-object v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-class v0, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/discord/serialization/IntEnumSerializer;-><init>(Lkotlin/reflect/KClass;Lcom/discord/serialization/IntEnum;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
