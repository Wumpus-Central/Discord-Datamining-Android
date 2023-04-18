.class final Lqa/k;
.super Lqa/q;
.source "SourceFile"


# instance fields
.field final synthetic a:Lqa/e0;


# direct methods
.method constructor <init>(Lqa/n;Lqa/e0;)V
    .locals 0

    iput-object p2, p0, Lqa/k;->a:Lqa/e0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lqa/q;-><init>(Lqa/p;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lva/d;

    .line 2
    .line 3
    iget-object v0, p0, Lqa/k;->a:Lqa/e0;

    .line 4
    .line 5
    invoke-static {v0}, Lqa/n;->e(Lqa/e0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lva/e;

    .line 12
    .line 13
    invoke-direct {v0}, Lva/e;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lqa/k;->a:Lqa/e0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lqa/e0;->H()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lva/e;->d(Ljava/lang/String;)Lva/e;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lqa/k;->a:Lqa/e0;

    .line 26
    .line 27
    invoke-virtual {v1}, Lqa/e0;->v()Landroid/bluetooth/BluetoothDevice;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lva/e;->a(Landroid/bluetooth/BluetoothDevice;)Lva/e;

    .line 32
    .line 33
    .line 34
    const-string v1, "__UNRECOGNIZED_BLUETOOTH_DEVICE__"

    .line 35
    .line 36
    invoke-virtual {v0}, Lva/e;->e()Lva/c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v1, v0}, Lva/d;->a(Ljava/lang/String;Lva/c;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lqa/k;->a:Lqa/e0;

    .line 45
    .line 46
    invoke-virtual {v0}, Lqa/e0;->z()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Lva/e;

    .line 51
    .line 52
    invoke-direct {v1}, Lva/e;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lqa/k;->a:Lqa/e0;

    .line 56
    .line 57
    invoke-virtual {v2}, Lqa/e0;->H()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Lva/e;->d(Ljava/lang/String;)Lva/e;

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lqa/k;->a:Lqa/e0;

    .line 65
    .line 66
    invoke-virtual {v2}, Lqa/e0;->G()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Lva/e;->c(Ljava/lang/String;)Lva/e;

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lqa/k;->a:Lqa/e0;

    .line 74
    .line 75
    invoke-virtual {v2}, Lqa/e0;->I()[B

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Lva/e;->b([B)Lva/e;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lva/e;->e()Lva/c;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1, v0, v1}, Lva/d;->a(Ljava/lang/String;Lva/c;)V

    .line 87
    .line 88
    .line 89
    return-void
    .line 90
.end method
