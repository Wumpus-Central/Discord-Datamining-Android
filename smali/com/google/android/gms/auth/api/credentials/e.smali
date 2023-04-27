.class public final Lcom/google/android/gms/auth/api/credentials/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {p1}, Ly9/b;->x(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v1

    .line 8
    move v5, v4

    .line 9
    move v9, v5

    .line 10
    move v12, v9

    .line 11
    move-object v6, v2

    .line 12
    move-object v7, v6

    .line 13
    move-object v8, v7

    .line 14
    move-object v10, v8

    .line 15
    move-object v11, v10

    .line 16
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge v1, v0, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Ly9/b;->p(Landroid/os/Parcel;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ly9/b;->k(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x3e8

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    packed-switch v2, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1}, Ly9/b;->w(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_0
    invoke-static {p1, v1}, Ly9/b;->l(Landroid/os/Parcel;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move v12, v1

    .line 46
    goto :goto_0

    .line 47
    :pswitch_1
    invoke-static {p1, v1}, Ly9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v11, v1

    .line 52
    goto :goto_0

    .line 53
    :pswitch_2
    invoke-static {p1, v1}, Ly9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v10, v1

    .line 58
    goto :goto_0

    .line 59
    :pswitch_3
    invoke-static {p1, v1}, Ly9/b;->l(Landroid/os/Parcel;I)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    move v9, v1

    .line 64
    goto :goto_0

    .line 65
    :pswitch_4
    sget-object v2, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 66
    .line 67
    invoke-static {p1, v1, v2}, Ly9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 72
    .line 73
    move-object v8, v1

    .line 74
    goto :goto_0

    .line 75
    :pswitch_5
    sget-object v2, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 76
    .line 77
    invoke-static {p1, v1, v2}, Ly9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 82
    .line 83
    move-object v7, v1

    .line 84
    goto :goto_0

    .line 85
    :pswitch_6
    invoke-static {p1, v1}, Ly9/b;->f(Landroid/os/Parcel;I)[Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v6, v1

    .line 90
    goto :goto_0

    .line 91
    :pswitch_7
    invoke-static {p1, v1}, Ly9/b;->l(Landroid/os/Parcel;I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    move v5, v1

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-static {p1, v1}, Ly9/b;->r(Landroid/os/Parcel;I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    move v4, v1

    .line 102
    goto :goto_0

    .line 103
    :cond_1
    invoke-static {p1, v0}, Ly9/b;->j(Landroid/os/Parcel;I)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Lcom/google/android/gms/auth/api/credentials/a;

    .line 107
    .line 108
    move-object v3, p1

    .line 109
    invoke-direct/range {v3 .. v12}, Lcom/google/android/gms/auth/api/credentials/a;-><init>(IZ[Ljava/lang/String;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/auth/api/credentials/a;

    return-object p1
.end method
