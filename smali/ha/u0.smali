.class public final Lha/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lha/s0;",
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
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lx9/b;->x(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-wide v5, v1

    .line 9
    move-object v7, v3

    .line 10
    move-object v8, v7

    .line 11
    move-object v9, v8

    .line 12
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v1, v0, :cond_4

    .line 17
    .line 18
    invoke-static {p1}, Lx9/b;->p(Landroid/os/Parcel;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Lx9/b;->k(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v2, v3, :cond_3

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    if-eq v2, v3, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x3

    .line 33
    if-eq v2, v3, :cond_1

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    if-eq v2, v3, :cond_0

    .line 37
    .line 38
    invoke-static {p1, v1}, Lx9/b;->w(Landroid/os/Parcel;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {p1, v1}, Lx9/b;->b(Landroid/os/Parcel;I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {p1, v1}, Lx9/b;->b(Landroid/os/Parcel;I)[B

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {p1, v1}, Lx9/b;->b(Landroid/os/Parcel;I)[B

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {p1, v1}, Lx9/b;->t(Landroid/os/Parcel;I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    goto :goto_0

    .line 62
    :cond_4
    invoke-static {p1, v0}, Lx9/b;->j(Landroid/os/Parcel;I)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lha/s0;

    .line 66
    .line 67
    move-object v4, p1

    .line 68
    invoke-direct/range {v4 .. v9}, Lha/s0;-><init>(J[B[B[B)V

    .line 69
    .line 70
    .line 71
    return-object p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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

    new-array p1, p1, [Lha/s0;

    return-object p1
.end method
