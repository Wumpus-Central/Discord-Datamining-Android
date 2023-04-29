.class public final Lcom/discord/notifications/actions/intents/DismissCallAction$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/actions/intents/DismissCallAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/discord/notifications/actions/intents/DismissCallAction;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/discord/notifications/actions/intents/DismissCallAction;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/notifications/actions/intents/DismissCallAction;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/discord/notifications/actions/intents/DismissCallAction;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/discord/primitives/ChannelId;

    invoke-virtual {p1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v2

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/discord/notifications/actions/intents/DismissCallAction;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/notifications/actions/intents/DismissCallAction$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/discord/notifications/actions/intents/DismissCallAction;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/discord/notifications/actions/intents/DismissCallAction;
    .locals 0

    new-array p1, p1, [Lcom/discord/notifications/actions/intents/DismissCallAction;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/discord/notifications/actions/intents/DismissCallAction$Creator;->newArray(I)[Lcom/discord/notifications/actions/intents/DismissCallAction;

    move-result-object p1

    return-object p1
.end method
