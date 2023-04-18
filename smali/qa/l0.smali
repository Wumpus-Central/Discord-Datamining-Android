.class final Lqa/l0;
.super Lqa/n0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqa/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lqa/m0;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lqa/n0;->a(Landroid/os/Parcel;)Lqa/m0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lqa/m0;->v(Lqa/m0;)Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lqa/m0;->v(Lqa/m0;)Landroid/os/ParcelFileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lqa/m0;->G(Landroid/os/ParcelFileDescriptor;)[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Lqa/m0;->z(Lqa/m0;[B)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lqa/n0;->a(Landroid/os/Parcel;)Lqa/m0;

    move-result-object p1

    return-object p1
.end method
