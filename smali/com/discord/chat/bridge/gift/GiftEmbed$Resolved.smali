.class public interface abstract Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/gift/GiftEmbed;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/gift/GiftEmbed;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolved"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;,
        Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0012\u0010\u000c\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;",
        "Lcom/discord/chat/bridge/gift/GiftEmbed;",
        "subtitle",
        "",
        "getSubtitle",
        "()Ljava/lang/String;",
        "subtitleColor",
        "",
        "getSubtitleColor",
        "()I",
        "thumbnailUrl",
        "getThumbnailUrl",
        "titleColor",
        "getTitleColor",
        "titleText",
        "getTitleText",
        "Invalid",
        "Valid",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;",
        "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;",
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


# virtual methods
.method public abstract getSubtitle()Ljava/lang/String;
.end method

.method public abstract getSubtitleColor()I
.end method

.method public abstract getThumbnailUrl()Ljava/lang/String;
.end method

.method public abstract getTitleColor()I
.end method

.method public abstract getTitleText()Ljava/lang/String;
.end method
