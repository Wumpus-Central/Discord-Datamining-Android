.class public final Lcom/discord/chat/presentation/textutils/LinkStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "",
        "font",
        "Lcom/discord/fonts/DiscordFont;",
        "linkColor",
        "",
        "(Lcom/discord/fonts/DiscordFont;I)V",
        "getFont",
        "()Lcom/discord/fonts/DiscordFont;",
        "getLinkColor",
        "()I",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
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
.field private final font:Lcom/discord/fonts/DiscordFont;

.field private final linkColor:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/discord/fonts/DiscordFont;I)V
    .locals 1

    const-string v0, "font"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    .line 3
    iput p2, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/fonts/DiscordFont;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    sget-object p1, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextLink()I

    move-result p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/textutils/LinkStyle;Lcom/discord/fonts/DiscordFont;IILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/textutils/LinkStyle;->copy(Lcom/discord/fonts/DiscordFont;I)Lcom/discord/chat/presentation/textutils/LinkStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/fonts/DiscordFont;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    return v0
.end method

.method public final copy(Lcom/discord/fonts/DiscordFont;I)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 1

    const-string v0, "font"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/presentation/textutils/LinkStyle;

    invoke-direct {v0, p1, p2}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    iget p1, p1, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFont()Lcom/discord/fonts/DiscordFont;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    return-object v0
.end method

.method public final getLinkColor()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->font:Lcom/discord/fonts/DiscordFont;

    iget v1, p0, Lcom/discord/chat/presentation/textutils/LinkStyle;->linkColor:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LinkStyle(font="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linkColor="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
