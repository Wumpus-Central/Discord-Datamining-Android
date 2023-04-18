.class final Loa/n;
.super Loa/q;
.source "SourceFile"


# instance fields
.field final synthetic r:Loa/o;


# direct methods
.method constructor <init>(Loa/o;Loa/r;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Loa/n;->r:Loa/o;

    invoke-direct {p0, p2, p3}, Loa/q;-><init>(Loa/r;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method final d(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method final e(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Loa/n;->r:Loa/o;

    .line 2
    .line 3
    iget-object v0, v0, Loa/o;->a:Loa/k;

    .line 4
    .line 5
    iget-object v1, p0, Loa/q;->m:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "index"

    .line 12
    .line 13
    invoke-static {p1, v2, v3}, Loa/m;->a(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :goto_0
    if-ge p1, v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v0, v3}, Loa/k;->a(C)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p1, -0x1

    .line 32
    :cond_1
    return p1
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
