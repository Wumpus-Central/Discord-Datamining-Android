.class public final Lw9/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lw9/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lx9/b;->x(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move-object v7, v4

    .line 9
    move-object v9, v7

    .line 10
    move v5, v2

    .line 11
    move v6, v5

    .line 12
    move v8, v6

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge v1, v0, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lx9/b;->p(Landroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Lx9/b;->k(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, Lx9/b;->w(Landroid/os/Parcel;I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_0
    invoke-static {p1, v1}, Lx9/b;->c(Landroid/os/Parcel;I)[I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v9, v1

    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    invoke-static {p1, v1}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    move v8, v1

    .line 45
    goto :goto_0

    .line 46
    :pswitch_2
    invoke-static {p1, v1}, Lx9/b;->c(Landroid/os/Parcel;I)[I

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v7, v1

    .line 51
    goto :goto_0

    .line 52
    :pswitch_3
    invoke-static {p1, v1}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    move v6, v1

    .line 57
    goto :goto_0

    .line 58
    :pswitch_4
    invoke-static {p1, v1}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    move v5, v1

    .line 63
    goto :goto_0

    .line 64
    :pswitch_5
    sget-object v2, Lw9/r;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    .line 66
    invoke-static {p1, v1, v2}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lw9/r;

    .line 71
    .line 72
    move-object v4, v1

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-static {p1, v0}, Lx9/b;->j(Landroid/os/Parcel;I)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lw9/e;

    .line 78
    .line 79
    move-object v3, p1

    .line 80
    invoke-direct/range {v3 .. v9}, Lw9/e;-><init>(Lw9/r;ZZ[II[I)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lw9/e;

    return-object p1
.end method
