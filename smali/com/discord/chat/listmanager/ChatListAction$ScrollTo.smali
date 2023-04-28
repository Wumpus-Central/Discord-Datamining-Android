.class public final Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;
.super Lcom/discord/chat/listmanager/ChatListAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/listmanager/ChatListAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ScrollTo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;",
        "Lcom/discord/chat/listmanager/ChatListAction;",
        "position",
        "",
        "animated",
        "",
        "jumped",
        "isHighlight",
        "(IZZZ)V",
        "getAnimated",
        "()Z",
        "getJumped",
        "getPosition",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
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
.field private final animated:Z

.field private final isHighlight:Z

.field private final jumped:Z

.field private final position:I


# direct methods
.method public constructor <init>(IZZZ)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/discord/chat/listmanager/ChatListAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput p1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    .line 4
    iput-boolean p2, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    .line 6
    iput-boolean p4, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 1
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;-><init>(IZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;IZZZILjava/lang/Object;)Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->copy(IZZZ)Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    return v0
.end method

.method public final copy(IZZZ)Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;
    .locals 1

    new-instance v0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;-><init>(IZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    iget v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    iget v3, p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    iget-boolean v3, p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    iget-boolean v3, p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    iget-boolean p1, p1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnimated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    return v0
.end method

.method public final getJumped()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    return v0
.end method

.method public final getPosition()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public final isHighlight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->position:I

    iget-boolean v1, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->animated:Z

    iget-boolean v2, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->jumped:Z

    iget-boolean v3, p0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ScrollTo(position="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", animated="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", jumped="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isHighlight="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
