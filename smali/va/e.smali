.class public final Lva/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/bluetooth/BluetoothDevice;

.field private d:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)Lva/e;
    .locals 0

    iput-object p1, p0, Lva/e;->c:Landroid/bluetooth/BluetoothDevice;

    const-string p1, "__UNRECOGNIZED_BLUETOOTH_DEVICE__"

    iput-object p1, p0, Lva/e;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    iput-object p1, p0, Lva/e;->d:[B

    return-object p0
.end method

.method public final b([B)Lva/e;
    .locals 0

    iput-object p1, p0, Lva/e;->d:[B

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lva/e;
    .locals 0

    iput-object p1, p0, Lva/e;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lva/e;
    .locals 0

    iput-object p1, p0, Lva/e;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final e()Lva/c;
    .locals 7

    new-instance v6, Lva/c;

    iget-object v1, p0, Lva/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lva/e;->b:Ljava/lang/String;

    iget-object v3, p0, Lva/e;->c:Landroid/bluetooth/BluetoothDevice;

    iget-object v4, p0, Lva/e;->d:[B

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lva/c;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;[BLva/f;)V

    return-object v6
.end method
