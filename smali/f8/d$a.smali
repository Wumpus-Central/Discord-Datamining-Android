.class Lf8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lf8/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lf8/d;
    .locals 2

    new-instance v0, Lf8/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lf8/d;-><init>(Landroid/os/Parcel;Lf8/d$a;)V

    return-object v0
.end method

.method public b(I)[Lf8/d;
    .locals 0

    new-array p1, p1, [Lf8/d;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/d$a;->a(Landroid/os/Parcel;)Lf8/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/d$a;->b(I)[Lf8/d;

    move-result-object p1

    return-object p1
.end method
