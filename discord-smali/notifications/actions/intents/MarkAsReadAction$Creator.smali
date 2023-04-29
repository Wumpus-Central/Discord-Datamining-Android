.class public final Lcom/discord/notifications/actions/intents/MarkAsReadAction$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/actions/intents/MarkAsReadAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/discord/notifications/actions/intents/MarkAsReadAction;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/discord/notifications/actions/intents/MarkAsReadAction;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    const-class v1, Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/discord/primitives/ChannelId;

    invoke-virtual {v3}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/discord/primitives/MessageId;

    invoke-virtual {p1}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/discord/notifications/actions/intents/MarkAsReadAction;-><init>(Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/notifications/actions/intents/MarkAsReadAction$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/discord/notifications/actions/intents/MarkAsReadAction;
    .locals 0

    new-array p1, p1, [Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/notifications/actions/intents/MarkAsReadAction$Creator;->newArray(I)[Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    move-result-object p1

    return-object p1
.end method
