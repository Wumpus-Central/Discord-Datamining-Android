.class public final Lcom/discord/chat/bridge/MessageType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/MessageType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000bH\u00c6\u0001R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/chat/bridge/MessageType$Companion;",
        "",
        "()V",
        "CallTypes",
        "",
        "Lcom/discord/chat/bridge/MessageType;",
        "getCallTypes",
        "()Ljava/util/Set;",
        "SystemTypes",
        "getSystemTypes",
        "serializer",
        "Lkotlinx/serialization/KSerializer;",
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

    invoke-direct {p0}, Lcom/discord/chat/bridge/MessageType$Companion;-><init>()V

    return-void
.end method

.method private final synthetic get$cachedSerializer$delegate()Lkotlin/Lazy;
    .locals 1

    invoke-static {}, Lcom/discord/chat/bridge/MessageType;->access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getCallTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/discord/chat/bridge/MessageType;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/discord/chat/bridge/MessageType;->access$getCallTypes$cp()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getSystemTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/discord/chat/bridge/MessageType;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/discord/chat/bridge/MessageType;->access$getSystemTypes$cp()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final serializer()Lkotlinx/serialization/KSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/serialization/KSerializer<",
            "Lcom/discord/chat/bridge/MessageType;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/discord/chat/bridge/MessageType$Companion;->get$cachedSerializer$delegate()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/KSerializer;

    return-object v0
.end method