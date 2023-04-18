.class final Lcom/google/android/gms/common/api/internal/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/b<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Lt9/c;


# direct methods
.method synthetic constructor <init>(Lv9/b;Lt9/c;Lv9/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/common/api/internal/u;)Lt9/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/common/api/internal/u;)Lv9/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    instance-of v1, p1, Lcom/google/android/gms/common/api/internal/u;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/gms/common/api/internal/u;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    .line 11
    .line 12
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    .line 23
    .line 24
    invoke-static {v1, p1}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v0
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

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    invoke-static {v0}, Lw9/n;->c([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lw9/n;->d(Ljava/lang/Object;)Lw9/n$a;

    move-result-object v0

    const-string v1, "key"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/u;->a:Lv9/b;

    invoke-virtual {v0, v1, v2}, Lw9/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lw9/n$a;

    move-result-object v0

    const-string v1, "feature"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/u;->b:Lt9/c;

    invoke-virtual {v0, v1, v2}, Lw9/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lw9/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lw9/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
