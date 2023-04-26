.class final enum Lcom/facebook/react/devsupport/DevServerHelper$BundleType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/DevServerHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "BundleType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/devsupport/DevServerHelper$BundleType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

.field public static final enum BUNDLE:Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

.field public static final enum MAP:Lcom/facebook/react/devsupport/DevServerHelper$BundleType;


# instance fields
.field private final mTypeID:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 2
    .line 3
    const-string v1, "bundle"

    .line 4
    .line 5
    const-string v2, "BUNDLE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->BUNDLE:Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 12
    .line 13
    new-instance v1, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 14
    .line 15
    const-string v2, "map"

    .line 16
    .line 17
    const-string v4, "MAP"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->MAP:Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    new-array v2, v2, [Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 27
    .line 28
    aput-object v0, v2, v3

    .line 29
    .line 30
    aput-object v1, v2, v5

    .line 31
    .line 32
    sput-object v2, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->$VALUES:[Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    .line 33
    .line 34
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->mTypeID:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/devsupport/DevServerHelper$BundleType;
    .locals 1

    const-class v0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    return-object p0
.end method

.method public static values()[Lcom/facebook/react/devsupport/DevServerHelper$BundleType;
    .locals 1

    sget-object v0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->$VALUES:[Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    invoke-virtual {v0}, [Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/devsupport/DevServerHelper$BundleType;

    return-object v0
.end method


# virtual methods
.method public typeID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/DevServerHelper$BundleType;->mTypeID:Ljava/lang/String;

    return-object v0
.end method
