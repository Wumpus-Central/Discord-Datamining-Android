.class public final Lzc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzc/b$a;
    }
.end annotation


# static fields
.field private static final b:Lzc/b;


# instance fields
.field private final a:Lzc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzc/b$a;

    invoke-direct {v0}, Lzc/b$a;-><init>()V

    invoke-virtual {v0}, Lzc/b$a;->a()Lzc/b;

    move-result-object v0

    sput-object v0, Lzc/b;->b:Lzc/b;

    return-void
.end method

.method constructor <init>(Lzc/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzc/b;->a:Lzc/a;

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
.end method

.method public static b()Lzc/b$a;
    .locals 1

    new-instance v0, Lzc/b$a;

    invoke-direct {v0}, Lzc/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lzc/a;
    .locals 1
    .annotation build Loc/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lzc/b;->a:Lzc/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/messaging/g0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
