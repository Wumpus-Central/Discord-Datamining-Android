.class public final Lco/discord/media_engine/internal/Outbound;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ6\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/discord/media_engine/internal/Outbound;",
        "",
        "id",
        "",
        "audio",
        "Lco/discord/media_engine/internal/OutboundAudio;",
        "videos",
        "",
        "Lco/discord/media_engine/internal/OutboundVideo;",
        "(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)V",
        "getAudio",
        "()Lco/discord/media_engine/internal/OutboundAudio;",
        "getId",
        "()Ljava/lang/String;",
        "getVideos",
        "()[Lco/discord/media_engine/internal/OutboundVideo;",
        "[Lco/discord/media_engine/internal/OutboundVideo;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)Lco/discord/media_engine/internal/Outbound;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "android_release"
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
.field private final audio:Lco/discord/media_engine/internal/OutboundAudio;

.field private final id:Ljava/lang/String;

.field private final videos:[Lco/discord/media_engine/internal/OutboundVideo;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)V
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    .line 12
    .line 13
    iput-object p3, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/Outbound;Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;ILjava/lang/Object;)Lco/discord/media_engine/internal/Outbound;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/discord/media_engine/internal/Outbound;->copy(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)Lco/discord/media_engine/internal/Outbound;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/discord/media_engine/internal/OutboundAudio;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    return-object v0
.end method

.method public final component3()[Lco/discord/media_engine/internal/OutboundVideo;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)Lco/discord/media_engine/internal/Outbound;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/discord/media_engine/internal/Outbound;

    invoke-direct {v0, p1, p2, p3}, Lco/discord/media_engine/internal/Outbound;-><init>(Ljava/lang/String;Lco/discord/media_engine/internal/OutboundAudio;[Lco/discord/media_engine/internal/OutboundVideo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/Outbound;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/Outbound;

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    iget-object v3, p1, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    iget-object p1, p1, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAudio()Lco/discord/media_engine/internal/OutboundAudio;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideos()[Lco/discord/media_engine/internal/OutboundVideo;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Outbound(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", audio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->audio:Lco/discord/media_engine/internal/OutboundAudio;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Outbound;->videos:[Lco/discord/media_engine/internal/OutboundVideo;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
