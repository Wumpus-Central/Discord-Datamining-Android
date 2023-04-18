.class public Lfa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a$g<",
            "Lpa/f;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "Lu9/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lia/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu9/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu9/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfa/a;->a:Lu9/a$g;

    .line 7
    .line 8
    new-instance v1, Lu9/a;

    .line 9
    .line 10
    new-instance v2, Lpa/e;

    .line 11
    .line 12
    invoke-direct {v2}, Lpa/e;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "Fido.U2F_ZERO_PARTY_API"

    .line 16
    .line 17
    invoke-direct {v1, v3, v2, v0}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lfa/a;->b:Lu9/a;

    .line 21
    .line 22
    new-instance v0, Lpa/c;

    .line 23
    .line 24
    invoke-direct {v0}, Lpa/c;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lfa/a;->c:Lia/a;

    .line 28
    .line 29
    return-void
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

.method public static a(Landroid/app/Activity;)Lga/a;
    .locals 1

    new-instance v0, Lga/a;

    invoke-direct {v0, p0}, Lga/a;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
