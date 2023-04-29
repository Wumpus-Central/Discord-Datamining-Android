.class public final Lcom/discord/audio/DiscordAudioManager$AudioDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/DiscordAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioDevice"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000cR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
        "",
        "type",
        "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "isAvailable",
        "",
        "id",
        "",
        "name",
        "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "()Z",
        "getName",
        "getType",
        "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "audio_release"
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
.field private final id:Ljava/lang/String;

.field private final isAvailable:Z

.field private final name:Ljava/lang/String;

.field private final type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 3
    iput-boolean p2, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    .line 4
    iput-object p3, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->INVALID:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    iget-object v3, p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    iget-boolean v3, p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    iget-object p1, p1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isAvailable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->type:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    iget-boolean v1, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable:Z

    iget-object v2, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->id:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->name:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AudioDevice(type="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAvailable="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
