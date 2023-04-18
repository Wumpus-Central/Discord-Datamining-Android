.class public final Lqa/e0;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/e0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Landroid/bluetooth/BluetoothDevice;

.field private o:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/f0;

    invoke-direct {v0}, Lqa/f0;-><init>()V

    sput-object v0, Lqa/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lx9/a;-><init>()V

    iput-object p1, p0, Lqa/e0;->k:Ljava/lang/String;

    iput-object p2, p0, Lqa/e0;->l:Ljava/lang/String;

    iput-object p3, p0, Lqa/e0;->m:Ljava/lang/String;

    iput-object p4, p0, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    iput-object p5, p0, Lqa/e0;->o:[B

    return-void
.end method


# virtual methods
.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final I()[B
    .locals 1

    iget-object v0, p0, Lqa/e0;->o:[B

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lqa/e0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lqa/e0;

    .line 11
    .line 12
    iget-object v1, p0, Lqa/e0;->k:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, p1, Lqa/e0;->k:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lqa/e0;->l:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lqa/e0;->l:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lqa/e0;->m:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p1, Lqa/e0;->m:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    .line 43
    .line 44
    iget-object v3, p1, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lqa/e0;->o:[B

    .line 53
    .line 54
    iget-object p1, p1, Lqa/e0;->o:[B

    .line 55
    .line 56
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    return v0

    .line 63
    :cond_1
    return v2
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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lqa/e0;->k:Ljava/lang/String;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lqa/e0;->l:Ljava/lang/String;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lqa/e0;->m:Ljava/lang/String;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget-object v2, p0, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    iget-object v1, p0, Lqa/e0;->o:[B

    .line 25
    .line 26
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x4

    .line 35
    aput-object v1, v0, v2

    .line 36
    .line 37
    invoke-static {v0}, Lw9/n;->c([Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
.end method

.method public final v()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lqa/e0;->k:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p1, v2, v1, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    iget-object v2, p0, Lqa/e0;->l:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    iget-object v2, p0, Lqa/e0;->m:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    iget-object v2, p0, Lqa/e0;->n:Landroid/bluetooth/BluetoothDevice;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x5

    .line 31
    iget-object v1, p0, Lqa/e0;->o:[B

    .line 32
    .line 33
    invoke-static {p1, p2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0;->k:Ljava/lang/String;

    return-object v0
.end method
