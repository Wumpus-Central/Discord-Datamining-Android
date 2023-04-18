.class final Lcom/budiyev/android/codescanner/CodeScanner$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic k:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method private constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$c;->k:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScanner$c;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;)V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$c;->k:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->F(Lcom/budiyev/android/codescanner/CodeScanner;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$c;->k:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->G(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p2}, Lcom/budiyev/android/codescanner/h;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Lcom/budiyev/android/codescanner/c;

    .line 19
    .line 20
    invoke-direct {p1, p2}, Lcom/budiyev/android/codescanner/c;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method
