.class public final Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;
.super Lcom/discord/audio/enums/WiredHeadsetState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/enums/WiredHeadsetState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unplugged"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;",
        "Lcom/discord/audio/enums/WiredHeadsetState;",
        "()V",
        "toString",
        "",
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
.field public static final INSTANCE:Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;

    invoke-direct {v0}, Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;-><init>()V

    sput-object v0, Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;->INSTANCE:Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/discord/audio/enums/WiredHeadsetState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WiredHeadsetState.Unplugged"

    return-object v0
.end method
