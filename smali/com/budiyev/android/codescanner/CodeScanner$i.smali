.class final Lcom/budiyev/android/codescanner/CodeScanner$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/budiyev/android/codescanner/CodeScannerView$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field final synthetic a:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method private constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScanner$i;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;)V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->L(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/budiyev/android/codescanner/CodeScanner;->a(Lcom/budiyev/android/codescanner/CodeScanner;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/budiyev/android/codescanner/CodeScanner;->b(Lcom/budiyev/android/codescanner/CodeScanner;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eq p2, v1, :cond_3

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/budiyev/android/codescanner/CodeScanner;->c(Lcom/budiyev/android/codescanner/CodeScanner;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 31
    .line 32
    invoke-static {v2}, Lcom/budiyev/android/codescanner/CodeScanner;->e(Lcom/budiyev/android/codescanner/CodeScanner;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/budiyev/android/codescanner/CodeScanner;->U()V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-nez v1, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 46
    .line 47
    invoke-static {v1}, Lcom/budiyev/android/codescanner/CodeScanner;->g(Lcom/budiyev/android/codescanner/CodeScanner;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, Lcom/budiyev/android/codescanner/CodeScanner$i;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 54
    .line 55
    invoke-static {v1, p1, p2}, Lcom/budiyev/android/codescanner/CodeScanner;->h(Lcom/budiyev/android/codescanner/CodeScanner;II)V

    .line 56
    .line 57
    .line 58
    :cond_3
    monitor-exit v0

    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw p1
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
.end method
