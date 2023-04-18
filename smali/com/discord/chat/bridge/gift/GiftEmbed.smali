.class public interface abstract Lcom/discord/chat/bridge/gift/GiftEmbed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;,
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;,
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0012\u0010\u000c\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/chat/bridge/gift/GiftEmbed;",
        "",
        "backgroundColor",
        "",
        "getBackgroundColor",
        "()I",
        "headerColor",
        "getHeaderColor",
        "headerText",
        "",
        "getHeaderText",
        "()Ljava/lang/String;",
        "thumbnailCornerRadius",
        "getThumbnailCornerRadius",
        "Companion",
        "Resolved",
        "Resolving",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;",
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
    with = Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;->$$INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;

    sput-object v0, Lcom/discord/chat/bridge/gift/GiftEmbed;->Companion:Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;

    return-void
.end method


# virtual methods
.method public abstract getBackgroundColor()I
.end method

.method public abstract getHeaderColor()I
.end method

.method public abstract getHeaderText()Ljava/lang/String;
.end method

.method public abstract getThumbnailCornerRadius()I
.end method
