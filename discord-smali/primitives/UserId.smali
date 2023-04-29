.class public final Lcom/discord/primitives/UserId;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/snowflake/SnowflakePrimitive;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/primitives/UserId$$serializer;,
        Lcom/discord/primitives/UserId$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u000cJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lcom/discord/primitives/UserId;",
        "Lcom/discord/snowflake/SnowflakePrimitive;",
        "snowflake",
        "",
        "Lcom/discord/snowflake/Snowflake;",
        "constructor-impl",
        "(J)J",
        "getSnowflake",
        "()J",
        "describeContents",
        "",
        "describeContents-impl",
        "(J)I",
        "equals",
        "",
        "other",
        "",
        "equals-impl",
        "(JLjava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "isValid",
        "isValid-impl",
        "(J)Z",
        "toString",
        "",
        "toString-impl",
        "(J)Ljava/lang/String;",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "writeToParcel-impl",
        "(JLandroid/os/Parcel;I)V",
        "$serializer",
        "Companion",
        "primitives_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lyi/f;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/discord/primitives/UserId;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/discord/primitives/UserId$Companion;


# instance fields
.field private final snowflake:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/primitives/UserId$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/primitives/UserId$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/primitives/UserId;->Companion:Lcom/discord/primitives/UserId$Companion;

    new-instance v0, Lcom/discord/primitives/UserId$Creator;

    invoke-direct {v0}, Lcom/discord/primitives/UserId$Creator;-><init>()V

    sput-object v0, Lcom/discord/primitives/UserId;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/discord/primitives/UserId;->snowflake:J

    return-void
.end method

.method public static final synthetic box-impl(J)Lcom/discord/primitives/UserId;
    .locals 1

    new-instance v0, Lcom/discord/primitives/UserId;

    invoke-direct {v0, p0, p1}, Lcom/discord/primitives/UserId;-><init>(J)V

    return-object v0
.end method

.method public static constructor-impl(J)J
    .locals 0

    return-wide p0
.end method

.method public static describeContents-impl(J)I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static equals-impl(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, Lcom/discord/primitives/UserId;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, Lcom/discord/primitives/UserId;

    invoke-virtual {p2}, Lcom/discord/primitives/UserId;->unbox-impl()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final equals-impl0(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static hashCode-impl(J)I
    .locals 0

    invoke-static {p0, p1}, Lco/discord/media_engine/a;->a(J)I

    move-result p0

    return p0
.end method

.method public static isValid-impl(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static toString-impl(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static writeToParcel-impl(JLandroid/os/Parcel;I)V
    .locals 0

    const-string p3, "out"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1}, Lcom/discord/primitives/UserId;->describeContents-impl(J)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1, p1}, Lcom/discord/primitives/UserId;->equals-impl(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getSnowflake()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1}, Lcom/discord/primitives/UserId;->hashCode-impl(J)I

    move-result v0

    return v0
.end method

.method public isValid()Z
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1}, Lcom/discord/primitives/UserId;->isValid-impl(J)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1}, Lcom/discord/primitives/UserId;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()J
    .locals 2

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/discord/primitives/UserId;->snowflake:J

    invoke-static {v0, v1, p1, p2}, Lcom/discord/primitives/UserId;->writeToParcel-impl(JLandroid/os/Parcel;I)V

    return-void
.end method
