.class public final Lco/discord/media_engine/Connection$StatsFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/discord/media_engine/Connection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StatsFilter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/discord/media_engine/Connection$StatsFilter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/discord/media_engine/Connection$StatsFilter;",
        "",
        "()V",
        "Companion",
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
.field public static final ALL:I = -0x1

.field public static final Companion:Lco/discord/media_engine/Connection$StatsFilter$Companion;

.field public static final INBOUND:I = 0x4

.field public static final OUTBOUND:I = 0x2

.field public static final TRANSPORT:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/discord/media_engine/Connection$StatsFilter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/discord/media_engine/Connection$StatsFilter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/discord/media_engine/Connection$StatsFilter;->Companion:Lco/discord/media_engine/Connection$StatsFilter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
