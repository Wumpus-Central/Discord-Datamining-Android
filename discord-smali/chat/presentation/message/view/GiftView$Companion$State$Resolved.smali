.class public final Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Resolved"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;",
        "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;",
        "accessoryId",
        "",
        "(J)V",
        "getAccessoryId",
        "()J",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final accessoryId:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->accessoryId:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;JILjava/lang/Object;)Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->copy(J)Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide v0

    return-wide v0
.end method

.method public final copy(J)Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;

    invoke-direct {v0, p1, p2}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;-><init>(J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getAccessoryId()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->accessoryId:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lco/discord/media_engine/a;->a(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;->getAccessoryId()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Resolved(accessoryId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
