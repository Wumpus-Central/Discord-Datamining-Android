.class public abstract Lcom/discord/audio/enums/WiredHeadsetState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/audio/enums/WiredHeadsetState$Companion;,
        Lcom/discord/audio/enums/WiredHeadsetState$PluggedIn;,
        Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/audio/enums/WiredHeadsetState;",
        "",
        "()V",
        "Companion",
        "PluggedIn",
        "Unplugged",
        "Lcom/discord/audio/enums/WiredHeadsetState$PluggedIn;",
        "Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;",
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


# static fields
.field public static final Companion:Lcom/discord/audio/enums/WiredHeadsetState$Companion;

.field public static final HAS_MIC:I = 0x1

.field public static final NO_MIC:I = 0x0

.field public static final PLUGGED:I = 0x1

.field public static final UNPLUGGED:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/audio/enums/WiredHeadsetState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/audio/enums/WiredHeadsetState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/audio/enums/WiredHeadsetState;->Companion:Lcom/discord/audio/enums/WiredHeadsetState$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/audio/enums/WiredHeadsetState;-><init>()V

    return-void
.end method
