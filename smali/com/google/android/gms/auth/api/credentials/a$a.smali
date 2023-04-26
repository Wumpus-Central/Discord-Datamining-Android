.class public final Lcom/google/android/gms/auth/api/credentials/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/credentials/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:[Ljava/lang/String;

.field private c:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

.field private d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/auth/api/credentials/a;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->b:[Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->b:[Ljava/lang/String;

    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->a:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->b:[Ljava/lang/String;

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v1, "At least one authentication method must be specified"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_2
    :goto_0
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/a;

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    iget-boolean v4, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->a:Z

    .line 32
    .line 33
    iget-object v5, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->b:[Ljava/lang/String;

    .line 34
    .line 35
    iget-object v6, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->c:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 36
    .line 37
    iget-object v7, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->d:Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 38
    .line 39
    iget-boolean v8, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->e:Z

    .line 40
    .line 41
    iget-object v9, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->f:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v10, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->g:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    move-object v2, v0

    .line 47
    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/auth/api/credentials/a;-><init>(IZ[Ljava/lang/String;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    return-object v0
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
.end method

.method public varargs b([Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/a$a;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->b:[Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/auth/api/credentials/a$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/auth/api/credentials/a$a;->a:Z

    return-object p0
.end method
