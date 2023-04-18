.class Lxb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Lxb/a;",
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
.method public a(Landroid/os/Parcel;)Lxb/a;
    .locals 2

    new-instance v0, Lxb/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lxb/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;Lxb/a$a;)V

    return-object v0
.end method

.method public b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lxb/a;
    .locals 2

    new-instance v0, Lxb/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lxb/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;Lxb/a$a;)V

    return-object v0
.end method

.method public c(I)[Lxb/a;
    .locals 0

    new-array p1, p1, [Lxb/a;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxb/a$a;->a(Landroid/os/Parcel;)Lxb/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lxb/a$a;->b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lxb/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lxb/a$a;->c(I)[Lxb/a;

    move-result-object p1

    return-object p1
.end method
