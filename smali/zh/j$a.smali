.class public final Lzh/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lzh/j$a;

.field private static final b:Lzh/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzh/j$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lzh/j$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzh/j$a;->a:Lzh/j$a;

    .line 7
    .line 8
    new-instance v0, Lzh/j$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lzh/j$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lzh/j$a;->b:Lzh/j;

    .line 14
    .line 15
    return-void
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

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lzh/j;
    .locals 1

    sget-object v0, Lzh/j$a;->b:Lzh/j;

    return-object v0
.end method
