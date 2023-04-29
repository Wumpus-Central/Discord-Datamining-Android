.class public abstract Lcom/discord/chat/bridge/contentnode/ContentNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0014\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/chat/bridge/contentnode/ContentNode;",
        "",
        "()V",
        "Companion",
        "Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;",
        "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;",
        "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;",
        "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;",
        "Lcom/discord/chat/bridge/contentnode/ErrorContentNode;",
        "Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;",
        "Lcom/discord/chat/bridge/contentnode/HeadingContentNode;",
        "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;",
        "Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "Lcom/discord/chat/bridge/contentnode/MentionContentNode;",
        "Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;",
        "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;",
        "Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;",
        "Lcom/discord/chat/bridge/contentnode/StrongContentNode;",
        "Lcom/discord/chat/bridge/contentnode/TextContentNode;",
        "Lcom/discord/chat/bridge/contentnode/TimestampContentNode;",
        "Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;",
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
    with = Lcom/discord/chat/bridge/contentnode/ContentNodeSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/contentnode/ContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/ContentNode$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/contentnode/ContentNode;-><init>()V

    return-void
.end method
