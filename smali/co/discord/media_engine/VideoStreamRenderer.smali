.class public Lco/discord/media_engine/VideoStreamRenderer;
.super Lorg/webrtc/SurfaceViewRenderer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/discord/media_engine/VideoStreamRenderer$Muxer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/discord/media_engine/VideoStreamRenderer;",
        "Lorg/webrtc/SurfaceViewRenderer;",
        "ctx",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "streamIdentifier",
        "",
        "attachToStream",
        "",
        "discord",
        "Lcom/hammerandchisel/libdiscord/Discord;",
        "streamId",
        "events",
        "Lorg/webrtc/RendererCommon$RendererEvents;",
        "Muxer",
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


# static fields
.field private static final Muxer:Lco/discord/media_engine/VideoStreamRenderer$Muxer;

.field private static streams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lco/discord/media_engine/VideoStreamRenderer;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private streamIdentifier:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lco/discord/media_engine/VideoStreamRenderer$Muxer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lco/discord/media_engine/VideoStreamRenderer$Muxer;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lco/discord/media_engine/VideoStreamRenderer;->Muxer:Lco/discord/media_engine/VideoStreamRenderer$Muxer;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lco/discord/media_engine/VideoStreamRenderer;->streams:Ljava/util/Map;

    .line 15
    .line 16
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lorg/webrtc/SurfaceViewRenderer;-><init>(Landroid/content/Context;)V

    const-string p1, ""

    .line 2
    iput-object p1, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lorg/webrtc/SurfaceViewRenderer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, ""

    .line 4
    iput-object p1, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getStreams$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lco/discord/media_engine/VideoStreamRenderer;->streams:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic attachToStream$default(Lco/discord/media_engine/VideoStreamRenderer;Lcom/hammerandchisel/libdiscord/Discord;Ljava/lang/String;Lorg/webrtc/RendererCommon$RendererEvents;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lco/discord/media_engine/VideoStreamRenderer;->attachToStream(Lcom/hammerandchisel/libdiscord/Discord;Ljava/lang/String;Lorg/webrtc/RendererCommon$RendererEvents;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: attachToStream"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final attachToStream(Lcom/hammerandchisel/libdiscord/Discord;Ljava/lang/String;Lorg/webrtc/RendererCommon$RendererEvents;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v2

    .line 17
    :goto_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    invoke-super {p0}, Lorg/webrtc/SurfaceViewRenderer;->clearImage()V

    .line 20
    .line 21
    .line 22
    invoke-super {p0}, Lorg/webrtc/SurfaceViewRenderer;->release()V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lco/discord/media_engine/VideoStreamRenderer;->Muxer:Lco/discord/media_engine/VideoStreamRenderer$Muxer;

    .line 26
    .line 27
    iget-object v3, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p0, v3}, Lco/discord/media_engine/VideoStreamRenderer$Muxer;->removeSink(Lcom/hammerandchisel/libdiscord/Discord;Lco/discord/media_engine/VideoStreamRenderer;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    if-nez p2, :cond_3

    .line 33
    .line 34
    const-string p2, ""

    .line 35
    .line 36
    :cond_3
    iput-object p2, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-nez p2, :cond_4

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_4
    move v1, v2

    .line 46
    :goto_1
    if-nez v1, :cond_5

    .line 47
    .line 48
    invoke-static {}, Lco/discord/media_engine/SharedEglBaseContext;->getEglContext()Lorg/webrtc/EglBase$Context;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-super {p0, p2, p3}, Lorg/webrtc/SurfaceViewRenderer;->init(Lorg/webrtc/EglBase$Context;Lorg/webrtc/RendererCommon$RendererEvents;)V

    .line 53
    .line 54
    .line 55
    sget-object p2, Lco/discord/media_engine/VideoStreamRenderer;->Muxer:Lco/discord/media_engine/VideoStreamRenderer$Muxer;

    .line 56
    .line 57
    iget-object p3, p0, Lco/discord/media_engine/VideoStreamRenderer;->streamIdentifier:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p2, p1, p0, p3}, Lco/discord/media_engine/VideoStreamRenderer$Muxer;->addSink(Lcom/hammerandchisel/libdiscord/Discord;Lco/discord/media_engine/VideoStreamRenderer;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_5
    return-void
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
