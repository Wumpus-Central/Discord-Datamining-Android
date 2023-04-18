.class public final Lcom/discord/primitives/StickerId$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/primitives/StickerId;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/discord/primitives/StickerId;",
        ">;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/discord/primitives/StickerId$Creator;->createFromParcel-aEuejx8(Landroid/os/Parcel;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->box-impl(J)Lcom/discord/primitives/StickerId;

    move-result-object p1

    return-object p1
.end method

.method public final createFromParcel-aEuejx8(Landroid/os/Parcel;)J
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/discord/primitives/StickerId;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final newArray(I)[Lcom/discord/primitives/StickerId;
    .locals 0

    new-array p1, p1, [Lcom/discord/primitives/StickerId;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/primitives/StickerId$Creator;->newArray(I)[Lcom/discord/primitives/StickerId;

    move-result-object p1

    return-object p1
.end method
