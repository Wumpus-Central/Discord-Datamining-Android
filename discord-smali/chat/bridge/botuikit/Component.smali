.class public abstract Lcom/discord/chat/bridge/botuikit/Component;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/botuikit/Component$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/discord/chat/bridge/botuikit/Component;",
        "",
        "()V",
        "indices",
        "",
        "",
        "getIndices",
        "()Ljava/util/List;",
        "type",
        "getType",
        "()I",
        "Companion",
        "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;",
        "Lcom/discord/chat/bridge/botuikit/ButtonComponent;",
        "Lcom/discord/chat/bridge/botuikit/SelectComponent;",
        "Lcom/discord/chat/bridge/botuikit/UnknownComponent;",
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
    with = Lcom/discord/chat/bridge/botuikit/ComponentSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/botuikit/Component$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/botuikit/Component$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/botuikit/Component$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/botuikit/Component;->Companion:Lcom/discord/chat/bridge/botuikit/Component$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/botuikit/Component;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getIndices()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getType()I
.end method
