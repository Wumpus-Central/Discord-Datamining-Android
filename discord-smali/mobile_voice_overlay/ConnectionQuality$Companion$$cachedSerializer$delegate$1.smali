.class final Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/mobile_voice_overlay/ConnectionQuality;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlinx/serialization/KSerializer<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;

    invoke-direct {v0}, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;-><init>()V

    sput-object v0, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion$$cachedSerializer$delegate$1;->invoke()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlinx/serialization/KSerializer;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/discord/mobile_voice_overlay/ConnectionQuality;->values()[Lcom/discord/mobile_voice_overlay/ConnectionQuality;

    move-result-object v0

    const-string v1, "bad"

    const-string v2, "unknown"

    const-string v3, "fine"

    const-string v4, "average"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object v4, v2, v3

    const-string v3, "com.discord.mobile_voice_overlay.ConnectionQuality"

    invoke-static {v3, v0, v1, v2}, Lbj/c0;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method