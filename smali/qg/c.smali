.class public final Lqg/c;
.super Lmg/n1;
.source "SourceFile"


# static fields
.field public static final c:Lqg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqg/c;

    invoke-direct {v0}, Lqg/c;-><init>()V

    sput-object v0, Lqg/c;->c:Lqg/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "protected_static"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Lmg/n1;-><init>(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "protected/*protected static*/"

    return-object v0
.end method

.method public d()Lmg/n1;
    .locals 1

    sget-object v0, Lmg/m1$g;->c:Lmg/m1$g;

    return-object v0
.end method
