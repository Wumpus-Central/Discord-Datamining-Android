.class public final Lcom/google/android/gms/auth/api/credentials/a;
.super Lx9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/auth/api/credentials/a$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/credentials/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field private final l:Z

.field private final m:[Ljava/lang/String;

.field private final n:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

.field private final o:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

.field private final p:Z

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;

.field private final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/e;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/credentials/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IZ[Ljava/lang/String;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZLjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/a;->k:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/android/gms/auth/api/credentials/a;->l:Z

    .line 7
    .line 8
    invoke-static {p3}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, [Ljava/lang/String;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/google/android/gms/auth/api/credentials/a;->m:[Ljava/lang/String;

    .line 15
    .line 16
    if-nez p4, :cond_0

    .line 17
    .line 18
    new-instance p2, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;

    .line 19
    .line 20
    invoke-direct {p2}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    :cond_0
    iput-object p4, p0, Lcom/google/android/gms/auth/api/credentials/a;->n:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 28
    .line 29
    if-nez p5, :cond_1

    .line 30
    .line 31
    new-instance p2, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;

    .line 32
    .line 33
    invoke-direct {p2}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig$a;->a()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 37
    .line 38
    .line 39
    move-result-object p5

    .line 40
    :cond_1
    iput-object p5, p0, Lcom/google/android/gms/auth/api/credentials/a;->o:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 41
    .line 42
    const/4 p2, 0x3

    .line 43
    if-ge p1, p2, :cond_2

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/a;->p:Z

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/a;->q:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/a;->r:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iput-boolean p6, p0, Lcom/google/android/gms/auth/api/credentials/a;->p:Z

    .line 55
    .line 56
    iput-object p7, p0, Lcom/google/android/gms/auth/api/credentials/a;->q:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p8, p0, Lcom/google/android/gms/auth/api/credentials/a;->r:Ljava/lang/String;

    .line 59
    .line 60
    :goto_0
    iput-boolean p9, p0, Lcom/google/android/gms/auth/api/credentials/a;->s:Z

    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method


# virtual methods
.method public G()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->n:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->r:Ljava/lang/String;

    return-object v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->q:Ljava/lang/String;

    return-object v0
.end method

.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->p:Z

    return v0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->l:Z

    return v0
.end method

.method public v()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->m:[Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->R()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->v()[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {p1, v2, v1, v3}, Lx9/c;->q(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->G()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->z()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x5

    .line 39
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->K()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {p1, p2, v1}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 44
    .line 45
    .line 46
    const/4 p2, 0x6

    .line 47
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->I()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {p1, p2, v1, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const/4 p2, 0x7

    .line 55
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/credentials/a;->H()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {p1, p2, v1, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    const/16 p2, 0x8

    .line 63
    .line 64
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/credentials/a;->s:Z

    .line 65
    .line 66
    invoke-static {p1, p2, v1}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 67
    .line 68
    .line 69
    const/16 p2, 0x3e8

    .line 70
    .line 71
    iget v1, p0, Lcom/google/android/gms/auth/api/credentials/a;->k:I

    .line 72
    .line 73
    invoke-static {p1, p2, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 77
    .line 78
    .line 79
    return-void
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
.end method

.method public z()Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a;->o:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    return-object v0
.end method
